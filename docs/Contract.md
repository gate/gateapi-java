
# Contract

Futures contract details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Futures contract |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Contract type: inverse - inverse contract, direct - direct contract |  [optional]
**quantoMultiplier** | **String** | The contract multiplier indicates how many units of the underlying asset the face value of one contract represents. |  [optional]
**leverageMin** | **String** | Minimum leverage |  [optional]
**leverageMax** | **String** | Maximum leverage |  [optional]
**maintenanceRate** | **String** | The maintenance margin rate of the first tier of risk limit sheet |  [optional]
**markType** | [**MarkTypeEnum**](#MarkTypeEnum) | Deprecated |  [optional]
**markPrice** | **String** | Current mark price |  [optional]
**indexPrice** | **String** | Current index price |  [optional]
**lastPrice** | **String** | Last trading price |  [optional]
**makerFeeRate** | **String** | Maker fee rate, negative values indicate rebates |  [optional]
**takerFeeRate** | **String** | Taker fee rate |  [optional]
**orderPriceRound** | **String** | Minimum order price increment |  [optional]
**markPriceRound** | **String** | Minimum mark price increment |  [optional]
**fundingRate** | **String** | Current funding rate |  [optional]
**fundingInterval** | **Integer** | Funding application interval, unit in seconds |  [optional]
**fundingNextApply** | **Double** | Next funding time |  [optional]
**riskLimitBase** | **String** | Base risk limit (deprecated) |  [optional]
**interestRate** | **String** | Interest rate parameter used in funding rate and premium-related calculations for perpetual contracts. Returned as a string decimal ratio (e.g. &#x60;0.0003&#x60;), same convention as &#x60;funding_rate&#x60; (ratio, not percent). |  [optional]
**riskLimitStep** | **String** | Risk limit adjustment step (deprecated) |  [optional]
**riskLimitMax** | **String** | Maximum risk limit allowed by the contract (deprecated). It is recommended to use /futures/{settle}/risk_limit_tiers to query risk limits |  [optional]
**orderSizeMin** | **String** | Minimum order size allowed by the contract |  [optional]
**enableDecimal** | **Boolean** | Whether decimal string type is supported for contract lot size. When this field is set to &#x60;true&#x60;, it indicates that the contract supports decimal lot sizes (i.e., the &#x60;size&#x60; field can use a decimal string type); when set to &#x60;false&#x60;, it indicates that the contract does not support decimal lot sizes (i.e., the &#x60;size&#x60; field can only use an integer type). |  [optional]
**orderSizeMax** | **String** | Maximum order size allowed by the contract |  [optional]
**orderPriceDeviate** | **String** | Maximum allowed deviation between order price and current mark price. The order price &#x60;order_price&#x60; must satisfy the following condition:      abs(order_price - mark_price) &lt;&#x3D; mark_price * order_price_deviate |  [optional]
**refDiscountRate** | **String** | Trading fee discount for referred users |  [optional]
**refRebateRate** | **String** | Commission rate for referrers |  [optional]
**orderbookId** | **Long** | Orderbook update ID |  [optional]
**tradeId** | **Long** | Current trade ID |  [optional]
**tradeSize** | **String** | Historical cumulative trading volume |  [optional]
**positionSize** | **String** | Current total long position size |  [optional]
**configChangeTime** | **Double** | Last configuration update time |  [optional]
**inDelisting** | **Boolean** | &#x60;in_delisting&#x3D;true&#x60; and position_size&gt;0 indicates the contract is in delisting transition period &#x60;in_delisting&#x3D;true&#x60; and position_size&#x3D;0 indicates the contract is delisted |  [optional]
**ordersLimit** | **Integer** | Maximum number of pending orders |  [optional]
**enableBonus** | **Boolean** | Whether bonus is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account is enabled |  [optional]
**createTime** | **Double** | Created time of the contract |  [optional]
**fundingCapRatio** | **String** | Deprecated |  [optional]
**status** | **String** | Contract status types include: prelaunch (pre-launch), trading (active), delisting (delisting), delisted (delisted), circuit_breaker (circuit breaker) |  [optional]
**launchTime** | **Long** | Contract expiry timestamp |  [optional]
**delistingTime** | **Long** | Timestamp when contract enters reduce-only state |  [optional]
**delistedTime** | **Long** | Contract delisting time |  [optional]
**marketOrderSlipRatio** | **String** | The maximum slippage allowed for market orders, with the slippage rate calculated based on the latest market price |  [optional]
**marketOrderSizeMax** | **String** | The maximum number of contracts supported for market orders, with a default value of 0. When the default value is used, the maximum number of contracts is limited by the &#x60;order_size_max&#x60; field |  [optional]
**fundingRateLimit** | **String** | Upper and lower limits of funding rate |  [optional]
**contractType** | **String** | Contract classification type, e.g. stocks, metals, indices, forex, commodities, etc. |  [optional]
**fundingImpactValue** | **String** | Funding rate depth impact value |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
INVERSE | &quot;inverse&quot;
DIRECT | &quot;direct&quot;

## Enum: MarkTypeEnum

Name | Value
---- | -----
INTERNAL | &quot;internal&quot;
INDEX | &quot;index&quot;

