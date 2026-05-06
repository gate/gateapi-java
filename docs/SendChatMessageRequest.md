
# SendChatMessageRequest

Send chat message request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **Integer** | Order ID | 
**type** | [**TypeEnum**](#TypeEnum) | Message type: &#x60;0&#x60; text; &#x60;1&#x60; file (image or video); defaults to &#x60;0&#x60;. |  [optional]
**message** | **String** | Message body. For &#x60;type&#x3D;0&#x60;, plain text up to 500 characters; for &#x60;type&#x3D;1&#x60;, pass the &#x60;file_key&#x60; returned by &#x60;upload_chat_file&#x60;. | 

## Enum: TypeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

