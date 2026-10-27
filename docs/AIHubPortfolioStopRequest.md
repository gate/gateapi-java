
# AIHubPortfolioStopRequest

Single owner-scoped stop. Existing six-type ID/type requests retain default exits. smart_position requires explicit mode, limit requires options; futures_combo uses fixed whole-portfolio close/settlement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyId** | **String** |  | 
**strategyType** | [**StrategyType**](StrategyType.md) |  | 
**stopMode** | [**StopModeEnum**](#StopModeEnum) | Required only for smart_position. Other types reject custom exit options. |  [optional]
**stopOptions** | [**AIHubRebalanceStopOptions**](AIHubRebalanceStopOptions.md) |  |  [optional]

## Enum: StopModeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;
NO_CLOSE | &quot;no_close&quot;

