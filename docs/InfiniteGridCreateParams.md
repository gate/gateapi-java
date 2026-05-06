
# InfiniteGridCreateParams

无限网格策略的创建参数。  与 App 口径对齐：**仅** `money`、`price_floor`、`profit_per_grid` 为必填； `grid_num`、`price_type` 可选（不传时由服务端按默认处理）。

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**money** | **String** |  | 
**priceFloor** | **String** | price floor | 
**profitPerGrid** | **String** | Profit per square | 
**gridNum** | **Integer** | Optional; may be omitted like in the app. |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Optional. &#x60;0&#x60; arithmetic grid; &#x60;1&#x60; geometric; omit for server defaults. |  [optional]
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

