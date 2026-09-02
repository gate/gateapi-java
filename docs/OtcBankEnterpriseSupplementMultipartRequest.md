
# OtcBankEnterpriseSupplementMultipartRequest

Enterprise supplement `multipart/form-data`. File field names: `certificate`, `share_holders`, `passport`, `share_holding_structure`; optional `funds_statement`, `additional`. Optional string field `relationship_proof` (JSON) is merged into the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** |  |  [optional]
**bankId** | **String** |  | 
**certificate** | **String** | Business license / registration certificate file content (multipart file field, binary/Base64) |  [optional]
**shareHolders** | **String** | Register of shareholders file content (multipart file field, binary/Base64) |  [optional]
**passport** | **String** | Legal representative / shareholder passport file content (multipart file field, binary/Base64) |  [optional]
**shareHoldingStructure** | **String** | Ownership structure chart file content (multipart file field, binary/Base64) |  [optional]
**fundsStatement** | **String** | Proof-of-funds file content (multipart file field, binary/Base64, optional) |  [optional]
**additional** | **String** | Other supplementary material file content (multipart file field, binary/Base64, optional) |  [optional]
**relationshipProof** | **String** | Optional. JSON string of relationship_proof. |  [optional]

