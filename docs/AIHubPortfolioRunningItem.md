
# AIHubPortfolioRunningItem

A single record in the list of running policies.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyId** | **String** |  | 
**strategyType** | [**StrategyType**](StrategyType.md) |  | 
**strategyName** | **String** |  | 
**market** | **String** | Single market, or empty string for a portfolio; use assets/markets for the latter. | 
**status** | **String** |  | 
**pnl** | **String** |  |  [optional]
**pnlRate** | **String** |  |  [optional]
**investAmount** | **String** |  |  [optional]
**createdAt** | **String** | Created time |  [optional]
**assets** | **List&lt;String&gt;** |  |  [optional]
**markets** | **List&lt;String&gt;** |  |  [optional]

