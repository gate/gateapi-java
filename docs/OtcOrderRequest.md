
# OtcOrderRequest

Fiat Order Request Body

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
**bankId** | **String** | The bank card ID used for placing the order; select it from the list returned by &#x60;GET /otc/bank_list&#x60; (or &#x60;GET /otc/bank/list&#x60;); the default card has &#x60;is_default&#x3D;1&#x60; | 

