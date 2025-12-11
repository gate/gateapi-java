
# FuturesAutoDeleverage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Long** | Automatic deleveraging time |  [optional] [readonly]
**user** | **Long** | User ID |  [optional] [readonly]
**orderId** | **Long** | Order ID. Order IDs before 2023-02-20 are null |  [optional] [readonly]
**contract** | **String** | Futures contract |  [optional] [readonly]
**leverage** | **String** |  leverage for isolated margin. 0 means cross margin. For leverage of cross margin, please refer to &#x60;cross_leverage_limit&#x60;. |  [optional] [readonly]
**crossLeverageLimit** | **String** | leverage for cross margin |  [optional] [readonly]
**entryPrice** | **String** | Average entry price |  [optional] [readonly]
**fillPrice** | **String** | Average fill price |  [optional] [readonly]
**tradeSize** | **String** | Trading size |  [optional] [readonly]
**positionSize** | **String** | Positions after auto-deleveraging |  [optional] [readonly]

