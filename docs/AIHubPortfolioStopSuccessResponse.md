
# AIHubPortfolioStopSuccessResponse

The response body when the termination strategy is successful.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **Integer** |  | 
**message** | **String** |  | 
**data** | [**AIHubPortfolioStopData**](AIHubPortfolioStopData.md) |  |  [optional]
**traceId** | **String** |  |  [optional]
**label** | **String** | Stable business error label when present. HTTP 200 can contain a non-200 business code; data may retain a real identity on failure. |  [optional]

