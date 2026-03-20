
# InlineResponse2008

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Response code. &#x60;0&#x60; &#x3D; success; &#x60;2002&#x60; &#x3D; user not logged in; &#x60;50105&#x60; &#x3D; parameter validation failed; &#x60;10001&#x60; &#x3D; coupon record does not exist or does not belong to current user; &#x60;10000&#x60; &#x3D; invalid parameter (e.g., task coupon missing coupon_info) |  [optional]
**label** | **String** | Error identifier code. Empty string on success, machine-readable error label on error |  [optional]
**message** | **String** |  |  [optional]
**data** | [**InlineResponse2008Data**](InlineResponse2008Data.md) |  |  [optional]

## Enum: CodeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_2002 | 2002
NUMBER_50105 | 50105
NUMBER_10001 | 10001
NUMBER_10000 | 10000

