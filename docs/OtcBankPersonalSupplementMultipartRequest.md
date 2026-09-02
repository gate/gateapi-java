
# OtcBankPersonalSupplementMultipartRequest

Personal supplement `multipart/form-data`. File field names are fixed: `id_document_front`, `id_document_back`, `address_proof` (aligned with the checklist `code`); the optional string field `relationship_proof` (JSON text) is merged with the upload result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankId** | **String** |  | 
**idDocumentFront** | **String** | ID document front-side file content (multipart file field, binary/Base64) |  [optional]
**idDocumentBack** | **String** | ID document back-side file content (multipart file field, binary/Base64) |  [optional]
**addressProof** | **String** | Proof-of-address file content (multipart file field, binary/Base64) |  [optional]
**relationshipProof** | **String** | Optional. JSON string of relationship_proof. |  [optional]

