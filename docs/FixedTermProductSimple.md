
# FixedTermProductSimple

Fixed-term earn product (compact)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Product ID |  [optional]
**asset** | **String** | Currency |  [optional]
**lockUpPeriod** | **Integer** | Lock-up period (in days) |  [optional]
**yearRate** | **String** | Annual interest rate |  [optional]
**type** | **Integer** | Product type: 1 for regular, 2 for VIP |  [optional]
**preRedeem** | **Integer** | Whether early redemption is supported: 0 for not supported, 1 for supported |  [optional]
**reinvest** | **Integer** | Whether auto-renewal is supported: 0 for not supported, 1 for supported |  [optional]
**simpleEarn** | **Integer** | Whether fixed-to-flexible conversion is supported: 0 for not supported, 1 for supported |  [optional]
**minVip** | **Integer** | Minimum VIP level requirement, 0 means no restriction |  [optional]
**maxVip** | **Integer** | Maximum VIP level requirement, 0 means no restriction |  [optional]
**saleStatus** | **Integer** | Sale status: 1 for on sale, 2 for sold out |  [optional]

