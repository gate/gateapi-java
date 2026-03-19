
# InlineResponse2006

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CodeEnum**](#CodeEnum) | Response Code. &#x60;0&#x60; &#x3D; Success; &#x60;2002&#x60; &#x3D; User not logged in; &#x60;50105&#x60; &#x3D; Input parameter validation failed |  [optional]
**label** | **String** | Error identifier code. Empty string on success, machine-readable error label on error |  [optional]
**message** | **String** |  |  [optional]
**data** | [**InlineResponse2006Data**](InlineResponse2006Data.md) |  |  [optional]

## Enum: CodeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_2002 | 2002
NUMBER_50105 | 50105

