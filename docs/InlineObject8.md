
# InlineObject8

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | BUY for on-ramp, SELL for off-ramp | 
**side** | **String** | Quote direction returned by the quote API (used for order validation) | 
**cryptoCurrency** | **String** | Cryptocurrency (supported currencies can be queried from the OTC web fiat quote page) | 
**fiatCurrency** | **String** | Fiat currency (supported currencies can be queried from the OTC web fiat quote page) | 
**cryptoAmount** | **String** | Amount of cryptocurrency | 
**fiatAmount** | **String** | Fiat amount | 
**promotionCode** | **String** | Promotion code |  [optional]
**quoteToken** | **String** | Parameter returned by the quote API | 
**bankId** | **String** | Bank card ID used for the order (retrieved via the default bank card API) | 

