
# TrailOrder

Trail order details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Order ID |  [optional] [readonly]
**userId** | **Long** | User ID |  [optional] [readonly]
**user** | **Long** | User ID |  [optional] [readonly]
**contract** | **String** | Contract name |  [optional]
**settle** | **String** | Settle currency |  [optional]
**amount** | **String** | Trading quantity in contracts, positive for buy, negative for sell |  [optional]
**isGte** | **Boolean** | true: activate when market price &gt;&#x3D; activation price, false: &lt;&#x3D; activation price |  [optional]
**activationPrice** | **String** | Activation price, 0 means trigger immediately |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Activation price type: 0-unknown, 1-latest price, 2-index price, 3-mark price |  [optional]
**priceOffset** | **String** | Callback ratio or price distance, e.g., &#x60;0.1&#x60; or &#x60;0.1%&#x60; |  [optional]
**text** | **String** | Custom field |  [optional]
**reduceOnly** | **Boolean** | Reduce Position Only |  [optional]
**positionRelated** | **Boolean** | Whether bound to position |  [optional]
**createdAt** | **Long** | Created time |  [optional] [readonly]
**activatedAt** | **Long** | Activation time |  [optional] [readonly]
**finishedAt** | **Long** | End time |  [optional] [readonly]
**createTime** | **Long** | Created time |  [optional] [readonly]
**activeTime** | **Long** | Activation time |  [optional] [readonly]
**finishTime** | **Long** | End time |  [optional] [readonly]
**reason** | **String** | End reason |  [optional] [readonly]
**suborderText** | **String** | Sub-order text field |  [optional] [readonly]
**isDualMode** | **Boolean** | Whether dual position mode when creating order |  [optional] [readonly]
**triggerPrice** | **String** | Trigger price |  [optional] [readonly]
**suborderId** | **Long** | Sub-order ID |  [optional] [readonly]
**sideLabel** | **String** | Order direction label: long/short/open long/open short/close long/close short |  [optional] [readonly]
**originalStatus** | **Integer** | Order status |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Simplified order status: open/finished |  [optional] [readonly]
**positionSideOutput** | **String** | Same as side_label, client requires consistency with other order types |  [optional] [readonly]
**updatedAt** | **Long** | Update time |  [optional] [readonly]
**extremumPrice** | **String** | Extremum price |  [optional] [readonly]
**statusCode** | **String** | Status code value |  [optional] [readonly]
**createdAtPrecise** | **String** | Creation time (high precision, seconds.microseconds format) |  [optional] [readonly]
**finishedAtPrecise** | **String** | End time (high precision, seconds.microseconds format) |  [optional] [readonly]
**activatedAtPrecise** | **String** | Activation time (high precision, seconds.microseconds format) |  [optional] [readonly]
**statusLabel** | **String** | Status internationalization label (translated status text) |  [optional] [readonly]
**posMarginMode** | **String** | Position margin mode: isolated/cross |  [optional] [readonly]
**positionMode** | **String** | Position mode: single, dual, and dual_plus |  [optional] [readonly]
**errorLabel** | **String** | Error label |  [optional] [readonly]
**leverage** | **String** | Leverage |  [optional] [readonly]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

## Enum: StatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
FINISHED | &quot;finished&quot;

