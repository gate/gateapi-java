
# P2pChatMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSell** | **Integer** | Whether the current user is the seller. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**msgType** | **Integer** | Message type: &#x60;0&#x60; text; &#x60;1&#x60; file; &#x60;2&#x60; template; &#x60;3&#x60; order-share; &#x60;4&#x60; payment-share; &#x60;5&#x60; status update. |  [optional]
**msg** | **String** | Message content; for file messages, usually URL or file key. |  [optional]
**username** | **String** | Message sender username |  [optional]
**timest** | **Integer** | Message timestamp |  [optional]
**msgObj** | [**P2pChatMessagePayload**](P2pChatMessagePayload.md) |  |  [optional]
**uid** | **String** | Sender&#39;s crypto UID; system messages may use &#x60;System&#x60; or an empty string. |  [optional]
**type** | **Integer** | Display type: &#x60;1&#x60; file message; &#x60;2&#x60; system message. |  [optional]
**pic** | **String** | File link |  [optional]
**fileKey** | **String** | File key |  [optional]
**fileType** | **String** | File type: &#x60;image&#x60; for images, &#x60;video&#x60; for videos. |  [optional]

