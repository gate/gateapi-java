# P2PApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**p2pMerchantAccountGetUserInfo**](P2PApi.md#p2pMerchantAccountGetUserInfo) | **POST** /p2p/merchant/account/get_user_info | Get account information
[**p2pMerchantAccountGetCounterpartyUserInfo**](P2PApi.md#p2pMerchantAccountGetCounterpartyUserInfo) | **POST** /p2p/merchant/account/get_counterparty_user_info | Get counterparty information
[**p2pMerchantAccountGetMyselfPayment**](P2PApi.md#p2pMerchantAccountGetMyselfPayment) | **POST** /p2p/merchant/account/get_myself_payment | Get payment method list
[**p2pMerchantTransactionGetPendingTransactionList**](P2PApi.md#p2pMerchantTransactionGetPendingTransactionList) | **POST** /p2p/merchant/transaction/get_pending_transaction_list | Get pending orders
[**p2pMerchantTransactionGetCompletedTransactionList**](P2PApi.md#p2pMerchantTransactionGetCompletedTransactionList) | **POST** /p2p/merchant/transaction/get_completed_transaction_list | Get all/historical orders
[**p2pMerchantTransactionGetTransactionDetails**](P2PApi.md#p2pMerchantTransactionGetTransactionDetails) | **POST** /p2p/merchant/transaction/get_transaction_details | Query order details
[**p2pMerchantTransactionConfirmPayment**](P2PApi.md#p2pMerchantTransactionConfirmPayment) | **POST** /p2p/merchant/transaction/confirm-payment | Confirm payment
[**p2pMerchantTransactionConfirmReceipt**](P2PApi.md#p2pMerchantTransactionConfirmReceipt) | **POST** /p2p/merchant/transaction/confirm-receipt | Confirm receipt
[**p2pMerchantTransactionCancel**](P2PApi.md#p2pMerchantTransactionCancel) | **POST** /p2p/merchant/transaction/cancel | Cancel order
[**p2pMerchantBooksPlaceBizPushOrder**](P2PApi.md#p2pMerchantBooksPlaceBizPushOrder) | **POST** /p2p/merchant/books/place_biz_push_order | Publish ad order
[**p2pMerchantBooksAdsUpdateStatus**](P2PApi.md#p2pMerchantBooksAdsUpdateStatus) | **POST** /p2p/merchant/books/ads_update_status | Update ad status
[**p2pMerchantBooksAdsDetail**](P2PApi.md#p2pMerchantBooksAdsDetail) | **POST** /p2p/merchant/books/ads_detail | Query ad details
[**p2pMerchantBooksMyAdsList**](P2PApi.md#p2pMerchantBooksMyAdsList) | **POST** /p2p/merchant/books/my_ads_list | Get my ad list
[**p2pMerchantChatGetChatsList**](P2PApi.md#p2pMerchantChatGetChatsList) | **POST** /p2p/merchant/chat/get_chats_list | Get chat history
[**p2pMerchantChatSendChatMessage**](P2PApi.md#p2pMerchantChatSendChatMessage) | **POST** /p2p/merchant/chat/send_chat_message | Send text message
[**p2pMerchantChatUploadChatFile**](P2PApi.md#p2pMerchantChatUploadChatFile) | **POST** /p2p/merchant/chat/upload_chat_file | Upload chat file


<a name="p2pMerchantAccountGetUserInfo"></a>
# **p2pMerchantAccountGetUserInfo**
> InlineResponse20014 p2pMerchantAccountGetUserInfo()

Get account information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        try {
            InlineResponse20014 result = apiInstance.p2pMerchantAccountGetUserInfo();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantAccountGetUserInfo");
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

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantAccountGetCounterpartyUserInfo"></a>
# **p2pMerchantAccountGetCounterpartyUserInfo**
> InlineResponse20015 p2pMerchantAccountGetCounterpartyUserInfo(bizUid)

Get counterparty information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String bizUid = "bizUid_example"; // String | Counterparty UID (encrypted)
        try {
            InlineResponse20015 result = apiInstance.p2pMerchantAccountGetCounterpartyUserInfo(bizUid);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantAccountGetCounterpartyUserInfo");
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
 **bizUid** | **String**| Counterparty UID (encrypted) |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantAccountGetMyselfPayment"></a>
# **p2pMerchantAccountGetMyselfPayment**
> InlineResponse20016 p2pMerchantAccountGetMyselfPayment(fiat)

Get payment method list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String fiat = "fiat_example"; // String | Fiat currency
        try {
            InlineResponse20016 result = apiInstance.p2pMerchantAccountGetMyselfPayment(fiat);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantAccountGetMyselfPayment");
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
 **fiat** | **String**| Fiat currency | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetPendingTransactionList"></a>
# **p2pMerchantTransactionGetPendingTransactionList**
> InlineResponse20017 p2pMerchantTransactionGetPendingTransactionList(cryptoCurrency, fiatCurrency, orderTab, selectType, status, txid, startTime, endTime)

Get pending orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String cryptoCurrency = "cryptoCurrency_example"; // String | Cryptocurrency
        String fiatCurrency = "fiatCurrency_example"; // String | Fiat currency
        String orderTab = "orderTab_example"; // String | 订单标签页，默认pending（pending：处理中（pending:  AND status in ('OPEN', 'PAID', 'LOCKED', 'TEMP')）；dispute：申诉中（status in ('ACCEPT', 'BCLOSED', 'CANCEL', 'BECANCEL', 'SCLOSED', 'SCANCEL')))
        String selectType = "selectType_example"; // String | Buy/Sell (sell=Sell, buy=Buy, others=All)
        String status = "status_example"; // String | Order Status (dispute: Disputed Order; closed: ACCEPT, BCLOSED; cancel: CANCEL, BECANCEL, SCLOSED, SCANCEL; locked: LOCKED; open: OPEN; paid: PAID; completed: CANCEL, BECANCEL, SCLOSED, SCANCEL, ACCEPT, BCLOSED)
        Integer txid = 56; // Integer | Order ID
        Integer startTime = 56; // Integer | Start timestamp, default is 00:00 89 days ago
        Integer endTime = 56; // Integer | End timestamp, default is 23:59:59 today
        try {
            InlineResponse20017 result = apiInstance.p2pMerchantTransactionGetPendingTransactionList(cryptoCurrency, fiatCurrency, orderTab, selectType, status, txid, startTime, endTime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionGetPendingTransactionList");
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
 **cryptoCurrency** | **String**| Cryptocurrency |
 **fiatCurrency** | **String**| Fiat currency |
 **orderTab** | **String**| 订单标签页，默认pending（pending：处理中（pending:  AND status in (&#39;OPEN&#39;, &#39;PAID&#39;, &#39;LOCKED&#39;, &#39;TEMP&#39;)）；dispute：申诉中（status in (&#39;ACCEPT&#39;, &#39;BCLOSED&#39;, &#39;CANCEL&#39;, &#39;BECANCEL&#39;, &#39;SCLOSED&#39;, &#39;SCANCEL&#39;))) | [optional]
 **selectType** | **String**| Buy/Sell (sell&#x3D;Sell, buy&#x3D;Buy, others&#x3D;All) | [optional]
 **status** | **String**| Order Status (dispute: Disputed Order; closed: ACCEPT, BCLOSED; cancel: CANCEL, BECANCEL, SCLOSED, SCANCEL; locked: LOCKED; open: OPEN; paid: PAID; completed: CANCEL, BECANCEL, SCLOSED, SCANCEL, ACCEPT, BCLOSED) | [optional]
 **txid** | **Integer**| Order ID | [optional]
 **startTime** | **Integer**| Start timestamp, default is 00:00 89 days ago | [optional]
 **endTime** | **Integer**| End timestamp, default is 23:59:59 today | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetCompletedTransactionList"></a>
# **p2pMerchantTransactionGetCompletedTransactionList**
> InlineResponse20017 p2pMerchantTransactionGetCompletedTransactionList(cryptoCurrency, fiatCurrency, selectType, status, txid, startTime, endTime, queryDispute, page, perPage)

Get all/historical orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String cryptoCurrency = "cryptoCurrency_example"; // String | Cryptocurrency
        String fiatCurrency = "fiatCurrency_example"; // String | Fiat currency
        String selectType = "selectType_example"; // String | Buy/Sell (sell=Sell, buy=Buy, others=All)
        String status = "status_example"; // String | Order Status (dispute: Disputed Order; closed: ACCEPT, BCLOSED; cancel: CANCEL, BECANCEL, SCLOSED, SCANCEL; locked: LOCKED; open: OPEN; paid: PAID; completed: CANCEL, BECANCEL, SCLOSED, SCANCEL, ACCEPT, BCLOSED)
        Integer txid = 56; // Integer | Order ID
        Integer startTime = 56; // Integer | Start timestamp, default is 00:00 89 days ago
        Integer endTime = 56; // Integer | End timestamp, default is 23:59:59 today
        Integer queryDispute = 56; // Integer | 1: Include appeal status, 0: None
        Integer page = 56; // Integer | page number
        Integer perPage = 56; // Integer | Number of orders per page
        try {
            InlineResponse20017 result = apiInstance.p2pMerchantTransactionGetCompletedTransactionList(cryptoCurrency, fiatCurrency, selectType, status, txid, startTime, endTime, queryDispute, page, perPage);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionGetCompletedTransactionList");
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
 **cryptoCurrency** | **String**| Cryptocurrency |
 **fiatCurrency** | **String**| Fiat currency |
 **selectType** | **String**| Buy/Sell (sell&#x3D;Sell, buy&#x3D;Buy, others&#x3D;All) | [optional]
 **status** | **String**| Order Status (dispute: Disputed Order; closed: ACCEPT, BCLOSED; cancel: CANCEL, BECANCEL, SCLOSED, SCANCEL; locked: LOCKED; open: OPEN; paid: PAID; completed: CANCEL, BECANCEL, SCLOSED, SCANCEL, ACCEPT, BCLOSED) | [optional]
 **txid** | **Integer**| Order ID | [optional]
 **startTime** | **Integer**| Start timestamp, default is 00:00 89 days ago | [optional]
 **endTime** | **Integer**| End timestamp, default is 23:59:59 today | [optional]
 **queryDispute** | **Integer**| 1: Include appeal status, 0: None | [optional]
 **page** | **Integer**| page number | [optional]
 **perPage** | **Integer**| Number of orders per page | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetTransactionDetails"></a>
# **p2pMerchantTransactionGetTransactionDetails**
> InlineResponse20018 p2pMerchantTransactionGetTransactionDetails(txid, channel)

Query order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        Integer txid = 56; // Integer | Order ID
        String channel = "channel_example"; // String | Empty or web3
        try {
            InlineResponse20018 result = apiInstance.p2pMerchantTransactionGetTransactionDetails(txid, channel);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionGetTransactionDetails");
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
 **txid** | **Integer**| Order ID |
 **channel** | **String**| Empty or web3 | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionConfirmPayment"></a>
# **p2pMerchantTransactionConfirmPayment**
> InlineResponse2007 p2pMerchantTransactionConfirmPayment(inlineObject10)

Confirm payment

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        InlineObject10 inlineObject10 = new InlineObject10(); // InlineObject10 | 
        try {
            InlineResponse2007 result = apiInstance.p2pMerchantTransactionConfirmPayment(inlineObject10);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionConfirmPayment");
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionConfirmReceipt"></a>
# **p2pMerchantTransactionConfirmReceipt**
> InlineResponse2007 p2pMerchantTransactionConfirmReceipt(inlineObject11)

Confirm receipt

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        InlineObject11 inlineObject11 = new InlineObject11(); // InlineObject11 | 
        try {
            InlineResponse2007 result = apiInstance.p2pMerchantTransactionConfirmReceipt(inlineObject11);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionConfirmReceipt");
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
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionCancel"></a>
# **p2pMerchantTransactionCancel**
> InlineResponse2007 p2pMerchantTransactionCancel(inlineObject12)

Cancel order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        InlineObject12 inlineObject12 = new InlineObject12(); // InlineObject12 | 
        try {
            InlineResponse2007 result = apiInstance.p2pMerchantTransactionCancel(inlineObject12);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantTransactionCancel");
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
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksPlaceBizPushOrder"></a>
# **p2pMerchantBooksPlaceBizPushOrder**
> Object p2pMerchantBooksPlaceBizPushOrder(currencyType, exchangeType, type, unitPrice, number, minAmount, maxAmount, payType, payTypeJson, rateFixed, oid, tierLimit, verifiedLimit, regTimeLimit, advertisersLimit, hidePayment, expireMin, tradeTips, autoReply, minCompletedLimit, maxCompletedLimit, completedRateLimit, userCountryLimit, userOrderLimit, rateReferenceId, rateOffset, floatTrend)

Publish ad order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String currencyType = "currencyType_example"; // String | Cryptocurrency
        String exchangeType = "exchangeType_example"; // String | Fiat currency
        String type = "type_example"; // String | Ad type: 0=Sell, 1=Buy, 2=Edit sell, 3=Edit buy
        String unitPrice = "unitPrice_example"; // String | Unit price
        String number = "number_example"; // String | Size
        String minAmount = "minAmount_example"; // String | Minimum transaction amount per order
        String maxAmount = "maxAmount_example"; // String | Maximum transaction amount per order
        String payType = "payType_example"; // String | Payment method
        String payTypeJson = "payTypeJson_example"; // String | Payment method JSON string
        String rateFixed = "rateFixed_example"; // String | Price type: 0-Floating price, 1-Fixed price
        String oid = "oid_example"; // String | Ad ID when editing
        String tierLimit = "tierLimit_example"; // String | Order tier limit
        String verifiedLimit = "verifiedLimit_example"; // String | Verification level limit
        String regTimeLimit = "regTimeLimit_example"; // String | Registration time limit
        String advertisersLimit = "advertisersLimit_example"; // String | Advertiser restriction
        String hidePayment = "hidePayment_example"; // String | Whether to hide payment method: 1=Yes, 0=No
        String expireMin = "expireMin_example"; // String | Ad expiration time (minutes)
        String tradeTips = "tradeTips_example"; // String | Trading terms
        String autoReply = "autoReply_example"; // String | Auto reply
        String minCompletedLimit = "minCompletedLimit_example"; // String | Minimum limit of completed orders
        String maxCompletedLimit = "maxCompletedLimit_example"; // String | Maximum limit of completed orders
        String completedRateLimit = "completedRateLimit_example"; // String | 30-day completion rate limit
        String userCountryLimit = "userCountryLimit_example"; // String | KYC nationality restriction
        String userOrderLimit = "userOrderLimit_example"; // String | Order count limit
        String rateReferenceId = "rateReferenceId_example"; // String | Reference exchange rate ID
        String rateOffset = "rateOffset_example"; // String | Reference exchange rate offset
        String floatTrend = "floatTrend_example"; // String | 444
        try {
            Object result = apiInstance.p2pMerchantBooksPlaceBizPushOrder(currencyType, exchangeType, type, unitPrice, number, minAmount, maxAmount, payType, payTypeJson, rateFixed, oid, tierLimit, verifiedLimit, regTimeLimit, advertisersLimit, hidePayment, expireMin, tradeTips, autoReply, minCompletedLimit, maxCompletedLimit, completedRateLimit, userCountryLimit, userOrderLimit, rateReferenceId, rateOffset, floatTrend);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantBooksPlaceBizPushOrder");
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
 **currencyType** | **String**| Cryptocurrency |
 **exchangeType** | **String**| Fiat currency |
 **type** | **String**| Ad type: 0&#x3D;Sell, 1&#x3D;Buy, 2&#x3D;Edit sell, 3&#x3D;Edit buy |
 **unitPrice** | **String**| Unit price |
 **number** | **String**| Size |
 **minAmount** | **String**| Minimum transaction amount per order |
 **maxAmount** | **String**| Maximum transaction amount per order |
 **payType** | **String**| Payment method | [optional]
 **payTypeJson** | **String**| Payment method JSON string | [optional]
 **rateFixed** | **String**| Price type: 0-Floating price, 1-Fixed price | [optional]
 **oid** | **String**| Ad ID when editing | [optional]
 **tierLimit** | **String**| Order tier limit | [optional]
 **verifiedLimit** | **String**| Verification level limit | [optional]
 **regTimeLimit** | **String**| Registration time limit | [optional]
 **advertisersLimit** | **String**| Advertiser restriction | [optional]
 **hidePayment** | **String**| Whether to hide payment method: 1&#x3D;Yes, 0&#x3D;No | [optional]
 **expireMin** | **String**| Ad expiration time (minutes) | [optional]
 **tradeTips** | **String**| Trading terms | [optional]
 **autoReply** | **String**| Auto reply | [optional]
 **minCompletedLimit** | **String**| Minimum limit of completed orders | [optional]
 **maxCompletedLimit** | **String**| Maximum limit of completed orders | [optional]
 **completedRateLimit** | **String**| 30-day completion rate limit | [optional]
 **userCountryLimit** | **String**| KYC nationality restriction | [optional]
 **userOrderLimit** | **String**| Order count limit | [optional]
 **rateReferenceId** | **String**| Reference exchange rate ID | [optional]
 **rateOffset** | **String**| Reference exchange rate offset | [optional]
 **floatTrend** | **String**| 444 | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksAdsUpdateStatus"></a>
# **p2pMerchantBooksAdsUpdateStatus**
> InlineResponse20019 p2pMerchantBooksAdsUpdateStatus(advNo, advStatus, tradeType)

Update ad status

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        Integer advNo = 56; // Integer | Ad ID
        Integer advStatus = 56; // Integer | Ad status: 1=Active, 3=Inactive, 4=Closed
        String tradeType = "sell"; // String | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME <EMAIL@ADDRESS> Language: en Language-Team: en <L@li.org> Plural-Forms: nplurals=2; plural=(n !=1) MIME-Version: 1.0 Content-Type: text/plain; charset=utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0 
        try {
            InlineResponse20019 result = apiInstance.p2pMerchantBooksAdsUpdateStatus(advNo, advStatus, tradeType);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantBooksAdsUpdateStatus");
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
 **advNo** | **Integer**| Ad ID |
 **advStatus** | **Integer**| Ad status: 1&#x3D;Active, 3&#x3D;Inactive, 4&#x3D;Closed |
 **tradeType** | **String**| Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  | [optional]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksAdsDetail"></a>
# **p2pMerchantBooksAdsDetail**
> InlineResponse20020 p2pMerchantBooksAdsDetail(advNo)

Query ad details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String advNo = "advNo_example"; // String | 
        try {
            InlineResponse20020 result = apiInstance.p2pMerchantBooksAdsDetail(advNo);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantBooksAdsDetail");
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
 **advNo** | **String**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksMyAdsList"></a>
# **p2pMerchantBooksMyAdsList**
> InlineResponse20021 p2pMerchantBooksMyAdsList(asset, fiatUnit, tradeType)

Get my ad list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String asset = "asset_example"; // String | Cryptocurrency
        String fiatUnit = "fiatUnit_example"; // String | Fiat currency
        String tradeType = "tradeType_example"; // String | Buy/Sell
        try {
            InlineResponse20021 result = apiInstance.p2pMerchantBooksMyAdsList(asset, fiatUnit, tradeType);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantBooksMyAdsList");
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
 **asset** | **String**| Cryptocurrency | [optional]
 **fiatUnit** | **String**| Fiat currency | [optional]
 **tradeType** | **String**| Buy/Sell | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatGetChatsList"></a>
# **p2pMerchantChatGetChatsList**
> InlineResponse20022 p2pMerchantChatGetChatsList(txid, lastreceived, firstreceived)

Get chat history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        Integer txid = 56; // Integer | Order ID
        Integer lastreceived = 56; // Integer | Pagination timestamp (forward)
        Integer firstreceived = 56; // Integer | Pagination timestamp (backward)
        try {
            InlineResponse20022 result = apiInstance.p2pMerchantChatGetChatsList(txid, lastreceived, firstreceived);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantChatGetChatsList");
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
 **txid** | **Integer**| Order ID |
 **lastreceived** | **Integer**| Pagination timestamp (forward) | [optional]
 **firstreceived** | **Integer**| Pagination timestamp (backward) | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatSendChatMessage"></a>
# **p2pMerchantChatSendChatMessage**
> InlineResponse20023 p2pMerchantChatSendChatMessage(txid, message, type)

Send text message

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        Integer txid = 56; // Integer | Order ID
        String message = "message_example"; // String | Message content
        Integer type = 56; // Integer | 0=Text, 1=File (video or image), default is 0 if not provided
        try {
            InlineResponse20023 result = apiInstance.p2pMerchantChatSendChatMessage(txid, message, type);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantChatSendChatMessage");
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
 **txid** | **Integer**| Order ID |
 **message** | **String**| Message content |
 **type** | **Integer**| 0&#x3D;Text, 1&#x3D;File (video or image), default is 0 if not provided | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatUploadChatFile"></a>
# **p2pMerchantChatUploadChatFile**
> InlineResponse20024 p2pMerchantChatUploadChatFile(imageContentType, base64Img)

Upload chat file

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2PApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        P2PApi apiInstance = new P2PApi(defaultClient);
        String imageContentType = "imageContentType_example"; // String | File type, currently only images and videos are supported
        String base64Img = "base64Img_example"; // String | File content (base64 encoded)
        try {
            InlineResponse20024 result = apiInstance.p2pMerchantChatUploadChatFile(imageContentType, base64Img);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2PApi#p2pMerchantChatUploadChatFile");
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
 **imageContentType** | **String**| File type, currently only images and videos are supported |
 **base64Img** | **String**| File content (base64 encoded) |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

