
# SpotPovOrder

Spot POV order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID |  [readonly]
**currencyPair** | **String** | Currency pair |  [readonly]
**side** | **String** | Buy or sell order |  [readonly]
**amount** | **String** | Trade amount |  [readonly]
**participationRate** | **Integer** | Target participation rate as a percentage. Allowed values: 5, 10, 20, and 40 |  [readonly]
**ttl** | **String** | Time to live. Valid values: 1h, 6h, 12h, 1d, 2d, 3d, 4d, 5d, 6d, and 7d |  [readonly]
**limitPrice** | **String** | Limit price. If omitted, the market price is used |  [optional] [readonly]
**triggerPrice** | **String** | Trigger price. If omitted, the order is triggered immediately |  [optional] [readonly]
**status** | **String** | Order status  - CREATED: Created - CANCELING: Canceling - RUNNING: Running - COMPLETED: Completed - EXPIRED: Expired - TERMINATED: Terminated |  [readonly]
**terminatedAs** | **String** | Order termination reason code |  [optional] [readonly]
**startTimeMs** | **Long** | Order execution start time in milliseconds |  [optional] [readonly]
**endTimeMs** | **Long** | Order execution end time in milliseconds |  [optional] [readonly]
**expireTimeMs** | **Long** | Order expiration time in milliseconds |  [optional] [readonly]
**createTimeMs** | **Long** | Creation time of order (in milliseconds) |  [readonly]
**updateTimeMs** | **Long** | Last modification time of order (in milliseconds) |  [optional] [readonly]
**text** | **String** | Order custom information. Users can set custom ID with this field. Custom fields must meet the following conditions:  1. Must start with &#x60;t-&#x60; 2. Excluding &#x60;t-&#x60;, length cannot exceed 28 bytes 3. Can only contain numbers, letters, underscore(_), hyphen(-) or dot(.)  |  [optional]

