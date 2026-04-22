
# ApiResponseExSkillClaimTaskResp

Receive task response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code, 0 means success |  [optional]
**label** | **String** | Error identifier code. Empty string on success, machine-readable error label on error |  [optional]
**message** | **String** | Error description |  [optional]
**data** | [**Object**](.md) | Empty object {} on success |  [optional]
**timestamp** | **Long** | Server timestamp (milliseconds) |  [optional]

