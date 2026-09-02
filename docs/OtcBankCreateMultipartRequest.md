
# OtcBankCreateMultipartRequest

Inner create-bank-card `multipart/form-data`. Account-opening proof file (choose one):  - **Pre-upload**: `documentation_file_key` + `file_type` (call `POST /otc/upload/pre_upload` first, `scene=bank`); - **Multipart direct upload**: `documentation_file` file field.

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
**documentationFile** | **String** | Multipart direct upload; mutually exclusive with documentation_file_key |  [optional]
**documentationFileKey** | **String** | Pre-upload mode; file_key returned by pre_upload (plaintext or base64 accepted) |  [optional]
**fileType** | **String** | Required when using documentation_file_key; plaintext MIME or its base64 |  [optional]

