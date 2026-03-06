
# GetPendingTransactionListRequest

Get pending transaction list request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cryptoCurrency** | **String** | Cryptocurrency | 
**fiatCurrency** | **String** | Fiat currency | 
**orderTab** | **String** | Order tab, default: pending (pending: In Progress (pending: AND status in (&#39;OPEN&#39;,&#39;PAID&#39;, &#39;LOCKED&#39;, &#39;TEMP&#39;)); dispute: In Dispute (status in (&#39;ACCEPT&#39;,&#39;BCLOSED&#39;, &#39;CANCEL&#39;, &#39;BECANCEL&#39;, &#39;SCLOSED&#39;, &#39;SCANCEL&#39;))) |  [optional]
**selectType** | **String** | Buy/Sell (sell&#x3D;Sell, buy&#x3D;Buy, others&#x3D;All) |  [optional]
**status** | **String** | Order Status (dispute: Disputed Order; closed: ACCEPT, BCLOSED; cancel: CANCEL, BECANCEL, SCLOSED, SCANCEL; locked: LOCKED; open: OPEN; paid: PAID; completed: CANCEL, BECANCEL, SCLOSED, SCANCEL, ACCEPT, BCLOSED) |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**startTime** | **Integer** | Start timestamp, default is 00:00 89 days ago |  [optional]
**endTime** | **Integer** | End timestamp, default is 23:59:59 today |  [optional]

