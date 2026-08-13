# StockApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryStockUserAssets**](StockApi.md#queryStockUserAssets) | **GET** /stock/users/assets | Query user assets
[**queryStockSymbols**](StockApi.md#queryStockSymbols) | **GET** /stock/symbols | Query symbol list
[**queryStockSymbolDetail**](StockApi.md#queryStockSymbolDetail) | **GET** /stock/symbols/detail | Query symbol details
[**queryStockOrderBook**](StockApi.md#queryStockOrderBook) | **GET** /stock/market/{symbol}/orderbook | Query market order book
[**queryStockOrderList**](StockApi.md#queryStockOrderList) | **GET** /stock/orders | Query open order list
[**createStockOrder**](StockApi.md#createStockOrder) | **POST** /stock/orders | Create order
[**deleteAllStockOrders**](StockApi.md#deleteAllStockOrders) | **DELETE** /stock/orders | Cancel all open orders
[**queryStockOrderHistory**](StockApi.md#queryStockOrderHistory) | **GET** /stock/orders/history | Query historical order list
[**updateStockOrder**](StockApi.md#updateStockOrder) | **PUT** /stock/orders/{order_id} | Modify order
[**deleteStockOrder**](StockApi.md#deleteStockOrder) | **DELETE** /stock/orders/{order_id} | Cancel order
[**queryStockPositions**](StockApi.md#queryStockPositions) | **GET** /stock/positions | Query current position list
[**closeStockPosition**](StockApi.md#closeStockPosition) | **POST** /stock/positions/close | Close position
[**queryStockTransactions**](StockApi.md#queryStockTransactions) | **GET** /stock/transactions | Query transaction records
[**createStockTransaction**](StockApi.md#createStockTransaction) | **POST** /stock/transactions | Fund transfer
[**queryStockExchanges**](StockApi.md#queryStockExchanges) | **GET** /stock/exchanges | Query supported exchanges
[**queryStockFeeRate**](StockApi.md#queryStockFeeRate) | **GET** /stock/fee-rate | Query fee rates for Japanese and Korean stocks


<a name="queryStockUserAssets"></a>
# **queryStockUserAssets**
> UserAssetResp2 queryStockUserAssets().pnlCalcType(pnlCalcType).pnlCalcPrice(pnlCalcPrice).execute();

Query user assets

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        Integer pnlCalcType = 1; // Integer | PnL calculation cost type. Defaults to average cost price when omitted (1 = average cost price, 2 = diluted cost price)
        Integer pnlCalcPrice = 1; // Integer | PnL calculation price type. Defaults to intraday price when omitted (1 = intraday price, 2 = latest extended-hours price)
        try {
            UserAssetResp2 result = apiInstance.queryStockUserAssets()
                        .pnlCalcType(pnlCalcType)
                        .pnlCalcPrice(pnlCalcPrice)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockUserAssets");
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
 **pnlCalcType** | **Integer**| PnL calculation cost type. Defaults to average cost price when omitted (1 &#x3D; average cost price, 2 &#x3D; diluted cost price) | [optional] [enum: 1, 2]
 **pnlCalcPrice** | **Integer**| PnL calculation price type. Defaults to intraday price when omitted (1 &#x3D; intraday price, 2 &#x3D; latest extended-hours price) | [optional] [enum: 1, 2]

### Return type

[**UserAssetResp2**](UserAssetResp2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockSymbols"></a>
# **queryStockSymbols**
> Symbols2 queryStockSymbols().symbols(symbols).exchange(exchange).withDescI18n(withDescI18n).page(page).pageSize(pageSize).execute();

Query symbol list

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        StockApi apiInstance = new StockApi(defaultClient);
        String symbols = "AAPL,TSLA"; // String | Symbol list, multiple separated by commas
        String exchange = "us"; // String | Exchange, supports us, hk, and kr
        Boolean withDescI18n = true; // Boolean | Whether to return multilingual symbol description
        Integer page = 1; // Integer | Page number, defaults to 1
        Integer pageSize = 100; // Integer | Page size, defaults to 10, max 500; server caps at 500
        try {
            Symbols2 result = apiInstance.queryStockSymbols()
                        .symbols(symbols)
                        .exchange(exchange)
                        .withDescI18n(withDescI18n)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockSymbols");
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
 **symbols** | **String**| Symbol list, multiple separated by commas | [optional]
 **exchange** | **String**| Exchange, supports us, hk, and kr | [optional] [enum: us, hk, kr]
 **withDescI18n** | **Boolean**| Whether to return multilingual symbol description | [optional]
 **page** | **Integer**| Page number, defaults to 1 | [optional]
 **pageSize** | **Integer**| Page size, defaults to 10, max 500; server caps at 500 | [optional]

### Return type

[**Symbols2**](Symbols2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockSymbolDetail"></a>
# **queryStockSymbolDetail**
> SymbolDetail queryStockSymbolDetail().symbols(symbols).exchange(exchange).page(page).pageSize(pageSize).execute();

Query symbol details

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        StockApi apiInstance = new StockApi(defaultClient);
        String symbols = "AAPL,TSLA"; // String | Symbol list, multiple separated by commas
        String exchange = "us"; // String | Exchange, supports us, hk, and kr
        Integer page = 1; // Integer | Page number, defaults to 1
        Integer pageSize = 100; // Integer | Page size, defaults to 10, max 500; server caps at 500
        try {
            SymbolDetail result = apiInstance.queryStockSymbolDetail()
                        .symbols(symbols)
                        .exchange(exchange)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockSymbolDetail");
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
 **symbols** | **String**| Symbol list, multiple separated by commas | [optional]
 **exchange** | **String**| Exchange, supports us, hk, and kr | [optional] [enum: us, hk, kr]
 **page** | **Integer**| Page number, defaults to 1 | [optional]
 **pageSize** | **Integer**| Page size, defaults to 10, max 500; server caps at 500 | [optional]

### Return type

[**SymbolDetail**](SymbolDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockOrderBook"></a>
# **queryStockOrderBook**
> OrderBook2 queryStockOrderBook(symbol)

Query market order book

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        StockApi apiInstance = new StockApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol
        try {
            OrderBook2 result = apiInstance.queryStockOrderBook(symbol);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockOrderBook");
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
 **symbol** | **String**| Symbol |

### Return type

[**OrderBook2**](OrderBook2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockOrderList"></a>
# **queryStockOrderList**
> OrderList2 queryStockOrderList().symbol(symbol).execute();

Query open order list

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol
        try {
            OrderList2 result = apiInstance.queryStockOrderList()
                        .symbol(symbol)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockOrderList");
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
 **symbol** | **String**| Symbol | [optional]

### Return type

[**OrderList2**](OrderList2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="createStockOrder"></a>
# **createStockOrder**
> CreateOrder2 createStockOrder(tradFiSpotOrderRequest)

Create order

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        TradFiSpotOrderRequest tradFiSpotOrderRequest = new TradFiSpotOrderRequest(); // TradFiSpotOrderRequest | 
        try {
            CreateOrder2 result = apiInstance.createStockOrder(tradFiSpotOrderRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#createStockOrder");
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
 **tradFiSpotOrderRequest** | [**TradFiSpotOrderRequest**](TradFiSpotOrderRequest.md)|  |

### Return type

[**CreateOrder2**](CreateOrder2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order placed successfully |  -  |
**400** | Request failed |  -  |

<a name="deleteAllStockOrders"></a>
# **deleteAllStockOrders**
> DeleteOrder deleteAllStockOrders()

Cancel all open orders

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        try {
            DeleteOrder result = apiInstance.deleteAllStockOrders();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#deleteAllStockOrders");
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

[**DeleteOrder**](DeleteOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockOrderHistory"></a>
# **queryStockOrderHistory**
> OrderHistoryList2 queryStockOrderHistory().symbol(symbol).orderIds(orderIds).beginTime(beginTime).endTime(endTime).side(side).page(page).pageSize(pageSize).execute();

Query historical order list

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        String symbol = "AAPL"; // String | Symbol
        String orderIds = "123456,123457"; // String | Order ID list, multiple separated by commas; max 20, each must be a positive integer
        Integer beginTime = 1769378400; // Integer | Start time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be >= begin_time, query range must not exceed 3 months.
        Integer endTime = 1769464800; // Integer | End time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be >= begin_time, query range must not exceed 3 months.
        Integer side = 2; // Integer | Side (1=sell, 2=buy)
        Integer page = 1; // Integer | Page number, defaults to 1
        Integer pageSize = 100; // Integer | Page size, defaults to 10, max 500; server caps at 500
        try {
            OrderHistoryList2 result = apiInstance.queryStockOrderHistory()
                        .symbol(symbol)
                        .orderIds(orderIds)
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .side(side)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockOrderHistory");
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
 **symbol** | **String**| Symbol | [optional]
 **orderIds** | **String**| Order ID list, multiple separated by commas; max 20, each must be a positive integer | [optional]
 **beginTime** | **Integer**| Start time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be &gt;&#x3D; begin_time, query range must not exceed 3 months. | [optional]
 **endTime** | **Integer**| End time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be &gt;&#x3D; begin_time, query range must not exceed 3 months. | [optional]
 **side** | **Integer**| Side (1&#x3D;sell, 2&#x3D;buy) | [optional] [enum: 1, 2]
 **page** | **Integer**| Page number, defaults to 1 | [optional]
 **pageSize** | **Integer**| Page size, defaults to 10, max 500; server caps at 500 | [optional]

### Return type

[**OrderHistoryList2**](OrderHistoryList2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="updateStockOrder"></a>
# **updateStockOrder**
> UpdateOrder2 updateStockOrder(orderId, tradFiSpotOrderUpdateRequest)

Modify order

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        Long orderId = 123456L; // Long | Order ID
        TradFiSpotOrderUpdateRequest tradFiSpotOrderUpdateRequest = new TradFiSpotOrderUpdateRequest(); // TradFiSpotOrderUpdateRequest | 
        try {
            UpdateOrder2 result = apiInstance.updateStockOrder(orderId, tradFiSpotOrderUpdateRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#updateStockOrder");
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
 **orderId** | **Long**| Order ID |
 **tradFiSpotOrderUpdateRequest** | [**TradFiSpotOrderUpdateRequest**](TradFiSpotOrderUpdateRequest.md)|  |

### Return type

[**UpdateOrder2**](UpdateOrder2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="deleteStockOrder"></a>
# **deleteStockOrder**
> DeleteOrder deleteStockOrder(orderId)

Cancel order

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        Long orderId = 123456L; // Long | Order ID
        try {
            DeleteOrder result = apiInstance.deleteStockOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#deleteStockOrder");
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
 **orderId** | **Long**| Order ID |

### Return type

[**DeleteOrder**](DeleteOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockPositions"></a>
# **queryStockPositions**
> PositionList2 queryStockPositions().pnlCalcType(pnlCalcType).pnlCalcPrice(pnlCalcPrice).symbol(symbol).exchange(exchange).execute();

Query current position list

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        Integer pnlCalcType = 1; // Integer | PnL calculation cost type. Defaults to average cost price when omitted (1 = average cost price, 2 = diluted cost price)
        Integer pnlCalcPrice = 1; // Integer | PnL calculation price type. Defaults to intraday price when omitted (1 = intraday price, 2 = latest extended-hours price)
        String symbol = "AAPL"; // String | Symbol
        String exchange = "us"; // String | Exchange, supports us, hk, and kr
        try {
            PositionList2 result = apiInstance.queryStockPositions()
                        .pnlCalcType(pnlCalcType)
                        .pnlCalcPrice(pnlCalcPrice)
                        .symbol(symbol)
                        .exchange(exchange)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockPositions");
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
 **pnlCalcType** | **Integer**| PnL calculation cost type. Defaults to average cost price when omitted (1 &#x3D; average cost price, 2 &#x3D; diluted cost price) | [optional] [enum: 1, 2]
 **pnlCalcPrice** | **Integer**| PnL calculation price type. Defaults to intraday price when omitted (1 &#x3D; intraday price, 2 &#x3D; latest extended-hours price) | [optional] [enum: 1, 2]
 **symbol** | **String**| Symbol | [optional]
 **exchange** | **String**| Exchange, supports us, hk, and kr | [optional] [enum: us, hk, kr]

### Return type

[**PositionList2**](PositionList2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="closeStockPosition"></a>
# **closeStockPosition**
> ClosePosition closeStockPosition(tradFiSpotClosePositionRequest)

Close position

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        TradFiSpotClosePositionRequest tradFiSpotClosePositionRequest = new TradFiSpotClosePositionRequest(); // TradFiSpotClosePositionRequest | 
        try {
            ClosePosition result = apiInstance.closeStockPosition(tradFiSpotClosePositionRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#closeStockPosition");
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
 **tradFiSpotClosePositionRequest** | [**TradFiSpotClosePositionRequest**](TradFiSpotClosePositionRequest.md)|  |

### Return type

[**ClosePosition**](ClosePosition.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockTransactions"></a>
# **queryStockTransactions**
> TransactionList2 queryStockTransactions().beginTime(beginTime).endTime(endTime).refId(refId).type(type).page(page).pageSize(pageSize).execute();

Query transaction records

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        Long beginTime = 1769378400L; // Long | Start time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be >= begin_time, query range must not exceed 3 months.
        Long endTime = 1769464800L; // Long | End time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be >= begin_time, query range must not exceed 3 months.
        String refId = "transfer-202607070001"; // String | Business idempotent ID. When ref_id is provided, the server queries by ref_id, ignoring other parameters such as begin_time, end_time, type, page, page_size
        String type = "deposit"; // String | Transaction type
        Integer page = 1; // Integer | Page number, defaults to 1
        Integer pageSize = 100; // Integer | Page size, defaults to 10, max 500; server caps at 500
        try {
            TransactionList2 result = apiInstance.queryStockTransactions()
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .refId(refId)
                        .type(type)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockTransactions");
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
 **beginTime** | **Long**| Start time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be &gt;&#x3D; begin_time, query range must not exceed 3 months. | [optional]
 **endTime** | **Long**| End time (Unix timestamp, seconds). When both begin_time and end_time are provided, end_time must be &gt;&#x3D; begin_time, query range must not exceed 3 months. | [optional]
 **refId** | **String**| Business idempotent ID. When ref_id is provided, the server queries by ref_id, ignoring other parameters such as begin_time, end_time, type, page, page_size | [optional]
 **type** | **String**| Transaction type | [optional] [enum: deposit, withdraw, fee, dividend, sell, buy, award, stock_transfer_in, stock_transfer_out]
 **page** | **Integer**| Page number, defaults to 1 | [optional]
 **pageSize** | **Integer**| Page size, defaults to 10, max 500; server caps at 500 | [optional]

### Return type

[**TransactionList2**](TransactionList2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="createStockTransaction"></a>
# **createStockTransaction**
> CreateTransaction2 createStockTransaction(tradFiSpotTransactionRequest)

Fund transfer

Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        StockApi apiInstance = new StockApi(defaultClient);
        TradFiSpotTransactionRequest tradFiSpotTransactionRequest = new TradFiSpotTransactionRequest(); // TradFiSpotTransactionRequest | 
        try {
            CreateTransaction2 result = apiInstance.createStockTransaction(tradFiSpotTransactionRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#createStockTransaction");
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
 **tradFiSpotTransactionRequest** | [**TradFiSpotTransactionRequest**](TradFiSpotTransactionRequest.md)|  |

### Return type

[**CreateTransaction2**](CreateTransaction2.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockExchanges"></a>
# **queryStockExchanges**
> Exchanges queryStockExchanges()

Query supported exchanges

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        StockApi apiInstance = new StockApi(defaultClient);
        try {
            Exchanges result = apiInstance.queryStockExchanges();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockExchanges");
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

[**Exchanges**](Exchanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

<a name="queryStockFeeRate"></a>
# **queryStockFeeRate**
> FeeRate queryStockFeeRate()

Query fee rates for Japanese and Korean stocks

Query fee rates for Japanese and Korean stocks. Rate limit: 5 qps.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.StockApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        StockApi apiInstance = new StockApi(defaultClient);
        try {
            FeeRate result = apiInstance.queryStockFeeRate();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling StockApi#queryStockFeeRate");
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

[**FeeRate**](FeeRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request success |  -  |
**400** | Request failed |  -  |

