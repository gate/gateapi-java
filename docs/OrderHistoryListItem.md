
# OrderHistoryListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** |  |  [optional]
**symbol** | **String** |  |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, and kr |  [optional]
**quoteCurrency** | **String** |  |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** |  |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (market &#x3D; market order, limit &#x3D; limit order) |  [optional]
**status** | **Integer** | Order status |  [optional]
**statusDesc** | **String** | Order status description |  [optional]
**statusDetail** | [**OrderHistoryListItemStatusDetail**](OrderHistoryListItemStatusDetail.md) |  |  [optional]
**finishAs** | **Integer** | Order completion reason |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force. - day: Day order. |  [optional]
**volume** | **String** |  |  [optional]
**fillVolume** | **String** |  |  [optional]
**price** | **String** |  |  [optional]
**avgFillPrice** | **String** |  |  [optional]
**commission** | **String** | fee |  [optional]
**timeSetup** | **Long** |  |  [optional]
**timeDone** | **Long** |  |  [optional]

## Enum: ExchangeEnum

Name | Value
---- | -----
US | &quot;us&quot;
HK | &quot;hk&quot;
KR | &quot;kr&quot;

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

