# SquareApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSquareAiSearch**](SquareApi.md#listSquareAiSearch) | **GET** /social/message/search | AI MCP Dynamic Search
[**listLiveReplay**](SquareApi.md#listLiveReplay) | **GET** /social/live/tag_coin_live_replay | Gate AI Assistant live stream data retrieval


<a name="listSquareAiSearch"></a>
# **listSquareAiSearch**
> InlineResponse2009 listSquareAiSearch().keyword(keyword).currency(currency).timeRange(timeRange).sort(sort).limit(limit).page(page).execute();

AI MCP Dynamic Search

Dynamic search endpoint for AI MCP platform. All parameters are passed via query string. Returns simplified fields. Designed for LLM function calling / MCP tool scenarios.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SquareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SquareApi apiInstance = new SquareApi(defaultClient);
        String keyword = "keyword_example"; // String | Search keyword (currency name or content keyword, e.g., BTC, ETH)
        String currency = "currency_example"; // String | Filter by currency (exact currency code, e.g., BTC, ETH, SOL)
        Integer timeRange = 0; // Integer | Time range: 0 = unlimited (default), 1 = last day, 2 = last week, 3 = last month
        Integer sort = 0; // Integer | Sort order: 0 = most popular (default), 1 = latest
        Integer limit = 10; // Integer | Return count, 1-50, default 10
        Integer page = 1; // Integer | Page number
        try {
            InlineResponse2009 result = apiInstance.listSquareAiSearch()
                        .keyword(keyword)
                        .currency(currency)
                        .timeRange(timeRange)
                        .sort(sort)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SquareApi#listSquareAiSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyword** | **String**| Search keyword (currency name or content keyword, e.g., BTC, ETH) | [optional]
 **currency** | **String**| Filter by currency (exact currency code, e.g., BTC, ETH, SOL) | [optional]
 **timeRange** | **Integer**| Time range: 0 &#x3D; unlimited (default), 1 &#x3D; last day, 2 &#x3D; last week, 3 &#x3D; last month | [optional] [default to 0] [enum: 0, 1, 2, 3]
 **sort** | **Integer**| Sort order: 0 &#x3D; most popular (default), 1 &#x3D; latest | [optional] [default to 0] [enum: 0, 1]
 **limit** | **Integer**| Return count, 1-50, default 10 | [optional] [default to 10]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field (code&#x3D;0 means success) |  -  |
**400** | Invalid request parameters |  -  |

<a name="listLiveReplay"></a>
# **listLiveReplay**
> InlineResponse20010 listLiveReplay().tag(tag).coin(coin).sort(sort).limit(limit).execute();

Gate AI Assistant live stream data retrieval

AI assistant live stream/replay search endpoint. Filters live rooms or replay videos by business tags and currency. Each record in the returned list is distinguished by content_type: streaming &#x3D; live broadcast (live field has value), video &#x3D; replay video (video field has value). The number of results is controlled by the limit parameter (max 10), no additional pagination needed.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.SquareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        SquareApi apiInstance = new SquareApi(defaultClient);
        String tag = "tag_example"; // String | Business type filter. Available values: Market Analysis, Hot Topics, Blockchain, Others
        String coin = "coin_example"; // String | Filter by currency name (e.g., BTC, ETH)
        String sort = "hot"; // String | Sort order: hot = most popular (default), new = latest
        Integer limit = 3; // Integer | Return count, 1-10, default 3
        try {
            InlineResponse20010 result = apiInstance.listLiveReplay()
                        .tag(tag)
                        .coin(coin)
                        .sort(sort)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SquareApi#listLiveReplay");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**| Business type filter. Available values: Market Analysis, Hot Topics, Blockchain, Others | [optional]
 **coin** | **String**| Filter by currency name (e.g., BTC, ETH) | [optional]
 **sort** | **String**| Sort order: hot &#x3D; most popular (default), new &#x3D; latest | [optional] [default to hot] [enum: hot, new]
 **limit** | **Integer**| Return count, 1-10, default 3 | [optional] [default to 3]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field (code&#x3D;200 means success) |  -  |
**400** | Invalid request parameters |  -  |

