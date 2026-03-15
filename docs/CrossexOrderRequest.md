
# CrossexOrderRequest

Place Order Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Client-defined Order ID, supports letters (a-z), numbers (0-9), symbols (-, _) only |  [optional]
**symbol** | **String** | Unique Identifier for Exchange_Business_Base_Counter Examples: If you want to place a spot order for ADA/USDT on BINANCE, use: &#x60;BINANCE_SPOT_ADA_USDT&#x60;; If you want to place a USDT-M perpetual futures order for ADA/USDT on OKX, use: &#x60;OKX_FUTURE_ADA_USDT&#x60;; If you want to place a spot margin order for ADA/USDT on GATE, use: &#x60;GATE_MARGIN_ADA_USDT&#x60;; If you want to place a spot order for ADA/USDT on BYBIT, use: &#x60;BYBIT_SPOT_ADA_USDT&#x60;; Currently supports three order types: Spot Orders, USDT-M Perpetual Futures Orders, and Spot Margin Orders. BYBIT does not currently support spot margin orders | 
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

