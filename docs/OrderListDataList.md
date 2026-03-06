
# OrderListDataList

Order detail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** | Order ID |  [optional]
**symbol** | **String** | Currency pair |  [optional]
**symbolDesc** | **String** | Trading symbol description |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Trade type (market&#x3D;market price, trigger&#x3D;trigger price) |  [optional]
**state** | **Integer** | Order status code |  [optional]
**stateDesc** | **String** | Order status description |  [optional]
**finished** | [**FinishedEnum**](#FinishedEnum) | Is completed (0&#x3D;shown in active order list, 1&#x3D;not shown in active list) |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**volume** | **String** | Order volume |  [optional]
**price** | **String** | Trigger price |  [optional]
**priceTp** | **String** | Take profit price |  [optional]
**priceSl** | **String** | Stop loss price |  [optional]
**timeSetup** | **Long** | Order time (Unix timestamp in seconds) |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
TRIGGER | &quot;trigger&quot;

## Enum: FinishedEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

