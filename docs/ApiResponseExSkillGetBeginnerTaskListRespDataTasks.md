
# ApiResponseExSkillGetBeginnerTaskListRespDataTasks

Getting started mission information. `task_center_id` and `status` are included in required: both are allowed to be 0 (registration tasks, download tasks to be received), And avoid Go SDK using omitempty for integer zero values, which will cause fields to be lost during client serialization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**welfareTaskId** | **Long** | Rewards Center task ID |  [optional]
**taskCenterId** | **Long** | Task center task ID (fixed at 0 for registration tasks) | 
**taskType** | **Integer** | Task type: 1&#x3D;KYC secondary certification 2&#x3D;Spot 3&#x3D;Contract 4&#x3D;Invitation 5&#x3D;Quantification 6&#x3D;Yu Bibao 7&#x3D;startup 8&#x3D;First deposit 10&#x3D;Registration task 11&#x3D;Guide task 23&#x3D;Download task |  [optional]
**taskName** | **String** | Task name |  [optional]
**taskDesc** | **String** | Task description, may contain &lt;span&gt; highlight tags |  [optional]
**rewardNum** | **String** | Reward value |  [optional]
**rewardUnit** | **String** | Reward unit (e.g., USDT, BTC) |  [optional]
**prizeType** | [**PrizeTypeEnum**](#PrizeTypeEnum) | Reward type: 1 &#x3D; points, 2 &#x3D; regular coupon, 3 &#x3D; VIP coupon |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Task status: 0&#x3D;Not claimed (typically a download task waiting to be claimed) 1&#x3D;Received/in progress 2&#x3D;Completed and waiting to be claimed 3&#x3D;Rewards in progress 4&#x3D;Completed/settled 5&#x3D;Expired | 

## Enum: PrizeTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

## Enum: StatusEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5

