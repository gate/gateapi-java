
# OtcQuoteRequest

Fiat and Stablecoin Quote Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**side** | **String** | PAY/GET quote direction. PAY means user inputs pay amount, GET means user inputs get amount. If PAY, pay_amount is required. If GET, get_amount is required | 
**payCoin** | **String** | Currency the user pays. Supported currencies can be found on the OTC web quote page. | 
**getCoin** | **String** | Currency the user receives. Supported currencies can be found on the OTC web quote page. | 
**payAmount** | **String** | User payment currency amount |  [optional]
**getAmount** | **String** | Amount of currency received by the user |  [optional]
**createQuoteToken** | **String** | Create quote token: 0: quote preview only; 1: generate quote token for order placement. |  [optional]
**promotionCode** | **String** | Promotion code (optional) |  [optional]

