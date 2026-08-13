
# TradFiSpotOrderRequest

Place order request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**volume** | **String** | Order quantity | 
**symbol** | **String** | Symbol | 
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) | 
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (market &#x3D; market order, limit &#x3D; limit order) | 
**tradingSession** | [**TradingSessionEnum**](#TradingSessionEnum) | Trading session. Limit orders support only All, while market orders support only Regular. | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force. - day: Day order. | 
**price** | **String** | Order price, used for limit orders |  [optional]
**clientOrderId** | **String** | Client-defined order ID |  [optional]

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;

## Enum: TradingSessionEnum

Name | Value
---- | -----
REGULAR | &quot;regular&quot;
ALL | &quot;all&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
DAY | &quot;day&quot;

