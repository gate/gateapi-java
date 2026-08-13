
# PositionTimerange

Contract position details (historical data)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contract** | **String** | Futures contract |  [optional] [readonly]
**size** | **String** | Position size |  [optional] [readonly]
**leverage** | **String** | Position leverage. 0 means cross margin; positive number means isolated margin |  [optional]
**riskLimit** | **String** | Position risk limit |  [optional]
**leverageMax** | **String** | the maximum permissible leverage given to the current positon value: the higher positon value, the lower maximum permissible leverage |  [optional] [readonly]
**maintenanceRate** | **String** | The maintenance margin rate of the first tier of risk limit sheet |  [optional] [readonly]
**margin** | **String** | Margin |  [optional]
**liqPrice** | **String** | Liquidation price |  [optional] [readonly]
**realisedPnl** | **String** | Realized PnL |  [optional] [readonly]
**historyPnl** | **String** | Total realized PnL from closed positions |  [optional] [readonly]
**lastClosePnl** | **String** | PNL of last position close |  [optional] [readonly]
**realisedPoint** | **String** | Realized POINT PNL |  [optional] [readonly]
**historyPoint** | **String** | History realized POINT PNL |  [optional] [readonly]
**mode** | **String** | Position mode, including: - &#x60;single&#x60;: One-way Mode - &#x60;dual_long&#x60;: Long position in Hedge Mode - &#x60;dual_short&#x60;: Short position in Hedge Mode |  [optional]
**crossLeverageLimit** | **String** | Cross margin leverage (valid only when &#x60;leverage&#x60; is 0) |  [optional]
**entryPrice** | **String** | Entry price |  [optional] [readonly]
**time** | **Long** | Timestamp |  [optional]

