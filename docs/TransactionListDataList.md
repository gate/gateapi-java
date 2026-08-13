
# TransactionListDataList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | **String** | Asset Type |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Trading Type |  [optional]
**typeDesc** | **String** | Transaction Type Description |  [optional]
**change** | **String** | Change amount |  [optional]
**balance** | **String** | Current Balance |  [optional]
**time** | **Long** | Occurrence Time (Second-level Timestamp) |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
DEPOSIT_ | &quot;deposit-转入&quot;
WITHDRAW_ | &quot;withdraw-转出&quot;
DIVIDEND_ | &quot;dividend-分红结息&quot;
FILL_NEGATIVE_ | &quot;fill_negative-填平负余额&quot;

