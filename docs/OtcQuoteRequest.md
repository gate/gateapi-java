
# OtcQuoteRequest

Fiat and Stablecoin Quote Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | PAY: specify the payment amount (&#x60;pay_amount&#x60; is required); GET: specify the receive amount (&#x60;get_amount&#x60; is required). | 
**payCoin** | **String** | Payment currency. Supported currencies are available on the OTC web quote page. | 
**getCoin** | **String** | Receive currency. Supported currencies are available on the OTC web quote page. | 
**payAmount** | **String** | User payment currency amount |  [optional]
**getAmount** | **String** | Amount of currency received by the user |  [optional]
**createQuoteToken** | **String** | Create quote token: 0: quote preview only; 1: generate quote token for order placement. |  [optional]
**promotionCode** | **String** | Promotion code |  [optional]

