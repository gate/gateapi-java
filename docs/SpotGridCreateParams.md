
# SpotGridCreateParams

现货网格策略的创建参数。

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**money** | **String** | 投入金额 | 
**lowPrice** | **String** | Range lower limit | 
**highPrice** | **String** | Range upper limit | 
**gridNum** | **Integer** | 网格数量 | 
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

