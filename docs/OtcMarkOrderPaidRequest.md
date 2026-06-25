
# OtcMarkOrderPaidRequest

Request body for marking a fiat order as paid (deposit confirmation). Must include the user's payment receipt (consistent with §3.2).  **`payment_receipt_file_key` is required**; the order primary key for this path is `order_id`. When accessed via the Pay gateway using `client_order_id`, the gateway's rewritten field prevails.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID | 
**clientOrderId** | **String** | Client order ID (used by some gateway/Inner Pay paths, optional) |  [optional]
**paymentReceiptFileKey** | **String** | User payment receipt: **required**. Stored as a file_key. Single file; jpg/jpeg/png/pdf; ≤4MB. | 
**paymentReceipt** | **String** | Alias compatible with &#x60;payment_receipt_file_key&#x60; (depends on the gateway&#39;s external field name) |  [optional]

