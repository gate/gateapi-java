
# ApiResponseExSkillGetUserIdentityResp

Get user identity response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | Business error code: 0 &#x3D; success, 1001 &#x3D; existing user, 1002 &#x3D; risk-controlled user, 1003 &#x3D; sub-account, 1004 &#x3D; agent, 1005 &#x3D; market maker, 1006 &#x3D; enterprise account, 1008 &#x3D; not logged in |  [optional]
**label** | **String** | Error identifier code. Empty string on success, machine-readable error label on error |  [optional]
**message** | **String** | Error description |  [optional]
**data** | [**Object**](.md) | Empty object {} on success, null on failure |  [optional]
**timestamp** | **Long** | Server timestamp (milliseconds) |  [optional]

