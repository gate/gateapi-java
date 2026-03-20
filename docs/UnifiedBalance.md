
# UnifiedBalance

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available** | **String** | Cross available balance, deducted futures isolated margin occupation and frozen amount (futures isolated occupation, i.e. futures isolated balance), effective in single-currency/multi-currency/portfolio margin mode. |  [optional]
**freeze** | **String** | Frozen amount, effective in single-currency/multi-currency/portfolio margin mode |  [optional]
**borrowed** | **String** | Borrowed amount, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**negativeLiab** | **String** | Negative balance borrowing, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**futuresPosLiab** | **String** | Contract opening position borrowing currency (abandoned, to be offline field) |  [optional]
**equity** | **String** | Currency equity amount (cross), effective in single-currency/multi-currency/portfolio margin mode |  [optional]
**totalFreeze** | **String** | Total frozen (deprecated, to be removed) |  [optional]
**totalLiab** | **String** | Total borrowed amount, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**spotInUse** | **String** | The amount of spot hedging is valid in the combined margin mode, and is 0 in other margin modes such as single currency and cross-currency margin modes |  [optional]
**funding** | **String** | Uniloan financial management amount, effective when turned on as a unified account margin switch |  [optional]
**fundingVersion** | **String** | Funding version |  [optional]
**crossBalance** | **String** | Full margin balance is valid in single currency margin mode, and is 0 in other modes such as cross currency margin/combined margin mode |  [optional]
**isoBalance** | **String** | Futures isolated balance, effective in single-currency and multi-currency margin mode, 0 in portfolio margin mode |  [optional]
**im** | **String** | Cross initial margin, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**mm** | **String** | Cross maintenance margin, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**imr** | **String** | Cross initial margin rate, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**mmr** | **String** | Cross maintenance margin rate, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**marginBalance** | **String** | Cross margin balance, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**availableMargin** | **String** | Cross available margin, only effective for USDT in single-currency margin mode, 0 in multi-currency/portfolio margin mode |  [optional]
**enabledCollateral** | **Boolean** | Currency enabled as margin: true - Enabled, false - Disabled |  [optional]
**balanceVersion** | [**BigDecimal**](BigDecimal.md) | Balance version number |  [optional]

