
# InlineObject5

Close position request parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closeType** | [**CloseTypeEnum**](#CloseTypeEnum) | 平仓类型  说明： - 1：部分平仓（必须传 close_volume） - 2：全平（无需传 close_volume） | 
**closeVolume** | **String** | 平仓数量  说明： - 当 close_type &#x3D; 1 时必传 - 当 close_type &#x3D; 2 时忽略该字段 |  [optional]

## Enum: CloseTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

