
# TradFiOrderRequest

Place order request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Order price | 
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (trigger&#x3D;trigger price, market&#x3D;market price) | 
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) | 
**symbol** | **String** | Trading symbol code | 
**volume** | **String** | Order quantity | 
**priceTp** | **String** | Take profit price (optional) |  [optional]
**priceSl** | **String** | Stop loss price (optional) |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
TRIGGER | &quot;trigger&quot;
MARKET | &quot;market&quot;

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

