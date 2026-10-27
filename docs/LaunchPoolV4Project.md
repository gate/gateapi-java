
# LaunchPoolV4Project

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **Integer** | Product ID | 
**name** | **String** | Product Name | 
**totalAmount** | **String** | Total rewards | 
**startTimest** | **Integer** | Project start timestamp | 
**endTimest** | **Integer** | Project end timestamp | 
**days** | **Integer** | Staking period (in days) | 
**projectState** | [**ProjectStateEnum**](#ProjectStateEnum) | Project status: 1 for ongoing, 2 for warming up, 3 for ended | 
**rewardPools** | [**List&lt;LaunchPoolV4RewardPool&gt;**](LaunchPoolV4RewardPool.md) | Collateral currency list | 

## Enum: ProjectStateEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

