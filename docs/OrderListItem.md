
# OrderListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**symbol** | **String** | Symbol |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, and kr |  [optional]
**quoteCurrency** | **String** | Quote currency |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | Trading status. - pre_market: Pre-market. - open: Regular trading session. - post_market: Post-market. - closed: Market closed. - gt_lp: GT LP session. |  [optional]
**tradeMode** | [**TradeModeEnum**](#TradeModeEnum) | Current session trading mode. - 0: Trading disabled. - 1: Buy only. - 2: Sell only. - 4: Buy and sell supported. |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (market &#x3D; market order, limit &#x3D; limit order) |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**status** | **Integer** | Order status |  [optional]
**volume** | **String** | Order quantity |  [optional]
**fillVolume** | **String** | Trading size |  [optional]
**price** | **String** | Order price |  [optional]
**timeSetup** | **Long** | Order creation time (Unix timestamp, seconds) |  [optional]
**timeUpdate** | **Long** | Order update time (Unix timestamp, seconds) |  [optional]
**maxOrderVolume** | **String** | Maximum order quantity |  [optional]
**stepOrderVolume** | **String** | Order step size |  [optional]
**minOrderVolume** | **String** | Minimum order quantity |  [optional]
**pricePrecision** | **Integer** | Price precision |  [optional]
**priceProtection** | **String** | Price protection range |  [optional]
**sellPriceProtection** | **String** | Sell price protection rate |  [optional]
**buyPriceProtection** | **String** | Buy price protection rate |  [optional]
**commissionRate** | **String** | Fee Rate |  [optional]
**slippageRate** | **String** | Slippage |  [optional]

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

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

