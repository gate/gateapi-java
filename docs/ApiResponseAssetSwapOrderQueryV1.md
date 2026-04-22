
# ApiResponseAssetSwapOrderQueryV1

Asset allocation optimization - unified response to query orders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code, 0 means success | 
**label** | **String** | Error identification code, empty string on success |  [optional]
**message** | **String** | Description information | 
**data** | **Object** | Order details on success, null on failure | 
**timestamp** | **Long** | Server timestamp (milliseconds) | 

