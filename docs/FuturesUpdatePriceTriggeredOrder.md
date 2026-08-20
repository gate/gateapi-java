
# FuturesUpdatePriceTriggeredOrder

Modify Price Order Details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settle** | **String** | Perpetual futures settlement currency, e.g. usdt, btc, usd1 |  [optional]
**orderId** | **Long** | ID of the Pending Take-Profit/Stop-Loss Trigger Order | 
**size** | **Long** | Modified Contract Quantity. Full Close: 0; Partial Close: Positive/Negative values indicate direction (consistent with the creation interface logic). |  [optional]
**amount** | **String** | Same as &#x60;size&#x60;; used for decimal contract size. When both &#x60;size&#x60; and &#x60;amount&#x60; are provided, &#x60;amount&#x60; takes precedence. |  [optional]
**price** | **String** | Represents the modified trading price. A value of 0 indicates a market order. |  [optional]
**triggerPrice** | **String** | Modified Trigger Price |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Reference price type. 0 - Latest trade price, 1 - Mark price, 2 - Index price |  [optional]
**autoSize** | **String** | One-way Mode: auto_size is not required Hedge Mode partial closing (size≠0): auto_size is not required Hedge Mode full closing (size&#x3D;0): auto_size must be set, close_long for closing long positions, close_short for closing short positions |  [optional]
**close** | **Boolean** | When fully closing a position in single-position mode, close must be set to true to execute the close operation. When partially closing a position in single-position mode or in dual-position mode, close can be left unset or set to false. |  [optional]

## Enum: PriceTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2

