# RebateApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agencyTransactionHistory**](RebateApi.md#agencyTransactionHistory) | **GET** /rebate/agency/transaction_history | Broker obtains transaction history of recommended users
[**agencyCommissionsHistory**](RebateApi.md#agencyCommissionsHistory) | **GET** /rebate/agency/commission_history | Broker obtains rebate history of recommended users
[**partnerTransactionHistory**](RebateApi.md#partnerTransactionHistory) | **GET** /rebate/partner/transaction_history | Partner obtains transaction history of recommended users
[**partnerCommissionsHistory**](RebateApi.md#partnerCommissionsHistory) | **GET** /rebate/partner/commission_history | Partner obtains rebate records of recommended users
[**partnerSubList**](RebateApi.md#partnerSubList) | **GET** /rebate/partner/sub_list | Partner subordinate list
[**rebateBrokerCommissionHistory**](RebateApi.md#rebateBrokerCommissionHistory) | **GET** /rebate/broker/commission_history | Broker obtains user&#39;s rebate records
[**rebateBrokerTransactionHistory**](RebateApi.md#rebateBrokerTransactionHistory) | **GET** /rebate/broker/transaction_history | Broker obtains user&#39;s trading history
[**rebateUserInfo**](RebateApi.md#rebateUserInfo) | **GET** /rebate/user/info | User obtains rebate information
[**userSubRelation**](RebateApi.md#userSubRelation) | **GET** /rebate/user/sub_relation | User subordinate relationship
[**getPartnerApplicationRecent**](RebateApi.md#getPartnerApplicationRecent) | **GET** /rebate/partner/applications/recent | Get recent partner application records
[**getPartnerEligibility**](RebateApi.md#getPartnerEligibility) | **GET** /rebate/partner/eligibility | Check partner application eligibility
[**getPartnerAgentDataAggregated**](RebateApi.md#getPartnerAgentDataAggregated) | **GET** /rebate/partner/data/aggregated | Aggregated partner agent statistics


<a name="agencyTransactionHistory"></a>
# **agencyTransactionHistory**
> List&lt;AgencyTransactionHistory&gt; agencyTransactionHistory().currencyPair(currencyPair).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Broker obtains transaction history of recommended users

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Specify the trading pair. If not specified, returns all trading pairs
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records. If not specified, defaults to 7 days before current time
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<AgencyTransactionHistory> result = apiInstance.agencyTransactionHistory()
                        .currencyPair(currencyPair)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#agencyTransactionHistory");
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
 **currencyPair** | **String**| Specify the trading pair. If not specified, returns all trading pairs | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records. If not specified, defaults to 7 days before current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;AgencyTransactionHistory&gt;**](AgencyTransactionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="agencyCommissionsHistory"></a>
# **agencyCommissionsHistory**
> List&lt;AgencyCommissionHistory&gt; agencyCommissionsHistory().currency(currency).commissionType(commissionType).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Broker obtains rebate history of recommended users

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        Integer commissionType = 1; // Integer | Rebate type: 1 - Direct rebate, 2 - Indirect rebate, 3 - Self rebate
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records. If not specified, defaults to 7 days before current time
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<AgencyCommissionHistory> result = apiInstance.agencyCommissionsHistory()
                        .currency(currency)
                        .commissionType(commissionType)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#agencyCommissionsHistory");
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
 **currency** | **String**| Specify the currency. If not specified, returns all currencies | [optional]
 **commissionType** | **Integer**| Rebate type: 1 - Direct rebate, 2 - Indirect rebate, 3 - Self rebate | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records. If not specified, defaults to 7 days before current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;AgencyCommissionHistory&gt;**](AgencyCommissionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="partnerTransactionHistory"></a>
# **partnerTransactionHistory**
> PartnerTransactionHistory partnerTransactionHistory().currencyPair(currencyPair).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Partner obtains transaction history of recommended users

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currencyPair = "BTC_USDT"; // String | Specify the trading pair. If not specified, returns all trading pairs
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records. If not specified, defaults to 7 days before current time
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerTransactionHistory result = apiInstance.partnerTransactionHistory()
                        .currencyPair(currencyPair)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#partnerTransactionHistory");
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
 **currencyPair** | **String**| Specify the trading pair. If not specified, returns all trading pairs | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records. If not specified, defaults to 7 days before current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerTransactionHistory**](PartnerTransactionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="partnerCommissionsHistory"></a>
# **partnerCommissionsHistory**
> PartnerCommissionHistory partnerCommissionsHistory().currency(currency).userId(userId).from(from).to(to).limit(limit).offset(offset).execute();

Partner obtains rebate records of recommended users

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String currency = "BTC"; // String | Specify the currency. If not specified, returns all currencies
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1602120000L; // Long | Start time for querying records. If not specified, defaults to 7 days before current time
        Long to = 1602123600L; // Long | End timestamp for the query, defaults to current time if not specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerCommissionHistory result = apiInstance.partnerCommissionsHistory()
                        .currency(currency)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#partnerCommissionsHistory");
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
 **currency** | **String**| Specify the currency. If not specified, returns all currencies | [optional]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time for querying records. If not specified, defaults to 7 days before current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerCommissionHistory**](PartnerCommissionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="partnerSubList"></a>
# **partnerSubList**
> PartnerSubList partnerSubList().userId(userId).limit(limit).offset(offset).execute();

Partner subordinate list

Including sub-agents, direct customers, and indirect customers

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            PartnerSubList result = apiInstance.partnerSubList()
                        .userId(userId)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#partnerSubList");
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
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**PartnerSubList**](PartnerSubList.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateBrokerCommissionHistory"></a>
# **rebateBrokerCommissionHistory**
> List&lt;BrokerCommission&gt; rebateBrokerCommissionHistory().limit(limit).offset(offset).userId(userId).from(from).to(to).execute();

Broker obtains user&#39;s rebate records

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1711929600L; // Long | Start time of the query record. If not specified, defaults to 30 days before the current time
        Long to = 1714521600L; // Long | End timestamp for the query, defaults to current time if not specified
        try {
            List<BrokerCommission> result = apiInstance.rebateBrokerCommissionHistory()
                        .limit(limit)
                        .offset(offset)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateBrokerCommissionHistory");
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
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time of the query record. If not specified, defaults to 30 days before the current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

### Return type

[**List&lt;BrokerCommission&gt;**](BrokerCommission.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateBrokerTransactionHistory"></a>
# **rebateBrokerTransactionHistory**
> List&lt;BrokerTransactionHistory&gt; rebateBrokerTransactionHistory().limit(limit).offset(offset).userId(userId).from(from).to(to).execute();

Broker obtains user&#39;s trading history

Record query time range cannot exceed 30 days

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long userId = 10003L; // Long | User ID. If not specified, all user records will be returned
        Long from = 1711929600L; // Long | Start time of the query record. If not specified, defaults to 30 days before the current time
        Long to = 1714521600L; // Long | End timestamp for the query, defaults to current time if not specified
        try {
            List<BrokerTransactionHistory> result = apiInstance.rebateBrokerTransactionHistory()
                        .limit(limit)
                        .offset(offset)
                        .userId(userId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateBrokerTransactionHistory");
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
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **userId** | **Long**| User ID. If not specified, all user records will be returned | [optional]
 **from** | **Long**| Start time of the query record. If not specified, defaults to 30 days before the current time | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]

### Return type

[**List&lt;BrokerTransactionHistory&gt;**](BrokerTransactionHistory.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="rebateUserInfo"></a>
# **rebateUserInfo**
> List&lt;RebateUserInfo&gt; rebateUserInfo()

User obtains rebate information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        try {
            List<RebateUserInfo> result = apiInstance.rebateUserInfo();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#rebateUserInfo");
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

[**List&lt;RebateUserInfo&gt;**](RebateUserInfo.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="userSubRelation"></a>
# **userSubRelation**
> UserSubRelation userSubRelation(userIdList)

User subordinate relationship

Query whether the specified user is within the system

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String userIdList = "1, 2, 3"; // String | Query user ID list, separated by commas. If more than 100, only 100 will be returned
        try {
            UserSubRelation result = apiInstance.userSubRelation(userIdList);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#userSubRelation");
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
 **userIdList** | **String**| Query user ID list, separated by commas. If more than 100, only 100 will be returned |

### Return type

[**UserSubRelation**](UserSubRelation.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getPartnerApplicationRecent"></a>
# **getPartnerApplicationRecent**
> PartnerApplicationResponse getPartnerApplicationRecent()

Get recent partner application records

获取当前用户最近的合伙人申请记录。  此接口返回用户最近 30 天内的申请记录，包括申请状态、审核信息、申请材料等详细信息。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        try {
            PartnerApplicationResponse result = apiInstance.getPartnerApplicationRecent();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#getPartnerApplicationRecent");
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

[**PartnerApplicationResponse**](PartnerApplicationResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getPartnerEligibility"></a>
# **getPartnerEligibility**
> EligibilityResponse getPartnerEligibility()

Check partner application eligibility

检查当前用户是否有资格申请成为合伙人。  此接口会检查多个条件： - 账户状态（是否被封禁） - 是否为子账号 - 是否已经是合伙人 - KYC 认证状态 - 是否在其他代理商的邀请链下 - 是否在黑名单中 - 其他业务规则限制

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        try {
            EligibilityResponse result = apiInstance.getPartnerEligibility();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#getPartnerEligibility");
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

[**EligibilityResponse**](EligibilityResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |

<a name="getPartnerAgentDataAggregated"></a>
# **getPartnerAgentDataAggregated**
> PartnerDataAggregatedResponse getPartnerAgentDataAggregated().startDate(startDate).endDate(endDate).businessType(businessType).execute();

Aggregated partner agent statistics

查询指定时间范围内合伙人代理的数据聚合统计，包括返佣金额、交易量、净手续费、客户数和交易人数。  **注意事项：** - 交易人数 &#x60;trading_user_count&#x60; 仅在 &#x60;business_type&#x3D;0&#x60;（全部）时返回 - 时间参数使用 UTC+8 时区 - 如不传时间参数，默认查询近 7 天数据 - 仅限合伙人代理访问，子账号无权限

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.RebateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        RebateApi apiInstance = new RebateApi(defaultClient);
        String startDate = "2024-01-01 00:00:00"; // String | 查询开始时间，格式：yyyy-mm-dd hh:ii:ss（UTC+8）  不传时默认为近 7 日开始时间
        String endDate = "2024-01-07 23:59:59"; // String | 查询结束时间，格式：yyyy-mm-dd hh:ii:ss（UTC+8）  不传时默认为近 7 日结束时间
        Integer businessType = 0; // Integer | Business type filter: - 0: All (default) - 1: Spot - 2: Futures - 3: Alpha - 4: Web3 - 5: Perps (DEX) - 6: Exchange All - 7: Web3 All - 8: TradFi
        try {
            PartnerDataAggregatedResponse result = apiInstance.getPartnerAgentDataAggregated()
                        .startDate(startDate)
                        .endDate(endDate)
                        .businessType(businessType)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling RebateApi#getPartnerAgentDataAggregated");
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
 **startDate** | **String**| 查询开始时间，格式：yyyy-mm-dd hh:ii:ss（UTC+8）  不传时默认为近 7 日开始时间 | [optional]
 **endDate** | **String**| 查询结束时间，格式：yyyy-mm-dd hh:ii:ss（UTC+8）  不传时默认为近 7 日结束时间 | [optional]
 **businessType** | **Integer**| Business type filter: - 0: All (default) - 1: Spot - 2: Futures - 3: Alpha - 4: Web3 - 5: Perps (DEX) - 6: Exchange All - 7: Web3 All - 8: TradFi | [optional] [default to 0] [enum: 0, 1, 2, 3, 4, 5, 6, 7, 8]

### Return type

[**PartnerDataAggregatedResponse**](PartnerDataAggregatedResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |
**400** | Invalid request parameters |  -  |
**401** | Unauthorized access |  -  |
**403** | Access denied |  -  |

