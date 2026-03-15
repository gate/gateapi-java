
# TradFiTransactionRequest

Fund Transfer Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | **String** | Asset type, e.g., USDT, currently only USDT is supported | 
**change** | **String** | Change Quantity, supports up to two decimal places | 
**type** | [**TypeEnum**](#TypeEnum) | Transaction Type (deposit - transfer in, withdraw - transfer out) | 

## Enum: TypeEnum

Name | Value
---- | -----
DEPOSIT | &quot;deposit&quot;
WITHDRAW | &quot;withdraw&quot;

