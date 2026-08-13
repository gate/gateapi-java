
# OtcQuoteResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | BUY (on-ramp) or SELL (off-ramp) | 
**payCoin** | **String** | Payment currency | 
**getCoin** | **String** | Currency | 
**payAmount** | **String** | Payment amount | 
**getAmount** | **String** | Redemption Amount | 
**rate** | **String** | Exchange rate | 
**rateReci** | **String** | Reciprocal of the exchange rate | 
**promotionCode** | **String** | Promotion code | 
**side** | **String** | Quote method | 
**orderType** | **String** | Order type: FIAT (fiat) / STABLE (stablecoin) | 
**quoteToken** | **String** | Quote token required when placing an order | 
**validityPeriod** | **String** | Quote validity period (seconds) |  [optional]
**refreshLimit** | **Integer** | Quote refresh limit |  [optional]
**refreshLimitMsg** | **String** | Quote refresh limit message |  [optional]

