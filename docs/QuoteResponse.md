
# QuoteResponse

Quote Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**quoteId** | **String** | Quote ID for order placement, valid for 1 minute |  [optional]
**minAmount** | **String** | Minimum order size |  [optional]
**maxAmount** | **String** | Maximum order size |  [optional]
**price** | **String** | Token Price (USDT-based) |  [optional]
**slippage** | **String** | Slippage |  [optional]
**estimateGasFeeAmountUsdt** | **String** | Estimated Gas Fee (USDT-based) |  [optional]
**orderFee** | **String** | Slippage tolerance (10 means 10% tolerance) |  [optional]
**targetTokenMinAmount** | **String** | Minimum received amount |  [optional]
**targetTokenMaxAmount** | **String** | Maximum received amount |  [optional]
**errorType** | **Integer** | Failure Type - &#x60;0&#x60; : Success - &#x60;1&#x60; : Exceeds maximum value - &#x60;2&#x60; : Below minimum value |  [optional]

