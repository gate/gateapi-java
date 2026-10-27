package io.gate.apidemo;

import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.api.FuturesApi;
import io.gate.gateapi.api.WalletApi;
import io.gate.gateapi.models.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/** Demonstrate current string-sized futures orders using one governed SDK client. */
public final class FutureTest {
    private final RunConfig config;
    public FutureTest(RunConfig config) { this.config = config; }

    public void run() throws ApiException {
        String settle = "usdt", contract = "BTC_USDT", leverage = "3";
        ApiClient client = ExampleAuth.create(config);
        FuturesApi api = new FuturesApi(client);
        // Unknown account/position state is an error, never a reason to continue trading.
        Position position = api.getPosition(settle, contract).execute();
        Contract market = api.getFuturesContract(settle, contract);
        List<FuturesTicker> tickers = api.listFuturesTickers(settle).contract(contract).execute();
        if (tickers.isEmpty()) throw new IllegalStateException("Missing futures ticker");
        BigDecimal size = positive(market.getOrderSizeMin(), "minimum size").max(BigDecimal.TEN);
        if (new BigDecimal(position.getSize()).signum() < 0) size = size.negate();
        BigDecimal margin = size.abs().multiply(positive(tickers.get(0).getLast(), "last price"))
                .multiply(positive(market.getQuantoMultiplier(), "contract multiplier"))
                .divide(new BigDecimal(leverage), 18, RoundingMode.UP).multiply(new BigDecimal("1.1"));
        BigDecimal available = new BigDecimal(api.listFuturesAccounts(settle).getAvailable());
        if (available.signum() < 0) throw new IllegalStateException("Negative available collateral");
        // Validate reads before writes, and transfer only the collateral shortfall.
        if (available.compareTo(margin) < 0) {
            if (config.isUseTest()) throw new IllegalStateException("Fund testnet collateral before running this example");
            Transfer transfer = new Transfer().currency(settle.toUpperCase(java.util.Locale.ROOT))
                    .amount(margin.subtract(available).toPlainString()).from(Transfer.FromEnum.SPOT)
                    .to(Transfer.ToEnum.FUTURES).settle(settle);
            new WalletApi(client).transfer(transfer);
        }
        api.updatePositionLeverage(settle, contract, leverage, null, null);
        // contract is now optional: placing it in the old argument slot would cancel every market.
        api.cancelFuturesOrders(settle, null, contract, null, null, null, null);
        FuturesOrder order = new FuturesOrder().contract(contract).size(size.toPlainString())
                .price("0").tif(FuturesOrder.TifEnum.IOC);
        FuturesOrder created = api.createFuturesOrder(settle, order, null);
        System.out.printf("Futures order %s status=%s size=%s%n", created.getId(), created.getStatus(), created.getSize());
        // Cancel a remaining open order immediately; a status query failure must not block cleanup.
        if (created.getStatus() == FuturesOrder.StatusEnum.OPEN) {
            ExampleAuth.cancelFuture(api, settle, created.getId().toString());
        }
        // Exceptions propagate without a retry: reconcile transfer/order history before re-running.
    }

    private static BigDecimal positive(String value, String field) {
        BigDecimal result = new BigDecimal(value);
        if (result.signum() <= 0) throw new IllegalStateException(field + " must be positive");
        return result;
    }
}
