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

Get the current user&#39;s onboarding task list. By default, the registration tasks (type&#x3D;10) and guidance tasks (type&#x3D;11) that have been assigned to the current user are returned. The registration tasks are ranked first and the guidance tasks are ranked behind. When the user does not have a download task and the system determines that the user has not downloaded the app, a \&quot;Download task to be received\&quot; card will be dynamically added. Among them: - &#x60;task_type &#x3D; 23&#x60; for download tasks - &#x60;status &#x3D; 0&#x60; for download tasks to be collected Results are cached for 60 seconds. Task lists are limited in number (usually no more than 10) and do not require pagination.

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

Receive a single welfare task. The current main scene is for new customer download tasks to be collected, but the interface itself supports new customer registration, guidance, and advanced task types. Processing flow: 1. Read the logged in user 2. Verify user qualifications 3. Risk control verification (event code &#x60;task_center&#x60;) 4. Verify task configuration and task center tasks 5. Verify whether there is an ongoing task 6. If it is a download task, verify whether the App has been downloaded 7. Write &#x60;welfare_user_tasks_xx&#x60; 8. Report to task center Risk control transparent transmission fields: - Old fields: &#x60;user_id&#x60;, &#x60;ip&#x60;, &#x60;const_id&#x60;, &#x60;is_async&#x60;, &#x60;action&#x60;, &#x60;task_id&#x60; - New fields: &#x60;req_method&#x60;, &#x60;traceid&#x60; - Among them:   - &#x60;req_method&#x60; from &#x60;X-Gate-Request-Source&#x60;   - &#x60;ip&#x60; from &#x60;X-Gate-Ip&#x60;   - &#x60;traceid&#x60; from &#x60;X-Gate-Trace-Id&#x60;   - &#x60;const_id&#x60; is fixed to an empty string

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

Receive rewards from a single welfare task. Processing flow: 1. Read the logged in user 2. Verify user qualifications 3. Query &#x60;welfare_user_tasks_xx&#x60; and require the task status to be &#x60;StatusDone(2)&#x60; 4. Risk control verification (event code &#x60;index_page_check&#x60;) 5. Query task details and reward information in the task center 6. If the reward is m and n is selected from the prize pool, then &#x60;has_m_n_task &#x3D; true&#x60; will be returned and the reward will not be actually issued. 7. Ordinary rewards will enter the original reward collection logic of the Welfare Center Risk control transparent transmission fields: - Old fields: &#x60;user_id&#x60;, &#x60;ip&#x60;, &#x60;const_id&#x60;, &#x60;is_async&#x60; - New fields: &#x60;req_method&#x60;, &#x60;traceid&#x60; - Among them:   - &#x60;req_method&#x60; from &#x60;X-Gate-Request-Source&#x60;   - &#x60;ip&#x60; from &#x60;X-Gate-Ip&#x60;   - &#x60;traceid&#x60; from &#x60;X-Gate-Trace-Id&#x60;   - &#x60;const_id&#x60; is fixed to an empty string

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

