
# InlineResponse2007Data

Returns coupon detail object when code=0; empty object {} otherwise

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Coupon distribution record ID (coupon_send_issuing_log.id) |  [optional]
**detailsId** | **Integer** | User coupon detail table primary key (separate table per type). This field is 0 for task coupons |  [optional]
**couponType** | **String** | Coupon type, enum values same as the &#x60;coupon_type&#x60; parameter |  [optional]
**name** | **String** | Coupon display name (i18n translated) |  [optional]
**amount** | **String** | Coupon denomination (formatted string with thousand separators). Meaning by type: point card &#x3D; balance, interest rate boost coupon &#x3D; rate percentage (e.g., &#39;5%&#39;), VIP trial card &#x3D; VIP level number, position voucher &#x3D; face value x leverage, others &#x3D; face value |  [optional]
**originAmount** | **String** | Original denomination (string with trailing zeros removed). Only returned for point card type, other types do not have this field |  [optional]
**currency** | **String** | Denomination unit. Point card &#x3D; &#39;POINT&#39;, interest rate boost coupon &#x3D; &#39;APR&#39;, VIP trial card &#x3D; &#39;VIP&#39;, Alpha cash coupon &#x3D; base currency, others &#x3D; uppercase currency symbol (e.g., &#39;USDT&#39;/&#39;GT&#39;) |  [optional]
**ruleNew** | **String** | Coupon usage rule text (i18n translated). Only has value in the detail endpoint, fixed as empty string in the list endpoint |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Coupon status. Regular coupon: NOT_ACTIVE (pending activation), ACTIVATED (activated), TO_BE_USED (to be used), EXPIRED (expired), RECYCLED (recycled), INVALID (invalidated), USED (used), UNKNOWN (unknown), LOCKED (locked, P2P only). Task coupon: TASK_START (task not started), TASK_WAIT (task in progress), TASK_DONE (task completed, processing), TASK_EXPIRED (task not completed, expired), TASK_NOT_STARTED_EXPIRED (not started, expired), TASK_RECEIVE_SUCCESS (reward claimed successfully), TASK_RECEIVE_FAIL (reward claim failed) |  [optional]
**jumpUrl** | [**InlineResponse2006DataJumpUrl**](InlineResponse2006DataJumpUrl.md) |  |  [optional]
**helpUrl** | [**InlineResponse2006DataHelpUrl**](InlineResponse2006DataHelpUrl.md) |  |  [optional]
**expireTime** | **Integer** | Expiration time (Unix timestamp). Some types replace this with actual expiration time after activation/use. Point card type returns 0. Rules by type: cash&#x3D;not_received_expired_timest; contract_bonus&#x3D;uses expired_timest after activation/use; contract_bonus_new&#x3D;always uses expired_timest; position_voucher/tradfi_position_voucher&#x3D;uses expire_time after use; robot_bonus&#x3D;not_received_expired_timest; commission_rebate&#x3D;uses use_deadline after use; crypto_loan_interest&#x3D;not_using_expired_timest; copy_trading&#x3D;not_using_expired_timest; alpha_voucher&#x3D;not_received_expired_timest; etf_voucher&#x3D;not_using_expired_timest |  [optional]
**expireTimeOrderBy** | **Integer** | Sorting expiration time (from the original expiration time of the distribution record, unaffected by activation) |  [optional]
**expireSecond** | **Integer** | Seconds remaining until expiration, returns 0 if expired or point card type |  [optional]
**hasUsageHistory** | **Boolean** | Whether there is a usage history. Fixed as true for point card type, determined by type for others |  [optional]
**hasProgress** | **Boolean** | Whether to display a progress bar. Only true for commission_rebate, interest_voucher, and qualifying task coupons |  [optional]
**progressConfig** | [**InlineResponse2006DataProgressConfig**](InlineResponse2006DataProgressConfig.md) |  |  [optional]
**activationInfo** | [**Object**](.md) | Type-specific activation information. Types without specific fields return empty object {}. Fields by type: interest_voucher&#x3D;{supported_pairs (applicable trading pairs), transaction_type}; contract_bonus_new&#x3D;{received_expired_hour (valid hours after activation)}; contract_bonus&#x3D;{check_unified_account_mode, received_expired_days (valid days after activation), abtest}; commission_rebate&#x3D;{market (spot/margin/futures/alpha/etf/tradfi), market_name (market display name)}; robot_bonus&#x3D;{designated_bots (ENABLED &#x3D; designated strategies only / DISABLED &#x3D; unrestricted)}; position_voucher&#x3D;{symbols (applicable trading pairs, empty &#x3D; unrestricted), leverage, need_user_funds (0 &#x3D; no user funds required / 1 &#x3D; user funds required), user_funds_amount, position_bonus (original face value)}; tradfi_position_voucher&#x3D;{symbols, leverage, position_bonus}; etf_voucher&#x3D;{currency_markets (ETF market list, comma-separated), amount (original face value)} |  [optional]
**isTaskCoupon** | [**IsTaskCouponEnum**](#IsTaskCouponEnum) | Whether it is a task coupon. &#x60;0&#x60; &#x3D; regular coupon; &#x60;1&#x60; &#x3D; task coupon |  [optional]
**upgradeToast** | **Boolean** | Whether to prompt the user to upgrade the App (true when the app version is too old to support the coupon) |  [optional]
**fromTask** | **Boolean** | [Detail endpoint only] Whether this regular coupon was obtained by completing a task (a sub-coupon automatically issued after task completion). Regular coupons may be true, task coupons are always false |  [optional]
**taskTitle** | **String** | Task title. Task coupons have value; regular coupons return empty string (but task_title is not assigned when from_task&#x3D;true) |  [optional]
**taskDesc** | **String** | Task description. Task coupons have value; regular coupons return empty string |  [optional]
**taskStartAt** | **Integer** | Task start timestamp (Unix). Task coupon: has value when in TASK_EXPIRED status, otherwise 0; regular coupon (from_task&#x3D;true): start time of the source task |  [optional]
**taskExpireAt** | **Integer** | Task validity expiration timestamp (Unix). Task coupon: claim validity deadline (0 means unlimited); regular coupon: fixed at 0 |  [optional]
**taskCompletedAt** | **Integer** | Task completion timestamp (Unix). Task coupon: task completion time (0 means not completed); regular coupon (from_task&#x3D;true): completion time of the source task |  [optional]
**extra** | [**List&lt;List&lt;Object&gt;&gt;**](List.md) | [Detail endpoint only] Coupon detail attributes organized by display blocks. The frontend renders them as separate sections. Point card type always returns empty array []. Other types return a 2D array composed of blocks: block 1 &#x3D; coupon name/source/status, block 2 &#x3D; coupon core attributes, block 3 &#x3D; time information. Each item contains: type (display type: string/timestamp/day/hour/status/btn), key (label text, i18n translated), value (string or integer, timestamp type is Unix timestamp) |  [optional]

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

