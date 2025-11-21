
# FuturesUpdatePriceTriggeredOrder

Modify Price Order Details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settle** | **String** | Settlement Currency (e.g., USDT, BTC) |  [optional] [readonly]
**orderId** | **Integer** | ID of the Pending Take-Profit/Stop-Loss Trigger Order |  [optional] [readonly]
**contact** | **String** | The order ID of the modified price-triggered order. This ID is returned upon successful creation of the price-triggered order. Note: This ID must be passed in both the request path and request body. |  [optional]
**size** | **Long** | Modified Contract Quantity. Full Close: 0; Partial Close: Positive/Negative values indicate direction (consistent with the creation interface logic). |  [optional]
**price** | **String** | Represents the modified trading price. A value of 0 indicates a market order. |  [optional]
**triggerPrice** | **String** | Modified Trigger Price |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Reference price type. 0 - Latest trade price, 1 - Mark price, 2 - Index price |  [optional]
**autoSize** | **String** | One-way Mode: auto_size is not required Hedge Mode partial closing (size≠0): auto_size is not required Hedge Mode full closing (size&#x3D;0): auto_size must be set, close_long for closing long positions, close_short for closing short positions |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2

