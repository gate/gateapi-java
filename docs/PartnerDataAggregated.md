
# PartnerDataAggregated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rebateAmount** | **String** | 返佣金额，字符串格式保证精度  最多保留 6 位小数，去除尾零 | 
**tradeVolume** | **String** | 交易量，字符串格式保证精度  最多保留 6 位小数，去除尾零 | 
**netFee** | **String** | 净手续费，字符串格式保证精度  最多保留 6 位小数，去除尾零 | 
**customerCount** | **Integer** | Customer count (invited users) | 
**tradingUserCount** | **String** | 交易人数，字符串形式（与线上 JSON 序列化一致）  仅在 business_type&#x3D;0（全部）时返回具体数值，其他业务类型返回 null | 
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

