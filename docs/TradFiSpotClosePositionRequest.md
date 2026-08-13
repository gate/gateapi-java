
# TradFiSpotClosePositionRequest

Close position request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Symbol | 
**closeVolume** | **String** | Close quantity; required for partial close |  [optional]
**closeType** | [**CloseTypeEnum**](#CloseTypeEnum) | Close type (1&#x3D;partial close, 2&#x3D;close all) | 

## Enum: CloseTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

