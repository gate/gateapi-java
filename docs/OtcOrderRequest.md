
# OtcOrderRequest

Fiat Order Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | BUY for on-ramp, SELL for off-ramp | 
**side** | **String** | The side returned by the quote endpoint (used for order validation). For backward compatibility, &#x60;FIAT&#x60;/&#x60;CRYPTO&#x60; or &#x60;PAY&#x60;/&#x60;GET&#x60; are accepted; new integrations should use the value returned by the quote response. | 
**cryptoCurrency** | **String** | Cryptocurrency (supported currencies can be queried from the OTC web fiat quote page) | 
**fiatCurrency** | **String** | Fiat currency (supported currencies can be queried from the OTC web fiat quote page) | 
**cryptoAmount** | **String** | Amount of cryptocurrency | 
**fiatAmount** | **String** | Fiat amount | 
**promotionCode** | **String** | Promotion code |  [optional]
**quoteToken** | **String** | Parameter returned by the quote API | 
**bankId** | **String** | Bank card ID used to place the order. Select one from the list returned by &#x60;GET /otc/bank/list&#x60;; the default card has &#x60;is_default&#x3D;1&#x60;. | 

