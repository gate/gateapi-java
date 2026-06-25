
# OtcOrderListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **String** | Current time |  [optional]
**timestamp** | **Integer** | Current timestamp |  [optional]
**orderId** | **String** | orderId |  [optional]
**tradeNo** | **String** | Trade number |  [optional]
**type** | **String** | Quote direction buy/sell/all |  [optional]
**status** | **String** | Order Status |  [optional]
**dbStatus** | **String** |  |  [optional]
**fiatCurrency** | **String** | Fiat type |  [optional]
**fiatCurrencyInfo** | [**OtcOrderListFiatCurrencyInfo**](OtcOrderListFiatCurrencyInfo.md) |  |  [optional]
**fiatAmount** | **String** | Fiat amount |  [optional]
**cryptoCurrency** | **String** | Stablecoin |  [optional]
**cryptoCurrencyInfo** | [**OtcOrderListCryptoCurrencyInfo**](OtcOrderListCryptoCurrencyInfo.md) |  |  [optional]
**cryptoAmount** | **String** | Stablecoin amount |  [optional]
**rate** | **String** | Exchange rate |  [optional]
**transferRemark** | **String** | Transfer remark (mutually exclusive with reference_code; empty string when the deposit buy order has a reference code) |  [optional]
**referenceCode** | **String** | Unique bank transfer reference code for deposit buy orders (SGB deposit scenario) |  [optional]
**gateBankAccountIban** | **String** | Bank account |  [optional]
**promotionCode** | **String** | Promotion code |  [optional]

