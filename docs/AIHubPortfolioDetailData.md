
# AIHubPortfolioDetailData

策略详情数据。

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyId** | **String** |  | 
**strategyType** | [**StrategyType**](StrategyType.md) |  | 
**market** | **String** |  | 
**status** | **String** |  | 
**baseInfo** | [**Map&lt;String, oas_any_type_not_mapped&gt;**](oas_any_type_not_mapped.md) | 基础信息，字段按策略类型动态变化 | 
**metrics** | [**Map&lt;String, oas_any_type_not_mapped&gt;**](oas_any_type_not_mapped.md) | 指标信息，字段按策略类型动态变化 | 
**position** | [**Map&lt;String, oas_any_type_not_mapped&gt;**](oas_any_type_not_mapped.md) | 仓位或持仓信息，字段按策略类型动态变化 |  [optional]
**stopSupported** | **Boolean** |  | 

