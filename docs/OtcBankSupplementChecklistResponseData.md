
# OtcBankSupplementChecklistResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userType** | [**UserTypeEnum**](#UserTypeEnum) | &#x60;personal&#x60; or &#x60;enterprise&#x60;, matching the supplementary document submission type; &#x60;items[].description&#x60; describes the submission requirements for each item | 
**items** | [**List&lt;OtcBankSupplementChecklistItem&gt;**](OtcBankSupplementChecklistItem.md) |  | 

## Enum: UserTypeEnum

Name | Value
---- | -----
PERSONAL | &quot;personal&quot;
ENTERPRISE | &quot;enterprise&quot;

