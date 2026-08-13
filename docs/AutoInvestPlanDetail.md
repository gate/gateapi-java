
# AutoInvestPlanDetail

Auto invest planDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Plan ID | 
**version** | **Long** | PlanVersion |  [optional]
**name** | **String** | Plan name | 
**createTime** | **Long** | Creation time (Unix timestamp) | 
**updateTime** | **Long** | Update time (Unix timestamp) | 
**userId** | **Long** | User ID | 
**money** | **String** | Quote Currency | 
**amount** | **String** | Per PeriodInvestment amount | 
**periodType** | **String** | Cycle type（e.g., monthly） | 
**periodDay** | **Long** | Cycle day | 
**periodHour** | **Long** | CycleHours | 
**portfolio** | [**List&lt;AutoInvestPortfolioItem&gt;**](AutoInvestPortfolioItem.md) | Portfolio | 
**nextTime** | **Long** | Next execution time (Unix timestamp) | 
**period** | **Long** | Executed periods | 
**fundSource** | **String** | Fund source（spot/earn） | 
**fundFlow** | **String** | Fund flow direction (auto_invest/earn) | 

