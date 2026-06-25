
# OtcBankCreateMultipartRequest

Inner create-bank-card `multipart/form-data`. Use the form field `documentation_file` to upload the account-opening proof.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountName** | **String** |  | 
**bankName** | **String** |  | 
**bankCountry** | **String** |  | 
**bankAddress** | **String** |  | 
**iban** | **String** |  | 
**swift** | **String** |  | 
**remittanceLineNumber** | **String** |  |  [optional]
**agentBankName** | **String** |  |  [optional]
**agentBankSwift** | **String** |  |  [optional]
**documentationFile** | **String** | 开户证明文件内容（multipart 文件字段，二进制/Base64；jpg/jpeg/png/pdf 等，单文件≤4MB 以现网为准） | 

