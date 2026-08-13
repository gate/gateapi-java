
# OrderLogData

Response data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **Integer** | Order ID |  [optional]
**logId** | **Integer** | logID |  [optional]
**symbol** | **String** | Trading pair of the order |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Trade type (market&#x3D;market price, trigger&#x3D;trigger price) |  [optional]
**state** | **Integer** | Order status code (1&#x3D;placed, 2&#x3D;canceled, 3&#x3D;partially filled, 4&#x3D;filled, 5&#x3D;rejected) |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**volume** | **String** | Order quantity |  [optional]
**price** | **String** | Average fill price |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
TRIGGER | &quot;trigger&quot;

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

