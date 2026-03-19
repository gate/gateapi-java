
# ApiResponseExSkillGetBeginnerTaskListResp

Get beginner task list response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code: 0 &#x3D; success, 1007 &#x3D; no task data, 1008 &#x3D; not logged in |  [optional]
**label** | **String** | Error identifier code. Empty string on success, machine-readable error label on error |  [optional]
**message** | **String** | Error description |  [optional]
**data** | [**ApiResponseExSkillGetBeginnerTaskListRespData**](ApiResponseExSkillGetBeginnerTaskListRespData.md) |  |  [optional]
**timestamp** | **Long** | Server timestamp (milliseconds) |  [optional]

