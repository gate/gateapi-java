
# P2pCounterpartyUserInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userTimest** | **String** | User registration time (formatted string) |  [optional]
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
**isFollow** | **Integer** | Whether you follow this user. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**haveTraded** | **Integer** | Whether you have traded with this user before. &#x60;1&#x60;: yes; &#x60;0&#x60;: no. |  [optional]
**bizUid** | **String** | Encrypted UID |  [optional]
**registrationDays** | **Integer** | Registration days |  [optional]
**firstTradeDays** | **Integer** | Days since first trade |  [optional]
**tradeVersatile** | **Boolean** | Single user or composite user |  [optional]

