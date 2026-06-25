
# CreateChaseOrderReq

Request body for creating a chase order

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Contract name; server-side converted to uppercase | 
**settle** | **String** | Settle currency, overridden by the path parameter and converted to lowercase |  [optional]
**amount** | **String** | Total order size in contracts, decimal string. Positive for buy, negative for sell. Cannot be 0 | 
**priceLimit** | **String** | 最高追逐价，合法十进制字符串；未设置限价时请传 \&quot;0\&quot; | 
**offsetLimit** | **String** | Maximum chasing distance from the best price, mutually exclusive with price_limit |  [optional]
**reduceOnly** | **Boolean** | Whether reduce only |  [optional]
**text** | **String** | Optional custom tag |  [optional]
**isDualMode** | **Boolean** | Whether dual-position mode is enabled |  [optional]
**priceType** | **Long** | Price type: 1 best bid/ask, 2 distance from best bid/ask |  [optional]
**priceGapType** | **Long** | Used when price_type &#x3D;&#x3D; 2: 1 absolute price gap, 2 percentage |  [optional]
**priceGapValue** | **String** | Price gap value paired with price_gap_type |  [optional]
**posMarginMode** | **String** | Position margin mode, e.g. isolated or cross |  [optional]
**positionMode** | **String** | Position mode (e.g. single, dual, dual_plus) |  [optional]

