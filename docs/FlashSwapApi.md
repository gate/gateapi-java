# FlashSwapApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFlashSwapCurrencyPair**](FlashSwapApi.md#listFlashSwapCurrencyPair) | **GET** /flash_swap/currency_pairs | List All Supported Currency Pairs In Flash Swap
[**listFlashSwapOrders**](FlashSwapApi.md#listFlashSwapOrders) | **GET** /flash_swap/orders | Query flash swap order list
[**createFlashSwapOrder**](FlashSwapApi.md#createFlashSwapOrder) | **POST** /flash_swap/orders | Create a flash swap order
[**getFlashSwapOrder**](FlashSwapApi.md#getFlashSwapOrder) | **GET** /flash_swap/orders/{order_id} | Query single flash swap order
[**previewFlashSwapOrder**](FlashSwapApi.md#previewFlashSwapOrder) | **POST** /flash_swap/orders/preview | Flash swap order preview
[**createFlashSwapMultiCurrencyManyToOneOrder**](FlashSwapApi.md#createFlashSwapMultiCurrencyManyToOneOrder) | **POST** /flash-swap/multi-currency/many-to-one/order/create | Flash Swap - Multi-currency exchange - Place order (many-to-one)
[**previewFlashSwapMultiCurrencyManyToOneOrder**](FlashSwapApi.md#previewFlashSwapMultiCurrencyManyToOneOrder) | **POST** /flash-swap/multi-currency/many-to-one/order/preview | Flash Swap - Multi-currency exchange - Preview (many-to-one)
[**createFlashSwapOrderV1**](FlashSwapApi.md#createFlashSwapOrderV1) | **POST** /flash-swap/order/create | Flash Swap - Place order (one-to-one)
[**createFlashSwapMultiCurrencyOneToManyOrder**](FlashSwapApi.md#createFlashSwapMultiCurrencyOneToManyOrder) | **POST** /flash-swap/multi-currency/one-to-many/order/create | Flash Swap - Multi-currency exchange - Place order (one-to-many)
[**previewFlashSwapMultiCurrencyOneToManyOrder**](FlashSwapApi.md#previewFlashSwapMultiCurrencyOneToManyOrder) | **POST** /flash-swap/multi-currency/one-to-many/order/preview | Flash Swap - Multi-currency exchange - Preview (one-to-many)
[**previewFlashSwapOrderV1**](FlashSwapApi.md#previewFlashSwapOrderV1) | **GET** /flash-swap/order/preview | Flash Swap - Preview (one-to-one)


<a name="listFlashSwapCurrencyPair"></a>
# **listFlashSwapCurrencyPair**
> List&lt;FlashSwapCurrencyPair&gt; listFlashSwapCurrencyPair().currency(currency).page(page).limit(limit).execute();

List All Supported Currency Pairs In Flash Swap

&#x60;BTC_GT&#x60; represents selling BTC and buying GT. The limits for each currency may vary across different currency pairs.  It is not necessary that two currencies that can be swapped instantaneously can be exchanged with each other. For example, it is possible to sell BTC and buy GT, but it does not necessarily mean that GT can be sold to buy BTC.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        Integer page = 1; // Integer | Page number
        Integer limit = 1000; // Integer | Maximum number of items returned. Default: 1000, minimum: 1, maximum: 1000
        try {
            List<FlashSwapCurrencyPair> result = apiInstance.listFlashSwapCurrencyPair()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#listFlashSwapCurrencyPair");
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
 **currency** | **String**| Query by specified currency name | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of items returned. Default: 1000, minimum: 1, maximum: 1000 | [optional] [default to 1000]

### Return type

[**List&lt;FlashSwapCurrencyPair&gt;**](FlashSwapCurrencyPair.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFlashSwapOrders"></a>
# **listFlashSwapOrders**
> List&lt;FlashSwapOrder&gt; listFlashSwapOrders().status(status).sellCurrency(sellCurrency).buyCurrency(buyCurrency).reverse(reverse).limit(limit).page(page).execute();

Query flash swap order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        Integer status = 1; // Integer | Flash swap order status  `1` - success `2` - failed
        String sellCurrency = "BTC"; // String | Asset name to sell - Retrieved from API `GET /flash_swap/currencies` for supported flash swap currencies
        String buyCurrency = "BTC"; // String | Asset name to buy - Retrieved from API `GET /flash_swap/currencies` for supported flash swap currencies
        Boolean reverse = true; // Boolean | Sort by ID in ascending or descending order, default `true` - `true`: ID descending order (most recent data first) - `false`: ID ascending order (oldest data first)
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer page = 1; // Integer | Page number
        try {
            List<FlashSwapOrder> result = apiInstance.listFlashSwapOrders()
                        .status(status)
                        .sellCurrency(sellCurrency)
                        .buyCurrency(buyCurrency)
                        .reverse(reverse)
                        .limit(limit)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#listFlashSwapOrders");
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
 **status** | **Integer**| Flash swap order status  &#x60;1&#x60; - success &#x60;2&#x60; - failed | [optional]
 **sellCurrency** | **String**| Asset name to sell - Retrieved from API &#x60;GET /flash_swap/currencies&#x60; for supported flash swap currencies | [optional]
 **buyCurrency** | **String**| Asset name to buy - Retrieved from API &#x60;GET /flash_swap/currencies&#x60; for supported flash swap currencies | [optional]
 **reverse** | **Boolean**| Sort by ID in ascending or descending order, default &#x60;true&#x60; - &#x60;true&#x60;: ID descending order (most recent data first) - &#x60;false&#x60;: ID ascending order (oldest data first) | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**List&lt;FlashSwapOrder&gt;**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="createFlashSwapOrder"></a>
# **createFlashSwapOrder**
> FlashSwapOrder createFlashSwapOrder(flashSwapOrderRequest)

Create a flash swap order

Initiate a flash swap preview in advance because order creation requires a preview result

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapOrderRequest flashSwapOrderRequest = new FlashSwapOrderRequest(); // FlashSwapOrderRequest | 
        try {
            FlashSwapOrder result = apiInstance.createFlashSwapOrder(flashSwapOrderRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#createFlashSwapOrder");
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
 **flashSwapOrderRequest** | [**FlashSwapOrderRequest**](FlashSwapOrderRequest.md)|  |

### Return type

[**FlashSwapOrder**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Flash swap order created successfully |  -  |

<a name="getFlashSwapOrder"></a>
# **getFlashSwapOrder**
> FlashSwapOrder getFlashSwapOrder(orderId)

Query single flash swap order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        Integer orderId = 1; // Integer | Flash swap order ID
        try {
            FlashSwapOrder result = apiInstance.getFlashSwapOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#getFlashSwapOrder");
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
 **orderId** | **Integer**| Flash swap order ID |

### Return type

[**FlashSwapOrder**](FlashSwapOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="previewFlashSwapOrder"></a>
# **previewFlashSwapOrder**
> FlashSwapOrderPreview previewFlashSwapOrder(flashSwapPreviewRequest)

Flash swap order preview

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapPreviewRequest flashSwapPreviewRequest = new FlashSwapPreviewRequest(); // FlashSwapPreviewRequest | 
        try {
            FlashSwapOrderPreview result = apiInstance.previewFlashSwapOrder(flashSwapPreviewRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#previewFlashSwapOrder");
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
 **flashSwapPreviewRequest** | [**FlashSwapPreviewRequest**](FlashSwapPreviewRequest.md)|  |

### Return type

[**FlashSwapOrderPreview**](FlashSwapOrderPreview.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Flash swap order preview successful |  -  |

<a name="createFlashSwapMultiCurrencyManyToOneOrder"></a>
# **createFlashSwapMultiCurrencyManyToOneOrder**
> FlashSwapMultiCurrencyManyToOneOrderCreateResp createFlashSwapMultiCurrencyManyToOneOrder(flashSwapMultiCurrencyManyToOneOrderCreateReq)

Flash Swap - Multi-currency exchange - Place order (many-to-one)

Create a multi-currency to single target currency exchange order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapMultiCurrencyManyToOneOrderCreateReq flashSwapMultiCurrencyManyToOneOrderCreateReq = new FlashSwapMultiCurrencyManyToOneOrderCreateReq(); // FlashSwapMultiCurrencyManyToOneOrderCreateReq | 
        try {
            FlashSwapMultiCurrencyManyToOneOrderCreateResp result = apiInstance.createFlashSwapMultiCurrencyManyToOneOrder(flashSwapMultiCurrencyManyToOneOrderCreateReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#createFlashSwapMultiCurrencyManyToOneOrder");
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
 **flashSwapMultiCurrencyManyToOneOrderCreateReq** | [**FlashSwapMultiCurrencyManyToOneOrderCreateReq**](FlashSwapMultiCurrencyManyToOneOrderCreateReq.md)|  |

### Return type

[**FlashSwapMultiCurrencyManyToOneOrderCreateResp**](FlashSwapMultiCurrencyManyToOneOrderCreateResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

<a name="previewFlashSwapMultiCurrencyManyToOneOrder"></a>
# **previewFlashSwapMultiCurrencyManyToOneOrder**
> FlashSwapMultiCurrencyManyToOneOrderPreviewResp previewFlashSwapMultiCurrencyManyToOneOrder(flashSwapMultiCurrencyManyToOneOrderPreviewReq)

Flash Swap - Multi-currency exchange - Preview (many-to-one)

Preview quote for multi-currency to single target currency exchange

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapMultiCurrencyManyToOneOrderPreviewReq flashSwapMultiCurrencyManyToOneOrderPreviewReq = new FlashSwapMultiCurrencyManyToOneOrderPreviewReq(); // FlashSwapMultiCurrencyManyToOneOrderPreviewReq | 
        try {
            FlashSwapMultiCurrencyManyToOneOrderPreviewResp result = apiInstance.previewFlashSwapMultiCurrencyManyToOneOrder(flashSwapMultiCurrencyManyToOneOrderPreviewReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#previewFlashSwapMultiCurrencyManyToOneOrder");
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
 **flashSwapMultiCurrencyManyToOneOrderPreviewReq** | [**FlashSwapMultiCurrencyManyToOneOrderPreviewReq**](FlashSwapMultiCurrencyManyToOneOrderPreviewReq.md)|  |

### Return type

[**FlashSwapMultiCurrencyManyToOneOrderPreviewResp**](FlashSwapMultiCurrencyManyToOneOrderPreviewResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

<a name="createFlashSwapOrderV1"></a>
# **createFlashSwapOrderV1**
> FlashSwapOrderCreateResp createFlashSwapOrderV1(flashSwapOrderCreateReq)

Flash Swap - Place order (one-to-one)

Submit a one-to-one flash swap order. A quote_id must be obtained from the preview endpoint first

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapOrderCreateReq flashSwapOrderCreateReq = new FlashSwapOrderCreateReq(); // FlashSwapOrderCreateReq | 
        try {
            FlashSwapOrderCreateResp result = apiInstance.createFlashSwapOrderV1(flashSwapOrderCreateReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#createFlashSwapOrderV1");
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
 **flashSwapOrderCreateReq** | [**FlashSwapOrderCreateReq**](FlashSwapOrderCreateReq.md)|  |

### Return type

[**FlashSwapOrderCreateResp**](FlashSwapOrderCreateResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

<a name="createFlashSwapMultiCurrencyOneToManyOrder"></a>
# **createFlashSwapMultiCurrencyOneToManyOrder**
> FlashSwapMultiCurrencyOneToManyOrderCreateResp createFlashSwapMultiCurrencyOneToManyOrder(flashSwapMultiCurrencyOneToManyOrderCreateReq)

Flash Swap - Multi-currency exchange - Place order (one-to-many)

Create a single currency to multiple target currencies exchange order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapMultiCurrencyOneToManyOrderCreateReq flashSwapMultiCurrencyOneToManyOrderCreateReq = new FlashSwapMultiCurrencyOneToManyOrderCreateReq(); // FlashSwapMultiCurrencyOneToManyOrderCreateReq | 
        try {
            FlashSwapMultiCurrencyOneToManyOrderCreateResp result = apiInstance.createFlashSwapMultiCurrencyOneToManyOrder(flashSwapMultiCurrencyOneToManyOrderCreateReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#createFlashSwapMultiCurrencyOneToManyOrder");
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
 **flashSwapMultiCurrencyOneToManyOrderCreateReq** | [**FlashSwapMultiCurrencyOneToManyOrderCreateReq**](FlashSwapMultiCurrencyOneToManyOrderCreateReq.md)|  |

### Return type

[**FlashSwapMultiCurrencyOneToManyOrderCreateResp**](FlashSwapMultiCurrencyOneToManyOrderCreateResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

<a name="previewFlashSwapMultiCurrencyOneToManyOrder"></a>
# **previewFlashSwapMultiCurrencyOneToManyOrder**
> FlashSwapMultiCurrencyOneToManyOrderPreviewResp previewFlashSwapMultiCurrencyOneToManyOrder(flashSwapMultiCurrencyOneToManyOrderPreviewReq)

Flash Swap - Multi-currency exchange - Preview (one-to-many)

Preview quote for single currency to multiple target currencies exchange

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        FlashSwapMultiCurrencyOneToManyOrderPreviewReq flashSwapMultiCurrencyOneToManyOrderPreviewReq = new FlashSwapMultiCurrencyOneToManyOrderPreviewReq(); // FlashSwapMultiCurrencyOneToManyOrderPreviewReq | 
        try {
            FlashSwapMultiCurrencyOneToManyOrderPreviewResp result = apiInstance.previewFlashSwapMultiCurrencyOneToManyOrder(flashSwapMultiCurrencyOneToManyOrderPreviewReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#previewFlashSwapMultiCurrencyOneToManyOrder");
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
 **flashSwapMultiCurrencyOneToManyOrderPreviewReq** | [**FlashSwapMultiCurrencyOneToManyOrderPreviewReq**](FlashSwapMultiCurrencyOneToManyOrderPreviewReq.md)|  |

### Return type

[**FlashSwapMultiCurrencyOneToManyOrderPreviewResp**](FlashSwapMultiCurrencyOneToManyOrderPreviewResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

<a name="previewFlashSwapOrderV1"></a>
# **previewFlashSwapOrderV1**
> FlashSwapOrderPreviewResp previewFlashSwapOrderV1(sellAsset, buyAsset).sellAmount(sellAmount).buyAmount(buyAmount).execute();

Flash Swap - Preview (one-to-one)

Get one-to-one flash swap quote. Either sell_amount or buy_amount must be specified

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FlashSwapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FlashSwapApi apiInstance = new FlashSwapApi(defaultClient);
        String sellAsset = "sellAsset_example"; // String | Currency to sell
        String buyAsset = "buyAsset_example"; // String | Currency to buy
        String sellAmount = "sellAmount_example"; // String | Sell amount, either this or buy_amount must be specified
        String buyAmount = "buyAmount_example"; // String | Buy amount, either this or sell_amount must be specified
        try {
            FlashSwapOrderPreviewResp result = apiInstance.previewFlashSwapOrderV1(sellAsset, buyAsset)
                        .sellAmount(sellAmount)
                        .buyAmount(buyAmount)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FlashSwapApi#previewFlashSwapOrderV1");
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
 **sellAsset** | **String**| Currency to sell |
 **buyAsset** | **String**| Currency to buy |
 **sellAmount** | **String**| Sell amount, either this or buy_amount must be specified | [optional]
 **buyAmount** | **String**| Buy amount, either this or sell_amount must be specified | [optional]

### Return type

[**FlashSwapOrderPreviewResp**](FlashSwapOrderPreviewResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Invalid parameters |  -  |
**404** | Record does not exist |  -  |

