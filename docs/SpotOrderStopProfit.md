
# SpotOrderStopProfit

Take profit for limit orders. Pass {} to cancel take profit; pass null to leave take profit unchanged.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**triggerPrice** | **String** | Take profit trigger price When &#x60;side &#x3D;&#x3D; \&quot;buy\&quot;&#x60;, &#x60;trigger_price&#x60; must be greater than &#x60;price&#x60; When &#x60;side &#x3D;&#x3D; \&quot;sell\&quot;&#x60;, &#x60;trigger_price&#x60; must be less than &#x60;price&#x60; |  [optional]
**orderPrice** | **String** | Take profit order price |  [optional]

