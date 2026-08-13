
# Symbol

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Unique trading pair identifier in the form ExchangeType_BusinessType_Base_Counter. | 
**exchangeType** | **String** | Venue bucket (&#x60;BINANCE&#x60; / &#x60;OKX&#x60; / &#x60;GATE&#x60; / &#x60;BYBIT&#x60; / &#x60;KRAKEN&#x60; / &#x60;HYPERLIQUID&#x60; / &#x60;DERIBIT&#x60;). | 
**businessType** | **String** | Business type (&#x60;SPOT&#x60; Spot / &#x60;FUTURE&#x60; Futures / &#x60;MARGIN&#x60; Margin). | 
**state** | **String** | Status (&#x60;live&#x60; running / &#x60;suspend&#x60; paused). | 
**minSize** | **String** | Minimum order quantity | 
**minNotional** | **String** | Minimum Order Value | 
**lotSize** | **String** | Quantity Step | 
**tickSize** | **String** | Price Step | 
**maxNumOrders** | **String** | maximumopen orderamount | 
**maxMarketSize** | **String** | Maximum Market Order Quantity | 
**maxLimitSize** | **String** | Maximum order quantity for limit orders. | 
**contractSize** | **String** | Contract multiplier (deprecated; quantity is used uniformly) | 
**liquidationFee** | **String** | Liquidation Fee Rate | 
**delistTime** | **String** | Millisecond timestamp; &#x60;0&#x60; means not delisted. | 
**supportRpi** | **String** | Whether RPI order placement is supported (true if supported; false otherwise) |  [optional]

