
# OtcUploadPreUploadPolicyFields

S3 POST Policy signature fields; send unchanged as form-data during direct upload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | Plaintext temporary object path, identical to base64_decode(file_key) | 
**contentType** | **String** | Must match the decoded content_type from the pre-upload request | 
**xAmzCredential** | **String** | AWS temporary credential and scope; submit them unchanged during direct upload | 
**xAmzAlgorithm** | **String** | AWS signing algorithm; submit it unchanged during direct upload | 
**xAmzDate** | **String** | AWS signing timestamp; submit it unchanged during direct upload | 
**policy** | **String** | Base64-encoded S3 POST Policy; submit it unchanged during direct upload | 
**xAmzSignature** | **String** | S3 POST Policy signature; submit it unchanged during direct upload | 

