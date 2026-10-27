
# ContractMartingaleCreateParams

The creation parameters of the contract Martin strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investAmount** | **String** | Total strategy budget, not first-order margin. The server uses the complete existing ladder formula, owner fee and live contract facts, quantizes quantity down and rechecks before allocation. Minimum infeasible budget is rejected. | 
**priceDeviation** | **String** |  | 
**maxOrders** | **Integer** | Maximum additional entries, excluding the first; preserve this legacy meaning. | 
**takeProfitRatio** | **String** |  | 
**direction** | [**ContractMartingaleDirection**](ContractMartingaleDirection.md) |  | 
**leverage** | **String** |  | 
**stopLossPrice** | **String** | Positive fixed stop price; requires explicit stop_loss_price_type. Missing both leaves the old no-fixed-stop request unchanged. |  [optional]
**profitSharingRatio** | **String** |  |  [optional]
**stopLossPriceType** | [**StopLossPriceTypeEnum**](#StopLossPriceTypeEnum) |  |  [optional]

## Enum: StopLossPriceTypeEnum

Name | Value
---- | -----
LAST | &quot;last&quot;
INDEX | &quot;index&quot;
MARK | &quot;mark&quot;

