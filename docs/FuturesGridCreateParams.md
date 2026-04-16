
# FuturesGridCreateParams

合约网格策略的创建参数。

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**money** | **String** |  | 
**lowPrice** | **String** |  | 
**highPrice** | **String** |  | 
**gridNum** | **Integer** |  | 
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) |  | 
**leverage** | **String** |  | 
**direction** | [**FuturesDirection**](FuturesDirection.md) |  |  [optional]
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

