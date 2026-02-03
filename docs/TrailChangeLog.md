
# TrailChangeLog

Trail order modification records

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**updatedAt** | **Long** | Update time |  [optional] [readonly]
**amount** | **String** | Trading quantity in contracts, positive for buy, negative for sell |  [optional] [readonly]
**isGte** | **Boolean** | true: activate when market price &gt;&#x3D; activation price, false: &lt;&#x3D; activation price |  [optional] [readonly]
**activationPrice** | **String** | Activation price, 0 means trigger immediately |  [optional] [readonly]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Activation price type: 0-unknown, 1-latest price, 2-index price, 3-mark price |  [optional] [readonly]
**priceOffset** | **String** | Callback ratio or price distance, e.g., &#x60;0.1&#x60; or &#x60;0.1%&#x60; |  [optional] [readonly]
**isCreate** | **Boolean** | true - order creation, false - order modification |  [optional] [readonly]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

