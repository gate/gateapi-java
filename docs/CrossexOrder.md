
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
**exchangeType** | **String** | Exchange type (BINANCE / OKX / GATE / BYBIT / KRAKEN / HYPERLIQUID / DERIBIT / LIGHTER). Stocks and ETFs return the listing market (US / HK / KR / JP) | 
**businessType** | **String** | Business type (SPOT: spot / FUTURE: futures / MARGIN: margin / CONVERT: flash swap / STOCK: stocks / ETF: exchange-traded funds) | 
**qty** | **String** | Order quantity in the base currency. | 
**quoteQty** | **String** | Order quantity in the quote currency. | 
**price** | **String** | Order price. Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) | 
**timeInForce** | **String** | Time-in-force policy (default: GTC; allowed values: GTC, IOC, FOK, POC, and RPI) | 
**executedQty** | **String** | Filled base amount. | 
**executedAmount** | **String** | Filled amount in the quote currency. Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) | 
**executedAvgPrice** | **String** | Average fill price. Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) | 
**feeCoin** | **String** | Fee currency | 
**fee** | **String** | Fee amount. | 
**reduceOnly** | **String** | Reduce-only order (&#x60;\&quot;true\&quot;&#x60; or &#x60;\&quot;false\&quot;&#x60;). | 
**leverage** | **String** | Order leverage multiplier. | 
**reason** | **String** | Failure reason description. | 
**lastExecutedQty** | **String** | Base quantity of the latest fill. | 
**lastExecutedPrice** | **String** | Price of the latest fill. Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) | 
**lastExecutedAmount** | **String** | Amount of the latest fill. Stocks and ETFs use the listing market currency (USD/HKD/KRW/JPY) | 
**positionSide** | **String** | Position side (&#x60;NONE&#x60; one-way position / &#x60;LONG&#x60; long / &#x60;SHORT&#x60; short) | 
**createTime** | **String** | Created time | 
**updateTime** | **String** | Update time | 

