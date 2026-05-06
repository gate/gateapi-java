
# CrossexAccount

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **String** | User ID | 
**availableMargin** | **String** | Available Margin | 
**marginBalance** | **String** | marginbalance | 
**initialMargin** | **String** | Initial Margin | 
**maintenanceMargin** | **String** | Maintenance margin | 
**initialMarginRate** | **String** | Initial margin rate | 
**maintenanceMarginRate** | **String** | Maintenance margin rate | 
**positionMode** | **String** | Contract Position Mode | 
**accountLimit** | **String** | Account limit |  [optional]
**createTime** | **String** | Created time | 
**updateTime** | **String** | Update time | 
**accountMode** | **String** | Account Mode. CROSS_EXCHANGE: Cross-Exchange Mode; ISOLATED_EXCHANGE: Split-Exchange Mode |  [optional]
**exchangeType** | **String** | Exchange Type. When account_mode is CROSS_EXCHANGE, it must be CROSSEX; otherwise, it is another exchange. |  [optional]
**assets** | [**List&lt;CrossexAccountAsset&gt;**](CrossexAccountAsset.md) | 资产列表，按交易所与币种维度返回各账户余额、保证金及盈亏明细 | 

