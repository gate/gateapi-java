
# OptionsAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | **Long** | User ID |  [optional]
**total** | **String** | Account balance, invalid for unified account |  [optional]
**positionValue** | **String** | Position value, long position value is positive, short position value is negative |  [optional]
**equity** | **String** | Account equity &#x3D; balance + option position value, invalid for unified account |  [optional]
**shortEnabled** | **Boolean** | If the account is allowed to short |  [optional]
**mmpEnabled** | **Boolean** | Whether to enable MMP |  [optional]
**liqTriggered** | **Boolean** | Whether the account is in a liquidation state |  [optional]
**marginMode** | [**MarginModeEnum**](#MarginModeEnum) | 此字段表示统一账户所使用的保证金模式：  - 0：经典现货保证金模式 - 1：跨币种保证金模式 - 2：组合保证金模式 - 3: 表示为单币种保证金模式 |  [optional]
**unrealisedPnl** | **String** | Unrealised PnL &#x3D; (mark price - entry price) * position size. For long postion, size is positive; for short positon, size is negative.This value is for reference only. |  [optional]
**initMargin** | **String** | Initial position margin |  [optional]
**maintMargin** | **String** | Position maintenance margin |  [optional]
**orderMargin** | **String** | Order margin of unfinished orders |  [optional]
**askOrderMargin** | **String** | Margin for outstanding sell orders |  [optional]
**bidOrderMargin** | **String** | Margin for outstanding buy orders |  [optional]
**available** | **String** | Available balance to transfer out or trade |  [optional]
**point** | **String** | Point card amount |  [optional]
**currency** | **String** | Settlement currency |  [optional]
**ordersLimit** | **Integer** | Maximum number of outstanding orders |  [optional]
**positionNotionalLimit** | **Long** | Notional value upper limit, including the nominal value of positions and outstanding orders |  [optional]

## Enum: MarginModeEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

