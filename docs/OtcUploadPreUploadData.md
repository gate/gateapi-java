
# OtcUploadPreUploadData

Pre-upload credentials and S3 direct-upload parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileKey** | **String** | Base64 temporary object path; pass back **unchanged** on business submit—do not decode | 
**url** | **String** | S3 direct upload URL | 
**fields** | [**OtcUploadPreUploadPolicyFields**](OtcUploadPreUploadPolicyFields.md) |  | 
**expiresIn** | **Integer** | Policy validity period in seconds; currently 5400 (90 minutes); aligns with &#x60;expiration&#x60; in &#x60;fields.Policy&#x60;; call this endpoint again after expiry | 

