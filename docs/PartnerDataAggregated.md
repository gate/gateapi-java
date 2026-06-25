
# PartnerDataAggregated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rebateAmount** | **String** | Rebate amount as a string for precision. Up to 6 decimal places; trailing zeros removed. | 
**tradeVolume** | **String** | Trading volume as a string for precision. Up to 6 decimal places; trailing zeros removed. | 
**netFee** | **String** | Net fee as a string for precision. Up to 6 decimal places; trailing zeros removed. | 
**customerCount** | **Integer** | Customer count (invited users) | 
**tradingUserCount** | **String** | Transaction participant count​ (string format, consistent with online JSON serialization) only returns a specific value when business_type&#x3D;0(all), and returns nullfor other business types. | 
**timeRangeDesc** | **String** | Time range description | 
**businessType** | [**BusinessTypeEnum**](#BusinessTypeEnum) | Business Type | 
**businessTypeDesc** | **String** | Business type description; allowed values: All, Spot, Futures, Alpha, Web3, Perps (DEX), Exchange All, Web3 All, TradFi | 

## Enum: BusinessTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8

