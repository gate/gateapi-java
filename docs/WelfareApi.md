# WelfareApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserIdentity**](WelfareApi.md#getUserIdentity) | **GET** /rewards/getUserIdentity | Get user identity
[**getBeginnerTaskList**](WelfareApi.md#getBeginnerTaskList) | **GET** /rewards/getBeginnerTaskList | Get beginner task list
[**claimTask**](WelfareApi.md#claimTask) | **POST** /rewards/claimTask | Get the task
[**claimReward**](WelfareApi.md#claimReward) | **POST** /rewards/claimReward | Receive mission rewards


<a name="getUserIdentity"></a>
# **getUserIdentity**
> ApiResponseExSkillGetUserIdentityResp getUserIdentity()

Get user identity

Validate whether the user is eligible for new user rewards. Returns the corresponding error code on validation failure, data is an empty object on success.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WelfareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WelfareApi apiInstance = new WelfareApi(defaultClient);
        try {
            ApiResponseExSkillGetUserIdentityResp result = apiInstance.getUserIdentity();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WelfareApi#getUserIdentity");
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

[**ApiResponseExSkillGetUserIdentityResp**](ApiResponseExSkillGetUserIdentityResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field |  -  |
**400** | Invalid request parameters |  -  |

<a name="getBeginnerTaskList"></a>
# **getBeginnerTaskList**
> ApiResponseExSkillGetBeginnerTaskListResp getBeginnerTaskList()

Get beginner task list

获取当前用户的新客入门任务列表。  默认返回已经归属到当前用户的注册任务（type&#x3D;10）和引导任务（type&#x3D;11），注册任务排在前面，引导任务排在后面。 当用户尚未拥有下载任务、且系统判断用户未下载过 App 时，会动态补充一条“待领取下载任务”卡片。  其中： - 下载任务的 &#x60;task_type &#x3D; 23&#x60; - 待领取下载任务的 &#x60;status &#x3D; 0&#x60;  结果缓存 60 秒。任务列表数量有限（通常不超过 10 条），无需分页。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WelfareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WelfareApi apiInstance = new WelfareApi(defaultClient);
        try {
            ApiResponseExSkillGetBeginnerTaskListResp result = apiInstance.getBeginnerTaskList();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WelfareApi#getBeginnerTaskList");
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

[**ApiResponseExSkillGetBeginnerTaskListResp**](ApiResponseExSkillGetBeginnerTaskListResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field |  -  |
**400** | Invalid request parameters |  -  |

<a name="claimTask"></a>
# **claimTask**
> ApiResponseExSkillClaimTaskResp claimTask(exSkillClaimTaskReq)

Get the task

领取单个福利任务。  当前主场景为新客下载任务领取，但接口本身支持新客注册、引导、进阶任务类型。  处理流程： 1. 读取登录用户 2. 做用户资格校验 3. 风控校验（事件码 &#x60;task_center&#x60;） 4. 校验任务配置与任务中心任务 5. 校验是否已存在进行中任务 6. 若为下载任务，校验是否已下载 App 7. 写入 &#x60;welfare_user_tasks_xx&#x60; 8. 上报任务中心  风控透传字段： - 老字段：&#x60;user_id&#x60;、&#x60;ip&#x60;、&#x60;const_id&#x60;、&#x60;is_async&#x60;、&#x60;action&#x60;、&#x60;task_id&#x60; - 新增字段：&#x60;req_method&#x60;、&#x60;traceid&#x60; - 其中：   - &#x60;req_method&#x60; 来自 &#x60;X-Gate-Request-Source&#x60;   - &#x60;ip&#x60; 来自 &#x60;X-Gate-Ip&#x60;   - &#x60;traceid&#x60; 来自 &#x60;X-Gate-Trace-Id&#x60;   - &#x60;const_id&#x60; 固定为空字符串

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WelfareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WelfareApi apiInstance = new WelfareApi(defaultClient);
        ExSkillClaimTaskReq exSkillClaimTaskReq = new ExSkillClaimTaskReq(); // ExSkillClaimTaskReq | 
        try {
            ApiResponseExSkillClaimTaskResp result = apiInstance.claimTask(exSkillClaimTaskReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WelfareApi#claimTask");
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
 **exSkillClaimTaskReq** | [**ExSkillClaimTaskReq**](ExSkillClaimTaskReq.md)|  |

### Return type

[**ApiResponseExSkillClaimTaskResp**](ApiResponseExSkillClaimTaskResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field |  -  |
**400** | Invalid request parameters |  -  |

<a name="claimReward"></a>
# **claimReward**
> ApiResponseExSkillClaimRewardResp claimReward(exSkillClaimRewardReq)

Receive mission rewards

领取单个福利任务奖励。  处理流程： 1. 读取登录用户 2. 做用户资格校验 3. 查询 &#x60;welfare_user_tasks_xx&#x60;，要求任务状态为 &#x60;StatusDone(2)&#x60; 4. 风控校验（事件码 &#x60;index_page_check&#x60;） 5. 查询任务中心任务详情与奖励信息 6. 若奖励为 m 选 n 奖池，则返回 &#x60;has_m_n_task &#x3D; true&#x60;，不实际发奖 7. 普通奖励则进入福利中心原领奖逻辑  风控透传字段： - 老字段：&#x60;user_id&#x60;、&#x60;ip&#x60;、&#x60;const_id&#x60;、&#x60;is_async&#x60; - 新增字段：&#x60;req_method&#x60;、&#x60;traceid&#x60; - 其中：   - &#x60;req_method&#x60; 来自 &#x60;X-Gate-Request-Source&#x60;   - &#x60;ip&#x60; 来自 &#x60;X-Gate-Ip&#x60;   - &#x60;traceid&#x60; 来自 &#x60;X-Gate-Trace-Id&#x60;   - &#x60;const_id&#x60; 固定为空字符串

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.WelfareApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        WelfareApi apiInstance = new WelfareApi(defaultClient);
        ExSkillClaimRewardReq exSkillClaimRewardReq = new ExSkillClaimRewardReq(); // ExSkillClaimRewardReq | 
        try {
            ApiResponseExSkillClaimRewardResp result = apiInstance.claimReward(exSkillClaimRewardReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling WelfareApi#claimReward");
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
 **exSkillClaimRewardReq** | [**ExSkillClaimRewardReq**](ExSkillClaimRewardReq.md)|  |

### Return type

[**ApiResponseExSkillClaimRewardResp**](ApiResponseExSkillClaimRewardResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The endpoint always returns HTTP 200. Business results are distinguished by the code field |  -  |
**400** | Invalid request parameters |  -  |

