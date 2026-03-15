
# CrossexAccountUpdateRequest

Change Account Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**positionMode** | **String** | Futures position mode (SINGLE/DUAL) |  [optional]
**accountMode** | **String** | Account mode (CROSS_EXCHANGE/ISOLATED_EXCHANGE, default: CROSS_EXCHANGE) |  [optional]
**exchangeType** | **String** | Exchange (BINANCE/OKX/GATE/BYBIT/CROSSEX; when account mode is ISOLATED_EXCHANGE, the exchange must be specified to modify futures position mode) |  [optional]

