
# AIHubCreateData

Policy information returned after the policy is successfully created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**strategyId** | **String** |  |  [optional]
**strategyType** | [**StrategyType**](StrategyType.md) |  |  [optional]
**market** | **String** |  |  [optional]
**status** | **String** | Observed product lifecycle state, or unknown. Creation acceptance/starting is not running; stopping/finished alone does not prove funds settled. |  [optional]
**jumpUrl** | **String** |  |  [optional]
**operationStatus** | **String** | pending when the write result requires verification; rejected for a proven pre-effect refusal. |  [optional]
**recoveryRequired** | **Boolean** |  |  [optional]

