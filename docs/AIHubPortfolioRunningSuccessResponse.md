
# AIHubPortfolioRunningSuccessResponse

The response body when querying the running policy list is successful.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** |  | 
**message** | **String** |  | 
**data** | [**AIHubPortfolioRunningData**](AIHubPortfolioRunningData.md) |  |  [optional]
**traceId** | **String** |  |  [optional]
**label** | **String** | Stable business error label when present. HTTP 200 can contain a non-200 business code; data may retain a real identity on failure. |  [optional]

