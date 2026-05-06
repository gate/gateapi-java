
# P2pTransactionListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**typeBuy** | **Integer** | Order side from current user&#39;s view. &#x60;1&#x60;: buy; &#x60;0&#x60;: sell. |  [optional]
**timest** | **String** | Creation time of order |  [optional]
**timestExpire** | **String** | Order expiration time |  [optional]
**timestamp** | **Integer** | Order creation timestamp |  [optional]
**rate** | **String** | Order price in fiat currency. |  [optional]
**amount** | **String** | Order size in cryptocurrency. |  [optional]
**total** | **String** | Total fiat amount of the order. |  [optional]
**txid** | **Integer** | Order ID |  [optional]
**status** | **String** | Display status: &#x60;unpay&#x60; awaiting payment; &#x60;paid&#x60; buyer paid; &#x60;unconfirmed&#x60; awaiting seller confirmation; &#x60;locked&#x60; locked; &#x60;finished&#x60; completed; &#x60;cancel&#x60; canceled; &#x60;expired&#x60; expired; &#x60;bclosed&#x60; arbitration filled; &#x60;sclosed&#x60; arbitration canceled. |  [optional]
**itsRealname** | **String** | Counterparty real name or verified display name. |  [optional]
**itsUid** | **String** | Counterparty crypto UID. |  [optional]
**itsNick** | **String** | Counterparty nickname |  [optional]
**sellerRealname** | **String** | Seller real name or verified display name. |  [optional]
**buyerRealname** | **String** | Buyer real name or verified display name. |  [optional]
**cancelable** | **Integer** | Whether the order can be canceled. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**currencyType** | **String** | Cryptocurrency symbol. |  [optional]
**wantType** | **String** | Fiat currency |  [optional]
**hidePayment** | **Integer** | Whether payment methods are hidden. &#x60;1&#x60;: hidden; &#x60;0&#x60;: visible. |  [optional]
**selPaytype** | **String** | Selected payment type for this order, e.g. &#x60;bank&#x60;, &#x60;alipay&#x60;, &#x60;wechat&#x60;, &#x60;paypal&#x60;, &#x60;swift&#x60;, &#x60;wu&#x60;. |  [optional]
**payOthers** | [**List&lt;P2pTransactionListResultPayOthers&gt;**](P2pTransactionListResultPayOthers.md) | Other payment method details; may appear on historical orders. |  [optional]
**cdTime** | **Integer** | Countdown seconds for the current order. |  [optional]
**orderType** | **Integer** | Order type: &#x60;1&#x60; standard; &#x60;2&#x60; partner; &#x60;3&#x60; flash swap; &#x60;4&#x60; Web3. |  [optional]
**orderTag** | **List&lt;String&gt;** | Order tags |  [optional]
**convertInfo** | [**P2pTransactionConvertInfo**](P2pTransactionConvertInfo.md) |  |  [optional]

