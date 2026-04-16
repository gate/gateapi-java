
# HodlerAirdropV4ProjectItem

HODLer Airdrop活动列表项

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hodlerId** | **String** | Product ID | 
**name** | **String** | Product Name | 
**asset** | **String** | 空投币种 | 
**status** | [**StatusEnum**](#StatusEnum) | 项目状态 | 
**totalAmount** | **String** | 空投总量 | 
**openTimest** | **String** | 活动开始时间，格式 Y-m-d H:i:s，UTC | 
**closeTimest** | **String** | 活动结束时间，格式 Y-m-d H:i:s，UTC | 
**perGtRewardToken** | **String** | 每枚GT可获得的空投币数量，计算中时返回空字符串 |  [optional]
**userCount** | **String** | 参与人数 |  [optional]
**maxQueueAmount** | **String** | 个人参与GT上限 |  [optional]

## Enum: StatusEnum

Name | Value
---- | -----
UNDERWAY | &quot;UNDERWAY&quot;
PREHEAT | &quot;PREHEAT&quot;
FINISH | &quot;FINISH&quot;

