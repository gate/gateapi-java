
# ApiResponseAssetSwapOrderPreviewV1

Asset allocation optimization-preview unified response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code, 0 means success | 
**label** | **String** | Error identification code, empty string on success |  [optional]
**message** | **String** | Description information | 
**data** | **Object** | Preview result when successful, null when failed | 
**timestamp** | **Long** | Server timestamp (milliseconds) | 

