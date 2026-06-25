
# StopChaseOrderReq

Request body for stopping a chase order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID. Either id or text must be provided |  [optional]
**text** | **String** | Custom text. Required only when id is 0 or omitted |  [optional]
**settle** | **String** | Overridden by the path parameter |  [optional]

