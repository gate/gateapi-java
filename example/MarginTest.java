package io.gate.apidemo;

import io.gate.gateapi.ApiException;
import io.gate.gateapi.api.MarginApi;
import io.gate.gateapi.api.MarginUniApi;
import io.gate.gateapi.models.MarginAccount;
import io.gate.gateapi.models.MaxUniBorrowable;
import io.gate.gateapi.models.UniCurrencyPair;
import io.gate.gateapi.models.UniLoan;
import java.util.List;

/** Show current isolated-margin balances and borrowing capacity without creating debt. */
final class MarginTest {
    private final RunConfig config;

    MarginTest(RunConfig config) { this.config = config; }

    public void run() throws ApiException {
        String pair = "BTC_USDT";
        io.gate.gateapi.ApiClient client = ExampleAuth.create(config);
        MarginUniApi margin = new MarginUniApi(client);
        UniCurrencyPair market = margin.getUniCurrencyPair(pair);
        MaxUniBorrowable capacity = margin.getUniBorrowable("USDT", pair);
        List<UniLoan> loans = margin.listUniLoans().currencyPair(pair).currency("USDT").limit(20).execute();
        List<MarginAccount> accounts = new MarginApi(client).listMarginAccounts().currencyPair(pair).execute();
        System.out.printf("%s status=%s borrowable=%s, loan records=%d, accounts=%d%n",
                pair, market.getStatus(), capacity.getBorrowable(), loans.size(), accounts.size());
        // Legacy P2P Loan APIs were removed. Borrow/repay is an explicit CreateUniLoan
        // operation; this example does not silently replace lending with a new write workflow.
    }
}
