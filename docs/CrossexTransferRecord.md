
# CrossexTransferRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order ID | 
**text** | **String** | Client Custom ID | 
**fromAccountType** | **String** | &#x60;from&#x60; credit account touched by this operation (&#x60;CROSSEX_BINANCE&#x60;, &#x60;CROSSEX_OKX&#x60;, &#x60;CROSSEX_GATE&#x60;, &#x60;CROSSEX_BYBIT&#x60;, &#x60;CROSSEX_KRAKEN&#x60;, &#x60;CROSSEX_HYPERLIQUID&#x60;, &#x60;CROSSEX&#x60;, &#x60;SPOT&#x60;). | 
**toAccountType** | **String** | &#x60;to&#x60; debit account handled by this operation (&#x60;CROSSEX_BINANCE&#x60;, &#x60;CROSSEX_OKX&#x60;, &#x60;CROSSEX_GATE&#x60;, &#x60;CROSSEX_BYBIT&#x60;, &#x60;CROSSEX_KRAKEN&#x60;, &#x60;CROSSEX_HYPERLIQUID&#x60;, &#x60;CROSSEX&#x60;, &#x60;SPOT&#x60;). | 
**coin** | **String** | Currency | 
**amount** | **String** | Transfer amount, the amount requested for the transfer | 
**actualReceive** | **String** | Actual credited amount (has a value when status &#x3D; SUCCESS; empty for other statuses) |  [optional]
**status** | **String** | Transfer Status - &#x60;FAIL&#x60;: Failed - &#x60;SUCCESS&#x60;: Successful - &#x60;PENDING&#x60;: Transfer in Progress | 
**failReason** | **String** | Failure reason (has a value when status &#x3D; FAIL; empty for other statuses) |  [optional]
**createTime** | **Integer** | Creation time of order | 
**updateTime** | **Integer** | OrderUpdateTime | 

