
# P2pChatListResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**List&lt;P2pChatMessage&gt;**](P2pChatMessage.md) | Message List |  [optional]
**memo** | **String** | Payment tip (displayed on homepage only) |  [optional]
**hasHistory** | **Boolean** | Whether historical records exist |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**SRVTM** | **Integer** | Timestamp of the latest message. |  [optional]
**orderStatus** | **String** | Raw order status in DB; typical values: &#x60;OPEN&#x60;, &#x60;PAID&#x60;, &#x60;LOCKED&#x60;, &#x60;ACCEPT&#x60;, &#x60;BCLOSED&#x60;, &#x60;CANCEL&#x60;, &#x60;BECANCEL&#x60;, &#x60;SCLOSED&#x60;, &#x60;SCANCEL&#x60;. |  [optional]

