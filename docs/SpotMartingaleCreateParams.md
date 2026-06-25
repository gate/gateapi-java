
# SpotMartingaleCreateParams

Spot martingale creation parameters (serialized fields aligned with `MartingaleBot`). - **Stop-loss**: use `stop_loss_per_cycle` (ratio per round), same as the app; **do not** use `stop_loss_price`. - Optional **`trigger_price`**: trigger price. - If `stop_loss_per_cycle` is passed and > 0, the server validates roughly between `0.001` and `0.9999` (same as `check_martingale`).

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

