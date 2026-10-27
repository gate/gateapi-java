
# CouponDetailExtraItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Display type. &#x60;string&#x60; &#x3D; plain text; &#x60;timestamp&#x60; &#x3D; Unix timestamp (frontend formats as date); &#x60;day&#x60; &#x3D; number of days (integer); &#x60;hour&#x60; &#x3D; number of hours (integer); &#x60;status&#x60; &#x3D; status enum value; &#x60;btn&#x60; &#x3D; button with redirect (value is button label) |  [optional]
**key** | **String** | Label Text (already i18n translated) |  [optional]
**value** | **Object** | Value. Integer when type is timestamp/day/hour; string otherwise |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
TIMESTAMP | &quot;timestamp&quot;
DAY | &quot;day&quot;
HOUR | &quot;hour&quot;
STATUS | &quot;status&quot;
BTN | &quot;btn&quot;

