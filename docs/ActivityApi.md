# ActivityApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMyActivityEntry**](ActivityApi.md#getMyActivityEntry) | **GET** /rewards/activity/my-activity-entry | My activity entry
[**listActivities**](ActivityApi.md#listActivities) | **GET** /rewards/activity/activity-list | Recommended activity list
[**listActivityTypes**](ActivityApi.md#listActivityTypes) | **GET** /rewards/activity/activity-type | Activity type list


<a name="getMyActivityEntry"></a>
# **getMyActivityEntry**
> GetMyActivityEntryResponse getMyActivityEntry()

My activity entry

Query user&#39;s Activity Center entry information, including activity icon and redirect link

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.ActivityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        ActivityApi apiInstance = new ActivityApi(defaultClient);
        try {
            GetMyActivityEntryResponse result = apiInstance.getMyActivityEntry();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityApi#getMyActivityEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMyActivityEntryResponse**](GetMyActivityEntryResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns activity entry information |  -  |

<a name="listActivities"></a>
# **listActivities**
> ListActivitiesResponse listActivities().recommendType(recommendType).typeIds(typeIds).keywords(keywords).page(page).pageSize(pageSize).sortBy(sortBy).execute();

Recommended activity list

Query recommended activity list from Activity Center, supports pagination and sorting

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.ActivityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        ActivityApi apiInstance = new ActivityApi(defaultClient);
        String recommendType = "recommendType_example"; // String | Recommendation type: hot for popular activities, type for filtering by activity type (type_ids), scenario for matching by activity name
        String typeIds = "typeIds_example"; // String | Activity type ID, multiple IDs separated by commas (supports filtering by activity type through this field)
        String keywords = "keywords_example"; // String | Activity name. When scenario type is used, keyword matching is applied
        Integer page = 1; // Integer | Page number, starting from 1
        Integer pageSize = 10; // Integer | Items per page
        String sortBy = "sortBy_example"; // String | Sort order, e.g., hot for sorting by popularity
        try {
            ListActivitiesResponse result = apiInstance.listActivities()
                        .recommendType(recommendType)
                        .typeIds(typeIds)
                        .keywords(keywords)
                        .page(page)
                        .pageSize(pageSize)
                        .sortBy(sortBy)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityApi#listActivities");
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
 **recommendType** | **String**| Recommendation type: hot for popular activities, type for filtering by activity type (type_ids), scenario for matching by activity name | [optional]
 **typeIds** | **String**| Activity type ID, multiple IDs separated by commas (supports filtering by activity type through this field) | [optional]
 **keywords** | **String**| Activity name. When scenario type is used, keyword matching is applied | [optional]
 **page** | **Integer**| Page number, starting from 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Items per page | [optional] [default to 10]
 **sortBy** | **String**| Sort order, e.g., hot for sorting by popularity | [optional]

### Return type

[**ListActivitiesResponse**](ListActivitiesResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns activity list |  -  |

<a name="listActivityTypes"></a>
# **listActivityTypes**
> ListActivityTypesResponse listActivityTypes()

Activity type list

Query all activity types supported by Activity Center

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.ActivityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        ActivityApi apiInstance = new ActivityApi(defaultClient);
        try {
            ListActivityTypesResponse result = apiInstance.listActivityTypes();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivityApi#listActivityTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListActivityTypesResponse**](ListActivityTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns activity type list |  -  |

