
# SymbolDetailItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** |  |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, and kr |  [optional]
**exchangeDesc** | **String** |  |  [optional]
**quoteCurrency** | **String** |  |  [optional]
**quoteCurrencyPrecision** | **Integer** |  |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** |  |  [optional]
**category** | **String** |  |  [optional]
**settlementCurrency** | **String** |  |  [optional]
**maxOrderVolume** | **String** |  |  [optional]
**stepOrderVolume** | **String** |  |  [optional]
**minOrderVolume** | **String** |  |  [optional]
**pricePrecision** | **Integer** | Price precision |  [optional]
**volumePrecision** | **Integer** |  |  [optional]
**isIpo** | **Boolean** |  |  [optional]
**ipoPrice** | **String** |  |  [optional]
**priceProtection** | **String** |  |  [optional]
**sellPriceProtection** | **String** |  |  [optional]
**buyPriceProtection** | **String** |  |  [optional]
**slippageRate** | **String** |  |  [optional]
**commissionRate** | **String** | Fee Rate |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | Trading status. - pre_market: Pre-market. - open: Regular trading session. - post_market: Post-market. - closed: Market closed. - gt_lp: GT LP session. |  [optional]
**tradeMode** | [**TradeModeEnum**](#TradeModeEnum) | Current session trading mode. - 0: Trading disabled. - 1: Buy only. - 2: Sell only. - 4: Buy and sell supported. |  [optional]
**orderFillTiming** | [**OrderFillTimingEnum**](#OrderFillTimingEnum) | Order fill timing (1&#x3D;immediate, 2&#x3D;after pre-market opens, 3&#x3D;after regular session opens) |  [optional]
**symbolDescs** | [**List&lt;SymbolDetailItemSymbolDescs&gt;**](SymbolDetailItemSymbolDescs.md) |  |  [optional]
**iconLink** | **String** |  |  [optional]

## Enum: ExchangeEnum

Name | Value
---- | -----
US | &quot;us&quot;
HK | &quot;hk&quot;
KR | &quot;kr&quot;

## Enum: TradeStatusEnum

Name | Value
---- | -----
PRE_MARKET | &quot;pre_market&quot;
OPEN | &quot;open&quot;
POST_MARKET | &quot;post_market&quot;
CLOSED | &quot;closed&quot;
GT_LP | &quot;gt_lp&quot;

## Enum: TradeModeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_4 | 4

## Enum: OrderFillTimingEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

