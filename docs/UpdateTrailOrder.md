
# UpdateTrailOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order ID | 
**amount** | **String** | Total trading quantity in contracts, positive for buy, negative for sell, 0 means no modification |  [optional]
**activationPrice** | **String** | Activation price, 0 means trigger immediately, empty means no modification |  [optional]
**isGteStr** | **String** | true: activate when market price &gt;&#x3D; activation price, false: &lt;&#x3D; activation price, empty means no modification |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Activation price type, not provided or 0 means no modification, 1-latest price, 2-index price, 3-mark price |  [optional]
**priceOffset** | **String** | Callback ratio or price distance, e.g., &#x60;0.1&#x60; or &#x60;0.1%&#x60;; empty means no modification |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

