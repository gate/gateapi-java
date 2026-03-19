
# FixedTermLendOrder

Fixed-term earn subscription order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Subscription record ID |  [optional]
**business** | **Integer** | Business type: 1 for regular, 2 for VIP |  [optional]
**orderId** | **Long** | Order ID |  [optional]
**userId** | **Long** | User ID |  [optional]
**asset** | **String** | Currency |  [optional]
**productId** | **Integer** | Product ID |  [optional]
**lockUpPeriod** | **Integer** | Lock-up period (in days) |  [optional]
**principal** | **String** | Subscription principal |  [optional]
**yearRate** | **String** | Annual interest rate |  [optional]
**productType** | **Integer** | Product type: 1 for regular, 2 for VIP |  [optional]
**interest** | **String** | Accrued interest |  [optional]
**status** | **Integer** | Order status: 1 for holding, 2 for redeemed, 3 for matured, 4 for settled |  [optional]
**reinvestStatus** | **Integer** | Auto-renewal status: 0 for disabled, 1 for enabled |  [optional]
**redeemAccountType** | **Integer** | Redemption payout account type: 1 for spot account |  [optional]
**originOrder** | **String** | Original order ID, linked to previous order IDs in auto-renewal scenarios |  [optional]
**redeemType** | **Integer** | Redemption type: 1 for early redemption, 2 for maturity redemption |  [optional]
**redeemTime** | **String** | Redemption time |  [optional]
**finishTime** | **String** | Expiration time |  [optional]
**createTime** | **String** | Created time |  [optional]
**yearRatePerent** | **String** | Annual interest rate percentage display value |  [optional]
**totalYearRatePercent** | **String** | Comprehensive annualized yield percentage (including interest rate boost, rewards, etc.) |  [optional]
**totalInterest** | **String** | Total earnings (including interest and bonus rewards) |  [optional]
**productInfo** | [**FixedTermProductInfo**](FixedTermProductInfo.md) |  |  [optional]
**bonusInfo** | [**FixedTermBonusInfo**](FixedTermBonusInfo.md) |  |  [optional]
**couponInfo** | [**FixedTermCouponInfo**](FixedTermCouponInfo.md) |  |  [optional]
**redeemAt** | **Integer** | Redemption timestamp (in seconds) |  [optional]
**finishAt** | **Integer** | Expiration timestamp (in seconds) |  [optional]
**createAt** | **Integer** | Creation timestamp (in seconds) |  [optional]
**icon** | **String** | Currency icon URL |  [optional]

