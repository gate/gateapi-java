
# CrossexOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** |  | 
**orderId** | **String** | Order ID | 
**text** | **String** | Customer-defined order ID | 
**state** | **String** | Order State:  NEW: The order is legal and waiting to be sent to the exchange  OPEN: The order has been placed on the orderbook of the exchange  PARTIALLY_FILLED: The order has been partially completed  FILLED: The order has been fully executed  FAIL: The order verification in CrossEx did not pass. Please check the order reason  REJECT：The order was rejected by the exchange. Please check the order reason | 
**symbol** | **String** | Trading pair unique identifier ,example: BINANCE_SPOT_BTC_USDT, BINANCE_FUTURE_BTC_USDT | 
**side** | **String** | Side(BUY,SELL) | 
**type** | **String** | Type(LIMIT, MARKET) | 
**attribute** | **String** | COMMON, LIQ, REDUCE, ADL | 
**exchangeType** | **String** | Exchange type(BINANCE,OKX,GATE,BYBIT) | 
**businessType** | **String** | Business type(SPOT,FUTURE,MARGIN) | 
**qty** | **String** | Order base quantity | 
**quoteQty** | **String** | Order quote quantity | 
**price** | **String** | Order price | 
**timeInForce** | **String** | Timeinforce (default GTC, enums:GTC,IOC,FOK,POC) | 
**executedQty** | **String** | Executed quantity | 
**executedAmount** | **String** | Executed quote quantity | 
**executedAvgPrice** | **String** | Average transaction price | 
**feeCoin** | **String** | Transaction fee coin | 
**fee** | **String** | Transaction fee amount | 
**reduceOnly** | **String** | Reduce position orders only, \&quot;true\&quot; or \&quot;false\&quot; | 
**leverage** | **String** | Order leverage | 
**reason** | **String** | Fail message | 
**lastExecutedQty** | **String** | Last transaction quantity | 
**lastExecutedPrice** | **String** | Last transaction price | 
**lastExecutedAmount** | **String** | Last transaction amount | 
**positionSide** | **String** | Position side(NONE/LONG/SHORT) | 
**createTime** | **String** | Create time | 
**updateTime** | **String** | Update time | 

