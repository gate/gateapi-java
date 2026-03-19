# TradFiApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryMt5AccountInfo**](TradFiApi.md#queryMt5AccountInfo) | **GET** /tradfi/users/mt5-account | Query MT5 account information
[**queryCategories**](TradFiApi.md#queryCategories) | **GET** /tradfi/symbols/categories | Query trading symbol categories
[**querySymbols**](TradFiApi.md#querySymbols) | **GET** /tradfi/symbols | Query trading symbol list
[**querySymbolDetail**](TradFiApi.md#querySymbolDetail) | **GET** /tradfi/symbols/detail | Query trading symbol details
[**querySymbolKline**](TradFiApi.md#querySymbolKline) | **GET** /tradfi/symbols/{symbol}/klines | Query trading symbol klines
[**querySymbolTicker**](TradFiApi.md#querySymbolTicker) | **GET** /tradfi/symbols/{symbol}/tickers | Query trading symbol ticker
[**createTradFiUser**](TradFiApi.md#createTradFiUser) | **POST** /tradfi/users | Create TradFi user
[**queryUserAssets**](TradFiApi.md#queryUserAssets) | **GET** /tradfi/users/assets | Query account assets
[**queryTransaction**](TradFiApi.md#queryTransaction) | **GET** /tradfi/transactions | Query Fund Transfer In/Out Records
[**createTransaction**](TradFiApi.md#createTransaction) | **POST** /tradfi/transactions | Fund Deposit and Withdrawal
[**queryOrderList**](TradFiApi.md#queryOrderList) | **GET** /tradfi/orders | Query active order list
[**createTradFiOrder**](TradFiApi.md#createTradFiOrder) | **POST** /tradfi/orders | Create an order
[**updateOrder**](TradFiApi.md#updateOrder) | **PUT** /tradfi/orders/{order_id} | Modify order
[**deleteOrder**](TradFiApi.md#deleteOrder) | **DELETE** /tradfi/orders/{order_id} | Cancel order
[**queryOrderHistoryList**](TradFiApi.md#queryOrderHistoryList) | **GET** /tradfi/orders/history | Query historical order list
[**queryPositionList**](TradFiApi.md#queryPositionList) | **GET** /tradfi/positions | Query active position list
[**updatePosition**](TradFiApi.md#updatePosition) | **PUT** /tradfi/positions/{position_id} | Modify position
[**closePosition**](TradFiApi.md#closePosition) | **POST** /tradfi/positions/{position_id}/close | Close position
[**queryPositionHistoryList**](TradFiApi.md#queryPositionHistoryList) | **GET** /tradfi/positions/history | Query historical position list


<a name="queryMt5AccountInfo"></a>
# **queryMt5AccountInfo**
> Mt5Account queryMt5AccountInfo()

Query MT5 account information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            Mt5Account result = apiInstance.queryMt5AccountInfo();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryMt5AccountInfo");
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

[**Mt5Account**](Mt5Account.md)

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

<a name="queryCategories"></a>
# **queryCategories**
> Categories queryCategories()

Query trading symbol categories

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            Categories result = apiInstance.queryCategories();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryCategories");
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

[**Categories**](Categories.md)

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

<a name="querySymbols"></a>
# **querySymbols**
> Symbols querySymbols()

Query trading symbol list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            Symbols result = apiInstance.querySymbols();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#querySymbols");
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

[**Symbols**](Symbols.md)

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

<a name="querySymbolDetail"></a>
# **querySymbolDetail**
> ContractDetail querySymbolDetail(symbols)

Query trading symbol details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        String symbols = "EURUSD,XAGUSD"; // String | Trading symbol code list (comma-separated, max 10 symbols)
        try {
            ContractDetail result = apiInstance.querySymbolDetail(symbols);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#querySymbolDetail");
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
 **symbols** | **String**| Trading symbol code list (comma-separated, max 10 symbols) |

### Return type

[**ContractDetail**](ContractDetail.md)

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

<a name="querySymbolKline"></a>
# **querySymbolKline**
> Klines querySymbolKline(symbol, klineType).beginTime(beginTime).endTime(endTime).limit(limit).execute();

Query trading symbol klines

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        String symbol = "EURUSD"; // String | Trading symbol code
        String klineType = "1m"; // String | Kline type (time period)
        Long beginTime = 1769378400L; // Long | Start time (Unix timestamp in seconds)
        Long endTime = 1769464800L; // Long | End time (Unix timestamp in seconds)
        Integer limit = 100; // Integer | Kline limit (max 500, error if exceeded)
        try {
            Klines result = apiInstance.querySymbolKline(symbol, klineType)
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#querySymbolKline");
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
 **symbol** | **String**| Trading symbol code |
 **klineType** | **String**| Kline type (time period) | [enum: 1m, 15m, 1h, 4h, 1d, 7d, 30d]
 **beginTime** | **Long**| Start time (Unix timestamp in seconds) | [optional]
 **endTime** | **Long**| End time (Unix timestamp in seconds) | [optional]
 **limit** | **Integer**| Kline limit (max 500, error if exceeded) | [optional]

### Return type

[**Klines**](Klines.md)

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

<a name="querySymbolTicker"></a>
# **querySymbolTicker**
> TradFiTicker querySymbolTicker(symbol)

Query trading symbol ticker

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        String symbol = "EURUSD"; // String | Trading symbol code
        try {
            TradFiTicker result = apiInstance.querySymbolTicker(symbol);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#querySymbolTicker");
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
 **symbol** | **String**| Trading symbol code |

### Return type

[**TradFiTicker**](TradFiTicker.md)

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

<a name="createTradFiUser"></a>
# **createTradFiUser**
> CreateUserResp createTradFiUser()

Create TradFi user

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            CreateUserResp result = apiInstance.createTradFiUser();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#createTradFiUser");
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

[**CreateUserResp**](CreateUserResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Account opened successfully |  -  |
**400** | Request failed |  -  |

<a name="queryUserAssets"></a>
# **queryUserAssets**
> UserAssetResp queryUserAssets()

Query account assets

Query account assets

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            UserAssetResp result = apiInstance.queryUserAssets();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryUserAssets");
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

[**UserAssetResp**](UserAssetResp.md)

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

<a name="queryTransaction"></a>
# **queryTransaction**
> TransactionList queryTransaction().beginTime(beginTime).endTime(endTime).type(type).page(page).pageSize(pageSize).execute();

Query Fund Transfer In/Out Records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Long beginTime = 1704067200L; // Long | Start Time (Second-level Timestamp)
        Long endTime = 1706745599L; // Long | End Time (Second-level Timestamp)
        String type = "withdraw"; // String | Transaction Type (deposit - transfer in, withdraw - transfer out, dividend - dividend payment, fill_negative - cover negative balance)
        Integer page = 1; // Integer | page number
        Integer pageSize = 20; // Integer | Number per page, default 10, maximum 50
        try {
            TransactionList result = apiInstance.queryTransaction()
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .type(type)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryTransaction");
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
 **beginTime** | **Long**| Start Time (Second-level Timestamp) | [optional]
 **endTime** | **Long**| End Time (Second-level Timestamp) | [optional]
 **type** | **String**| Transaction Type (deposit - transfer in, withdraw - transfer out, dividend - dividend payment, fill_negative - cover negative balance) | [optional] [enum: deposit, withdraw, dividend, fill_negative]
 **page** | **Integer**| page number | [optional]
 **pageSize** | **Integer**| Number per page, default 10, maximum 50 | [optional]

### Return type

[**TransactionList**](TransactionList.md)

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

<a name="createTransaction"></a>
# **createTransaction**
> CreateTransaction createTransaction(tradFiTransactionRequest)

Fund Deposit and Withdrawal

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        TradFiTransactionRequest tradFiTransactionRequest = new TradFiTransactionRequest(); // TradFiTransactionRequest | 
        try {
            CreateTransaction result = apiInstance.createTransaction(tradFiTransactionRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#createTransaction");
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
 **tradFiTransactionRequest** | [**TradFiTransactionRequest**](TradFiTransactionRequest.md)|  |

### Return type

[**CreateTransaction**](CreateTransaction.md)

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

<a name="queryOrderList"></a>
# **queryOrderList**
> OrderList queryOrderList()

Query active order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            OrderList result = apiInstance.queryOrderList();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryOrderList");
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

[**OrderList**](OrderList.md)

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

<a name="createTradFiOrder"></a>
# **createTradFiOrder**
> CreateOrder createTradFiOrder(tradFiOrderRequest)

Create an order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        TradFiOrderRequest tradFiOrderRequest = new TradFiOrderRequest(); // TradFiOrderRequest | 
        try {
            CreateOrder result = apiInstance.createTradFiOrder(tradFiOrderRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#createTradFiOrder");
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
 **tradFiOrderRequest** | [**TradFiOrderRequest**](TradFiOrderRequest.md)|  |

### Return type

[**CreateOrder**](CreateOrder.md)

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

<a name="updateOrder"></a>
# **updateOrder**
> UpdateOrder updateOrder(orderId, tradFiOrderUpdateRequest)

Modify order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Integer orderId = 1223; // Integer | Order ID
        TradFiOrderUpdateRequest tradFiOrderUpdateRequest = new TradFiOrderUpdateRequest(); // TradFiOrderUpdateRequest | 
        try {
            UpdateOrder result = apiInstance.updateOrder(orderId, tradFiOrderUpdateRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#updateOrder");
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
 **orderId** | **Integer**| Order ID |
 **tradFiOrderUpdateRequest** | [**TradFiOrderUpdateRequest**](TradFiOrderUpdateRequest.md)|  |

### Return type

[**UpdateOrder**](UpdateOrder.md)

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

<a name="deleteOrder"></a>
# **deleteOrder**
> Object deleteOrder(orderId)

Cancel order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Integer orderId = 1223; // Integer | Order ID
        try {
            Object result = apiInstance.deleteOrder(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#deleteOrder");
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
 **orderId** | **Integer**| Order ID |

### Return type

**Object**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Deleted successfully |  -  |
**400** | Request failed |  -  |

<a name="queryOrderHistoryList"></a>
# **queryOrderHistoryList**
> OrderHistoryList queryOrderHistoryList().beginTime(beginTime).endTime(endTime).symbol(symbol).side(side).execute();

Query historical order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Long beginTime = 1769397000L; // Long | Start time (Unix timestamp in seconds), earliest query is one month ago
        Long endTime = 1769398000L; // Long | End time (Unix timestamp in seconds)
        String symbol = "USDCAD"; // String | Currency pair
        Integer side = 2; // Integer | Order side (1=sell, 2=buy)
        try {
            OrderHistoryList result = apiInstance.queryOrderHistoryList()
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .symbol(symbol)
                        .side(side)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryOrderHistoryList");
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
 **beginTime** | **Long**| Start time (Unix timestamp in seconds), earliest query is one month ago | [optional]
 **endTime** | **Long**| End time (Unix timestamp in seconds) | [optional]
 **symbol** | **String**| Currency pair | [optional]
 **side** | **Integer**| Order side (1&#x3D;sell, 2&#x3D;buy) | [optional] [enum: 1, 2]

### Return type

[**OrderHistoryList**](OrderHistoryList.md)

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

<a name="queryPositionList"></a>
# **queryPositionList**
> PositionList queryPositionList()

Query active position list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        try {
            PositionList result = apiInstance.queryPositionList();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryPositionList");
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

[**PositionList**](PositionList.md)

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

<a name="updatePosition"></a>
# **updatePosition**
> UpdatePosition updatePosition(positionId, tradFiPositionUpdateRequest)

Modify position

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Integer positionId = 1223; // Integer | Position ID
        TradFiPositionUpdateRequest tradFiPositionUpdateRequest = new TradFiPositionUpdateRequest(); // TradFiPositionUpdateRequest | 
        try {
            UpdatePosition result = apiInstance.updatePosition(positionId, tradFiPositionUpdateRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#updatePosition");
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
 **positionId** | **Integer**| Position ID |
 **tradFiPositionUpdateRequest** | [**TradFiPositionUpdateRequest**](TradFiPositionUpdateRequest.md)|  |

### Return type

[**UpdatePosition**](UpdatePosition.md)

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

<a name="closePosition"></a>
# **closePosition**
> DeletePosition closePosition(positionId, tradFiClosePositionRequest)

Close position

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Integer positionId = 1223; // Integer | Position ID
        TradFiClosePositionRequest tradFiClosePositionRequest = new TradFiClosePositionRequest(); // TradFiClosePositionRequest | 
        try {
            DeletePosition result = apiInstance.closePosition(positionId, tradFiClosePositionRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#closePosition");
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
 **positionId** | **Integer**| Position ID |
 **tradFiClosePositionRequest** | [**TradFiClosePositionRequest**](TradFiClosePositionRequest.md)|  |

### Return type

[**DeletePosition**](DeletePosition.md)

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

<a name="queryPositionHistoryList"></a>
# **queryPositionHistoryList**
> PositionHistoryList queryPositionHistoryList().beginTime(beginTime).endTime(endTime).symbol(symbol).positionDir(positionDir).execute();

Query historical position list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.TradFiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        TradFiApi apiInstance = new TradFiApi(defaultClient);
        Long beginTime = 56L; // Long | Start Time (Unix Timestamp, seconds). The earliest queryable time is one month ago
        Long endTime = 56L; // Long | End time (timestamp in seconds)
        String symbol = "symbol_example"; // String | Trading symbol (e.g., EURUSD)
        String positionDir = "positionDir_example"; // String | Position direction (Long=long position, Short=short position)
        try {
            PositionHistoryList result = apiInstance.queryPositionHistoryList()
                        .beginTime(beginTime)
                        .endTime(endTime)
                        .symbol(symbol)
                        .positionDir(positionDir)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling TradFiApi#queryPositionHistoryList");
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
 **beginTime** | **Long**| Start Time (Unix Timestamp, seconds). The earliest queryable time is one month ago | [optional]
 **endTime** | **Long**| End time (timestamp in seconds) | [optional]
 **symbol** | **String**| Trading symbol (e.g., EURUSD) | [optional]
 **positionDir** | **String**| Position direction (Long&#x3D;long position, Short&#x3D;short position) | [optional] [enum: Long, Short]

### Return type

[**PositionHistoryList**](PositionHistoryList.md)

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

