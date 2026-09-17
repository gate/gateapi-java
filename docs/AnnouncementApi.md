# AnnouncementApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAnnouncementArticles**](AnnouncementApi.md#listAnnouncementArticles) | **POST** /ann/list_article | List announcement articles


<a name="listAnnouncementArticles"></a>
# **listAnnouncementArticles**
> AnnouncementArticleListResponse listAnnouncementArticles(announcementArticleListRequest)

List announcement articles

Query announcement articles with pagination and filters for title, category, language, time, and other criteria. Send query parameters in the JSON request body. Both page and size are optional and must be strings when provided. No API key is required.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AnnouncementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        AnnouncementApi apiInstance = new AnnouncementApi(defaultClient);
        AnnouncementArticleListRequest announcementArticleListRequest = new AnnouncementArticleListRequest(); // AnnouncementArticleListRequest | 
        try {
            AnnouncementArticleListResponse result = apiInstance.listAnnouncementArticles(announcementArticleListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementApi#listAnnouncementArticles");
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
 **announcementArticleListRequest** | [**AnnouncementArticleListRequest**](AnnouncementArticleListRequest.md)|  |

### Return type

[**AnnouncementArticleListResponse**](AnnouncementArticleListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Announcement article list response |  -  |

