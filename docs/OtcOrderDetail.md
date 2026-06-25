
# OtcOrderDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID | 
**uid** | **String** | User ID | 
**type** | **String** | Order Type | 
**fiatCurrency** | **String** | Fiat type | 
**fiatAmount** | **String** | Fiat amount | 
**cryptoCurrency** | **String** | Stablecoin | 
**cryptoAmount** | **String** | Stablecoin amount | 
**rate** | **String** | Exchange rate | 
**transferRemark** | **String** | Transfer remark (mutually exclusive with reference_code; empty string when the deposit buy order has a reference code) | 
**referenceCode** | **String** | Unique bank transfer reference code for deposit buy orders (SGB deposit scenario; mutually exclusive with transfer_remark) |  [optional]
**status** | **String** | Status | 
**dbStatus** | **String** |  | 
**createTime** | **String** | Created time | 
**memo** | **String** | Cancellation or rejection reason | 
**side** | **String** | Quote direction | 
**promotionCode** | **String** | Promotion code | 
**tradeNo** | **String** | Trade number | 

