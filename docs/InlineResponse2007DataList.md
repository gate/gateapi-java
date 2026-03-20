
# InlineResponse2007DataList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Coupon distribution record ID (coupon_send_issuing_log.id), used as &#x60;last_id&#x60; for cursor-based pagination |  [optional]
**detailsId** | **Integer** | User coupon detail table primary key (separate table per type). This field is 0 for task coupons, has value for regular coupons |  [optional]
**couponType** | **String** | Coupon type, enum values same as the &#x60;type&#x60; parameter |  [optional]
**name** | **String** | Coupon display name (i18n translated) |  [optional]
**amount** | **String** | Coupon denomination (formatted string with thousand separators). Meaning by type: point card &#x3D; balance, interest rate boost coupon &#x3D; interest rate percentage (e.g., &#39;5%&#39;), VIP trial card &#x3D; VIP level number, position voucher &#x3D; face value × leverage, others &#x3D; face value |  [optional]
**originAmount** | **String** | Original denomination (string with trailing zeros removed). Only returned for point card type, other types do not have this field |  [optional]
**currency** | **String** | Denomination unit. Point card &#x3D; &#39;POINT&#39;, interest rate boost coupon &#x3D; &#39;APR&#39;, VIP trial card &#x3D; &#39;VIP&#39;, Alpha cash coupon &#x3D; base currency, others &#x3D; uppercase currency symbol (e.g., &#39;USDT&#39;/&#39;GT&#39;) |  [optional]
**ruleNew** | **String** | Coupon usage rule text. List endpoint always returns empty string \&quot;\&quot;, only detail endpoint returns actual value |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Coupon status. Regular coupon: NOT_ACTIVE (pending activation), ACTIVATED (activated), TO_BE_USED (to be used), EXPIRED (expired), RECYCLED (recycled), INVALID (invalidated), USED (used), UNKNOWN (unknown), LOCKED (locked, P2P only). Task coupon: TASK_START (task not started), TASK_WAIT (task in progress), TASK_DONE (task completed, processing), TASK_EXPIRED (task not completed, expired), TASK_NOT_STARTED_EXPIRED (not started, expired), TASK_RECEIVE_SUCCESS (reward claimed successfully), TASK_RECEIVE_FAIL (reward claim failed) |  [optional]
**jumpUrl** | [**InlineResponse2007DataJumpUrl**](InlineResponse2007DataJumpUrl.md) |  |  [optional]
**helpUrl** | [**InlineResponse2007DataHelpUrl**](InlineResponse2007DataHelpUrl.md) |  |  [optional]
**expireTime** | **Integer** | Expiration time (Unix timestamp). Some types replace this with actual expiration time after activation or use (e.g., contract_bonus uses expired_timest after activation). Point card type returns 0 |  [optional]
**expireTimeOrderBy** | **Integer** | Sorting expiration time (from the original expiration time of the distribution record, unaffected by activation). Used as the &#x60;expire_time&#x60; parameter for the next request in cursor-based pagination |  [optional]
**expireSecond** | **Integer** | Seconds remaining until expiration. Returns 0 for expired or Point Card types |  [optional]
**hasUsageHistory** | **Boolean** | Whether there is a usage history. Fixed as true for point card type, determined by type for others |  [optional]
**hasProgress** | **Boolean** | Whether to display a progress bar. Only true for commission_rebate, interest_voucher, and qualifying task coupons |  [optional]
**progressConfig** | [**InlineResponse2007DataProgressConfig**](InlineResponse2007DataProgressConfig.md) |  |  [optional]
**activationInfo** | [**Object**](.md) | Type-specific activation information. Types without specific fields return empty object {}. Fields by type: interest_voucher&#x3D;{supported_pairs,transaction_type}; contract_bonus_new&#x3D;{received_expired_hour}; contract_bonus&#x3D;{check_unified_account_mode,received_expired_days,abtest}; commission_rebate&#x3D;{market,market_name}; robot_bonus&#x3D;{designated_bots}; position_voucher&#x3D;{symbols,leverage,need_user_funds,user_funds_amount,position_bonus}; tradfi_position_voucher&#x3D;{symbols,leverage,position_bonus}; etf_voucher&#x3D;{currency_markets,amount} |  [optional]
**isTaskCoupon** | [**IsTaskCouponEnum**](#IsTaskCouponEnum) | Whether it is a task coupon. &#x60;0&#x60; &#x3D; regular coupon; &#x60;1&#x60; &#x3D; task coupon |  [optional]
**upgradeToast** | **Boolean** | Whether to prompt the user to upgrade the App (true when app version is too old to support the coupon). Triggered types: copy_trading/alpha_voucher (Android&lt;7320000/iOS&lt;202507320000), commission_rebate subtype tradfi (Android&lt;8040000/iOS&lt;202608040000), etf_voucher (Android&lt;8090000/iOS&lt;202608090000), tradfi_position_voucher (Android&lt;8100000/iOS&lt;202508240000) |  [optional]
**taskTitle** | **String** | Task title (only task coupons have value, regular coupons return empty string \&quot;\&quot;) |  [optional]
**taskDesc** | **String** | Task description (only task coupons have value, regular coupons return empty string \&quot;\&quot;) |  [optional]
**taskStartAt** | **Integer** | Task start timestamp (Unix). Only has value for task coupons in TASK_EXPIRED status, otherwise 0 |  [optional]
**taskExpireAt** | **Integer** | Task expiration timestamp (Unix). Currently fixed at 0, reserved field |  [optional]
**taskCompletedAt** | **Integer** | Task completion timestamp (Unix). Currently fixed at 0, reserved field |  [optional]
**extra** | **List&lt;Object&gt;** | Extension fields. List endpoint always returns empty array [], only the detail endpoint has values |  [optional]

## Enum: StatusEnum

Name | Value
---- | -----
NOT_ACTIVE | &quot;NOT_ACTIVE&quot;
ACTIVATED | &quot;ACTIVATED&quot;
TO_BE_USED | &quot;TO_BE_USED&quot;
EXPIRED | &quot;EXPIRED&quot;
RECYCLED | &quot;RECYCLED&quot;
INVALID | &quot;INVALID&quot;
USED | &quot;USED&quot;
UNKNOWN | &quot;UNKNOWN&quot;
LOCKED | &quot;LOCKED&quot;
TASK_START | &quot;TASK_START&quot;
TASK_WAIT | &quot;TASK_WAIT&quot;
TASK_DONE | &quot;TASK_DONE&quot;
TASK_EXPIRED | &quot;TASK_EXPIRED&quot;
TASK_NOT_STARTED_EXPIRED | &quot;TASK_NOT_STARTED_EXPIRED&quot;
TASK_RECEIVE_SUCCESS | &quot;TASK_RECEIVE_SUCCESS&quot;
TASK_RECEIVE_FAIL | &quot;TASK_RECEIVE_FAIL&quot;

## Enum: IsTaskCouponEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

