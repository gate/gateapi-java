
# OrderHistoryListDataList

Order detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** | Order ID |  [optional]
**symbol** | **String** | Currency pair |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Trade type (market&#x3D;market price, trigger&#x3D;trigger price) |  [optional]
**orderOptType** | [**OrderOptTypeEnum**](#OrderOptTypeEnum) | Order operation type (1&#x3D;sell, 2&#x3D;buy, 3&#x3D;close long, 4&#x3D;close short, 5&#x3D;force close long, 6&#x3D;force close short) |  [optional]
**state** | **Integer** | Order status code |  [optional]
**stateDesc** | **String** | Order status description |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**volume** | **String** | Order quantity |  [optional]
**fillVolume** | **String** | Trading size |  [optional]
**closePnl** | **String** | Close Position P&amp;L |  [optional]
**price** | **String** | Average fill price |  [optional]
**triggerPrice** | **String** | Trigger price |  [optional]
**priceTp** | **String** | Take profit price |  [optional]
**priceSl** | **String** | Stop loss price |  [optional]
**timeSetup** | **Long** | Order time (Unix timestamp in seconds) |  [optional]
**timeDone** | **Long** | End time (Unix timestamp in seconds) |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
TRIGGER | &quot;trigger&quot;

## Enum: OrderOptTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

