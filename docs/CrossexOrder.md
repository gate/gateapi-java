
# CrossexOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | User ID | 
**orderId** | **String** | Order ID | 
**text** | **String** | Client-defined order ID. | 
**state** | **String** | 订单状态：  NEW：订单已通过校验，等待发送到交易所  OPEN：订单已挂在交易所订单簿上  PARTIALLY_FILLED：订单已部分成交  FILLED：订单已完全成交  FAIL：CrossEx 内部校验未通过，请查看 reason 字段了解失败原因  REJECT：订单被交易所拒绝，请查看 reason 字段了解失败原因 | 
**symbol** | **String** | Unique trading pair identifiers, e.g. &#x60;BINANCE_SPOT_BTC_USDT&#x60;, &#x60;BINANCE_FUTURE_BTC_USDT&#x60;. | 
**side** | **String** | Side (&#x60;BUY&#x60; buy / &#x60;SELL&#x60; sell). | 
**type** | **String** | Order type (&#x60;LIMIT&#x60; limit / &#x60;MARKET&#x60; market). | 
**attribute** | **String** | Order attributes (&#x60;COMMON&#x60; normal / &#x60;LIQ&#x60; liquidation takeover / &#x60;REDUCE&#x60; liquidation reduction / &#x60;ADL&#x60; auto-deleverage). | 
**exchangeType** | **String** | Exchange type (&#x60;BINANCE&#x60; / &#x60;OKX&#x60; / &#x60;GATE&#x60; / &#x60;BYBIT&#x60;). | 
**businessType** | **String** | Business type (&#x60;SPOT&#x60; Spot / &#x60;FUTURE&#x60; Futures / &#x60;MARGIN&#x60; Margin). | 
**qty** | **String** | Order quantity in the base currency. | 
**quoteQty** | **String** | Order quantity in the quote currency. | 
**price** | **String** | Order price. | 
**timeInForce** | **String** | Time in force (default &#x60;GTC&#x60;; enum: &#x60;GTC&#x60; / &#x60;IOC&#x60; / &#x60;FOK&#x60; / &#x60;POC&#x60;). | 
**executedQty** | **String** | Filled base amount. | 
**executedAmount** | **String** | Filled quote amount. | 
**executedAvgPrice** | **String** | Average Filled Price | 
**feeCoin** | **String** | Fee currency | 
**fee** | **String** | Fee amount. | 
**reduceOnly** | **String** | Reduce-only order (&#x60;\&quot;true\&quot;&#x60; or &#x60;\&quot;false\&quot;&#x60;). | 
**leverage** | **String** | Order leverage multiplier. | 
**reason** | **String** | Failure reason description. | 
**lastExecutedQty** | **String** | Base quantity of the latest fill. | 
**lastExecutedPrice** | **String** | Price of the latest fill. | 
**lastExecutedAmount** | **String** | Quote amount of the latest fill. | 
**positionSide** | **String** | Position side (&#x60;NONE&#x60; flat / &#x60;LONG&#x60; long / &#x60;SHORT&#x60; short). | 
**createTime** | **String** | Created time | 
**updateTime** | **String** | Update time | 

