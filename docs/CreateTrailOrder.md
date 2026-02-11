
# CreateTrailOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Contract name | 
**amount** | **String** | Trading quantity in contracts, positive for buy, negative for sell | 
**activationPrice** | **String** | Activation price, 0 means trigger immediately |  [optional]
**isGte** | **Boolean** | true: activate when market price &gt;&#x3D; activation price, false: &lt;&#x3D; activation price |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Activation price type: 1-latest price, 2-index price, 3-mark price |  [optional]
**priceOffset** | **String** | Callback ratio or price distance, e.g., &#x60;0.1&#x60; or &#x60;0.1%&#x60; |  [optional]
**reduceOnly** | **Boolean** | Whether reduce only |  [optional]
**positionRelated** | **Boolean** | Whether bound to a position (if position_related &#x3D; true (position-related), then reduce_only must also be true) |  [optional]
**text** | **String** | Order custom information, optional field. Used to identify the order source or set a user-defined ID.  If non-empty, it must meet one of the following rules:  1. Internal Reserved Fields (identifying order source): - &#x60;apiv4&#x60;: API call 2. User-defined Fields (setting custom ID): - Must start with &#x60;t-&#x60; - The content after &#x60;t-&#x60; must not exceed 28 bytes in length - Can only contain: numbers, letters, underscores (_), hyphens (-), or dots (.) - Examples: &#x60;t-my-order-001&#x60;, &#x60;t-trail_2024.01&#x60;  Note: User-defined fields must not conflict with internal reserved fields. |  [optional]
**posMarginMode** | **String** | Position margin mode: isolated/cross |  [optional]
**positionMode** | **String** | Position mode: single, dual, and dual_plus |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

