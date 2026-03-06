
# InlineResponse20014Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isSelf** | **Boolean** | Whether self |  [optional]
**userTimest** | **String** | User registration time (formatted string) |  [optional]
**counterpartiesNum** | **Integer** | Number of counterparties |  [optional]
**emailVerified** | **String** | Whether email is verified |  [optional]
**verified** | **String** | Whether KYC verification is completed |  [optional]
**hasPhone** | **String** | Whether phone is bound |  [optional]
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
**isBlack** | **Integer** | Whether blocked |  [optional]
**isFollow** | **Integer** | Whether following |  [optional]
**haveTraded** | **Integer** | Whether traded with self |  [optional]
**bizUid** | **String** | Encrypted UID |  [optional]
**blueVip** | **Integer** | Blue V Crown Shield |  [optional]
**workStatus** | **Integer** | Merchant work status |  [optional]
**registrationDays** | **Integer** | Registration days |  [optional]
**firstTradeDays** | **Integer** | Days since first trade |  [optional]
**needReplenish** | **Integer** | Whether margin replenishment is needed |  [optional]
**merchantInfo** | [**InlineResponse20014DataMerchantInfo**](InlineResponse20014DataMerchantInfo.md) |  |  [optional]
**onlineStatus** | **Integer** | Merchant online status |  [optional]
**workHours** | [**Object**](.md) | Merchant online status details |  [optional]
**transactionsMonth** | [**BigDecimal**](BigDecimal.md) | 30-day transaction volume |  [optional]
**transactionsAll** | [**BigDecimal**](BigDecimal.md) | Total transaction volume |  [optional]
**tradeVersatile** | **Boolean** | Single user or composite user |  [optional]

