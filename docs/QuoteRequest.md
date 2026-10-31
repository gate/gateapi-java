
# QuoteRequest

Quote Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Alpha currency ID, for example USDS02b5a8dd2f59a098, not the display symbol USDS. First call GET /alpha/currencies without currency, match the token by name, chain and address, and use the returned currency field. Paginate with page and limit. | 
**side** | **String** | Buy or sell orders - buy - sell | 
**amount** | **String** | Trade Quantity - &#x60;side&#x60; : &#x60;buy&#x60; refers to the quote currency, i.e., &#x60;USDT&#x60; - &#x60;side&#x60; : &#x60;sell&#x60; refers to the base currency | 
**gasMode** | **String** | Trading mode affects slippage selection - &#x60;speed&#x60; : Smart mode - &#x60;custom&#x60; : Custom mode, uses &#x60;slippage&#x60; parameter | 
**slippage** | **String** | Slippage tolerance (10 means 10% tolerance) |  [optional]

