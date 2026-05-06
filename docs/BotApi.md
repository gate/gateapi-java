# BotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAIHubStrategyRecommend**](BotApi.md#getAIHubStrategyRecommend) | **GET** /bot/strategy/recommend | Get AIHub strategy recommendations
[**postAIHubSpotGridCreate**](BotApi.md#postAIHubSpotGridCreate) | **POST** /bot/spot-grid/create | Create spot grid
[**postAIHubMarginGridCreate**](BotApi.md#postAIHubMarginGridCreate) | **POST** /bot/margin-grid/create | Create a lever grid
[**postAIHubInfiniteGridCreate**](BotApi.md#postAIHubInfiniteGridCreate) | **POST** /bot/infinite-grid/create | Create infinite grid
[**postAIHubFuturesGridCreate**](BotApi.md#postAIHubFuturesGridCreate) | **POST** /bot/futures-grid/create | Create a contract grid
[**postAIHubSpotMartingaleCreate**](BotApi.md#postAIHubSpotMartingaleCreate) | **POST** /bot/spot-martingale/create | Create Spot Martin
[**postAIHubContractMartingaleCreate**](BotApi.md#postAIHubContractMartingaleCreate) | **POST** /bot/contract-martingale/create | Create contract martin
[**getAIHubPortfolioRunning**](BotApi.md#getAIHubPortfolioRunning) | **GET** /bot/portfolio/running | Query the list of running policies
[**getAIHubPortfolioDetail**](BotApi.md#getAIHubPortfolioDetail) | **GET** /bot/portfolio/detail | Query order policy details
[**postAIHubPortfolioStop**](BotApi.md#postAIHubPortfolioStop) | **POST** /bot/portfolio/stop | Terminate a single running policy


<a name="getAIHubStrategyRecommend"></a>
# **getAIHubStrategyRecommend**
> AIHubDiscoverSuccessResponse getAIHubStrategyRecommend().market(market).strategyType(strategyType).direction(direction).investAmount(investAmount).scene(scene).refreshRecommendationId(refreshRecommendationId).limit(limit).maxDrawdownLte(maxDrawdownLte).backtestAprGte(backtestAprGte).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

Get AIHub strategy recommendations

discover 域唯一正式接口。  支持场景： - &#x60;top1&#x60; - &#x60;bundle&#x60; - &#x60;filter&#x60; - &#x60;refresh&#x60;  约束： - 主动推荐池仅包含 &#x60;spot_grid&#x60;、&#x60;futures_grid&#x60;、&#x60;spot_martingale&#x60; - 可返回但不主动推荐 &#x60;infinite_grid&#x60;、&#x60;margin_grid&#x60; - 不得返回 &#x60;contract_martingale&#x60;、&#x60;smart-position&#x60;、&#x60;spot-future-arbitrage&#x60; - &#x60;scene&#x3D;filter&#x60; 时只允许按 &#x60;market&#x60;、&#x60;backtest_apr_gte&#x60;、&#x60;max_drawdown_lte&#x60; 过滤 - &#x60;scene&#x3D;refresh&#x60; 通过 &#x60;refresh_recommendation_id&#x60; 承接刷新上下文；正式最小格式只要求 &#x60;strategy_type|market&#x60; - 若上游直接透传上一条推荐的 &#x60;recommendation_id&#x60;，其中第三段 &#x60;backtest_id&#x60; 当前会被忽略

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        String market = "market_example"; // String | Trading pair, such as `BTC_USDT`
        String strategyType = "strategyType_example"; // String | Recommended target policy type; `contract_martingale` not allowed
        String direction = "direction_example"; // String | Market direction
        String investAmount = "investAmount_example"; // String | Investment amount, string transparent transmission
        String scene = "scene_example"; // String | Recommended scenario; when empty, bot-service can automatically infer according to the implementation logic.
        String refreshRecommendationId = "refreshRecommendationId_example"; // String | It is recommended to refresh the context. Used when `scene=refresh` is used; when `scene` is empty but the field exists, bot-service will also automatically determine as `refresh`. The official minimum format is `strategy_type|market`; if the `recommendation_id` of the previous recommendation is directly passed through, the third paragraph `backtest_id` will be ignored.
        Integer limit = 56; // Integer | Return quantity; when `scene=filter` is used, the actual results are up to 10
        String maxDrawdownLte = "maxDrawdownLte_example"; // String | Maximum drawdown limit
        String backtestAprGte = "backtestAprGte_example"; // String | Backtest annualized lower limit
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubDiscoverSuccessResponse result = apiInstance.getAIHubStrategyRecommend()
                        .market(market)
                        .strategyType(strategyType)
                        .direction(direction)
                        .investAmount(investAmount)
                        .scene(scene)
                        .refreshRecommendationId(refreshRecommendationId)
                        .limit(limit)
                        .maxDrawdownLte(maxDrawdownLte)
                        .backtestAprGte(backtestAprGte)
                        .xGateServiceId(xGateServiceId)
                        .xGateAppLang(xGateAppLang)
                        .xRequestId(xRequestId)
                        .xTraceId(xTraceId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#getAIHubStrategyRecommend");
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
 **market** | **String**| Trading pair, such as &#x60;BTC_USDT&#x60; | [optional]
 **strategyType** | **String**| Recommended target policy type; &#x60;contract_martingale&#x60; not allowed | [optional] [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale]
 **direction** | **String**| Market direction | [optional] [enum: buy, sell, neutral]
 **investAmount** | **String**| Investment amount, string transparent transmission | [optional]
 **scene** | **String**| Recommended scenario; when empty, bot-service can automatically infer according to the implementation logic. | [optional] [enum: top1, bundle, filter, refresh]
 **refreshRecommendationId** | **String**| It is recommended to refresh the context. Used when &#x60;scene&#x3D;refresh&#x60; is used; when &#x60;scene&#x60; is empty but the field exists, bot-service will also automatically determine as &#x60;refresh&#x60;. The official minimum format is &#x60;strategy_type|market&#x60;; if the &#x60;recommendation_id&#x60; of the previous recommendation is directly passed through, the third paragraph &#x60;backtest_id&#x60; will be ignored. | [optional]
 **limit** | **Integer**| Return quantity; when &#x60;scene&#x3D;filter&#x60; is used, the actual results are up to 10 | [optional]
 **maxDrawdownLte** | **String**| Maximum drawdown limit | [optional]
 **backtestAprGte** | **String**| Backtest annualized lower limit | [optional]
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubDiscoverSuccessResponse**](AIHubDiscoverSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubSpotGridCreate"></a>
# **postAIHubSpotGridCreate**
> AIHubCreateSuccessResponse postAIHubSpotGridCreate(spotGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create spot grid

Create a spot grid strategy based on the incoming parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        SpotGridCreateRequest spotGridCreateRequest = new SpotGridCreateRequest(); // SpotGridCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubSpotGridCreate(spotGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubSpotGridCreate");
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
 **spotGridCreateRequest** | [**SpotGridCreateRequest**](SpotGridCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubMarginGridCreate"></a>
# **postAIHubMarginGridCreate**
> AIHubCreateSuccessResponse postAIHubMarginGridCreate(marginGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create a lever grid

Create a leverage grid strategy based on the passed parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        MarginGridCreateRequest marginGridCreateRequest = new MarginGridCreateRequest(); // MarginGridCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubMarginGridCreate(marginGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubMarginGridCreate");
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
 **marginGridCreateRequest** | [**MarginGridCreateRequest**](MarginGridCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubInfiniteGridCreate"></a>
# **postAIHubInfiniteGridCreate**
> AIHubCreateSuccessResponse postAIHubInfiniteGridCreate(infiniteGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create infinite grid

Create an infinite grid strategy based on passed parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        InfiniteGridCreateRequest infiniteGridCreateRequest = new InfiniteGridCreateRequest(); // InfiniteGridCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubInfiniteGridCreate(infiniteGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubInfiniteGridCreate");
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
 **infiniteGridCreateRequest** | [**InfiniteGridCreateRequest**](InfiniteGridCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubFuturesGridCreate"></a>
# **postAIHubFuturesGridCreate**
> AIHubCreateSuccessResponse postAIHubFuturesGridCreate(futuresGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create a contract grid

Create a contract grid strategy based on the incoming parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        FuturesGridCreateRequest futuresGridCreateRequest = new FuturesGridCreateRequest(); // FuturesGridCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubFuturesGridCreate(futuresGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubFuturesGridCreate");
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
 **futuresGridCreateRequest** | [**FuturesGridCreateRequest**](FuturesGridCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubSpotMartingaleCreate"></a>
# **postAIHubSpotMartingaleCreate**
> AIHubCreateSuccessResponse postAIHubSpotMartingaleCreate(spotMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create Spot Martin

根据传入参数创建现货马丁策略。  止损口径与 App / &#x60;MartingaleBot&#x60; 一致： - 使用 **&#x60;create_params.stop_loss_per_cycle&#x60;**（每轮止损比例，小数字符串），**不要**使用 &#x60;stop_loss_price&#x60; 表达创建侧止损。 - 详情页展示的「止损价」由引擎按轮次计算；创建侧可选 **&#x60;create_params.trigger_price&#x60;**（触发价）。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        SpotMartingaleCreateRequest spotMartingaleCreateRequest = new SpotMartingaleCreateRequest(); // SpotMartingaleCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubSpotMartingaleCreate(spotMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubSpotMartingaleCreate");
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
 **spotMartingaleCreateRequest** | [**SpotMartingaleCreateRequest**](SpotMartingaleCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubContractMartingaleCreate"></a>
# **postAIHubContractMartingaleCreate**
> AIHubCreateSuccessResponse postAIHubContractMartingaleCreate(contractMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Create contract martin

Create a contract Martin strategy based on the input parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        ContractMartingaleCreateRequest contractMartingaleCreateRequest = new ContractMartingaleCreateRequest(); // ContractMartingaleCreateRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubCreateSuccessResponse result = apiInstance.postAIHubContractMartingaleCreate(contractMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubContractMartingaleCreate");
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
 **contractMartingaleCreateRequest** | [**ContractMartingaleCreateRequest**](ContractMartingaleCreateRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubCreateSuccessResponse**](AIHubCreateSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="getAIHubPortfolioRunning"></a>
# **getAIHubPortfolioRunning**
> AIHubPortfolioRunningSuccessResponse getAIHubPortfolioRunning().strategyType(strategyType).market(market).page(page).pageSize(pageSize).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

Query the list of running policies

Query the list of AIHub strategies currently running by the user, and support filtering by strategy type, trading pair and paging conditions.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        String strategyType = "strategyType_example"; // String | Filter by policy type
        String market = "market_example"; // String | Filter by trading pair
        Integer page = 1; // Integer | Page number, default 1
        Integer pageSize = 20; // Integer | Paging size, default 20, maximum 50
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubPortfolioRunningSuccessResponse result = apiInstance.getAIHubPortfolioRunning()
                        .strategyType(strategyType)
                        .market(market)
                        .page(page)
                        .pageSize(pageSize)
                        .xGateServiceId(xGateServiceId)
                        .xGateAppLang(xGateAppLang)
                        .xRequestId(xRequestId)
                        .xTraceId(xTraceId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#getAIHubPortfolioRunning");
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
 **strategyType** | **String**| Filter by policy type | [optional] [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale, contract_martingale]
 **market** | **String**| Filter by trading pair | [optional]
 **page** | **Integer**| Page number, default 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Paging size, default 20, maximum 50 | [optional] [default to 20]
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubPortfolioRunningSuccessResponse**](AIHubPortfolioRunningSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="getAIHubPortfolioDetail"></a>
# **getAIHubPortfolioDetail**
> AIHubPortfolioDetailSuccessResponse getAIHubPortfolioDetail(strategyId, strategyType).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

Query order policy details

Both &#x60;strategy_id&#x60; and &#x60;strategy_type&#x60; must be passed in the request, where &#x60;strategy_type&#x60; is used to distribute to the underlying detailed implementation by strategy type.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        String strategyId = "strategyId_example"; // String | Policy ID
        String strategyType = "strategyType_example"; // String | Policy type; used for underlying detail distribution
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubPortfolioDetailSuccessResponse result = apiInstance.getAIHubPortfolioDetail(strategyId, strategyType)
                        .xGateServiceId(xGateServiceId)
                        .xGateAppLang(xGateAppLang)
                        .xRequestId(xRequestId)
                        .xTraceId(xTraceId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#getAIHubPortfolioDetail");
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
 **strategyId** | **String**| Policy ID |
 **strategyType** | **String**| Policy type; used for underlying detail distribution | [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale, contract_martingale]
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubPortfolioDetailSuccessResponse**](AIHubPortfolioDetailSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

<a name="postAIHubPortfolioStop"></a>
# **postAIHubPortfolioStop**
> AIHubPortfolioStopSuccessResponse postAIHubPortfolioStop(aiHubPortfolioStopRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

Terminate a single running policy

Only one policy is allowed to be terminated per request. Risk warning and secondary confirmation are borne by the upper layer of OpenClaw; this interface is only responsible for executing stop.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.BotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        BotApi apiInstance = new BotApi(defaultClient);
        AIHubPortfolioStopRequest aiHubPortfolioStopRequest = new AIHubPortfolioStopRequest(); // AIHubPortfolioStopRequest | 
        String xGateServiceId = "xGateServiceId_example"; // String | Call source identifier; injected by APIv4 if necessary
        String xGateAppLang = "xGateAppLang_example"; // String | Language context, such as `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | Request link ID; caller can transmit transparently
        String xTraceId = "xTraceId_example"; // String | trace header; can be generated uniformly by APIv4
        try {
            AIHubPortfolioStopSuccessResponse result = apiInstance.postAIHubPortfolioStop(aiHubPortfolioStopRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling BotApi#postAIHubPortfolioStop");
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
 **aiHubPortfolioStopRequest** | [**AIHubPortfolioStopRequest**](AIHubPortfolioStopRequest.md)|  |
 **xGateServiceId** | **String**| Call source identifier; injected by APIv4 if necessary | [optional]
 **xGateAppLang** | **String**| Language context, such as &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| Request link ID; caller can transmit transparently | [optional]
 **xTraceId** | **String**| trace header; can be generated uniformly by APIv4 | [optional]

### Return type

[**AIHubPortfolioStopSuccessResponse**](AIHubPortfolioStopSuccessResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Unified business response |  -  |

