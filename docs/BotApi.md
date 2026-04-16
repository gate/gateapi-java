# BotApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAIHubStrategyRecommend**](BotApi.md#getAIHubStrategyRecommend) | **GET** /bot/strategy/recommend | 获取 AIHub 策略推荐
[**postAIHubSpotGridCreate**](BotApi.md#postAIHubSpotGridCreate) | **POST** /bot/spot-grid/create | 创建现货网格
[**postAIHubMarginGridCreate**](BotApi.md#postAIHubMarginGridCreate) | **POST** /bot/margin-grid/create | 创建杠杆网格
[**postAIHubInfiniteGridCreate**](BotApi.md#postAIHubInfiniteGridCreate) | **POST** /bot/infinite-grid/create | 创建无限网格
[**postAIHubFuturesGridCreate**](BotApi.md#postAIHubFuturesGridCreate) | **POST** /bot/futures-grid/create | 创建合约网格
[**postAIHubSpotMartingaleCreate**](BotApi.md#postAIHubSpotMartingaleCreate) | **POST** /bot/spot-martingale/create | 创建现货马丁
[**postAIHubContractMartingaleCreate**](BotApi.md#postAIHubContractMartingaleCreate) | **POST** /bot/contract-martingale/create | 创建合约马丁
[**getAIHubPortfolioRunning**](BotApi.md#getAIHubPortfolioRunning) | **GET** /bot/portfolio/running | 查询运行中策略列表
[**getAIHubPortfolioDetail**](BotApi.md#getAIHubPortfolioDetail) | **GET** /bot/portfolio/detail | 查询单策略详情
[**postAIHubPortfolioStop**](BotApi.md#postAIHubPortfolioStop) | **POST** /bot/portfolio/stop | 终止单个运行中策略


<a name="getAIHubStrategyRecommend"></a>
# **getAIHubStrategyRecommend**
> AIHubDiscoverSuccessResponse getAIHubStrategyRecommend().market(market).strategyType(strategyType).direction(direction).investAmount(investAmount).scene(scene).refreshRecommendationId(refreshRecommendationId).limit(limit).maxDrawdownLte(maxDrawdownLte).backtestAprGte(backtestAprGte).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

获取 AIHub 策略推荐

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
        String market = "market_example"; // String | 交易对，例如 `BTC_USDT`
        String strategyType = "strategyType_example"; // String | 推荐目标策略类型；`contract_martingale` 不允许
        String direction = "direction_example"; // String | 行情方向
        String investAmount = "investAmount_example"; // String | 投入金额，字符串透传
        String scene = "scene_example"; // String | 推荐场景；为空时 bot-service 可按实现逻辑自动推断
        String refreshRecommendationId = "refreshRecommendationId_example"; // String | 推荐刷新上下文。`scene=refresh` 时使用；当 `scene` 为空但该字段存在时，bot-service 也会自动判定为 `refresh`。 正式最小格式为 `strategy_type|market`；若直接透传上一条推荐的 `recommendation_id`，第三段 `backtest_id` 会被忽略。
        Integer limit = 56; // Integer | 返回数量；`scene=filter` 时实际结果最多 10 条
        String maxDrawdownLte = "maxDrawdownLte_example"; // String | 最大回撤上限
        String backtestAprGte = "backtestAprGte_example"; // String | 回测年化下限
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **market** | **String**| 交易对，例如 &#x60;BTC_USDT&#x60; | [optional]
 **strategyType** | **String**| 推荐目标策略类型；&#x60;contract_martingale&#x60; 不允许 | [optional] [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale]
 **direction** | **String**| 行情方向 | [optional] [enum: buy, sell, neutral]
 **investAmount** | **String**| 投入金额，字符串透传 | [optional]
 **scene** | **String**| 推荐场景；为空时 bot-service 可按实现逻辑自动推断 | [optional] [enum: top1, bundle, filter, refresh]
 **refreshRecommendationId** | **String**| 推荐刷新上下文。&#x60;scene&#x3D;refresh&#x60; 时使用；当 &#x60;scene&#x60; 为空但该字段存在时，bot-service 也会自动判定为 &#x60;refresh&#x60;。 正式最小格式为 &#x60;strategy_type|market&#x60;；若直接透传上一条推荐的 &#x60;recommendation_id&#x60;，第三段 &#x60;backtest_id&#x60; 会被忽略。 | [optional]
 **limit** | **Integer**| 返回数量；&#x60;scene&#x3D;filter&#x60; 时实际结果最多 10 条 | [optional]
 **maxDrawdownLte** | **String**| 最大回撤上限 | [optional]
 **backtestAprGte** | **String**| 回测年化下限 | [optional]
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubSpotGridCreate"></a>
# **postAIHubSpotGridCreate**
> AIHubCreateSuccessResponse postAIHubSpotGridCreate(spotGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建现货网格

根据传入参数创建现货网格策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubMarginGridCreate"></a>
# **postAIHubMarginGridCreate**
> AIHubCreateSuccessResponse postAIHubMarginGridCreate(marginGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建杠杆网格

根据传入参数创建杠杆网格策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubInfiniteGridCreate"></a>
# **postAIHubInfiniteGridCreate**
> AIHubCreateSuccessResponse postAIHubInfiniteGridCreate(infiniteGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建无限网格

根据传入参数创建无限网格策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubFuturesGridCreate"></a>
# **postAIHubFuturesGridCreate**
> AIHubCreateSuccessResponse postAIHubFuturesGridCreate(futuresGridCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建合约网格

根据传入参数创建合约网格策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubSpotMartingaleCreate"></a>
# **postAIHubSpotMartingaleCreate**
> AIHubCreateSuccessResponse postAIHubSpotMartingaleCreate(spotMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建现货马丁

根据传入参数创建现货马丁策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubContractMartingaleCreate"></a>
# **postAIHubContractMartingaleCreate**
> AIHubCreateSuccessResponse postAIHubContractMartingaleCreate(contractMartingaleCreateRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

创建合约马丁

根据传入参数创建合约马丁策略。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="getAIHubPortfolioRunning"></a>
# **getAIHubPortfolioRunning**
> AIHubPortfolioRunningSuccessResponse getAIHubPortfolioRunning().strategyType(strategyType).market(market).page(page).pageSize(pageSize).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

查询运行中策略列表

查询当前用户运行中的 AIHub 策略列表，支持按策略类型、交易对和分页条件过滤。

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
        String strategyType = "strategyType_example"; // String | 按策略类型过滤
        String market = "market_example"; // String | 按交易对过滤
        Integer page = 1; // Integer | 页码，默认 1
        Integer pageSize = 20; // Integer | 分页大小，默认 20，最大 50
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **strategyType** | **String**| 按策略类型过滤 | [optional] [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale, contract_martingale]
 **market** | **String**| 按交易对过滤 | [optional]
 **page** | **Integer**| 页码，默认 1 | [optional] [default to 1]
 **pageSize** | **Integer**| 分页大小，默认 20，最大 50 | [optional] [default to 20]
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="getAIHubPortfolioDetail"></a>
# **getAIHubPortfolioDetail**
> AIHubPortfolioDetailSuccessResponse getAIHubPortfolioDetail(strategyId, strategyType).xGateServiceId(xGateServiceId).xGateAppLang(xGateAppLang).xRequestId(xRequestId).xTraceId(xTraceId).execute();

查询单策略详情

请求中必须同时传 &#x60;strategy_id&#x60; 与 &#x60;strategy_type&#x60;，其中 &#x60;strategy_type&#x60; 用于按策略类型分发到底层详情实现。

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
        String strategyId = "strategyId_example"; // String | 策略 ID
        String strategyType = "strategyType_example"; // String | 策略类型；用于底层详情分发
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **strategyId** | **String**| 策略 ID |
 **strategyType** | **String**| 策略类型；用于底层详情分发 | [enum: spot_grid, margin_grid, infinite_grid, futures_grid, spot_martingale, contract_martingale]
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

<a name="postAIHubPortfolioStop"></a>
# **postAIHubPortfolioStop**
> AIHubPortfolioStopSuccessResponse postAIHubPortfolioStop(aiHubPortfolioStopRequest, xGateServiceId, xGateAppLang, xRequestId, xTraceId)

终止单个运行中策略

单次请求只允许终止一个策略。 风险提示与二次确认由 OpenClaw 上层承担；本接口只负责执行 stop。

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
        String xGateServiceId = "xGateServiceId_example"; // String | 调用来源标识；如有需要由 APIv4 注入
        String xGateAppLang = "xGateAppLang_example"; // String | 语言上下文，例如 `zh-CN` / `en-US`
        String xRequestId = "xRequestId_example"; // String | 请求链路 ID；调用方可透传
        String xTraceId = "xTraceId_example"; // String | trace header；可由 APIv4 统一生成
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
 **xGateServiceId** | **String**| 调用来源标识；如有需要由 APIv4 注入 | [optional]
 **xGateAppLang** | **String**| 语言上下文，例如 &#x60;zh-CN&#x60; / &#x60;en-US&#x60; | [optional]
 **xRequestId** | **String**| 请求链路 ID；调用方可透传 | [optional]
 **xTraceId** | **String**| trace header；可由 APIv4 统一生成 | [optional]

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
**200** | 统一业务响应 |  -  |

