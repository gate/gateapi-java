
# DeliveryAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **String** | Balance, only applicable to classic contract account.The balance is the sum of all historical fund flows, including historical transfers in and out, closing settlements, and transaction fee expenses, but does not include upl of positions.total &#x3D; SUM(history_dnw, history_pnl, history_fee, history_refr, history_fund) |  [optional]
**unrealisedPnl** | **String** | Unrealized PNL |  [optional]
**positionMargin** | **String** | Deprecated |  [optional]
**orderMargin** | **String** | initial margin of all open orders |  [optional]
**available** | **String** | Available amount for transfer or trading, which includes credit limits under the unified account (includes experience funds; experience funds cannot be transferred, so when transferring, the transfer amount must deduct experience funds) |  [optional]
**point** | **String** | Point card amount |  [optional]
**currency** | **String** | Settlement currency |  [optional]
**inDualMode** | **Boolean** | Whether Hedge Mode is enabled |  [optional]
**enableCredit** | **Boolean** | Whether portfolio margin account mode is enabled |  [optional]
**positionInitialMargin** | **String** | Initial margin occupied by positions, applicable to unified account mode |  [optional]
**maintenanceMargin** | **String** | Maintenance margin occupied by positions, applicable to new classic account margin mode and unified account mode |  [optional]
**bonus** | **String** | Bonus |  [optional]
**enableEvolvedClassic** | **Boolean** | Deprecated |  [optional]
**crossOrderMargin** | **String** | Cross margin order margin, applicable to new classic account margin mode |  [optional]
**crossInitialMargin** | **String** | Cross margin initial margin, applicable to new classic account margin mode |  [optional]
**crossMaintenanceMargin** | **String** | Cross margin maintenance margin, applicable to new classic account margin mode |  [optional]
**crossUnrealisedPnl** | **String** | Cross margin unrealized P&amp;L, applicable to new classic account margin mode |  [optional]
**crossAvailable** | **String** | Cross margin available balance, applicable to new classic account margin mode |  [optional]
**crossMarginBalance** | **String** | Cross margin balance, applicable to new classic account margin mode |  [optional]
**crossMmr** | **String** | Cross margin maintenance margin rate, applicable to new classic account margin mode |  [optional]
**crossImr** | **String** | Cross margin initial margin rate, applicable to new classic account margin mode |  [optional]
**isolatedPositionMargin** | **String** | Isolated position margin, applicable to new classic account margin mode |  [optional]
**enableNewDualMode** | **Boolean** | Deprecated |  [optional]
**marginMode** | **Integer** | Margin mode of the account 0: classic future account or Classic Spot Margin Mode of unified account; 1:  Multi-Currency Margin Mode; 2:  Portoforlio Margin Mode; 3:  Single-Currency Margin Mode |  [optional]
**enableTieredMm** | **Boolean** | Whether to enable tiered maintenance margin calculation |  [optional]
**history** | [**FuturesAccountHistory**](FuturesAccountHistory.md) |  |  [optional]

