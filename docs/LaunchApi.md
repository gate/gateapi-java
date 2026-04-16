# LaunchApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listLaunchPoolProjects**](LaunchApi.md#listLaunchPoolProjects) | **GET** /launch/project-list | Query LaunchPool project list
[**createLaunchPoolOrder**](LaunchApi.md#createLaunchPoolOrder) | **POST** /launch/create-order | Create LaunchPool staking order
[**redeemLaunchPool**](LaunchApi.md#redeemLaunchPool) | **POST** /launch/redeem | Redeem LaunchPool staked assets
[**listLaunchPoolPledgeRecords**](LaunchApi.md#listLaunchPoolPledgeRecords) | **GET** /launch/user-pledge-records | Query user pledge records
[**listLaunchPoolRewardRecords**](LaunchApi.md#listLaunchPoolRewardRecords) | **GET** /launch/get-user-reward-records | Query user reward records
[**getHodlerAirdropProjectList**](LaunchApi.md#getHodlerAirdropProjectList) | **GET** /launch/hodler-airdrop/project-list | 查询HODLer Airdrop活动列表
[**hodlerAirdropOrder**](LaunchApi.md#hodlerAirdropOrder) | **POST** /launch/hodler-airdrop/order | 参与HODLer Airdrop活动
[**getHodlerAirdropUserOrderRecords**](LaunchApi.md#getHodlerAirdropUserOrderRecords) | **GET** /launch/hodler-airdrop/user-order-records | 查询HODLer Airdrop参与记录
[**getHodlerAirdropUserAirdropRecords**](LaunchApi.md#getHodlerAirdropUserAirdropRecords) | **GET** /launch/hodler-airdrop/user-airdrop-records | 查询HODLer Airdrop空投记录
[**getCandyDropActivityListV4**](LaunchApi.md#getCandyDropActivityListV4) | **GET** /launch/candydrop/activity-list | 查询活动列表
[**registerCandyDropV4**](LaunchApi.md#registerCandyDropV4) | **POST** /launch/candydrop/register | 报名参与活动
[**getCandyDropActivityRulesV4**](LaunchApi.md#getCandyDropActivityRulesV4) | **GET** /launch/candydrop/activity-rules | 查询活动规则
[**getCandyDropTaskProgressV4**](LaunchApi.md#getCandyDropTaskProgressV4) | **GET** /launch/candydrop/task-progress | 查询任务完成进度
[**getCandyDropParticipationRecordsV4**](LaunchApi.md#getCandyDropParticipationRecordsV4) | **GET** /launch/candydrop/participation-records | 查询参与记录
[**getCandyDropAirdropRecordsV4**](LaunchApi.md#getCandyDropAirdropRecordsV4) | **GET** /launch/candydrop/airdrop-records | 查询空投记录


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

查询HODLer Airdrop活动列表

获取HODLer Airdrop活动列表，支持按状态、币种/项目名称、参与情况筛选。此接口无需用户登录，登录用户可获取个人参与信息。

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
        String status = "status_example"; // String | 活动状态筛选，可选值：ACTIVE（进行中+预热中）、UNDERWAY（进行中）、PREHEAT（预热中）、FINISH（已结束），不传返回全部
        String keyword = "keyword_example"; // String | 币种/项目名称关键词，模糊匹配
        Integer join = 0; // Integer | 参与情况筛选：0全部（默认），1仅已参与
        Integer page = 1; // Integer | 页码，默认1
        Integer size = 10; // Integer | 每页条数，默认10
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
 **status** | **String**| 活动状态筛选，可选值：ACTIVE（进行中+预热中）、UNDERWAY（进行中）、PREHEAT（预热中）、FINISH（已结束），不传返回全部 | [optional] [enum: ACTIVE, UNDERWAY, PREHEAT, FINISH]
 **keyword** | **String**| 币种/项目名称关键词，模糊匹配 | [optional]
 **join** | **Integer**| 参与情况筛选：0全部（默认），1仅已参与 | [optional] [default to 0] [enum: 0, 1]
 **page** | **Integer**| 页码，默认1 | [optional] [default to 1]
 **size** | **Integer**| 每页条数，默认10 | [optional] [default to 10]

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

参与HODLer Airdrop活动

参与指定的HODLer Airdrop活动，需持有GT。此接口需要用户登录认证，且须满足KYC要求，不支持子账户、企业/机构用户。

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
**200** | 成功参与活动 |  -  |
**400** | 请求参数错误或业务校验失败（KYC不足、子账户限制、企业用户限制等） |  -  |
**401** | 用户未登录 |  -  |

<a name="getHodlerAirdropUserOrderRecords"></a>
# **getHodlerAirdropUserOrderRecords**
> List&lt;HodlerAirdropV4UserOrderRecord&gt; getHodlerAirdropUserOrderRecords().keyword(keyword).startTimest(startTimest).endTimest(endTimest).page(page).size(size).execute();

查询HODLer Airdrop参与记录

查询用户的HODLer Airdrop参与记录，返回每个活动的有效持仓和空投金额。此接口需要用户登录认证。

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
        String keyword = "keyword_example"; // String | 币种名称关键词筛选
        Integer startTimest = 56; // Integer | 开始时间戳（秒）
        Integer endTimest = 56; // Integer | 结束时间戳（秒）
        Integer page = 1; // Integer | 页码，默认1
        Integer size = 10; // Integer | 每页条数，默认10
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
 **keyword** | **String**| 币种名称关键词筛选 | [optional]
 **startTimest** | **Integer**| 开始时间戳（秒） | [optional]
 **endTimest** | **Integer**| 结束时间戳（秒） | [optional]
 **page** | **Integer**| 页码，默认1 | [optional] [default to 1]
 **size** | **Integer**| 每页条数，默认10 | [optional] [default to 10]

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
**200** | 成功返回参与记录列表 |  -  |
**400** | Invalid request parameters |  -  |
**401** | 用户未登录 |  -  |

<a name="getHodlerAirdropUserAirdropRecords"></a>
# **getHodlerAirdropUserAirdropRecords**
> List&lt;HodlerAirdropV4UserAirdropRecord&gt; getHodlerAirdropUserAirdropRecords().keyword(keyword).startTimest(startTimest).endTimest(endTimest).page(page).size(size).execute();

查询HODLer Airdrop空投记录

查询用户已获得的HODLer Airdrop空投发放记录，包含基础空投、额外空投和自动兑换状态。此接口需要用户登录认证。

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
        String keyword = "keyword_example"; // String | 币种名称关键词筛选
        Integer startTimest = 56; // Integer | 开始时间戳（秒）
        Integer endTimest = 56; // Integer | 结束时间戳（秒）
        Integer page = 1; // Integer | 页码，默认1
        Integer size = 10; // Integer | 每页条数，默认10
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
 **keyword** | **String**| 币种名称关键词筛选 | [optional]
 **startTimest** | **Integer**| 开始时间戳（秒） | [optional]
 **endTimest** | **Integer**| 结束时间戳（秒） | [optional]
 **page** | **Integer**| 页码，默认1 | [optional] [default to 1]
 **size** | **Integer**| 每页条数，默认10 | [optional] [default to 10]

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
**200** | 成功返回空投记录列表 |  -  |
**400** | Invalid request parameters |  -  |
**401** | 用户未登录 |  -  |

<a name="getCandyDropActivityListV4"></a>
# **getCandyDropActivityListV4**
> List&lt;CandyDropV4ActivityCd01&gt; getCandyDropActivityListV4().status(status).ruleName(ruleName).registerStatus(registerStatus).currency(currency).limit(limit).offset(offset).execute();

查询活动列表

支持多维度筛选 CandyDrop 活动，每次查询返回列表排序的前十条数据。不需要登录。

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
        String status = "status_example"; // String | 活动状态筛选：ongoing(进行中)、upcoming(即将开始)、ended(已结束)，不传则返回全部
        String ruleName = "ruleName_example"; // String | 任务类型筛选：spot(现货)、futures(合约)、deposit(充值)、invite(邀请)、trading_bot(交易机器人)、simple_earn(余币宝)、first_deposit(首笔入金)、alpha(Alpha)、flash_swap(闪兑)、tradfi(TradFi)、etf(ETF)
        String registerStatus = "registerStatus_example"; // String | 参与情况筛选：registered(已参与)、unregistered(未参与)，不传则返回全部
        String currency = "currency_example"; // String | 币种名称筛选
        Integer limit = 10; // Integer | 返回条数，默认10，最大30
        Integer offset = 0; // Integer | 偏移量，默认0
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
 **status** | **String**| 活动状态筛选：ongoing(进行中)、upcoming(即将开始)、ended(已结束)，不传则返回全部 | [optional] [enum: ongoing, upcoming, ended]
 **ruleName** | **String**| 任务类型筛选：spot(现货)、futures(合约)、deposit(充值)、invite(邀请)、trading_bot(交易机器人)、simple_earn(余币宝)、first_deposit(首笔入金)、alpha(Alpha)、flash_swap(闪兑)、tradfi(TradFi)、etf(ETF) | [optional]
 **registerStatus** | **String**| 参与情况筛选：registered(已参与)、unregistered(未参与)，不传则返回全部 | [optional] [enum: registered, unregistered]
 **currency** | **String**| 币种名称筛选 | [optional]
 **limit** | **Integer**| 返回条数，默认10，最大30 | [optional] [default to 10]
 **offset** | **Integer**| 偏移量，默认0 | [optional] [default to 0]

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
**200** | 成功返回活动列表数组 |  -  |
**400** | Invalid request parameters |  -  |

<a name="registerCandyDropV4"></a>
# **registerCandyDropV4**
> CandyDropV4RegisterRespCd02 registerCandyDropV4(candyDropV4RegisterReqCd02)

报名参与活动

报名参与特定 CandyDrop 活动。需要登录，需要 API Key 签名认证。

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
**200** | 报名成功 |  -  |
**400** | Request failed |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropActivityRulesV4"></a>
# **getCandyDropActivityRulesV4**
> CandyDropV4ActivityRulesCd03 getCandyDropActivityRulesV4().activityId(activityId).currency(currency).execute();

查询活动规则

查询特定活动的规则，包括奖池及对应任务数据。不需要登录。

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
        Long activityId = 56L; // Long | 活动ID，与 currency 二选一，至少须传其一
        String currency = "currency_example"; // String | 项目/币种名称，与 activity_id 二选一，至少须传其一
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
 **activityId** | **Long**| 活动ID，与 currency 二选一，至少须传其一 | [optional]
 **currency** | **String**| 项目/币种名称，与 activity_id 二选一，至少须传其一 | [optional]

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
**200** | 成功返回活动规则 |  -  |
**400** | Invalid request parameters |  -  |

<a name="getCandyDropTaskProgressV4"></a>
# **getCandyDropTaskProgressV4**
> CandyDropV4TaskProgressCd04 getCandyDropTaskProgressV4().activityId(activityId).currency(currency).execute();

查询任务完成进度

查询进行中且已报名/参与的任务完成进度。需要登录。

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
        Long activityId = 56L; // Long | 活动ID，与 currency 二选一，至少须传其一
        String currency = "currency_example"; // String | 项目/币种名称，与 activity_id 二选一，至少须传其一
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
 **activityId** | **Long**| 活动ID，与 currency 二选一，至少须传其一 | [optional]
 **currency** | **String**| 项目/币种名称，与 activity_id 二选一，至少须传其一 | [optional]

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
**200** | 成功返回任务进度 |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropParticipationRecordsV4"></a>
# **getCandyDropParticipationRecordsV4**
> List&lt;CandyDropV4ParticipationRecordCd05&gt; getCandyDropParticipationRecordsV4().currency(currency).status(status).startTime(startTime).endTime(endTime).page(page).limit(limit).execute();

查询参与记录

查询用户的 CandyDrop 参与详情。需要登录。

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
        String currency = "currency_example"; // String | 币种名称筛选
        String status = "status_example"; // String | 状态筛选：ongoing(进行中)、awaiting_draw(待开奖)、won(已中奖)、not_win(未中奖)
        Long startTime = 56L; // Long | 开始时间（Unix 时间戳秒）
        Long endTime = 56L; // Long | 结束时间（Unix 时间戳秒）
        Integer page = 1; // Integer | 页码，默认1
        Integer limit = 10; // Integer | 每页条数，默认10，最大30
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
 **currency** | **String**| 币种名称筛选 | [optional]
 **status** | **String**| 状态筛选：ongoing(进行中)、awaiting_draw(待开奖)、won(已中奖)、not_win(未中奖) | [optional] [enum: ongoing, awaiting_draw, won, not_win]
 **startTime** | **Long**| 开始时间（Unix 时间戳秒） | [optional]
 **endTime** | **Long**| 结束时间（Unix 时间戳秒） | [optional]
 **page** | **Integer**| 页码，默认1 | [optional] [default to 1]
 **limit** | **Integer**| 每页条数，默认10，最大30 | [optional] [default to 10]

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
**200** | 成功返回参与记录列表 |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

<a name="getCandyDropAirdropRecordsV4"></a>
# **getCandyDropAirdropRecordsV4**
> List&lt;CandyDropV4AirdropRecordCd06&gt; getCandyDropAirdropRecordsV4().currency(currency).startTime(startTime).endTime(endTime).page(page).limit(limit).execute();

查询空投记录

查询用户的 CandyDrop 空投详情。需要登录。

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
        String currency = "currency_example"; // String | 币种名称筛选
        Long startTime = 56L; // Long | 开始时间（Unix 时间戳秒）
        Long endTime = 56L; // Long | 结束时间（Unix 时间戳秒）
        Integer page = 1; // Integer | 页码，默认1
        Integer limit = 10; // Integer | 每页条数，默认10，最大30
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
 **currency** | **String**| 币种名称筛选 | [optional]
 **startTime** | **Long**| 开始时间（Unix 时间戳秒） | [optional]
 **endTime** | **Long**| 结束时间（Unix 时间戳秒） | [optional]
 **page** | **Integer**| 页码，默认1 | [optional] [default to 1]
 **limit** | **Integer**| 每页条数，默认10，最大30 | [optional] [default to 10]

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
**200** | 成功返回空投记录列表 |  -  |
**400** | Invalid request parameters |  -  |
**401** | User not authenticated |  -  |

