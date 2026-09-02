
# CrossexOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | User ID | 
**orderId** | **String** | Order ID | 
**text** | **String** | Client-defined order ID. | 
**state** | **String** | Order status: &#x60;NEW&#x60;: validated locally, pending submission to the exchange &#x60;OPEN&#x60;: resting on the exchange order book &#x60;PARTIALLY_FILLED&#x60;: partially filled &#x60;FILLED&#x60;: fully filled &#x60;FAIL&#x60;: CrossEx validation failed; see &#x60;reason&#x60; &#x60;REJECT&#x60;: rejected by the exchange; see &#x60;reason&#x60; &#x60;CANCELLED&#x60;: cancelled | 
**symbol** | **String** | Unique trading pair identifiers, e.g. &#x60;BINANCE_SPOT_BTC_USDT&#x60;, &#x60;BINANCE_FUTURE_BTC_USDT&#x60;. | 
**side** | **String** | Side (&#x60;BUY&#x60; buy / &#x60;SELL&#x60; sell). | 
**type** | **String** | Order type (&#x60;LIMIT&#x60; limit / &#x60;MARKET&#x60; market). | 
**attribute** | **String** | Order attributes (&#x60;COMMON&#x60; normal / &#x60;LIQ&#x60; liquidation takeover / &#x60;REDUCE&#x60; liquidation reduction / &#x60;ADL&#x60; auto-deleverage / &#x60;SETTLEMENT&#x60; delisting settlement). | 
**exchangeType** | **String** | Venue bucket (&#x60;BINANCE&#x60; / &#x60;OKX&#x60; / &#x60;GATE&#x60; / &#x60;BYBIT&#x60; / &#x60;KRAKEN&#x60; / &#x60;HYPERLIQUID&#x60; / &#x60;DERIBIT&#x60;). | 
**businessType** | **String** | Business type (&#x60;SPOT&#x60; Spot / &#x60;FUTURE&#x60; Futures / &#x60;MARGIN&#x60; Margin / &#x60;CONVERT&#x60; Flash Swap). | 
**qty** | **String** | Order quantity in the base currency. | 
**quoteQty** | **String** | Order quantity in the quote currency. | 
**price** | **String** | Order price. | 
**timeInForce** | **String** | Time-in-force policy (default: GTC; allowed values: GTC, IOC, FOK, POC, and RPI) | 
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
**positionSide** | **String** | Position side (&#x60;NONE&#x60; one-way position / &#x60;LONG&#x60; long / &#x60;SHORT&#x60; short) | 
**createTime** | **String** | Created time | 
**updateTime** | **String** | Update time | 

