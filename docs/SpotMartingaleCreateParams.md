
# SpotMartingaleCreateParams

现货马丁策略的创建参数（对应 `MartingaleBot` 序列化字段）。  - **止损**：使用 `stop_loss_per_cycle`（每轮止损比例），与 App 一致；**不使用** `stop_loss_price`。 - 可选 **`trigger_price`**：触发价。 - `stop_loss_per_cycle` 若传入且大于 0，服务端校验区间约为 `0.001`～`0.9999`（与 `check_martingale` 一致）。

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investAmount** | **String** |  | 
**priceDeviation** | **String** | Add-position deviation ratio as a decimal string (e.g. a 2% drop is &#x60;0.02&#x60;). | 
**maxOrders** | **Integer** |  | 
**takeProfitRatio** | **String** | Take-profit ratio per round as a decimal string. | 
**stopLossPerCycle** | **String** | Stop-loss ratio per round as a decimal string; optional; aligned with app &#x60;stop_loss_per_cycle&#x60;. |  [optional]
**triggerPrice** | **String** | Trigger price; optional. |  [optional]
**profitSharingRatio** | **String** |  |  [optional]

