
# FuturesInitialOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Futures contract | 
**size** | **Long** | Represents the number of contracts that need to be closed, full closing: size&#x3D;0 Partial closing: plan-close-short-position size&gt;0  Partial closing: plan-close-long-position size&lt;0 |  [optional]
**price** | **String** | Order price. Set to 0 to use market price | 
**close** | **Boolean** | In One-way Mode, when closing all positions, this must be set to true to perform the closing operation When partially closing positions in One-way Mode or Hedge Mode, you can omit close or set close&#x3D;false |  [optional]
**tif** | [**TifEnum**](#TifEnum) | Time in force strategy, default is gtc, market orders currently only support ioc mode  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled |  [optional]
**text** | **String** | The source of the order, including: - web: Web - api: API call - app: Mobile app |  [optional]
**reduceOnly** | **Boolean** | When set to true, perform automatic position reduction operation. Set to true to ensure that the order will not open a new position, and is only used to close or reduce positions |  [optional]
**autoSize** | **String** | One-way Mode: auto_size is not required Hedge Mode full closing (size&#x3D;0): auto_size must be set, close_long for closing long positions, close_short for closing short positions Hedge Mode partial closing (size≠0): auto_size is not required |  [optional]
**isReduceOnly** | **Boolean** | Is the order reduce-only |  [optional] [readonly]
**isClose** | **Boolean** | Is the order to close position |  [optional] [readonly]

## Enum: TifEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;

