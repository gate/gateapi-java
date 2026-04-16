
# ApiResponseAssetSwapOrderQueryV1

资产配置优化-查询订单统一响应

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | 业务错误码，0 表示成功 | 
**label** | **String** | 错误标识码，成功时为空字符串 |  [optional]
**message** | **String** | 描述信息 | 
**data** | **Object** | 成功时为订单详情，失败时为 null | 
**timestamp** | **Long** | Server timestamp (milliseconds) | 

