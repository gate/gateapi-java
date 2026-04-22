
# HodlerAirdropV4ProjectItem

HODLer Airdrop activity list item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hodlerId** | **String** | Product ID | 
**name** | **String** | Product Name | 
**asset** | **String** | Airdrop currency | 
**status** | [**StatusEnum**](#StatusEnum) | Project status | 
**totalAmount** | **String** | Total airdrop amount | 
**openTimest** | **String** | Event start time, format Y-m-d H:i:s, UTC | 
**closeTimest** | **String** | Event end time, format Y-m-d H:i:s, UTC | 
**perGtRewardToken** | **String** | The number of airdrop coins that can be obtained for each GT. When the calculation is in progress, an empty string is returned. |  [optional]
**userCount** | **String** | Number of participants |  [optional]
**maxQueueAmount** | **String** | Personal GT limit |  [optional]

## Enum: StatusEnum

Name | Value
---- | -----
UNDERWAY | &quot;UNDERWAY&quot;
PREHEAT | &quot;PREHEAT&quot;
FINISH | &quot;FINISH&quot;

