
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
**documentationFile** | **String** | Account opening proof file content (multipart file field, binary/Base64; jpg/jpeg/png/pdf, etc.; maximum 10 MB per file, subject to the live environment) | 

