
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
**documentationFile** | [**File**](File.md) | Account-opening proof file (jpg/jpeg/png/pdf, etc.; single file ≤4MB — subject to production environment). | 

