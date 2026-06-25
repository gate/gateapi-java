
# ContractStat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Long** | Stat timestamp |  [optional]
**lsrTaker** | **Double** | Long/short taker ratio |  [optional]
**lsrAccount** | **Double** | Long/short position user ratio |  [optional]
**longLiqSize** | **String** | Long liquidation size (contracts) |  [optional]
**longLiqAmount** | **Double** | Long liquidation amount (base currency) |  [optional]
**longLiqUsd** | **Double** | Long liquidation volume (quote currency) |  [optional]
**longLiqUsdNew** | **Double** | Long liquidations in quote currency; USDT settlement: long_liq_size × multiplier × mark price |  [optional]
**shortLiqSize** | **String** | Short liquidation size (contracts) |  [optional]
**shortLiqAmount** | **Double** | Short liquidation amount (base currency) |  [optional]
**shortLiqUsd** | **Double** | Short liquidation volume (quote currency) |  [optional]
**shortLiqUsdNew** | **Double** | Short liquidations in quote currency; USDT settlement: short_liq_size × multiplier × mark price |  [optional]
**openInterest** | **String** | Total open interest size (contracts) |  [optional]
**openInterestUsd** | **Double** | Total open interest volume (quote currency) |  [optional]
**topLsrAccount** | **Double** | Top trader long/short account ratio |  [optional]
**topLsrSize** | **String** | Top trader long/short position ratio |  [optional]
**markPrice** | **Double** | Mark price |  [optional]
**topLongSize** | **String** | Top long open interest (contracts) |  [optional]
**topShortSize** | **String** | Top short open interest (contracts) |  [optional]
**longTakerSize** | **String** | Long taker trade volume (contracts) |  [optional]
**shortTakerSize** | **String** | Short taker trade volume (contracts) |  [optional]
**topLongAccount** | **Long** | Number of top long accounts (large holders) |  [optional]
**topShortAccount** | **Long** | Number of top short accounts (large holders) |  [optional]
**longUsers** | **String** | Number of users holding long positions |  [optional]
**shortUsers** | **String** | Number of users holding short positions |  [optional]

