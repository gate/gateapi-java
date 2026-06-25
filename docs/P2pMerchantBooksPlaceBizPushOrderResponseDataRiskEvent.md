
# P2pMerchantBooksPlaceBizPushOrderResponseDataRiskEvent

Risk control prompt event for advertisement content

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Prompt display type |  [optional]
**title** | **String** | Risk control prompt title |  [optional]
**msg** | **String** | Risk control prompt message generated based on the field that hit risk control |  [optional]
**action** | [**List&lt;P2pMerchantBooksPlaceBizPushOrderResponseDataRiskEventAction&gt;**](P2pMerchantBooksPlaceBizPushOrderResponseDataRiskEventAction.md) | Available actions; advertisement content risk control only returns the close action |  [optional]
**contentRiskType** | [**ContentRiskTypeEnum**](#ContentRiskTypeEnum) | Advertisement content field that hit risk control |  [optional]
**tradeTips** | **String** | Prompt message returned when the trade terms hit risk control |  [optional]
**autoReply** | **String** | Prompt message returned when the auto reply hits risk control |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
MODAL | &quot;modal&quot;

## Enum: ContentRiskTypeEnum

Name | Value
---- | -----
TRADE_TIPS | &quot;trade_tips&quot;
AUTO_REPLY | &quot;auto_reply&quot;
TRADE_TIPS_AUTO_REPLY | &quot;trade_tips_auto_reply&quot;

