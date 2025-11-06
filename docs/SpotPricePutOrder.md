
# SpotPricePutOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Order type，default to &#x60;limit&#x60;  - limit : Limit Order - market : Market Order |  [optional]
**side** | [**SideEnum**](#SideEnum) | Order side  - buy: buy side - sell: sell side | 
**price** | **String** | Order price | 
**amount** | **String** | Trading quantity, refers to the trading quantity of the trading currency, i.e., the currency that needs to be traded, for example, the quantity of BTC in BTC_USDT. | 
**account** | [**AccountEnum**](#AccountEnum) | Trading account type. Unified account must be set to &#x60;unified&#x60;  - normal: spot trading - margin: margin trading - unified: unified account  | 
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | time_in_force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only  |  [optional]
**autoBorrow** | **Boolean** | Whether to borrow coins automatically |  [optional]
**autoRepay** | **Boolean** | Whether to repay the loan automatically |  [optional]
**text** | **String** | The source of the order, including: - web: Web - api: API call - app: Mobile app |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
LIMIT | &quot;limit&quot;
MARKET | &quot;market&quot;

## Enum: SideEnum

Name | Value
---- | -----
BUY | &quot;buy&quot;
SELL | &quot;sell&quot;

## Enum: AccountEnum

Name | Value
---- | -----
NORMAL | &quot;normal&quot;
MARGIN | &quot;margin&quot;
UNIFIED | &quot;unified&quot;

## Enum: TimeInForceEnum

Name | Value
---- | -----
GTC | &quot;gtc&quot;
IOC | &quot;ioc&quot;

