
# OptionsContract

Options contract details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Options contract name |  [optional]
**tag** | **String** | Expiry periods include day, week, and month. |  [optional]
**createTime** | **Double** | Created time |  [optional]
**expirationTime** | **Double** | Expiration time |  [optional]
**isCall** | **Boolean** | &#x60;true&#x60; means call options, &#x60;false&#x60; means put options |  [optional]
**multiplier** | **String** | The option contract multiplier indicates how many units of the underlying asset the face value of one contract represents. |  [optional]
**underlying** | **String** | Underlying |  [optional]
**underlyingPrice** | **String** | The forward futures price corresponding to the delivery date |  [optional]
**lastPrice** | **String** | Last trading price |  [optional]
**markPrice** | **String** | Current mark price (quote currency) |  [optional]
**indexPrice** | **String** | Current index price (quote currency) |  [optional]
**makerFeeRate** | **String** | Maker fee rate, negative values indicate rebates |  [optional]
**takerFeeRate** | **String** | Taker fee rate |  [optional]
**orderPriceRound** | **String** | Minimum order price increment |  [optional]
**markPriceRound** | **String** | Minimum mark price increment |  [optional]
**orderSizeMin** | **Long** | Minimum order quantity |  [optional]
**orderSizeMax** | **Long** | Maximum order quantity |  [optional]
**orderPriceDeviate** | **String** | Deprecated |  [optional]
**refDiscountRate** | **String** | Trading fee discount for referred users |  [optional]
**refRebateRate** | **String** | Commission rate for referrers |  [optional]
**orderbookId** | **Long** | Orderbook update ID |  [optional]
**tradeId** | **Long** | Deprecated |  [optional]
**tradeSize** | **Long** | Historical cumulative trading volume |  [optional]
**positionSize** | **Long** | Current total long position size |  [optional]
**ordersLimit** | **Integer** | The maximum number of open orders each user can place in this order book. |  [optional]

