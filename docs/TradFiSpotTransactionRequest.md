
# TradFiSpotTransactionRequest

Fund transfer request parameters. Transfer in means moving funds from the spot account to the stock account; transfer out means moving funds from the stock account to the spot account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | [**AssetEnum**](#AssetEnum) | Asset, USDT only | 
**change** | **String** | Change amount, must be greater than 0 | 
**type** | [**TypeEnum**](#TypeEnum) | Transaction type. deposit transfers funds from the spot account to the stock account; withdraw transfers funds from the stock account to the spot account. | 
**refId** | **String** | Business idempotent ID | 

## Enum: AssetEnum

Name | Value
---- | -----
USDT | &quot;USDT&quot;

## Enum: TypeEnum

Name | Value
---- | -----
DEPOSIT | &quot;deposit&quot;
WITHDRAW | &quot;withdraw&quot;

