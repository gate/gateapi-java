
# P2pChatMessagePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Order status when sending a message. Typical values: &#x60;OPEN&#x60;, &#x60;PAID&#x60;, &#x60;LOCKED&#x60;, &#x60;ACCEPT&#x60;, &#x60;BCLOSED&#x60;, &#x60;CANCEL&#x60;, &#x60;BECANCEL&#x60;, &#x60;SCLOSED&#x60;, &#x60;SCANCEL&#x60;. |  [optional]
**text** | **String** | Message content |  [optional]
**paymentVoucher** | **List&lt;String&gt;** | Payment voucher |  [optional]
**reasonId** | **Integer** | Cancel reason ID. &#x60;1&#x60; no longer want to buy; &#x60;2&#x60; cannot reach seller; &#x60;3&#x60; will not pay; &#x60;4&#x60; seller account not real; &#x60;5&#x60; payout account issue; &#x60;6&#x60; price mismatch; &#x60;7&#x60; mutually agreed cancel; &#x60;8&#x60; poor communication; &#x60;9&#x60; other; &#x60;10&#x60; seller cannot release with refund; &#x60;11&#x60; terms not met; &#x60;12&#x60; seller payout risk-controlled. |  [optional]
**toastId** | **Integer** | Cancellation reason popup |  [optional]
**reasonMemo** | **String** | Cancel reason description. |  [optional]
**cancelTime** | **Integer** | Cancellation time |  [optional]
**sellerConfirm** | **Integer** | Seller confirmation of cancel reason: &#x60;0&#x60; pending; &#x60;1&#x60; confirmed; &#x60;2&#x60; rejected. |  [optional]
**id** | **String** | Payment method information ID |  [optional]
**accountDes** | **String** | Payment method description |  [optional]
**payType** | **String** | Payment method type |  [optional]
**file** | **String** | Payment method file link |  [optional]
**fileKey** | **String** | Payment method file key |  [optional]
**account** | **String** | Payment account or masked payment account. |  [optional]
**memo** | **String** | Payment method note |  [optional]
**code** | **String** | Payment method code |  [optional]
**memoExt** | **String** | Payment method additional note |  [optional]
**tradeTips** | **String** | Payment method tip |  [optional]
**realName** | **String** | Payment method username |  [optional]
**isDelete** | **Integer** | Whether the payment method was deleted. &#x60;1&#x60;: deleted; &#x60;0&#x60;: not deleted. |  [optional]
**payName** | **String** | Payment method full name |  [optional]

