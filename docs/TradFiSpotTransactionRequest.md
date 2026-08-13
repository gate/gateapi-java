
# TradFiSpotTransactionRequest

Transfer request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | [**AssetEnum**](#AssetEnum) | Asset, USDT only | 
**change** | **String** | Change amount | 
**type** | [**TypeEnum**](#TypeEnum) | Transaction type (deposit&#x3D;deposit, withdraw&#x3D;withdrawal) | 
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

