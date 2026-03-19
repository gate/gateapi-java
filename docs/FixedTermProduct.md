
# FixedTermProduct

Fixed-term earn product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Product ID |  [optional]
**name** | **String** | Product name |  [optional]
**asset** | **String** | Currency |  [optional]
**lockUpPeriod** | **Integer** | Lock-up period (in days) |  [optional]
**minLendAmount** | **String** | Minimum earn amount |  [optional]
**userMaxLendAmount** | **String** | User maximum earn limit |  [optional]
**totalLendAmount** | **String** | Platform earn limit |  [optional]
**yearRate** | **String** | Annual interest rate |  [optional]
**type** | **Integer** | Product type: 1 for regular, 2 for VIP |  [optional]
**preRedeem** | **Integer** | Whether early redemption is supported: 0 for not supported, 1 for supported |  [optional]
**reinvest** | **Integer** | Whether auto-renewal is supported: 0 for not supported, 1 for supported |  [optional]
**redeemAccount** | **Integer** | Whether fixed-to-flexible conversion is supported: 0 for not supported, 1 for supported |  [optional]
**minVip** | **Integer** | Minimum VIP level requirement, 0-16, 0 means no restriction |  [optional]
**maxVip** | **Integer** | Maximum VIP level requirement (0-16), 0 means no restriction |  [optional]
**status** | **Integer** | Product status: 1 for unlisted, 2 for listed, 3 for delisted |  [optional]
**createTime** | **String** | Created time |  [optional]
**userMaxLendVolume** | **String** | User maximum earn amount |  [optional]
**userTotalAmount** | **String** | Total amount the user has invested in earn products |  [optional]
**saleStatus** | **Integer** | Sale status: 1 for on sale, 2 for sold out |  [optional]

