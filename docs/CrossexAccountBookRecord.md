
# CrossexAccountBookRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Account Change Record ID | 
**userId** | **String** | User ID | 
**businessId** | **String** | Business ID | 
**type** | **String** | Change type | &#x60;TRANSACTION&#x60; trade &#x60;TRADING_FEE&#x60; fee &#x60;FUNDING_FEE&#x60; futures funding fee &#x60;LIQUIDATION_FEE&#x60; liquidation fee &#x60;TRANSFER_IN&#x60; transfer in &#x60;TRANSFER_OUT&#x60; transfer out &#x60;BANKRUPT_COMPENSATION&#x60; bankruptcy compensation &#x60;AUTO_REPAY&#x60; margin position auto-repay | 
**exchangeType** | **String** | Exchange | 
**coin** | **String** | Currency | 
**change** | **String** | Change amount (positive indicates transfer in; negative indicates transfer out) | 
**balance** | **String** | Balance after change | 
**createTime** | **String** | Created time | 

