
# PositionListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Symbol |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, kr, and jp |  [optional]
**quoteCurrency** | **String** | Quote currency |  [optional]
**quoteCurrencyPrecision** | **Integer** | Quote currency precision |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**tradeStatus** | [**TradeStatusEnum**](#TradeStatusEnum) | Trading status. - pre_market: Pre-market. - open: Regular trading session. - post_market: Post-market. - closed: Market closed. - gt_lp: GT LP session. |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**positionPnl** | **String** | Position P&amp;L |  [optional]
**todayPnl** | **String** | Today&#39;s P&amp;L |  [optional]
**pnlRate** | **String** | Yield |  [optional]
**todaySellAmount** | **String** | Today&#39;s sales amount |  [optional]
**todayBuyAmount** | **String** | Today&#39;s purchase amount |  [optional]
**todaySellVolume** | **String** | Today&#39;s sell volume |  [optional]
**todayBuyVolume** | **String** | Today&#39;s buy volume |  [optional]
**yesterdayVolume** | **String** | Previous close position quantity |  [optional]
**volume** | **String** | Position quantity |  [optional]
**available** | **String** | Available position quantity |  [optional]
**transferOutPendingQty** | **String** | Stock transfer in progress quantity |  [optional]
**avgCostPrice** | **String** | Cost price |  [optional]
**dilutedCostPrice** | **String** | Diluted cost price |  [optional]
**lastPrice** | **String** | Latest price |  [optional]
**extendedLastPrice** | **String** | Extended hours latest price |  [optional]
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
JP | &quot;jp&quot;

## Enum: TradeStatusEnum

Name | Value
---- | -----
PRE_MARKET | &quot;pre_market&quot;
OPEN | &quot;open&quot;
POST_MARKET | &quot;post_market&quot;
CLOSED | &quot;closed&quot;
GT_LP | &quot;gt_lp&quot;

