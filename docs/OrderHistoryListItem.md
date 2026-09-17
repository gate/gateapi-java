
# OrderHistoryListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**symbol** | **String** | Symbol |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, kr, and jp |  [optional]
**quoteCurrency** | **String** | Quote currency |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (market &#x3D; market order, limit &#x3D; limit order) |  [optional]
**status** | **Integer** | Order status |  [optional]
**statusDesc** | **String** | Order status description |  [optional]
**statusDetail** | [**OrderHistoryListItemStatusDetail**](OrderHistoryListItemStatusDetail.md) |  |  [optional]
**finishAs** | **Integer** | Order completion reason |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force. - day: Day order. |  [optional]
**volume** | **String** | Order quantity |  [optional]
**fillVolume** | **String** | Trading size |  [optional]
**price** | **String** | Order price |  [optional]
**avgFillPrice** | **String** | Average fill price |  [optional]
**commission** | **String** | fee |  [optional]
**timeSetup** | **Long** | Order creation time (Unix timestamp, seconds) |  [optional]
**timeDone** | **Long** | Order completion time (Unix timestamp in seconds) |  [optional]

## Enum: ExchangeEnum

Name | Value
---- | -----
US | &quot;us&quot;
HK | &quot;hk&quot;
KR | &quot;kr&quot;
JP | &quot;jp&quot;

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

## Enum: TimeInForceEnum

Name | Value
---- | -----
DAY | &quot;day&quot;

