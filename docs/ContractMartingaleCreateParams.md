
# ContractMartingaleCreateParams

The creation parameters of the contract Martin strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investAmount** | **String** | Margin allocated; the server converts it to initial contract size using live contract price, contract multiplier, and minimum lot size. | 
**priceDeviation** | **String** |  | 
**maxOrders** | **Integer** |  | 
**takeProfitRatio** | **String** |  | 
**direction** | [**ContractMartingaleDirection**](ContractMartingaleDirection.md) |  | 
**leverage** | **String** |  | 
**stopLossPrice** | **String** | Legacy field name. The AIHub &#x60;contract_martingale&#x60; creation path does not map this field today; follow contract martingale rules from the underlying API. MCP tooling must match bot-service behavior. |  [optional]
**profitSharingRatio** | **String** |  |  [optional]

