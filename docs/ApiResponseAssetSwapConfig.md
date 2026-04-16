
# ApiResponseAssetSwapConfig

资产配置优化-配置统一响应

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** | 业务错误码，0 表示成功 | 
**label** | **String** | 错误标识码，成功时为空字符串 |  [optional]
**message** | **String** | 描述信息 | 
**data** | **Object** | 成功时为前端配置（ConfigResp），失败时为 null | 
**timestamp** | **Long** | Server timestamp (milliseconds) | 

