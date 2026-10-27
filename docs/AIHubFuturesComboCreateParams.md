
# AIHubFuturesComboCreateParams

Creation parameters for a futures-combo strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**beginMoneyAmount** | **String** |  | 
**beginMoneyCurrency** | [**BeginMoneyCurrencyEnum**](#BeginMoneyCurrencyEnum) |  | 
**assetInfo** | [**List&lt;AIHubFuturesComboAsset&gt;**](AIHubFuturesComboAsset.md) |  | 
**leverage** | **Integer** |  | 
**period** | [**PeriodEnum**](#PeriodEnum) |  |  [optional]
**threshold** | **String** | Ratio 0.01–0.50; exclusive with period. |  [optional]
**stopProfit** | **String** |  |  [optional]
**stopLoss** | **String** |  |  [optional]

## Enum: BeginMoneyCurrencyEnum

Name | Value
---- | -----
USDT | &quot;USDT&quot;

## Enum: PeriodEnum

Name | Value
---- | -----
_30M | &quot;30m&quot;
_1H | &quot;1h&quot;
_4H | &quot;4h&quot;
_8H | &quot;8h&quot;
_12H | &quot;12h&quot;
_1D | &quot;1d&quot;
_3D | &quot;3d&quot;
_7D | &quot;7d&quot;
_14D | &quot;14d&quot;
_28D | &quot;28d&quot;

