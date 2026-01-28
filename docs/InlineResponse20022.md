
# InlineResponse20022

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID | 
**text** | **String** | Client Custom ID | 
**fromAccountType** | **String** | Source &#x60;from&#x60; account (CROSSEX_BINANCE, CROSSEX_OKX, CROSSEX_GATE, CROSSEX, SPOT) | 
**toAccountType** | **String** |  | 
**coin** | **String** | Currency | 
**amount** | **String** | Transfer amount, the amount requested for the transfer | 
**actualReceive** | **String** | Actual credited amount (has a value when status &#x3D; SUCCESS; empty for other statuses) |  [optional]
**status** | **String** | Transfer Status - &#x60;FAIL&#x60;: Failed - &#x60;SUCCESS&#x60;: Successful - &#x60;PENDING&#x60;: Transfer in Progress | 
**failReason** | **String** | Failure reason (has a value when status &#x3D; FAIL; empty for other statuses) |  [optional]
**createTime** | **Integer** | Creation time of order | 
**updateTime** | **Integer** | OrderUpdateTime | 

