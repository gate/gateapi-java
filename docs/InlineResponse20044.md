
# InlineResponse20044

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Account Change Record ID | 
**userId** | **String** | User ID | 
**businessId** | **String** | Business ID | 
**type** | **String** | 变更类型| &#x60;TRANSACTION&#x60; 成交 &#x60;TRADING_FEE&#x60; 手续费 &#x60;FUNDING_FEE&#x60; 合约资金费 &#x60;LIQUIDATION_FEE&#x60; 强平费 &#x60;TRANSFER_IN&#x60; 资金转入 &#x60;TRANSFER_OUT&#x60; 资金转出 &#x60;BANKRUPT_COMPENSATION&#x60; 穿仓补贴 &#x60;AUTO_REPAY&#x60; 杠杆仓位自动还负债 | 
**exchangeType** | **String** | Exchange | 
**coin** | **String** | Currency | 
**change** | **String** | Change amount (positive indicates transfer in; negative indicates transfer out) | 
**balance** | **String** | Balance after change | 
**createTime** | **String** | Created time | 

