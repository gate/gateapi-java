
# OrderHistoryListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID |  [optional]
**symbol** | **String** | Symbol |  [optional]
**exchange** | [**ExchangeEnum**](#ExchangeEnum) | Exchange, supports us, hk, kr, and jp |  [optional]
**quoteCurrency** | **String** | Quote currency |  [optional]
**fxRate** | **String** | Quote currency to USD exchange rate |  [optional]
**symbolDesc** | **String** | Symbol description |  [optional]
**priceType** | [**PriceTypeEnum**](#PriceTypeEnum) | Price type (market &#x3D; market order, limit &#x3D; limit order) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Order status. - 0: Unknown. - 1: New order; the order has been validated and is waiting to be processed. - 2: Partially filled. - 3: Filled. - 4: Canceled. - 5: Order rejected. - 6: Cancellation rejected. - 7: Order update succeeded. - 8: Order update rejected. |  [optional]
**statusDesc** | **String** | Order status description |  [optional]
**statusDetail** | [**OrderHistoryListItemStatusDetail**](OrderHistoryListItemStatusDetail.md) |  |  [optional]
**finishAs** | [**FinishAsEnum**](#FinishAsEnum) | Order completion reason. - 0: Unknown. - 1: No quote found. - 2: No match found. - 3: Trigger price exceeded. - 4: Order value exceeds the limit. - 5: Unknown rejection. - 6: Unknown cancellation. - 7: Canceled by user. - 8: Canceled after the order time in force expired. - 9: Trading is not supported in the current session. - 13: Canceled due to corporate action. |  [optional]
**side** | [**SideEnum**](#SideEnum) | Side (1&#x3D;sell, 2&#x3D;buy) |  [optional]
**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) | Time in force. - day: Day order. |  [optional]
**volume** | **String** | Order quantity |  [optional]
**fillVolume** | **String** | Trading size |  [optional]
**price** | **String** | Order price |  [optional]
**avgFillPrice** | **String** | Average fill price |  [optional]
**commission** | **String** | fee |  [optional]
**timeSetup** | **Long** | Order creation time (Unix timestamp, seconds) |  [optional]
**timeDone** | **Long** | Order completion time (Unix timestamp in seconds) |  [optional]

## Enum: ExchangeEnum

Name | Value
---- | -----
US | &quot;us&quot;
HK | &quot;hk&quot;
KR | &quot;kr&quot;
JP | &quot;jp&quot;

## Enum: PriceTypeEnum

Name | Value
---- | -----
MARKET | &quot;market&quot;
LIMIT | &quot;limit&quot;

## Enum: StatusEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8

## Enum: FinishAsEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
NUMBER_6 | 6
NUMBER_7 | 7
NUMBER_8 | 8
NUMBER_9 | 9
NUMBER_13 | 13

## Enum: SideEnum

Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

## Enum: TimeInForceEnum

Name | Value
---- | -----
DAY | &quot;day&quot;

