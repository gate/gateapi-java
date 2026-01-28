
# InlineResponse20015Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rate** | **String** | Price | 
**type** | **String** | Buy/Sell order | 
**amount** | **String** | Cryptocurrency amount | 
**minAmount** | **String** | Minimum limit | 
**maxAmount** | **String** | Maximum limit | 
**total** | **String** | Fiat amount | 
**payAli** | **Integer** | Whether Alipay payment is supported | 
**payBank** | **Integer** | Whether bank payment is supported | 
**payPaypal** | **Integer** | Whether PayPal payment is supported | 
**payWechat** | **Integer** | Whether WeChat payment is supported | 
**payTypeNum** | **String** | Payment method ID list | 
**payTypeJson** | **String** | Payment method list | 
**lockedAmount** | **String** | Locked amount | 
**orderid** | **Integer** | Order ID | 
**timestamp** | **Integer** | Created time | 
**currencyType** | **String** | Cryptocurrency type | 
**wantType** | **String** | Fiat type | 
**hideRate** | **String** | Hidden price | 
**tradeTips** | **String** | Trading terms | 
**autoReply** | **String** | Auto reply | 
**newHand** | **String** | Merchant-friendly order | 
**rateRefId** | **Integer** | Floating price reference ID: 1&#x3D;Platform reference price, 3&#x3D;Spot reference price (≤0 means fixed price, &gt;0 means floating price) | 
**rateOffset** | [**BigDecimal**](BigDecimal.md) | Floating ratio (absolute value) | 
**status** | **String** | Status | 
**rateFixed** | **Integer** | 0&#x3D;Floating, 1&#x3D;Fixed | 
**floatTrend** | **Integer** | 0&#x3D;Upward float, 1&#x3D;Downward float | 
**expireMin** | **Integer** | Timeout (minutes) | 
**tierLimit** | **Integer** | Tier limit | 
**regTimeLimit** | **Integer** | Registration time limit | 
**advertisersLimit** | **Integer** | Do not trade with advertisers, advertiser limit: 0&#x3D;No limit, 1&#x3D;Limit | 
**verifiedLimit** | **Integer** | kyclimit | 
**minCompletedLimit** | **Integer** | Minimum limit of completed orders | 
**maxCompletedLimit** | **Integer** | Maximum limit of completed orders | 
**userOrdersLimit** | **Integer** | Order count limit | 
**completedRateLimit** | **Integer** | 30-day completion rate limit | 
**userCountryLimit** | **Integer** | KYC nationality restriction | 
**limitCountryCn** | **String** | Restricted nationality (Chinese) | 
**limitCountryEn** | **String** | Restricted nationality (English) | 
**isHedge** | **Integer** | Whether auto delegation | 
**hidePayment** | **Integer** | Whether to hide payment method | 
**fee** | **Integer** | fee | 

