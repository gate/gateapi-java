
# AIHubRecommendation

A single piece of strategy recommendation information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recommendationId** | **String** |  | 
**market** | **String** |  | 
**strategyType** | [**StrategyType**](StrategyType.md) |  | 
**strategyName** | **String** |  | 
**backtestApr** | **String** |  |  [optional]
**maxDrawdown** | **String** |  |  [optional]
**summary** | **String** |  | 
**strategyParamsPreview** | **String** | Recommended-parameter preview as JSON text (string-encoded so clients deserialize it consistently). The value is a serialized JSON object whose structure varies by strategy type; callers or upper-layer models must parse it. |  [optional]

