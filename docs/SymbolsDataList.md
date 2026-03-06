
# SymbolsDataList

Trading symbol information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Trading symbol code |  [optional]
**symbolDesc** | **String** | Trading symbol description |  [optional]
**categoryId** | **Integer** | Category ID |  [optional]
**status** | **String** | Trading status (open&#x3D;tradable, closed&#x3D;non-tradable) |  [optional]
**tradeMode** | **String** | Trading mode code (0&#x3D;disabled, 1&#x3D;long only, 2&#x3D;short only, 3&#x3D;close only, 4&#x3D;full trading access) |  [optional]
**iconLink** | **String** | Symbol icon URL |  [optional]
**closeTime** | **Long** | Close time (Unix timestamp in seconds) |  [optional]
**openTime** | **Long** | Open time (Unix timestamp in seconds) |  [optional]
**nextOpenTime** | **Long** | Next open time (Unix timestamp in seconds, 0 means none) |  [optional]
**settlementCurrency** | **String** | Settlement currency |  [optional]
**settlementCurrencySymbol** | **String** | Settlement currency symbol |  [optional]
**pricePrecision** | **Integer** | Price precision (decimal places) |  [optional]

