# OtcApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOtcQuote**](OtcApi.md#createOtcQuote) | **POST** /otc/quote | Fiat and stablecoin quote
[**createOtcOrder**](OtcApi.md#createOtcOrder) | **POST** /otc/order/create | Create fiat order
[**createStableCoinOrder**](OtcApi.md#createStableCoinOrder) | **POST** /otc/stable_coin/order/create | Create stablecoin order
[**getUserDefaultBank**](OtcApi.md#getUserDefaultBank) | **GET** /otc/get_user_def_bank | Get user&#39;s default bank account information
[**getBankList**](OtcApi.md#getBankList) | **GET** /otc/bank_list | Get user bank card list
[**markOtcOrderPaid**](OtcApi.md#markOtcOrderPaid) | **POST** /otc/order/paid | Mark fiat order as paid
[**cancelOtcOrder**](OtcApi.md#cancelOtcOrder) | **POST** /otc/order/cancel | Fiat order cancellation
[**listOtcOrders**](OtcApi.md#listOtcOrders) | **GET** /otc/order/list | Fiat order list
[**listStableCoinOrders**](OtcApi.md#listStableCoinOrders) | **GET** /otc/stable_coin/order/list | Stablecoin order list
[**getOtcOrderDetail**](OtcApi.md#getOtcOrderDetail) | **GET** /otc/order/detail | Fiat order details


<a name="createOtcQuote"></a>
# **createOtcQuote**
> InlineResponse2006 createOtcQuote(inlineObject1)

Fiat and stablecoin quote

Create fiat and stablecoin quotes, supporting both PAY and GET directions

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2006 result = apiInstance.createOtcQuote(inlineObject1);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#createOtcQuote");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Quote retrieved successfully |  -  |

<a name="createOtcOrder"></a>
# **createOtcOrder**
> InlineResponse2007 createOtcOrder(inlineObject2)

Create fiat order

Create a fiat order, supporting BUY for on-ramp and SELL for off-ramp

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2007 result = apiInstance.createOtcOrder(inlineObject2);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#createOtcOrder");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order created successfully |  -  |

<a name="createStableCoinOrder"></a>
# **createStableCoinOrder**
> InlineResponse2008 createStableCoinOrder(inlineObject3)

Create stablecoin order

Create stablecoin order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2008 result = apiInstance.createStableCoinOrder(inlineObject3);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#createStableCoinOrder");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Stablecoin order created successfully |  -  |

<a name="getUserDefaultBank"></a>
# **getUserDefaultBank**
> InlineResponse2009 getUserDefaultBank()

Get user&#39;s default bank account information

Get user&#39;s default bank account information for order placement

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        try {
            InlineResponse2009 result = apiInstance.getUserDefaultBank();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#getUserDefaultBank");
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

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getBankList"></a>
# **getBankList**
> InlineResponse20010 getBankList()

Get user bank card list

Get user bank card list for selecting bank card when placing orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        try {
            InlineResponse20010 result = apiInstance.getBankList();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#getBankList");
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

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="markOtcOrderPaid"></a>
# **markOtcOrderPaid**
> InlineResponse2007 markOtcOrderPaid(inlineObject4)

Mark fiat order as paid

Mark fiat order as paid

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
        try {
            InlineResponse2007 result = apiInstance.markOtcOrderPaid(inlineObject4);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#markOtcOrderPaid");
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The order has been marked as paid |  -  |

<a name="cancelOtcOrder"></a>
# **cancelOtcOrder**
> InlineResponse2007 cancelOtcOrder(orderId)

Fiat order cancellation

Cancel fiat order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        String orderId = "orderId_example"; // String | Order ID
        try {
            InlineResponse2007 result = apiInstance.cancelOtcOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#cancelOtcOrder");
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
 **orderId** | **String**| Order ID |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order cancelled successfully |  -  |

<a name="listOtcOrders"></a>
# **listOtcOrders**
> InlineResponse20011 listOtcOrders().type(type).fiatCurrency(fiatCurrency).cryptoCurrency(cryptoCurrency).startTime(startTime).endTime(endTime).status(status).pn(pn).ps(ps).execute();

Fiat order list

Query the fiat order list with filters such as type, currency, time range, and status

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        String type = "type_example"; // String | BUY for on-ramp, SELL for off-ramp
        String fiatCurrency = "fiatCurrency_example"; // String | Fiat currency
        String cryptoCurrency = "cryptoCurrency_example"; // String | Digital currency
        String startTime = "startTime_example"; // String | starttime   for example : 2025-09-09
        String endTime = "endTime_example"; // String | endtime  for example :2025-09-09
        String status = "status_example"; // String | DONE: Completed CANCEL: Canceled PROCESSING: In Progress
        String pn = "pn_example"; // String | Page number
        String ps = "ps_example"; // String | Number of items per page
        try {
            InlineResponse20011 result = apiInstance.listOtcOrders()
                        .type(type)
                        .fiatCurrency(fiatCurrency)
                        .cryptoCurrency(cryptoCurrency)
                        .startTime(startTime)
                        .endTime(endTime)
                        .status(status)
                        .pn(pn)
                        .ps(ps)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#listOtcOrders");
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
 **type** | **String**| BUY for on-ramp, SELL for off-ramp | [optional]
 **fiatCurrency** | **String**| Fiat currency | [optional]
 **cryptoCurrency** | **String**| Digital currency | [optional]
 **startTime** | **String**| starttime   for example : 2025-09-09 | [optional]
 **endTime** | **String**| endtime  for example :2025-09-09 | [optional]
 **status** | **String**| DONE: Completed CANCEL: Canceled PROCESSING: In Progress | [optional]
 **pn** | **String**| Page number | [optional]
 **ps** | **String**| Number of items per page | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listStableCoinOrders"></a>
# **listStableCoinOrders**
> InlineResponse20012 listStableCoinOrders().pageSize(pageSize).pageNumber(pageNumber).coinName(coinName).startTime(startTime).endTime(endTime).status(status).execute();

Stablecoin order list

Query stablecoin order list with filtering by currency, time range, status, etc.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        String pageSize = "10"; // String | Number of records per page
        String pageNumber = "1"; // String | Page number
        String coinName = "USDT"; // String | ordercurrency
        String startTime = "startTime_example"; // String | Start Time
        String endTime = "endTime_example"; // String | End time
        String status = "status_example"; // String | Status: PROCESSING: in progress / DONE：completed / FAILED: failed
        try {
            InlineResponse20012 result = apiInstance.listStableCoinOrders()
                        .pageSize(pageSize)
                        .pageNumber(pageNumber)
                        .coinName(coinName)
                        .startTime(startTime)
                        .endTime(endTime)
                        .status(status)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#listStableCoinOrders");
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
 **pageSize** | **String**| Number of records per page | [optional]
 **pageNumber** | **String**| Page number | [optional]
 **coinName** | **String**| ordercurrency | [optional]
 **startTime** | **String**| Start Time | [optional]
 **endTime** | **String**| End time | [optional]
 **status** | **String**| Status: PROCESSING: in progress / DONE：completed / FAILED: failed | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getOtcOrderDetail"></a>
# **getOtcOrderDetail**
> InlineResponse20013 getOtcOrderDetail(orderId)

Fiat order details

Query fiat order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.OtcApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        OtcApi apiInstance = new OtcApi(defaultClient);
        String orderId = "orderId_example"; // String | Order ID
        try {
            InlineResponse20013 result = apiInstance.getOtcOrderDetail(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#getOtcOrderDetail");
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
 **orderId** | **String**| Order ID |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

