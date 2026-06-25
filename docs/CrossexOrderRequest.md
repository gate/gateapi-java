
# CrossexOrderRequest

Place Order Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Client-defined Order ID, supports letters (a-z), numbers (0-9), symbols (-, _) only |  [optional]
**symbol** | **String** | Unique identifier &#x60;{Exchange}_{Business}_{Base}_{Counter}&#x60; Examples: To send a Binance spot order on &#x60;ADA/USDT&#x60;, use &#x60;BINANCE_SPOT_ADA_USDT&#x60;; For an ADA/USDT-margined USDT perpetual futures order on OKX, use &#x60;OKX_FUTURE_ADA_USDT&#x60;; For ADA/USDT margin trading on Gate, use &#x60;GATE_MARGIN_ADA_USDT&#x60;; For ADA/USDT spot trading on Bybit, use &#x60;BYBIT_SPOT_ADA_USDT&#x60;; For an ADA/USD futures order on Kraken, use &#x60;KRAKEN_FUTURE_ADA_USD&#x60;; For an ADA/USDC futures order on Hyperliquid, use &#x60;HYPERLIQUID_FUTURE_ADA_USDC&#x60;; Supports spot trades, USDT-margined perpetual futures, and spot margin templates. BYBIT omits spot margin for now; Kraken and Hyperliquid omit dedicated spot/margin legs inside CrossEx. | 
**side** | [**SideEnum**](#SideEnum) | BUY, SELL | 
**type** | [**TypeEnum**](#TypeEnum) | Order type (default: &#x60;LIMIT&#x60;; supported types: &#x60;LIMIT&#x60;, &#x60;MARKET&#x60;) |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Default GTC, supports enumerated types: GTC, IOC, FOK, POC GTC: GoodTillCancelled IOC: ImmediateOrCancelled FOK: FillOrKill POC: PendingOrCancelled or PostOnly |  [optional]
**qty** | **String** | Order quantity (required unless spot market buy) |  [optional]
**price** | **String** | Limit Order Price (Required for Limit Orders) |  [optional]
**quoteQty** | **String** | Order quote quantity; required for spot and margin market buy orders |  [optional]
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

