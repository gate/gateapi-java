
# CrossexIsolatedMarginRequest

Request body for increasing or decreasing isolated margin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Hyperliquid futures trading pair | 
**margin** | **String** | Margin adjustment amount. Positive values increase margin, while negative values decrease margin. Values with more than two decimal places are truncated to two decimal places | 
**positionSide** | [**PositionSideEnum**](#PositionSideEnum) | Position side (NONE/LONG/SHORT). Defaults to NONE for one-way positions if omitted |  [optional]

## Enum: PositionSideEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
LONG | &quot;LONG&quot;
SHORT | &quot;SHORT&quot;

