
# SymbolListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Symbol |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, and kr |  [optional]
**exchangeDesc** | **String** | Exchange description |  [optional]
**quoteCurrency** | **String** | Quote currency |  [optional]
**quoteCurrencyPrecision** | **Integer** | Quote currency precision |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**category** | **String** | Category |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | Trading status. - pre_market: Pre-market. - open: Regular trading session. - post_market: Post-market. - closed: Market closed. - gt_lp: GT LP session. |  [optional]
**tradeMode** | [**TradeModeEnum**](#TradeModeEnum) | Current session trading mode. - 0: Trading disabled. - 1: Buy only. - 2: Sell only. - 4: Buy and sell supported. |  [optional]
**orderFillTiming** | [**OrderFillTimingEnum**](#OrderFillTimingEnum) | Order fill timing (1&#x3D;immediate, 2&#x3D;after pre-market opens, 3&#x3D;after regular session opens) |  [optional]
**iconLink** | **String** | Icon URL |  [optional]
**quoteCurrencySymbol** | **String** | Quote currency symbol |  [optional]
**pricePrecision** | **Integer** | Price precision |  [optional]
**volumePrecision** | **Integer** | Quantity precision |  [optional]
**isIpo** | **Boolean** | Whether it is an IPO symbol |  [optional]
**ipoPrice** | **String** | IPO price |  [optional]
**sellPriceProtection** | **String** | Sell price protection rate |  [optional]
**buyPriceProtection** | **String** | Buy price protection rate |  [optional]
**symbolDescs** | [**List&lt;I18nTxt&gt;**](I18nTxt.md) | Multilingual symbol description |  [optional]

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

