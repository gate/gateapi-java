
# AutoInvestMinInvestAmount

QueryAvailableInvestmentMinimumAmountRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**money** | **String** | Currency, optional: USDT or BTC | 
**assetType** | [**AssetTypeEnum**](#AssetTypeEnum) | Asset type: 1 for cryptocurrency, 2 for TradFi stocks; must be provided explicitly | 
**items** | [**List&lt;AutoInvestMinInvestAmountItems&gt;**](AutoInvestMinInvestAmountItems.md) |  | 

## Enum: AssetTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

