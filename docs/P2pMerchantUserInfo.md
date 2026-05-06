
# P2pMerchantUserInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSelf** | **Boolean** | Whether self |  [optional]
**userTimest** | **String** | User registration time (formatted string) |  [optional]
**counterpartiesNum** | **Integer** | Number of counterparties |  [optional]
**emailVerified** | **String** | Whether email is verified. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**verified** | **String** | Whether KYC is completed. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**hasPhone** | **String** | Whether a phone number is bound. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**userName** | **String** | Username |  [optional]
**userNote** | **String** | User note information |  [optional]
**completeTransactions** | **String** | Total completed orders |  [optional]
**paidTransactions** | **String** | Number of completed buy orders |  [optional]
**acceptedTransactions** | **String** | Number of completed sell orders |  [optional]
**transactionsUsedTime** | **String** | Average time to confirm receipt |  [optional]
**cancelledUsedTimeMonth** | **String** | Cancellation time in last 30 days |  [optional]
**completeTransactionsMonth** | **String** | Number of completed orders in last 30 days |  [optional]
**completeRateMonth** | [**BigDecimal**](BigDecimal.md) | Completion rate in last 30 days |  [optional]
**ordersBuyRateMonth** | [**BigDecimal**](BigDecimal.md) | Buy order ratio in last 30 days |  [optional]
**isBlack** | **Integer** | Whether the user is blocked. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**isFollow** | **Integer** | Whether you follow this user. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**haveTraded** | **Integer** | Whether you have traded with this user before. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**bizUid** | **String** | Encrypted UID |  [optional]
**blueVip** | **Integer** | Blue V Crown Shield |  [optional]
**workStatus** | **Integer** | Merchant work status |  [optional]
**registrationDays** | **Integer** | Registration days |  [optional]
**firstTradeDays** | **Integer** | Days since first trade |  [optional]
**needReplenish** | **Integer** | Whether additional margin is required. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**merchantInfo** | [**P2pMerchantMarketInfo**](P2pMerchantMarketInfo.md) |  |  [optional]
**onlineStatus** | **Integer** | Merchant online status: &#x60;1&#x60; online; &#x60;0&#x60; offline. |  [optional]
**workHours** | [**Object**](.md) | Merchant online status details |  [optional]
**transactionsMonth** | [**BigDecimal**](BigDecimal.md) | 30-day transaction volume |  [optional]
**transactionsAll** | [**BigDecimal**](BigDecimal.md) | Total transaction volume |  [optional]
**tradeVersatile** | **Boolean** | Single user or composite user |  [optional]

