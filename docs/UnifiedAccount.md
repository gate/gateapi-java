
# UnifiedAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **String** | Unified account mode: - classic: Classic account mode - multi_currency: Multi-currency margin mode - portfolio: Portfolio margin mode - single_currency: Single-currency margin mode |  [optional]
**userId** | **Long** | User ID |  [optional]
**refreshTime** | **Long** | Last refresh time |  [optional]
**locked** | **Boolean** | Whether the account is locked, valid in cross-currency margin/combined margin mode, false in other modes such as single-currency margin mode |  [optional]
**balances** | [**Map&lt;String, UnifiedBalance&gt;**](UnifiedBalance.md) |  |  [optional]
**total** | **String** | Total account assets converted to USD, i.e. the sum of &#x60;(available + freeze) * price&#x60; in all currencies (deprecated, to be removed, replaced by unified_account_total) |  [optional]
**borrowed** | **String** | Total borrowed amount converted to USD, i.e. the sum of &#x60;borrowed * price&#x60; of all currencies (excluding point cards), valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**totalInitialMargin** | **String** | Total initial margin (cross), effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**totalMarginBalance** | **String** | Total margin balance (cross), effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**totalMaintenanceMargin** | **String** | Total maintenance margin (cross), effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**totalInitialMarginRate** | **String** | Total initial margin rate (cross), effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**totalMaintenanceMarginRate** | **String** | Total maintenance margin rate (cross), effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**totalAvailableMargin** | **String** | Available margin amount, valid in cross-currency margin/combined margin mode, 0 in other modes such as single-currency margin mode |  [optional]
**unifiedAccountTotal** | **String** | Total unified account assets, includes both cross and isolated total assets in single-currency/multi-currency mode, only cross total assets in portfolio margin mode |  [optional]
**unifiedAccountTotalLiab** | **String** | Total unified account borrowed, i.e. total cross borrowed, effective in multi-currency margin/portfolio margin mode, 0 in single-currency margin mode |  [optional]
**unifiedAccountTotalEquity** | **String** | Total unified account equity, includes both cross and isolated total equity in single-currency/multi-currency mode, only cross total equity in portfolio margin mode |  [optional]
**leverage** | **String** | Account leverage multiplier, effective in multi-currency/portfolio margin mode (deprecated). Currency leverage query API: GET /unified/leverage/user_currency_setting |  [optional] [readonly]
**spotOrderLoss** | **String** | Spot Pending Order Loss, in USDT, effective only in Cross-Currency Margin Mode and Portfolio Margin Mode. |  [optional]
**optionsOrderLoss** | **String** | Option Pending Order Loss, in USDT, effective only in Portfolio Margin Mode. |  [optional]
**spotHedge** | **Boolean** | Spot hedging status: true - enabled, false - disabled |  [optional]
**useFunding** | **Boolean** | Whether to use Earn funds as margin |  [optional]
**isAllCollateral** | **Boolean** | Whether all currencies are used as margin: true - all currencies as margin, false - no |  [optional]

