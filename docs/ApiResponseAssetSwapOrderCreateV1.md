
# ApiResponseAssetSwapOrderCreateV1

Asset allocation optimization - unified response to orders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code, 0 means success | 
**label** | **String** | Error identification code, empty string on success |  [optional]
**message** | **String** | Description information | 
**data** | **Object** | It is the order result when successful, and null when it fails. | 
**timestamp** | **Long** | Server timestamp (milliseconds) | 

