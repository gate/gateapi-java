
# OrderResponse

Order response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**txHash** | **String** | Transaction Hash |  [optional]
**side** | **String** | Buy or sell orders - buy - sell |  [optional]
**usdtAmount** | **String** | Amount (USDT) |  [optional]
**currency** | **String** | Token |  [optional]
**currencyAmount** | **String** | Token amount |  [optional]
**status** | **Integer** | Order Status - &#x60;0&#x60; : All - &#x60;1&#x60; : Processing - &#x60;2&#x60; : Successful - &#x60;3&#x60; : Failed - &#x60;4&#x60; : Cancelled - &#x60;5&#x60; : Buy order placed but transfer not completed - &#x60;6&#x60; : Order cancelled but transfer not completed |  [optional]
**gasMode** | **String** | Trading mode affects slippage selection - &#x60;speed&#x60; : Smart mode - &#x60;custom&#x60; : Custom mode, uses &#x60;slippage&#x60; parameter |  [optional]
**chain** | **String** | Blockchain |  [optional]
**gasFee** | **String** | Gas Fee (USDT-based) |  [optional]
**transactionFee** | **String** | Trading Fee (USDT-based) |  [optional]
**failedReason** | **String** | Failure reason (if applicable) |  [optional]
**createTime** | **Long** | Creation timestamp |  [optional]

