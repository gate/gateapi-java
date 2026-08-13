
# OtcStableCoinOrderRequest

Stablecoin Order Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payCoin** | **String** | Currency paid by the user. Supported currencies can be queried from the OTC web stablecoin quote page. | 
**getCoin** | **String** | Currency to be received by the user. Supported currencies can be queried from the OTC web stablecoin quote page. | 
**payAmount** | **String** | User payment currency amount | 
**getAmount** | **String** | Amount of currency received by the user | 
**side** | **String** | The side returned by the quote endpoint (used for order validation). For backward compatibility, &#x60;PAY&#x60;/&#x60;GET&#x60; are accepted; new integrations should use the value returned by the quote response. | 
**promotionCode** | **String** | Promotion code (optional) |  [optional]
**quoteToken** | **String** | Parameter returned by the quote API | 

