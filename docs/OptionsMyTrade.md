
# OptionsMyTrade

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Fill ID |  [optional]
**createTime** | **Double** | Fill Time |  [optional]
**contract** | **String** | Options contract name |  [optional]
**orderId** | **Integer** | Related order ID |  [optional]
**size** | **Long** | Trading size |  [optional]
**price** | **String** | Trade price (quote currency) |  [optional]
**underlyingPrice** | **String** | The forward futures price corresponding to the delivery date |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Trade role. taker - taker, maker - maker |  [optional]

## Enum: RoleEnum

Name | Value
---- | -----
TAKER | &quot;taker&quot;
MAKER | &quot;maker&quot;

