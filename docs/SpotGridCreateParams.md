
# SpotGridCreateParams

Creation parameters for the spot grid strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**money** | **String** | Amount of investment | 
**lowPrice** | **String** | Range lower limit | 
**highPrice** | **String** | Range upper limit | 
**gridNum** | **Integer** | Number of grids | 
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) |  | 
**triggerPrice** | **String** |  |  [optional]
**stopProfit** | **String** |  |  [optional]
**stopLoss** | **String** |  |  [optional]
**profitSharingRatio** | **String** |  |  [optional]
**isUseBase** | **Boolean** |  |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

