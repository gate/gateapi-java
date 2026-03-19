
# ApiResponseExSkillGetBeginnerTaskListRespDataTasks

Beginner task information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**welfareTaskId** | **Long** | Rewards Center task ID |  [optional]
**taskCenterId** | **Long** | Task center task ID (fixed at 0 for registration tasks) |  [optional]
**taskType** | **Integer** | Task type: 1 &#x3D; KYC level-2 verification, 2 &#x3D; spot, 3 &#x3D; futures, 4 &#x3D; referral, 5 &#x3D; quantitative, 6 &#x3D; earn, 7 &#x3D; startup, 8 &#x3D; first deposit, 10 &#x3D; registration task, 11 &#x3D; onboarding task |  [optional]
**taskName** | **String** | Task name |  [optional]
**taskDesc** | **String** | Task description, may contain &lt;span&gt; highlight tags |  [optional]
**rewardNum** | **String** | Reward value |  [optional]
**rewardUnit** | **String** | Reward unit (e.g., USDT, BTC) |  [optional]
**prizeType** | [**PrizeTypeEnum**](#PrizeTypeEnum) | Reward type: 1 &#x3D; points, 2 &#x3D; regular coupon, 3 &#x3D; VIP coupon |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Task status: 0 &#x3D; unclaimed, 1 &#x3D; claimed, 2 &#x3D; reward pending, 3 &#x3D; rewarding, 4 &#x3D; completed, 5 &#x3D; expired |  [optional]

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

