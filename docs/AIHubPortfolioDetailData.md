
# AIHubPortfolioDetailData

Policy details data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyId** | **String** |  | 
**strategyType** | [**StrategyType**](StrategyType.md) |  | 
**market** | **String** | Single market, or empty string for a portfolio; use assets/markets for the latter. | 
**status** | **String** |  | 
**baseInfo** | [**AIHubPortfolioBaseInfo**](AIHubPortfolioBaseInfo.md) |  | 
**metrics** | [**AIHubPortfolioMetrics**](AIHubPortfolioMetrics.md) |  | 
**position** | [**AIHubPortfolioPosition**](AIHubPortfolioPosition.md) |  |  [optional]
**stopSupported** | **Boolean** |  | 
**assets** | **List&lt;String&gt;** |  |  [optional]
**markets** | **List&lt;String&gt;** |  |  [optional]
**positions** | [**List&lt;AIHubPortfolioAssetPosition&gt;**](AIHubPortfolioAssetPosition.md) |  |  [optional]
**positionsStatus** | [**PositionsStatusEnum**](#PositionsStatusEnum) |  |  [optional]
**_configuration** | [**Object**](.md) | Product-specific saved configuration. spot_martingale exposes AIHubSpotMartingaleConfiguration; absence is unverified. Runtime recovery internals are excluded. |  [optional]
**stopProgress** | [**AIHubStopProgress**](AIHubStopProgress.md) |  |  [optional]

## Enum: PositionsStatusEnum

Name | Value
---- | -----
VERIFIED | &quot;verified&quot;
PARTIAL | &quot;partial&quot;
UNVERIFIED | &quot;unverified&quot;
HISTORICAL | &quot;historical&quot;

