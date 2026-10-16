
# Symbol

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Unique trading pair identifier in the format ExchangeType_BusinessType_Base_Counter. Stocks and ETFs use the market as ExchangeType (US/HK/KR/JP) and STOCK or ETF as the business type, for example US_STOCK_AAPL_USDT, HK_STOCK_00700_USDT, or US_ETF_SPY_USDT. | 
**exchangeType** | **String** | Exchange type (BINANCE / OKX / GATE / BYBIT / KRAKEN / HYPERLIQUID / DERIBIT / LIGHTER). Stocks and ETFs return the listing market (US / HK / KR / JP) | 
**businessType** | **String** | Business type (SPOT: spot / FUTURE: futures / MARGIN: margin / STOCK: stocks / ETF: exchange-traded funds) | 
**state** | **String** | Status (&#x60;live&#x60; running / &#x60;suspend&#x60; paused). | 
**minSize** | **String** | Minimum order quantity | 
**minNotional** | **String** | Minimum Order Value | 
**lotSize** | **String** | Quantity Step | 
**tickSize** | **String** | Price Step | 
**maxNumOrders** | **String** | maximumopen orderamount | 
**maxMarketSize** | **String** | Maximum Market Order Quantity | 
**maxLimitSize** | **String** | Maximum order quantity for limit orders. | 
**contractSize** | **String** | Contract multiplier (deprecated; quantity is used uniformly) | 
**liquidationFee** | **String** | Liquidation Fee Rate | 
**delistTime** | **String** | Millisecond timestamp; &#x60;0&#x60; means not delisted. | 
**supportRpi** | **String** | Whether RPI order placement is supported (true if supported; false otherwise) |  [optional]
**supportCross** | **String** | Whether cross-margin order placement is supported (true if supported; false otherwise) |  [optional]
**tag** | **String** | Tag information. Hyperliquid returns DEX information, stocks and ETFs return the security description, and other businesses return an empty string | 

