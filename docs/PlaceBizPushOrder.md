
# PlaceBizPushOrder

Place ad order request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currencyType** | **String** | Cryptocurrency symbol. | 
**exchangeType** | **String** | Fiat currency | 
**type** | [**TypeEnum**](#TypeEnum) | Ad operation type. &#x60;0&#x60;: publish sell ad; &#x60;1&#x60;: publish buy ad; &#x60;2&#x60;: edit sell ad; &#x60;3&#x60;: edit buy ad. | 
**unitPrice** | **String** | Per-unit price in fixed-price mode. | 
**number** | **String** | Ad amount priced in &#x60;currencyType&#x60;. | 
**payType** | **String** | Payment types, comma-separated; from pay type list &#x60;pay_type&#x60;, e.g. &#x60;bank&#x60;, &#x60;alipay&#x60;, &#x60;wechat&#x60;, &#x60;paypal&#x60;, &#x60;swift&#x60;, &#x60;wu&#x60;. | 
**payTypeJson** | **String** | JSON map of payment type -&gt; user&#39;s payment method ID. |  [optional]
**rateFixed** | **String** | Price type: &#x60;0&#x60; floating; &#x60;1&#x60; fixed. |  [optional]
**oid** | **String** | Pass ad ID when editing; omit or empty when publishing a new ad. |  [optional]
**minAmount** | **String** | Minimum trade amount in &#x60;exchangeType&#x60;. | 
**maxAmount** | **String** | Maximum amount per trade in &#x60;exchangeType&#x60; fiat units. | 
**tierLimit** | **String** | Minimum counterparty VIP level; &#x60;0&#x60; means no requirement. |  [optional]
**verifiedLimit** | **String** | Minimum counterparty verification level; &#x60;0&#x60; means no limit. |  [optional]
**regTimeLimit** | **String** | Minimum counterparty account age in days; &#x60;0&#x60; means no limit. |  [optional]
**advertisersLimit** | **String** | Whether trading with the advertiser is restricted. &#x60;0&#x60;: no; &#x60;1&#x60;: yes. |  [optional]
**expireMin** | **String** | Payment timeout in minutes. |  [optional]
**tradeTips** | **String** | Advertisement trade terms displayed to ordering users; goes through off-platform traffic diversion risk control on submission, and when hit, the advertisement is not saved and code 70305102 is returned |  [optional]
**autoReply** | **String** | Auto reply content after order creation; goes through off-platform traffic diversion risk control on submission, and when hit, the advertisement is not saved and code 70305102 is returned |  [optional]
**minCompletedLimit** | **String** | Minimum completed orders for counterparty; &#x60;-1&#x60; unlimited. |  [optional]
**maxCompletedLimit** | **String** | Maximum completed orders for counterparty; &#x60;-1&#x60; unlimited. |  [optional]
**completedRateLimit** | **String** | Counterparty minimum 30-day completion rate; &#x60;-1&#x60; means no limit. |  [optional]
**userCountryLimit** | **String** | KYC nationality restriction; &#x60;-1&#x60; means no restriction. |  [optional]
**userOrderLimit** | **String** | Maximum concurrent orders allowed for the counterparty. &#x60;-1&#x60;: unlimited. |  [optional]
**rateReferenceId** | **String** | Floating price reference. &#x60;1&#x60;: platform reference; &#x60;2&#x60;: Gate reference; &#x60;3&#x60;: spot reference. |  [optional]
**rateOffset** | **String** | Absolute floating offset ratio, e.g. &#x60;0.5&#x60; means 0.5%. |  [optional]
**floatTrend** | **String** | Floating direction: &#x60;0&#x60; markup; &#x60;1&#x60; markdown. |  [optional]
**teamPaymentUid** | **String** | Team payee UID; optional for non-team merchants. |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;

