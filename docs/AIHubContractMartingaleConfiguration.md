
# AIHubContractMartingaleConfiguration

AIHub-supported persisted contract settings. This is not a complete advanced native configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investAmount** | **String** |  |  [optional]
**investmentCurrency** | **String** |  |  [optional]
**priceDeviation** | **String** |  |  [optional]
**takeProfitRatio** | **String** |  |  [optional]
**direction** | **String** |  |  [optional]
**firstOrderSize** | **String** | Exact decimal contract quantity from the product snapshot; empty remains unverified, never inferred from the total budget. |  [optional]
**maxOrders** | **Long** | Maximum additional entries excluding the first. |  [optional]
**leverage** | **Integer** |  |  [optional]
**stopLossPriceRule** | [**AIHubMartingalePriceRule**](AIHubMartingalePriceRule.md) |  |  [optional]

