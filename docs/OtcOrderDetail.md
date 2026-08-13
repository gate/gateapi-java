
# OtcOrderDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID | 
**uid** | **String** | User ID | 
**type** | **String** | Order Type | 
**fiatCurrency** | **String** | Fiat currency | 
**fiatAmount** | **String** | Fiat amount | 
**cryptoCurrency** | **String** | Digital currency | 
**cryptoAmount** | **String** | Cryptocurrency amount | 
**rate** | **String** | Exchange rate | 
**bankAccountName** | **String** | User payment/receiving name |  [optional]
**bankName** | **String** | User payment/receiving bank name |  [optional]
**bankCountry** | **String** | User payment/receiving bank country |  [optional]
**bankAddress** | **String** | User payment/receiving bank address |  [optional]
**bankAccountNumberIban** | **String** | User payment/receiving bank account number/IBAN |  [optional]
**swiftCode** | **String** | User payment/receiving bank SWIFT code |  [optional]
**intermediateBankName** | **String** | User payment/receiving intermediary bank name |  [optional]
**intermediaryBankSwiftCode** | **String** | User payment/receiving intermediary bank SWIFT code |  [optional]
**gateBankAccountName** | **String** | Gate beneficiary name, shown for BUY only |  [optional]
**gateBankName** | **String** | Gate beneficiary bank name, shown for BUY only |  [optional]
**gateBankCountry** | **String** | Gate beneficiary bank country, shown for BUY only |  [optional]
**gateBankAddress** | **String** | Gate beneficiary bank address, shown for BUY only |  [optional]
**gateBankAccountNumberIban** | **String** | Gate beneficiary bank account number/IBAN, shown for BUY only |  [optional]
**gateSwiftCode** | **String** | Gate beneficiary bank SWIFT code, shown for BUY only |  [optional]
**gateIntermediaryBankName** | **String** | Gate beneficiary intermediary bank name, shown for BUY only |  [optional]
**gateIntermediaryBankSwiftCode** | **String** | Gate beneficiary intermediary bank SWIFT code, shown for BUY only |  [optional]
**gateTransferRemark** | **String** | Transfer remark (mutually exclusive with &#x60;gate_reference_code&#x60;; empty when a BUY deposit order has a reference code), shown for BUY only |  [optional]
**gateReferenceCode** | **String** | Be sure to include the reference code when making the transfer so that your order can be processed promptly. (Mutually exclusive with &#x60;gate_transfer_remark&#x60;.) |  [optional]
**status** | **String** | Status | 
**createTime** | **String** | Created time | 

