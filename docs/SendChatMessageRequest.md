
# SendChatMessageRequest

Send chat message request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **Integer** | Order ID | 
**type** | [**TypeEnum**](#TypeEnum) | Message type: &#x60;0&#x60; text; &#x60;1&#x60; file (image or video); defaults to &#x60;0&#x60;. |  [optional]
**message** | **String** | Message content. When type&#x3D;0, pass text up to 500 characters, which goes through off-platform traffic diversion risk control; when hit, the response contains risk_type&#x3D;1 and toast_msg. When type&#x3D;1, pass the file_key returned by upload_chat_file | 

## Enum: TypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

