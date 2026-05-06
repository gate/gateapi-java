
# GetChatsListRequest

Get chat history request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txid** | **Integer** | Order ID; omit or &#x60;0&#x60; to return the latest order with chat for the user. |  [optional]
**lastreceived** | **Integer** | Timestamp of the last received message for backward incremental fetch; omit on first load. |  [optional]
**firstreceived** | **Integer** | Timestamp of first received message for paging backward; omit on first load. |  [optional]

