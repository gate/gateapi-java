# LaunchApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLaunchPoolProjects**](LaunchApi.md#listLaunchPoolProjects) | **GET** /launch/project-list | Query LaunchPool project list
[**createLaunchPoolOrder**](LaunchApi.md#createLaunchPoolOrder) | **POST** /launch/create-order | Create LaunchPool staking order
[**redeemLaunchPool**](LaunchApi.md#redeemLaunchPool) | **POST** /launch/redeem | Redeem LaunchPool staked assets
[**listLaunchPoolPledgeRecords**](LaunchApi.md#listLaunchPoolPledgeRecords) | **GET** /launch/user-pledge-records | Query user pledge records
[**listLaunchPoolRewardRecords**](LaunchApi.md#listLaunchPoolRewardRecords) | **GET** /launch/get-user-reward-records | Query user reward records


<a name="listLaunchPoolProjects"></a>
# **listLaunchPoolProjects**
> List&lt;LaunchPoolV4Project&gt; listLaunchPoolProjects().status(status).mortgageCoin(mortgageCoin).searchCoin(searchCoin).limitRule(limitRule).sortType(sortType).page(page).pageSize(pageSize).execute();

Query LaunchPool project list

Retrieve the list of available LaunchPool projects, including basic project information and reward pool configuration. This endpoint does not require user authentication.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.LaunchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        LaunchApi apiInstance = new LaunchApi(defaultClient);
        Integer status = 56; // Integer | Filter by project status: 0 for all, 1 for ongoing, 2 for warming up, 3 for ended, 4 for ongoing and warming up
        String mortgageCoin = "mortgageCoin_example"; // String | Exact match by staking currency
        String searchCoin = "searchCoin_example"; // String | Fuzzy match by reward currency and name
        Integer limitRule = 56; // Integer | Limit rule: 0 for regular pool, 1 for beginner pool
        Integer sortType = 56; // Integer | Sort type: 1 for max APR descending, 2 for max APR ascending
        Integer page = 1; // Integer | Page number, default 1
        Integer pageSize = 10; // Integer | Number of items per page, default 10, maximum 30
        try {
            List<LaunchPoolV4Project> result = apiInstance.listLaunchPoolProjects()
                        .status(status)
                        .mortgageCoin(mortgageCoin)
                        .searchCoin(searchCoin)
                        .limitRule(limitRule)
                        .sortType(sortType)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#listLaunchPoolProjects");
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
 **status** | **Integer**| Filter by project status: 0 for all, 1 for ongoing, 2 for warming up, 3 for ended, 4 for ongoing and warming up | [optional]
 **mortgageCoin** | **String**| Exact match by staking currency | [optional]
 **searchCoin** | **String**| Fuzzy match by reward currency and name | [optional]
 **limitRule** | **Integer**| Limit rule: 0 for regular pool, 1 for beginner pool | [optional]
 **sortType** | **Integer**| Sort type: 1 for max APR descending, 2 for max APR ascending | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items per page, default 10, maximum 30 | [optional] [default to 10]

### Return type

[**List&lt;LaunchPoolV4Project&gt;**](LaunchPoolV4Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns project list |  -  |
**400** | Invalid request parameters |  -  |

<a name="createLaunchPoolOrder"></a>
# **createLaunchPoolOrder**
> LaunchPoolV4CreateOrderResponse createLaunchPoolOrder(createOrderV4)

Create LaunchPool staking order

Create a new staking order for asset staking mining. This endpoint requires API Key signature authentication.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.LaunchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        LaunchApi apiInstance = new LaunchApi(defaultClient);
        CreateOrderV4 createOrderV4 = new CreateOrderV4(); // CreateOrderV4 | 
        try {
            LaunchPoolV4CreateOrderResponse result = apiInstance.createLaunchPoolOrder(createOrderV4);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#createLaunchPoolOrder");
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
 **createOrderV4** | [**CreateOrderV4**](CreateOrderV4.md)|  |

### Return type

[**LaunchPoolV4CreateOrderResponse**](LaunchPoolV4CreateOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully created staking order |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="redeemLaunchPool"></a>
# **redeemLaunchPool**
> RedeemLaunchPoolResponse redeemLaunchPool(redeemV4)

Redeem LaunchPool staked assets

Redeem staked assets and end staking mining. This endpoint requires API Key signature authentication.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.LaunchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        LaunchApi apiInstance = new LaunchApi(defaultClient);
        RedeemV4 redeemV4 = new RedeemV4(); // RedeemV4 | 
        try {
            RedeemLaunchPoolResponse result = apiInstance.redeemLaunchPool(redeemV4);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#redeemLaunchPool");
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
 **redeemV4** | [**RedeemV4**](RedeemV4.md)|  |

### Return type

[**RedeemLaunchPoolResponse**](RedeemLaunchPoolResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully redeemed pledged assets |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="listLaunchPoolPledgeRecords"></a>
# **listLaunchPoolPledgeRecords**
> List&lt;LaunchPoolV4PledgeRecord&gt; listLaunchPoolPledgeRecords().page(page).pageSize(pageSize).type(type).startTime(startTime).endTime(endTime).coin(coin).execute();

Query user pledge records

Query user&#39;s staking and redemption operation records. This endpoint requires user authentication.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.LaunchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        LaunchApi apiInstance = new LaunchApi(defaultClient);
        Long page = 1lL; // Long | Page number, default 1
        Long pageSize = 10lL; // Long | Number of items per page, maximum 30
        Integer type = 56; // Integer | Type: 1 for pledge, 2 for redemption
        String startTime = "2026-03-17 00:00:00"; // String | Start time, format: YYYY-MM-DD HH:MM:SS
        String endTime = "2026-03-17 23:59:59"; // String | End time, format: YYYY-MM-DD HH:MM:SS
        String coin = "coin_example"; // String | Collateral currency
        try {
            List<LaunchPoolV4PledgeRecord> result = apiInstance.listLaunchPoolPledgeRecords()
                        .page(page)
                        .pageSize(pageSize)
                        .type(type)
                        .startTime(startTime)
                        .endTime(endTime)
                        .coin(coin)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#listLaunchPoolPledgeRecords");
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
 **page** | **Long**| Page number, default 1 | [optional] [default to 1l]
 **pageSize** | **Long**| Number of items per page, maximum 30 | [optional] [default to 10l]
 **type** | **Integer**| Type: 1 for pledge, 2 for redemption | [optional]
 **startTime** | **String**| Start time, format: YYYY-MM-DD HH:MM:SS | [optional]
 **endTime** | **String**| End time, format: YYYY-MM-DD HH:MM:SS | [optional]
 **coin** | **String**| Collateral currency | [optional]

### Return type

[**List&lt;LaunchPoolV4PledgeRecord&gt;**](LaunchPoolV4PledgeRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns user staking records |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="listLaunchPoolRewardRecords"></a>
# **listLaunchPoolRewardRecords**
> List&lt;LaunchPoolV4RewardRecord&gt; listLaunchPoolRewardRecords().page(page).pageSize(pageSize).startTime(startTime).endTime(endTime).coin(coin).execute();

Query user reward records

Query the user&#39;s staking reward records. This endpoint requires user authentication.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.LaunchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        LaunchApi apiInstance = new LaunchApi(defaultClient);
        Long page = 1lL; // Long | Page number, default 1
        Long pageSize = 10lL; // Long | Number of items per page, maximum 30
        Long startTime = 56L; // Long | Start timestamp
        Long endTime = 56L; // Long | End Timestamp
        String coin = "coin_example"; // String | Reward currency
        try {
            List<LaunchPoolV4RewardRecord> result = apiInstance.listLaunchPoolRewardRecords()
                        .page(page)
                        .pageSize(pageSize)
                        .startTime(startTime)
                        .endTime(endTime)
                        .coin(coin)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#listLaunchPoolRewardRecords");
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
 **page** | **Long**| Page number, default 1 | [optional] [default to 1l]
 **pageSize** | **Long**| Number of items per page, maximum 30 | [optional] [default to 10l]
 **startTime** | **Long**| Start timestamp | [optional]
 **endTime** | **Long**| End Timestamp | [optional]
 **coin** | **String**| Reward currency | [optional]

### Return type

[**List&lt;LaunchPoolV4RewardRecord&gt;**](LaunchPoolV4RewardRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns user reward records |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

