
# InlineObject8

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cryptoCurrency** | **String** | Cryptocurrency | 
**fiatCurrency** | **String** | Fiat currency | 
**selectType** | **String** | Buy/Sell (sell&#x3D;Sell, buy&#x3D;Buy, others&#x3D;All) |  [optional]
**status** | **String** | 订单状态（dispute: 申诉订单； closed: ACCEPT、BCLOSED； cancel： CANCEL、BECANCEL、SCLOSED、SCANCEL； locked: LOCKED； open: OPEN； paid： PAID； completed： CANCEL、BECANCEL、SCLOSED、SCANCEL、ACCEPT、BCLOSED） |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**startTime** | **Integer** | Start timestamp, default is 00:00 89 days ago |  [optional]
**endTime** | **Integer** | End timestamp, default is 23:59:59 today |  [optional]
**queryDispute** | **Integer** | 1: Include appeal status, 0: None |  [optional]
**page** | **Integer** | page number |  [optional]
**perPage** | **Integer** | Number of orders per page |  [optional]

