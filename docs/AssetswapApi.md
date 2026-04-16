# AssetswapApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAssetSwapAssets**](AssetswapApi.md#listAssetSwapAssets) | **GET** /asset-swap/asset/list | Portfolio optimization — currency list
[**getAssetSwapConfig**](AssetswapApi.md#getAssetSwapConfig) | **GET** /asset-swap/config | Portfolio optimization — configuration
[**evaluateAssetSwap**](AssetswapApi.md#evaluateAssetSwap) | **GET** /asset-swap/evaluate | Portfolio optimization — valuation
[**createAssetSwapOrderV1**](AssetswapApi.md#createAssetSwapOrderV1) | **POST** /asset-swap/order/create | Portfolio optimization — place order
[**listAssetSwapOrdersV1**](AssetswapApi.md#listAssetSwapOrdersV1) | **GET** /asset-swap/order/list | Portfolio optimization — order list
[**previewAssetSwapOrderV1**](AssetswapApi.md#previewAssetSwapOrderV1) | **POST** /asset-swap/order/preview | Portfolio optimization — preview
[**getAssetSwapOrderV1**](AssetswapApi.md#getAssetSwapOrderV1) | **GET** /asset-swap/order/{order_id} | Portfolio optimization — query order


<a name="listAssetSwapAssets"></a>
# **listAssetSwapAssets**
> ApiResponseAssetSwapListAssets listAssetSwapAssets()

Portfolio optimization — currency list

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        try {
            ApiResponseAssetSwapListAssets result = apiInstance.listAssetSwapAssets();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#listAssetSwapAssets");
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

[**ApiResponseAssetSwapListAssets**](ApiResponseAssetSwapListAssets.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="getAssetSwapConfig"></a>
# **getAssetSwapConfig**
> ApiResponseAssetSwapConfig getAssetSwapConfig()

Portfolio optimization — configuration

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        try {
            ApiResponseAssetSwapConfig result = apiInstance.getAssetSwapConfig();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#getAssetSwapConfig");
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

[**ApiResponseAssetSwapConfig**](ApiResponseAssetSwapConfig.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="evaluateAssetSwap"></a>
# **evaluateAssetSwap**
> ApiResponseAssetSwapEvaluate evaluateAssetSwap().maxEvaluateValue(maxEvaluateValue).cursor(cursor).size(size).execute();

Portfolio optimization — valuation

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        Integer maxEvaluateValue = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        String cursor = "cursor_example"; // String | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer size = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        try {
            ApiResponseAssetSwapEvaluate result = apiInstance.evaluateAssetSwap()
                        .maxEvaluateValue(maxEvaluateValue)
                        .cursor(cursor)
                        .size(size)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#evaluateAssetSwap");
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
 **maxEvaluateValue** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **cursor** | **String**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **size** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]

### Return type

[**ApiResponseAssetSwapEvaluate**](ApiResponseAssetSwapEvaluate.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="createAssetSwapOrderV1"></a>
# **createAssetSwapOrderV1**
> ApiResponseAssetSwapOrderCreateV1 createAssetSwapOrderV1(orderCreateV1Req)

Portfolio optimization — place order

将账户内若干源币种按指定数量换入目标币种侧配置，**正式下单前强烈建议先调用** &#x60;POST /asset-swap/order/preview&#x60; **且 &#x60;code&#x3D;0&#x60; 后再用一致的语义提交本接口**。  **请求体不含 &#x60;ratio&#x60;** - 本接口 &#x60;OrderCreateV1Req&#x60; 仅含 &#x60;from&#x60; / &#x60;to&#x60;，且数组元素均为 &#x60;CreateParam&#x60;（**仅** &#x60;asset&#x60; + &#x60;amount&#x60;）。**请勿**在下单 JSON 中传入 &#x60;ratio&#x60;；比例字段 &#x60;ratio&#x60; 只存在于预览接口 &#x60;OrderPreviewV1Req.to&#x60;（&#x60;PreviewToParam&#x60;）。  **与预览接口的关键差异（易错点）** - 本接口 &#x60;to&#x60; 数组元素为 &#x60;CreateParam&#x60;：**&#x60;asset&#x60; + &#x60;amount&#x60;（目标侧数量，十进制字符串）**。 - 预览接口 &#x60;to&#x60; 为 **&#x60;asset&#x60; + &#x60;ratio&#x60;（比例字符串）**，**二者不可混用**：不要把预览里的 &#x60;ratio&#x60; 原样填到下单的 &#x60;amount&#x60;，也不要把下单的 &#x60;amount&#x60; 当成预览的 &#x60;ratio&#x60;。  **推荐调用顺序** 1. &#x60;GET /asset-swap/asset/list&#x60;：确认币种支持。 2. &#x60;GET /asset-swap/config&#x60;：读取 &#x60;recommend&#x60; / &#x60;recommend_v2&#x60;（如 &#x60;recommend_v2.market&#x60; 下某策略的 &#x60;schemes&#x60;，将 &#x60;scheme.name&#x60; 作为目标 &#x60;asset&#x60;、&#x60;scheme.ratio&#x60; 仅用于 **preview** 的 &#x60;to[].ratio&#x60;）。 3. &#x60;GET /asset-swap/evaluate&#x60;（可选）：参考可卖数量。 4. &#x60;POST /asset-swap/order/preview&#x60;：&#x60;from&#x60; 与 &#x60;to&#x60;（比例）构造询价。 5. 预览成功后，按产品/服务端约定将预览结果映射为下单的 &#x60;from&#x60;/&#x60;to&#x60;（**均为 amount**）再调用本接口。  **字段约定** - &#x60;from&#x60;：卖出侧，每项为 &#x60;asset&#x60; + &#x60;amount&#x60;（字符串，十进制，表示该币种卖出数量）。 - &#x60;to&#x60;：买入/目标侧，每项为 &#x60;asset&#x60; + **&#x60;amount&#x60;**（字符串，十进制，表示该目标币种侧数量；语义与预览的 &#x60;ratio&#x60; 不同）。 - 本接口仅校验上述 &#x60;amount&#x60; 的精度与范围；不满足时返回非 0 &#x60;code&#x60; 及 &#x60;message&#x60;。预览侧 &#x60;to[].ratio&#x60; 的校验规则见 &#x60;POST /asset-swap/order/preview&#x60; 文档。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        OrderCreateV1Req orderCreateV1Req = new OrderCreateV1Req(); // OrderCreateV1Req | 下单请求体（`OrderCreateV1Req`）。**无 `ratio` 字段**；`from`/`to` 每项仅 `asset` + `amount`。`to` 使用目标侧**数量** `amount`，与 preview 中 `to` 的 **ratio**（比例）语义不同，勿混用。
        try {
            ApiResponseAssetSwapOrderCreateV1 result = apiInstance.createAssetSwapOrderV1(orderCreateV1Req);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#createAssetSwapOrderV1");
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
 **orderCreateV1Req** | [**OrderCreateV1Req**](OrderCreateV1Req.md)| 下单请求体（&#x60;OrderCreateV1Req&#x60;）。**无 &#x60;ratio&#x60; 字段**；&#x60;from&#x60;/&#x60;to&#x60; 每项仅 &#x60;asset&#x60; + &#x60;amount&#x60;。&#x60;to&#x60; 使用目标侧**数量** &#x60;amount&#x60;，与 preview 中 &#x60;to&#x60; 的 **ratio**（比例）语义不同，勿混用。 |

### Return type

[**ApiResponseAssetSwapOrderCreateV1**](ApiResponseAssetSwapOrderCreateV1.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="listAssetSwapOrdersV1"></a>
# **listAssetSwapOrdersV1**
> ApiResponseAssetSwapOrderListV1 listAssetSwapOrdersV1().from(from).to(to).status(status).offset(offset).size(size).sortMode(sortMode).orderBy(orderBy).execute();

Portfolio optimization — order list

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        Integer from = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer to = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer status = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer offset = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer size = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer sortMode = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        Integer orderBy = 56; // Integer | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        try {
            ApiResponseAssetSwapOrderListV1 result = apiInstance.listAssetSwapOrdersV1()
                        .from(from)
                        .to(to)
                        .status(status)
                        .offset(offset)
                        .size(size)
                        .sortMode(sortMode)
                        .orderBy(orderBy)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#listAssetSwapOrdersV1");
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
 **from** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **to** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **status** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **offset** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **size** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **sortMode** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]
 **orderBy** | **Integer**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]

### Return type

[**ApiResponseAssetSwapOrderListV1**](ApiResponseAssetSwapOrderListV1.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="previewAssetSwapOrderV1"></a>
# **previewAssetSwapOrderV1**
> ApiResponseAssetSwapOrderPreviewV1 previewAssetSwapOrderV1(orderPreviewV1Req)

Portfolio optimization — preview

根据卖出币种数量与**目标分配比例**估算成交与费用，**不写入订单**。&#x60;code&#x3D;0&#x60; 时 &#x60;data&#x60; 含预估 &#x60;order&#x60; 与 &#x60;transaction_fee&#x60;。  **与下单接口的关键差异（易错点）** - 本接口 &#x60;to&#x60; 数组元素为 &#x60;PreviewToParam&#x60;：**&#x60;asset&#x60; + &#x60;ratio&#x60;（比例，十进制字符串）**，表示目标币种在组合中的权重/占比。 - 下单接口 &#x60;POST /asset-swap/order/create&#x60; 的 &#x60;to&#x60; 为 **&#x60;asset&#x60; + &#x60;amount&#x60;（绝对数量）**，**不是** &#x60;ratio&#x60;。调用方切勿把两套字段混用。  **如何构造 &#x60;to&#x60;（ratio）** - 优先从 &#x60;GET /asset-swap/config&#x60; 的 &#x60;data.recommend_v2&#x60; 取值：按分组键（如 &#x60;market&#x60;、&#x60;faith&#x60;、&#x60;conservative&#x60;）找到策略列表中的某条 &#x60;RecommendV2Strategy&#x60;（如 &#x60;name&#x60; 为 &#x60;top2&#x60;），将其 &#x60;schemes&#x60; 映射为预览请求：   - &#x60;to[].asset&#x60; ← &#x60;scheme.name&#x60;（目标币种符号）   - &#x60;to[].ratio&#x60; ← &#x60;scheme.ratio&#x60;（与配置一致的比例字符串） - 亦可使用 &#x60;recommend&#x60; 下扁平 map（币种 → 比例字符串）自行展开为多元素 &#x60;to&#x60;（每项一个 &#x60;asset&#x60; + &#x60;ratio&#x60;）。 - 多目标时各 &#x60;ratio&#x60; 建议与前端/运营配置一致；是否需加总为 1 以服务端校验为准。  **&#x60;from&#x60;（卖出侧）** - 每项为 &#x60;asset&#x60; + &#x60;amount&#x60;（字符串，十进制），表示本次参与换出的该币种数量。币种应在 &#x60;GET /asset-swap/asset/list&#x60; 支持范围内；数量级过小或市场深度不足时可能返回非 0 &#x60;code&#x60;（如无法询价）。  **与下单的衔接** - 预览成功后，将业务允许的预览结果转换为下单所需的 **&#x60;from&#x60;/&#x60;to&#x60; 全为 amount** 的请求体再调用 create（具体映射规则以产品文档或服务端约定为准）。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        OrderPreviewV1Req orderPreviewV1Req = new OrderPreviewV1Req(); // OrderPreviewV1Req | 预览请求体。`to` 必须为 **ratio**；与 create 的 **amount** 语义不同。
        try {
            ApiResponseAssetSwapOrderPreviewV1 result = apiInstance.previewAssetSwapOrderV1(orderPreviewV1Req);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#previewAssetSwapOrderV1");
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
 **orderPreviewV1Req** | [**OrderPreviewV1Req**](OrderPreviewV1Req.md)| 预览请求体。&#x60;to&#x60; 必须为 **ratio**；与 create 的 **amount** 语义不同。 |

### Return type

[**ApiResponseAssetSwapOrderPreviewV1**](ApiResponseAssetSwapOrderPreviewV1.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

<a name="getAssetSwapOrderV1"></a>
# **getAssetSwapOrderV1**
> ApiResponseAssetSwapOrderQueryV1 getAssetSwapOrderV1(orderId)

Portfolio optimization — query order

Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.AssetswapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        AssetswapApi apiInstance = new AssetswapApi(defaultClient);
        String orderId = "orderId_example"; // String | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        try {
            ApiResponseAssetSwapOrderQueryV1 result = apiInstance.getAssetSwapOrderV1(orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetswapApi#getAssetSwapOrderV1");
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
 **orderId** | **String**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |

### Return type

[**ApiResponseAssetSwapOrderQueryV1**](ApiResponseAssetSwapOrderQueryV1.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | HTTP 200，业务结果通过 code 字段区分 |  -  |

