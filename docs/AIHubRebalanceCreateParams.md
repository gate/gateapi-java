
# AIHubRebalanceCreateParams

Creation parameters for a smart-position strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beginMoneyAmount** | **String** |  | 
**beginMoneyCurrency** | [**BeginMoneyCurrencyEnum**](#BeginMoneyCurrencyEnum) |  | 
**assetInfo** | [**List&lt;AIHubRebalanceAsset&gt;**](AIHubRebalanceAsset.md) |  | 
**period** | **String** | Product interval between 1m and 28d. |  [optional]
**threshold** | **String** | Positive ratio below 1, at most four decimal places. |  [optional]
**closeFlag** | [**CloseFlagEnum**](#CloseFlagEnum) |  |  [optional]
**isUseBase** | **Boolean** |  |  [optional]
**stopProfit** | **String** |  |  [optional]
**stopLoss** | **String** |  |  [optional]

## Enum: BeginMoneyCurrencyEnum

Name | Value
---- | -----
USDT | &quot;USDT&quot;

## Enum: CloseFlagEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

