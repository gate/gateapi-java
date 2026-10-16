
# CrossexOrderRequest

Place Order Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Client-defined Order ID, supports letters (a-z), numbers (0-9), symbols (-, _) only |  [optional]
**symbol** | **String** | Unique identifier Exchange_Business_Base_Counter Examples: To place a spot order for ADA/USDT on BINANCE, use &#x60;BINANCE_SPOT_ADA_USDT&#x60;; To place a USDT-margined perpetual futures order for ADA/USDT on OKX, use &#x60;OKX_FUTURE_ADA_USDT&#x60;; To place a spot margin order for ADA/USDT on GATE, use &#x60;GATE_MARGIN_ADA_USDT&#x60;; To place a spot order for ADA/USDT on BYBIT, use &#x60;BYBIT_SPOT_ADA_USDT&#x60;; To place a futures order for ADA/USD on KRAKEN, use &#x60;KRAKEN_FUTURE_ADA_USD&#x60;; To place a futures order for ADA/USDC on HYPERLIQUID, use &#x60;HYPERLIQUID_FUTURE_ADA_USDC&#x60;; To place a futures order for ADA/USDC on DERIBIT, use &#x60;DERIBIT_FUTURE_ADA_USDC&#x60;; To place a futures order for ADA/USDC on LIGHTER, use &#x60;LIGHTER_FUTURE_ADA_USDC&#x60;; To trade US stock AAPL, use &#x60;US_STOCK_AAPL_USDT&#x60;; To trade Hong Kong stock 00700, use &#x60;HK_STOCK_00700_USDT&#x60;; To trade US ETF SPY, use &#x60;US_ETF_SPY_USDT&#x60;; Spot, USDT-margined perpetual futures, spot margin, stock, and ETF orders are supported. BYBIT/DERIBIT do not currently support spot margin orders. KRAKEN, HYPERLIQUID, and LIGHTER do not currently support spot or margin orders. Stocks and ETFs support only cross-exchange account mode | 
**side** | [**SideEnum**](#SideEnum) | BUY, SELL | 
**type** | [**TypeEnum**](#TypeEnum) | Order type (default: &#x60;LIMIT&#x60;; supported types: &#x60;LIMIT&#x60;, &#x60;MARKET&#x60;) |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Defaults to GTC. Supported values: &#x60;GTC&#x60;, &#x60;IOC&#x60;, &#x60;FOK&#x60;, &#x60;POC&#x60;, &#x60;RPI&#x60; &#x60;GTC&#x60;: GoodTillCancelled &#x60;IOC&#x60;: ImmediateOrCancelled &#x60;FOK&#x60;: FillOrKill &#x60;POC&#x60;: PendingOrCancelled or PostOnly &#x60;RPI&#x60;: RPI Stocks and ETFs support only &#x60;GTC&#x60; |  [optional]
**qty** | **String** | Order quantity (required except for spot and margin market buys; qty is required for stocks and ETFs) |  [optional]
**price** | **String** | Limit order price (required for limit orders). Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) |  [optional]
**quoteQty** | **String** | Order quote quantity, required for spot and margin market buys. Stock and ETF orders do not support quote_qty |  [optional]
**reduceOnly** | [**ReduceOnlyEnum**](#ReduceOnlyEnum) | Reduce-only: &#x60;true&#x60; or &#x60;false&#x60; |  [optional]
**positionSide** | [**PositionSideEnum**](#PositionSideEnum) | Position side: &#x60;NONE&#x60;, &#x60;LONG&#x60;, &#x60;SHORT&#x60; Defaults to &#x60;NONE&#x60; (single position mode) if not specified |  [optional]

## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;BUY&quot;
SELL | &quot;SELL&quot;

## Enum: TypeEnum

Name | Value
---- | -----
LIMIT | &quot;LIMIT&quot;
MARKET | &quot;MARKET&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
GTC | &quot;GTC&quot;
IOC | &quot;IOC&quot;
FOK | &quot;FOK&quot;
POC | &quot;POC&quot;
RPI | &quot;RPI&quot;

## Enum: ReduceOnlyEnum

Name | Value
---- | -----
TRUE | &quot;true&quot;
FALSE | &quot;false&quot;

## Enum: PositionSideEnum

Name | Value
---- | -----
LONG | &quot;LONG&quot;
SHORT | &quot;SHORT&quot;
NONE | &quot;NONE&quot;

