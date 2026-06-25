
# P2pSendChatMessageResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SRVTM** | **Integer** | Timestamp when message was successfully sent (current timestamp) |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**conversationId** | **String** | Chat ID, formatted as both parties&#39; UIDs concatenated in ascending order |  [optional]
**msgType** | [**MsgTypeEnum**](#MsgTypeEnum) | Message content type when risk control is hit. 0: text |  [optional]
**riskType** | [**RiskTypeEnum**](#RiskTypeEnum) | Risk control display type. 1: off-platform traffic diversion risk; returned only when risk control is hit |  [optional]
**toastMsg** | **String** | Risk control prompt message; returned only when risk_type&#x3D;1 |  [optional]

## Enum: MsgTypeEnum

Name | Value
---- | -----
NUMBER_0 | 0

## Enum: RiskTypeEnum

Name | Value
---- | -----
NUMBER_1 | 1

