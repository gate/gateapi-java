
# GetPendingTransactionListRequest

Get pending transaction list request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cryptoCurrency** | **String** | Cryptocurrency symbol. | 
**fiatCurrency** | **String** | Fiat currency | 
**orderTab** | [**OrderTabEnum**](#OrderTabEnum) | Order tab: &#x60;pending&#x60; in progress (&#x60;OPEN&#x60;, &#x60;PAID&#x60;, &#x60;LOCKED&#x60;, &#x60;TEMP&#x60;); &#x60;dispute&#x60; in dispute; default &#x60;pending&#x60;. |  [optional]
**selectType** | **String** | Order side filter: &#x60;buy&#x60; buy orders; &#x60;sell&#x60; sell orders; empty: all. |  [optional]
**status** | **String** | Order status filter. &#x60;open&#x60; unpaid (&#x60;OPEN&#x60;); &#x60;paid&#x60; paid (&#x60;PAID&#x60;); &#x60;locked&#x60; locked (&#x60;LOCKED&#x60;); &#x60;dispute&#x60; in dispute; empty or omitted uses the default range for &#x60;order_tab&#x60;. |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**startTime** | **Integer** | Start timestamp, default is 00:00 89 days ago |  [optional]
**endTime** | **Integer** | End timestamp, default is 23:59:59 today |  [optional]

## Enum: OrderTabEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
DISPUTE | &quot;dispute&quot;

