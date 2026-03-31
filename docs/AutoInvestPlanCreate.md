
# AutoInvestPlanCreate

Create auto invest planRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planName** | **String** | Plan name。Length: 0-50 characters |  [optional]
**planDes** | **String** | Plan description |  [optional]
**planMoney** | **String** | Pricing currency，SupportUSDT，BTC | 
**planAmount** | **String** | Per PeriodAuto InvestAmount，Must &gt; 0，and not exceedThePricing currencyConfigurationSingleMaximumAmount | 
**planPeriodType** | **String** | Enum: daily, weekly, biweekly, monthly, hourly, 4-hourly | 
**planPeriodDay** | **Long** | Cycle day. For monthly: day of month (1-30); For weekly/biweekly: day of week (1-7, 1&#x3D;Monday); For daily/hourly/4-hourly: ignored | 
**planPeriodHour** | **Long** | Execution hourAuto Invest 0-23 | 
**items** | [**List&lt;AutoInvestPlanCreateItems&gt;**](AutoInvestPlanCreateItems.md) | Investment portfolio, asset cannot be repeated; Sum of all items&#39; ratios must be 100 | 
**fundSource** | **String** | Fund source: spot or earn, default: spot |  [optional]
**fundFlow** | **String** | Fund flow direction: auto_invest or earn, default: auto_invest |  [optional]
**type** | **Long** | 0 Normal creation, 1 QuickInvestment |  [optional]

