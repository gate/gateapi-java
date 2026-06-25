
# TradFiClosePositionRequest

Close position request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closeType** | [**CloseTypeEnum**](#CloseTypeEnum) | Close Type Description: - 1: Partial Close (close_volume is required) - 2: Full Close (close_volume is not required) | 
**closeVolume** | **String** | Close Volume Description: - Required when close_type &#x3D; 1 - Ignored when close_type &#x3D; 2 |  [optional]

## Enum: CloseTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

