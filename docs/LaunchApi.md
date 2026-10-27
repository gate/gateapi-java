# LaunchApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLaunchPoolProjects**](LaunchApi.md#listLaunchPoolProjects) | **GET** /launch/project-list | Query LaunchPool project list
[**createLaunchPoolOrder**](LaunchApi.md#createLaunchPoolOrder) | **POST** /launch/create-order | Create LaunchPool staking order
[**redeemLaunchPool**](LaunchApi.md#redeemLaunchPool) | **POST** /launch/redeem | Redeem LaunchPool staked assets
[**listLaunchPoolPledgeRecords**](LaunchApi.md#listLaunchPoolPledgeRecords) | **GET** /launch/user-pledge-records | Query user pledge records
[**listLaunchPoolRewardRecords**](LaunchApi.md#listLaunchPoolRewardRecords) | **GET** /launch/get-user-reward-records | Query user reward records
[**getHodlerAirdropProjectList**](LaunchApi.md#getHodlerAirdropProjectList) | **GET** /launch/hodler-airdrop/project-list | Check the list of HODLer Airdrop activities
[**hodlerAirdropOrder**](LaunchApi.md#hodlerAirdropOrder) | **POST** /launch/hodler-airdrop/order | Participate in the HODLer Airdrop event
[**getHodlerAirdropUserOrderRecords**](LaunchApi.md#getHodlerAirdropUserOrderRecords) | **GET** /launch/hodler-airdrop/user-order-records | Check HODLer Airdrop participation records
[**getHodlerAirdropUserAirdropRecords**](LaunchApi.md#getHodlerAirdropUserAirdropRecords) | **GET** /launch/hodler-airdrop/user-airdrop-records | Query HODLer Airdrop records
[**getCandyDropActivityListV4**](LaunchApi.md#getCandyDropActivityListV4) | **GET** /launch/candydrop/activity-list | Query activity list
[**registerCandyDropV4**](LaunchApi.md#registerCandyDropV4) | **POST** /launch/candydrop/register | Sign up for events
[**getCandyDropActivityRulesV4**](LaunchApi.md#getCandyDropActivityRulesV4) | **GET** /launch/candydrop/activity-rules | Query activity rules
[**getCandyDropTaskProgressV4**](LaunchApi.md#getCandyDropTaskProgressV4) | **GET** /launch/candydrop/task-progress | Query task completion progress
[**getCandyDropParticipationRecordsV4**](LaunchApi.md#getCandyDropParticipationRecordsV4) | **GET** /launch/candydrop/participation-records | Query participation records
[**getCandyDropAirdropRecordsV4**](LaunchApi.md#getCandyDropAirdropRecordsV4) | **GET** /launch/candydrop/airdrop-records | Query airdrop records


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

<a name="getHodlerAirdropProjectList"></a>
# **getHodlerAirdropProjectList**
> List&lt;HodlerAirdropV4ProjectItem&gt; getHodlerAirdropProjectList().status(status).keyword(keyword).join(join).page(page).size(size).execute();

Check the list of HODLer Airdrop activities

Get the HODLer Airdrop activity list, which supports filtering by status, currency/project name, and participation status. This interface does not require user login, and logged in users can obtain personal participation information.

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
        String status = "status_example"; // String | Activity status filtering, optional values: ACTIVE (in progress + preheating), UNDERWAY (in progress), PREHEAT (preheating), FINISH (ended), return all if not passed
        String keyword = "keyword_example"; // String | Currency/project name keywords, fuzzy matching
        Integer join = 0; // Integer | Participation filter: 0 all (default), 1 only participated
        Integer page = 1; // Integer | Page number, default 1
        Integer size = 10; // Integer | Number of items per page, default 10
        try {
            List<HodlerAirdropV4ProjectItem> result = apiInstance.getHodlerAirdropProjectList()
                        .status(status)
                        .keyword(keyword)
                        .join(join)
                        .page(page)
                        .size(size)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getHodlerAirdropProjectList");
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
 **status** | **String**| Activity status filtering, optional values: ACTIVE (in progress + preheating), UNDERWAY (in progress), PREHEAT (preheating), FINISH (ended), return all if not passed | [optional] [enum: ACTIVE, UNDERWAY, PREHEAT, FINISH]
 **keyword** | **String**| Currency/project name keywords, fuzzy matching | [optional]
 **join** | **Integer**| Participation filter: 0 all (default), 1 only participated | [optional] [default to 0] [enum: 0, 1]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **size** | **Integer**| Number of items per page, default 10 | [optional] [default to 10]

### Return type

[**List&lt;HodlerAirdropV4ProjectItem&gt;**](HodlerAirdropV4ProjectItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns activity list |  -  |
**400** | Invalid request parameters |  -  |

<a name="hodlerAirdropOrder"></a>
# **hodlerAirdropOrder**
> HodlerAirdropV4OrderResponse hodlerAirdropOrder(hodlerAirdropV4OrderRequest)

Participate in the HODLer Airdrop event

To participate in designated HODLer Airdrop activities, you need to hold GT. This interface requires user login authentication and must meet KYC requirements. It does not support sub-accounts and enterprise/institutional users.

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
        HodlerAirdropV4OrderRequest hodlerAirdropV4OrderRequest = new HodlerAirdropV4OrderRequest(); // HodlerAirdropV4OrderRequest | 
        try {
            HodlerAirdropV4OrderResponse result = apiInstance.hodlerAirdropOrder(hodlerAirdropV4OrderRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#hodlerAirdropOrder");
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
 **hodlerAirdropV4OrderRequest** | [**HodlerAirdropV4OrderRequest**](HodlerAirdropV4OrderRequest.md)|  |

### Return type

[**HodlerAirdropV4OrderResponse**](HodlerAirdropV4OrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully participated in the event |  -  |
**400** | Incorrect request parameters or failed business verification (insufficient KYC, sub-account restrictions, enterprise user restrictions, etc.) |  -  |
**401** | User is not logged in |  -  |

<a name="getHodlerAirdropUserOrderRecords"></a>
# **getHodlerAirdropUserOrderRecords**
> List&lt;HodlerAirdropV4UserOrderRecord&gt; getHodlerAirdropUserOrderRecords().keyword(keyword).startTimest(startTimest).endTimest(endTimest).page(page).size(size).execute();

Check HODLer Airdrop participation records

Query the user&#39;s HODLer Airdrop participation record and return the effective holdings and airdrop amount of each activity. This interface requires user login authentication.

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
        String keyword = "keyword_example"; // String | Currency name keyword filtering
        Integer startTimest = 56; // Integer | Start timestamp (seconds)
        Integer endTimest = 56; // Integer | end timestamp (seconds)
        Integer page = 1; // Integer | Page number, default 1
        Integer size = 10; // Integer | Number of items per page, default 10
        try {
            List<HodlerAirdropV4UserOrderRecord> result = apiInstance.getHodlerAirdropUserOrderRecords()
                        .keyword(keyword)
                        .startTimest(startTimest)
                        .endTimest(endTimest)
                        .page(page)
                        .size(size)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getHodlerAirdropUserOrderRecords");
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
 **keyword** | **String**| Currency name keyword filtering | [optional]
 **startTimest** | **Integer**| Start timestamp (seconds) | [optional]
 **endTimest** | **Integer**| end timestamp (seconds) | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **size** | **Integer**| Number of items per page, default 10 | [optional] [default to 10]

### Return type

[**List&lt;HodlerAirdropV4UserOrderRecord&gt;**](HodlerAirdropV4UserOrderRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned the participation record list |  -  |
**400** | Invalid request parameters |  -  |
**401** | User is not logged in |  -  |

<a name="getHodlerAirdropUserAirdropRecords"></a>
# **getHodlerAirdropUserAirdropRecords**
> List&lt;HodlerAirdropV4UserAirdropRecord&gt; getHodlerAirdropUserAirdropRecords().keyword(keyword).startTimest(startTimest).endTimest(endTimest).page(page).size(size).execute();

Query HODLer Airdrop records

Query the HODLer Airdrop airdrop distribution record that the user has obtained, including basic airdrops, additional airdrops and automatic redemption status. This interface requires user login authentication.

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
        String keyword = "keyword_example"; // String | Currency name keyword filtering
        Integer startTimest = 56; // Integer | Start timestamp (seconds)
        Integer endTimest = 56; // Integer | end timestamp (seconds)
        Integer page = 1; // Integer | Page number, default 1
        Integer size = 10; // Integer | Number of items per page, default 10
        try {
            List<HodlerAirdropV4UserAirdropRecord> result = apiInstance.getHodlerAirdropUserAirdropRecords()
                        .keyword(keyword)
                        .startTimest(startTimest)
                        .endTimest(endTimest)
                        .page(page)
                        .size(size)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getHodlerAirdropUserAirdropRecords");
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
 **keyword** | **String**| Currency name keyword filtering | [optional]
 **startTimest** | **Integer**| Start timestamp (seconds) | [optional]
 **endTimest** | **Integer**| end timestamp (seconds) | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **size** | **Integer**| Number of items per page, default 10 | [optional] [default to 10]

### Return type

[**List&lt;HodlerAirdropV4UserAirdropRecord&gt;**](HodlerAirdropV4UserAirdropRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns the airdrop record list |  -  |
**400** | Invalid request parameters |  -  |
**401** | User is not logged in |  -  |

<a name="getCandyDropActivityListV4"></a>
# **getCandyDropActivityListV4**
> List&lt;CandyDropV4ActivityCd01&gt; getCandyDropActivityListV4().status(status).ruleName(ruleName).registerStatus(registerStatus).currency(currency).limit(limit).offset(offset).execute();

Query activity list

Supports multi-dimensional filtering of CandyDrop activities, and each query returns the top ten data sorted by the list. No login required.

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
        String status = "status_example"; // String | Activity status filtering: ongoing (in progress), upcoming (about to start), ended (ended), if not passed, all will be returned
        String ruleName = "ruleName_example"; // String | Task type filtering: spot (spot), futures (contract), deposit (recharge), invite (invitation), trading_bot (trading robot), simple_earn (Yu Bibao), first_deposit (first deposit), alpha (Alpha), flash_swap (flash swap), tradfi (TradFi), etf (ETF)
        String registerStatus = "registerStatus_example"; // String | Participation status screening: registered (already participated), unregistered (not participated), if not passed, all will be returned
        String currency = "currency_example"; // String | Currency name filter
        Integer limit = 10; // Integer | Number of items returned, default 10, maximum 30
        Integer offset = 0; // Integer | Offset, default 0
        try {
            List<CandyDropV4ActivityCd01> result = apiInstance.getCandyDropActivityListV4()
                        .status(status)
                        .ruleName(ruleName)
                        .registerStatus(registerStatus)
                        .currency(currency)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getCandyDropActivityListV4");
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
 **status** | **String**| Activity status filtering: ongoing (in progress), upcoming (about to start), ended (ended), if not passed, all will be returned | [optional] [enum: ongoing, upcoming, ended]
 **ruleName** | **String**| Task type filtering: spot (spot), futures (contract), deposit (recharge), invite (invitation), trading_bot (trading robot), simple_earn (Yu Bibao), first_deposit (first deposit), alpha (Alpha), flash_swap (flash swap), tradfi (TradFi), etf (ETF) | [optional]
 **registerStatus** | **String**| Participation status screening: registered (already participated), unregistered (not participated), if not passed, all will be returned | [optional] [enum: registered, unregistered]
 **currency** | **String**| Currency name filter | [optional]
 **limit** | **Integer**| Number of items returned, default 10, maximum 30 | [optional] [default to 10]
 **offset** | **Integer**| Offset, default 0 | [optional] [default to 0]

### Return type

[**List&lt;CandyDropV4ActivityCd01&gt;**](CandyDropV4ActivityCd01.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns the activity list array |  -  |
**400** | Invalid request parameters |  -  |

<a name="registerCandyDropV4"></a>
# **registerCandyDropV4**
> CandyDropV4RegisterRespCd02 registerCandyDropV4(candyDropV4RegisterReqCd02)

Sign up for events

Sign up for select CandyDrop events. Login is required and API Key signature authentication is required.

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
        CandyDropV4RegisterReqCd02 candyDropV4RegisterReqCd02 = new CandyDropV4RegisterReqCd02(); // CandyDropV4RegisterReqCd02 | 
        try {
            CandyDropV4RegisterRespCd02 result = apiInstance.registerCandyDropV4(candyDropV4RegisterReqCd02);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#registerCandyDropV4");
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
 **candyDropV4RegisterReqCd02** | [**CandyDropV4RegisterReqCd02**](CandyDropV4RegisterReqCd02.md)|  |

### Return type

[**CandyDropV4RegisterRespCd02**](CandyDropV4RegisterRespCd02.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Registration successful |  -  |
**400** | Request failed |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropActivityRulesV4"></a>
# **getCandyDropActivityRulesV4**
> CandyDropV4ActivityRulesCd03 getCandyDropActivityRulesV4().activityId(activityId).currency(currency).execute();

Query activity rules

Query the rules of a specific activity, including prize pool and corresponding task data. No login required.

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
        Long activityId = 56L; // Long | Activity ID, choose one from currency, at least one of them must be passed
        String currency = "currency_example"; // String | Project/currency name, choose one from activity_id, at least one of them must be passed
        try {
            CandyDropV4ActivityRulesCd03 result = apiInstance.getCandyDropActivityRulesV4()
                        .activityId(activityId)
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getCandyDropActivityRulesV4");
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
 **activityId** | **Long**| Activity ID, choose one from currency, at least one of them must be passed | [optional]
 **currency** | **String**| Project/currency name, choose one from activity_id, at least one of them must be passed | [optional]

### Return type

[**CandyDropV4ActivityRulesCd03**](CandyDropV4ActivityRulesCd03.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful return to activity rules |  -  |
**400** | Invalid request parameters |  -  |

<a name="getCandyDropTaskProgressV4"></a>
# **getCandyDropTaskProgressV4**
> CandyDropV4TaskProgressCd04 getCandyDropTaskProgressV4().activityId(activityId).currency(currency).execute();

Query task completion progress

Check the completion progress of tasks that are in progress and have been registered/participated. Login required.

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
        Long activityId = 56L; // Long | Activity ID, choose one from currency, at least one of them must be passed
        String currency = "currency_example"; // String | Project/currency name, choose one from activity_id, at least one of them must be passed
        try {
            CandyDropV4TaskProgressCd04 result = apiInstance.getCandyDropTaskProgressV4()
                        .activityId(activityId)
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getCandyDropTaskProgressV4");
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
 **activityId** | **Long**| Activity ID, choose one from currency, at least one of them must be passed | [optional]
 **currency** | **String**| Project/currency name, choose one from activity_id, at least one of them must be passed | [optional]

### Return type

[**CandyDropV4TaskProgressCd04**](CandyDropV4TaskProgressCd04.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully return task progress |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropParticipationRecordsV4"></a>
# **getCandyDropParticipationRecordsV4**
> List&lt;CandyDropV4ParticipationRecordCd05&gt; getCandyDropParticipationRecordsV4().currency(currency).status(status).startTime(startTime).endTime(endTime).page(page).limit(limit).execute();

Query participation records

Query the user&#39;s CandyDrop participation details. Login required.

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
        String currency = "currency_example"; // String | Currency name filter
        String status = "status_example"; // String | Status filtering: ongoing (in progress), awaiting_draw (to be drawn), won (already won), not_win (not won)
        Long startTime = 56L; // Long | Start time (Unix timestamp seconds)
        Long endTime = 56L; // Long | End time (Unix timestamp seconds)
        Integer page = 1; // Integer | Page number, default 1
        Integer limit = 10; // Integer | Number of items per page, default 10, maximum 30
        try {
            List<CandyDropV4ParticipationRecordCd05> result = apiInstance.getCandyDropParticipationRecordsV4()
                        .currency(currency)
                        .status(status)
                        .startTime(startTime)
                        .endTime(endTime)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getCandyDropParticipationRecordsV4");
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
 **currency** | **String**| Currency name filter | [optional]
 **status** | **String**| Status filtering: ongoing (in progress), awaiting_draw (to be drawn), won (already won), not_win (not won) | [optional] [enum: ongoing, awaiting_draw, won, not_win]
 **startTime** | **Long**| Start time (Unix timestamp seconds) | [optional]
 **endTime** | **Long**| End time (Unix timestamp seconds) | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **limit** | **Integer**| Number of items per page, default 10, maximum 30 | [optional] [default to 10]

### Return type

[**List&lt;CandyDropV4ParticipationRecordCd05&gt;**](CandyDropV4ParticipationRecordCd05.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned the participation record list |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropAirdropRecordsV4"></a>
# **getCandyDropAirdropRecordsV4**
> List&lt;CandyDropV4AirdropRecordCd06&gt; getCandyDropAirdropRecordsV4().currency(currency).startTime(startTime).endTime(endTime).page(page).limit(limit).execute();

Query airdrop records

Query the user&#39;s CandyDrop airdrop details. Login required.

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
        String currency = "currency_example"; // String | Currency name filter
        Long startTime = 56L; // Long | Start time (Unix timestamp seconds)
        Long endTime = 56L; // Long | End time (Unix timestamp seconds)
        Integer page = 1; // Integer | Page number, default 1
        Integer limit = 10; // Integer | Number of items per page, default 10, maximum 30
        try {
            List<CandyDropV4AirdropRecordCd06> result = apiInstance.getCandyDropAirdropRecordsV4()
                        .currency(currency)
                        .startTime(startTime)
                        .endTime(endTime)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling LaunchApi#getCandyDropAirdropRecordsV4");
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
 **currency** | **String**| Currency name filter | [optional]
 **startTime** | **Long**| Start time (Unix timestamp seconds) | [optional]
 **endTime** | **Long**| End time (Unix timestamp seconds) | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **limit** | **Integer**| Number of items per page, default 10, maximum 30 | [optional] [default to 10]

### Return type

[**List&lt;CandyDropV4AirdropRecordCd06&gt;**](CandyDropV4AirdropRecordCd06.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returns the airdrop record list |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

