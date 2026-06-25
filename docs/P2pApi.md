# P2pApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**p2pMerchantAccountGetUserInfo**](P2pApi.md#p2pMerchantAccountGetUserInfo) | **POST** /p2p/merchant/account/get_user_info | Get account information
[**p2pMerchantAccountGetCounterpartyUserInfo**](P2pApi.md#p2pMerchantAccountGetCounterpartyUserInfo) | **POST** /p2p/merchant/account/get_counterparty_user_info | Get counterparty information
[**p2pMerchantAccountGetMyselfPayment**](P2pApi.md#p2pMerchantAccountGetMyselfPayment) | **POST** /p2p/merchant/account/get_myself_payment | Get payment method list
[**p2pMerchantAccountSetMerchantWorkHours**](P2pApi.md#p2pMerchantAccountSetMerchantWorkHours) | **POST** /p2p/merchant/account/set_merchant_work_hours | Set merchant working status and custom working hours
[**p2pMerchantTransactionGetPendingTransactionList**](P2pApi.md#p2pMerchantTransactionGetPendingTransactionList) | **POST** /p2p/merchant/transaction/get_pending_transaction_list | Get pending orders
[**p2pMerchantTransactionGetCompletedTransactionList**](P2pApi.md#p2pMerchantTransactionGetCompletedTransactionList) | **POST** /p2p/merchant/transaction/get_completed_transaction_list | Get all/historical orders
[**p2pMerchantTransactionGetTransactionDetails**](P2pApi.md#p2pMerchantTransactionGetTransactionDetails) | **POST** /p2p/merchant/transaction/get_transaction_details | Query order details
[**p2pMerchantTransactionConfirmPayment**](P2pApi.md#p2pMerchantTransactionConfirmPayment) | **POST** /p2p/merchant/transaction/confirm-payment | Confirm payment
[**p2pMerchantTransactionConfirmReceipt**](P2pApi.md#p2pMerchantTransactionConfirmReceipt) | **POST** /p2p/merchant/transaction/confirm-receipt | Confirm receipt
[**p2pMerchantTransactionCancel**](P2pApi.md#p2pMerchantTransactionCancel) | **POST** /p2p/merchant/transaction/cancel | Cancel order
[**p2pMerchantBooksPlaceBizPushOrder**](P2pApi.md#p2pMerchantBooksPlaceBizPushOrder) | **POST** /p2p/merchant/books/place_biz_push_order | Publish ad order
[**p2pMerchantBooksAdsUpdateStatus**](P2pApi.md#p2pMerchantBooksAdsUpdateStatus) | **POST** /p2p/merchant/books/ads_update_status | Update ad status
[**p2pMerchantBooksAdsDetail**](P2pApi.md#p2pMerchantBooksAdsDetail) | **POST** /p2p/merchant/books/ads_detail | Query ad details
[**p2pMerchantBooksMyAdsList**](P2pApi.md#p2pMerchantBooksMyAdsList) | **POST** /p2p/merchant/books/my_ads_list | Get my ad list
[**p2pMerchantBooksAdsList**](P2pApi.md#p2pMerchantBooksAdsList) | **POST** /p2p/merchant/books/ads_list | Get Advertisement List
[**p2pMerchantChatGetChatsList**](P2pApi.md#p2pMerchantChatGetChatsList) | **POST** /p2p/merchant/chat/get_chats_list | Get chat history
[**p2pMerchantChatSendChatMessage**](P2pApi.md#p2pMerchantChatSendChatMessage) | **POST** /p2p/merchant/chat/send_chat_message | Send text message
[**p2pMerchantChatUploadChatFile**](P2pApi.md#p2pMerchantChatUploadChatFile) | **POST** /p2p/merchant/chat/upload_chat_file | Upload chat file


<a name="p2pMerchantAccountGetUserInfo"></a>
# **p2pMerchantAccountGetUserInfo**
> P2pMerchantUserInfoResponse p2pMerchantAccountGetUserInfo()

Get account information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        try {
            P2pMerchantUserInfoResponse result = apiInstance.p2pMerchantAccountGetUserInfo();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantAccountGetUserInfo");
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

[**P2pMerchantUserInfoResponse**](P2pMerchantUserInfoResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantAccountGetCounterpartyUserInfo"></a>
# **p2pMerchantAccountGetCounterpartyUserInfo**
> P2pCounterpartyUserInfoResponse p2pMerchantAccountGetCounterpartyUserInfo(getCounterpartyUserInfoRequest)

Get counterparty information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetCounterpartyUserInfoRequest getCounterpartyUserInfoRequest = new GetCounterpartyUserInfoRequest(); // GetCounterpartyUserInfoRequest | 
        try {
            P2pCounterpartyUserInfoResponse result = apiInstance.p2pMerchantAccountGetCounterpartyUserInfo(getCounterpartyUserInfoRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantAccountGetCounterpartyUserInfo");
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
 **getCounterpartyUserInfoRequest** | [**GetCounterpartyUserInfoRequest**](GetCounterpartyUserInfoRequest.md)|  |

### Return type

[**P2pCounterpartyUserInfoResponse**](P2pCounterpartyUserInfoResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantAccountGetMyselfPayment"></a>
# **p2pMerchantAccountGetMyselfPayment**
> P2pPaymentMethodsResponse p2pMerchantAccountGetMyselfPayment(getMyselfPaymentRequest)

Get payment method list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetMyselfPaymentRequest getMyselfPaymentRequest = new GetMyselfPaymentRequest(); // GetMyselfPaymentRequest | 
        try {
            P2pPaymentMethodsResponse result = apiInstance.p2pMerchantAccountGetMyselfPayment(getMyselfPaymentRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantAccountGetMyselfPayment");
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
 **getMyselfPaymentRequest** | [**GetMyselfPaymentRequest**](GetMyselfPaymentRequest.md)|  | [optional]

### Return type

[**P2pPaymentMethodsResponse**](P2pPaymentMethodsResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantAccountSetMerchantWorkHours"></a>
# **p2pMerchantAccountSetMerchantWorkHours**
> P2pMerchantWorkHoursResponse p2pMerchantAccountSetMerchantWorkHours(setMerchantWorkHoursRequest)

Set merchant working status and custom working hours

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        SetMerchantWorkHoursRequest setMerchantWorkHoursRequest = new SetMerchantWorkHoursRequest(); // SetMerchantWorkHoursRequest | 
        try {
            P2pMerchantWorkHoursResponse result = apiInstance.p2pMerchantAccountSetMerchantWorkHours(setMerchantWorkHoursRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantAccountSetMerchantWorkHours");
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
 **setMerchantWorkHoursRequest** | [**SetMerchantWorkHoursRequest**](SetMerchantWorkHoursRequest.md)|  |

### Return type

[**P2pMerchantWorkHoursResponse**](P2pMerchantWorkHoursResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetPendingTransactionList"></a>
# **p2pMerchantTransactionGetPendingTransactionList**
> P2pTransactionListResponse p2pMerchantTransactionGetPendingTransactionList(getPendingTransactionListRequest)

Get pending orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetPendingTransactionListRequest getPendingTransactionListRequest = new GetPendingTransactionListRequest(); // GetPendingTransactionListRequest | 
        try {
            P2pTransactionListResponse result = apiInstance.p2pMerchantTransactionGetPendingTransactionList(getPendingTransactionListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionGetPendingTransactionList");
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
 **getPendingTransactionListRequest** | [**GetPendingTransactionListRequest**](GetPendingTransactionListRequest.md)|  |

### Return type

[**P2pTransactionListResponse**](P2pTransactionListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetCompletedTransactionList"></a>
# **p2pMerchantTransactionGetCompletedTransactionList**
> P2pTransactionListResponse p2pMerchantTransactionGetCompletedTransactionList(getCompletedTransactionListRequest)

Get all/historical orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetCompletedTransactionListRequest getCompletedTransactionListRequest = new GetCompletedTransactionListRequest(); // GetCompletedTransactionListRequest | 
        try {
            P2pTransactionListResponse result = apiInstance.p2pMerchantTransactionGetCompletedTransactionList(getCompletedTransactionListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionGetCompletedTransactionList");
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
 **getCompletedTransactionListRequest** | [**GetCompletedTransactionListRequest**](GetCompletedTransactionListRequest.md)|  |

### Return type

[**P2pTransactionListResponse**](P2pTransactionListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionGetTransactionDetails"></a>
# **p2pMerchantTransactionGetTransactionDetails**
> P2pTransactionDetailResponse p2pMerchantTransactionGetTransactionDetails(getTransactionDetailsRequest)

Query order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetTransactionDetailsRequest getTransactionDetailsRequest = new GetTransactionDetailsRequest(); // GetTransactionDetailsRequest | 
        try {
            P2pTransactionDetailResponse result = apiInstance.p2pMerchantTransactionGetTransactionDetails(getTransactionDetailsRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionGetTransactionDetails");
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
 **getTransactionDetailsRequest** | [**GetTransactionDetailsRequest**](GetTransactionDetailsRequest.md)|  |

### Return type

[**P2pTransactionDetailResponse**](P2pTransactionDetailResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionConfirmPayment"></a>
# **p2pMerchantTransactionConfirmPayment**
> P2pTransactionActionResponse p2pMerchantTransactionConfirmPayment(confirmPayment)

Confirm payment

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        ConfirmPayment confirmPayment = new ConfirmPayment(); // ConfirmPayment | 
        try {
            P2pTransactionActionResponse result = apiInstance.p2pMerchantTransactionConfirmPayment(confirmPayment);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionConfirmPayment");
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
 **confirmPayment** | [**ConfirmPayment**](ConfirmPayment.md)|  |

### Return type

[**P2pTransactionActionResponse**](P2pTransactionActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionConfirmReceipt"></a>
# **p2pMerchantTransactionConfirmReceipt**
> P2pTransactionActionResponse p2pMerchantTransactionConfirmReceipt(confirmReceipt)

Confirm receipt

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        ConfirmReceipt confirmReceipt = new ConfirmReceipt(); // ConfirmReceipt | 
        try {
            P2pTransactionActionResponse result = apiInstance.p2pMerchantTransactionConfirmReceipt(confirmReceipt);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionConfirmReceipt");
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
 **confirmReceipt** | [**ConfirmReceipt**](ConfirmReceipt.md)|  |

### Return type

[**P2pTransactionActionResponse**](P2pTransactionActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantTransactionCancel"></a>
# **p2pMerchantTransactionCancel**
> P2pTransactionActionResponse p2pMerchantTransactionCancel(cancelOrder)

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
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        CancelOrder cancelOrder = new CancelOrder(); // CancelOrder | 
        try {
            P2pTransactionActionResponse result = apiInstance.p2pMerchantTransactionCancel(cancelOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantTransactionCancel");
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
 **cancelOrder** | [**CancelOrder**](CancelOrder.md)|  |

### Return type

[**P2pTransactionActionResponse**](P2pTransactionActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksPlaceBizPushOrder"></a>
# **p2pMerchantBooksPlaceBizPushOrder**
> P2pMerchantBooksPlaceBizPushOrderResponse p2pMerchantBooksPlaceBizPushOrder(placeBizPushOrder)

Publish ad order

When publishing or editing an advertisement, trade_tips and auto_reply go through off-platform traffic diversion risk control; when hit, the advertisement is not saved, and code 70305102 with data.risk_event is returned.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        PlaceBizPushOrder placeBizPushOrder = new PlaceBizPushOrder(); // PlaceBizPushOrder | 
        try {
            P2pMerchantBooksPlaceBizPushOrderResponse result = apiInstance.p2pMerchantBooksPlaceBizPushOrder(placeBizPushOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantBooksPlaceBizPushOrder");
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
 **placeBizPushOrder** | [**PlaceBizPushOrder**](PlaceBizPushOrder.md)|  |

### Return type

[**P2pMerchantBooksPlaceBizPushOrderResponse**](P2pMerchantBooksPlaceBizPushOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksAdsUpdateStatus"></a>
# **p2pMerchantBooksAdsUpdateStatus**
> P2pAdsUpdateStatusResponse p2pMerchantBooksAdsUpdateStatus(adsUpdateStatus)

Update ad status

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        AdsUpdateStatus adsUpdateStatus = new AdsUpdateStatus(); // AdsUpdateStatus | 
        try {
            P2pAdsUpdateStatusResponse result = apiInstance.p2pMerchantBooksAdsUpdateStatus(adsUpdateStatus);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantBooksAdsUpdateStatus");
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
 **adsUpdateStatus** | [**AdsUpdateStatus**](AdsUpdateStatus.md)|  |

### Return type

[**P2pAdsUpdateStatusResponse**](P2pAdsUpdateStatusResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksAdsDetail"></a>
# **p2pMerchantBooksAdsDetail**
> P2pAdDetailResponse p2pMerchantBooksAdsDetail(adsDetailRequest)

Query ad details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        AdsDetailRequest adsDetailRequest = new AdsDetailRequest(); // AdsDetailRequest | 
        try {
            P2pAdDetailResponse result = apiInstance.p2pMerchantBooksAdsDetail(adsDetailRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantBooksAdsDetail");
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
 **adsDetailRequest** | [**AdsDetailRequest**](AdsDetailRequest.md)|  |

### Return type

[**P2pAdDetailResponse**](P2pAdDetailResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksMyAdsList"></a>
# **p2pMerchantBooksMyAdsList**
> P2pMyAdsListResponse p2pMerchantBooksMyAdsList(myAdsListRequest)

Get my ad list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        MyAdsListRequest myAdsListRequest = new MyAdsListRequest(); // MyAdsListRequest | 
        try {
            P2pMyAdsListResponse result = apiInstance.p2pMerchantBooksMyAdsList(myAdsListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantBooksMyAdsList");
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
 **myAdsListRequest** | [**MyAdsListRequest**](MyAdsListRequest.md)|  | [optional]

### Return type

[**P2pMyAdsListResponse**](P2pMyAdsListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantBooksAdsList"></a>
# **p2pMerchantBooksAdsList**
> P2pAdsListResponse p2pMerchantBooksAdsList(adsListRequest)

Get Advertisement List

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
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        AdsListRequest adsListRequest = new AdsListRequest(); // AdsListRequest | 
        try {
            P2pAdsListResponse result = apiInstance.p2pMerchantBooksAdsList(adsListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantBooksAdsList");
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
 **adsListRequest** | [**AdsListRequest**](AdsListRequest.md)|  |

### Return type

[**P2pAdsListResponse**](P2pAdsListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatGetChatsList"></a>
# **p2pMerchantChatGetChatsList**
> P2pChatListResponse p2pMerchantChatGetChatsList(getChatsListRequest)

Get chat history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        GetChatsListRequest getChatsListRequest = new GetChatsListRequest(); // GetChatsListRequest | 
        try {
            P2pChatListResponse result = apiInstance.p2pMerchantChatGetChatsList(getChatsListRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantChatGetChatsList");
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
 **getChatsListRequest** | [**GetChatsListRequest**](GetChatsListRequest.md)|  |

### Return type

[**P2pChatListResponse**](P2pChatListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatSendChatMessage"></a>
# **p2pMerchantChatSendChatMessage**
> P2pSendChatMessageResponse p2pMerchantChatSendChatMessage(sendChatMessageRequest)

Send text message

Text messages go through off-platform traffic diversion risk control. When hit, the API still returns code 0, and data contains risk_type&#x3D;1 and toast_msg.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        SendChatMessageRequest sendChatMessageRequest = new SendChatMessageRequest(); // SendChatMessageRequest | 
        try {
            P2pSendChatMessageResponse result = apiInstance.p2pMerchantChatSendChatMessage(sendChatMessageRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantChatSendChatMessage");
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
 **sendChatMessageRequest** | [**SendChatMessageRequest**](SendChatMessageRequest.md)|  |

### Return type

[**P2pSendChatMessageResponse**](P2pSendChatMessageResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

<a name="p2pMerchantChatUploadChatFile"></a>
# **p2pMerchantChatUploadChatFile**
> P2pUploadChatFileResponse p2pMerchantChatUploadChatFile(uploadChatFile)

Upload chat file

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.P2pApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        P2pApi apiInstance = new P2pApi(defaultClient);
        UploadChatFile uploadChatFile = new UploadChatFile(); // UploadChatFile | 
        try {
            P2pUploadChatFileResponse result = apiInstance.p2pMerchantChatUploadChatFile(uploadChatFile);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling P2pApi#p2pMerchantChatUploadChatFile");
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
 **uploadChatFile** | [**UploadChatFile**](UploadChatFile.md)|  |

### Return type

[**P2pUploadChatFileResponse**](P2pUploadChatFileResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Project-Id-Version: GateApiTools 1.0.0 Report-Msgid-Bugs-To: EMAIL@ADDRESS POT-Creation-Date: 2025-11-12 18:14+0800 PO-Revision-Date: 2019-01-02 17:30+0800 Last-Translator: FULL NAME &lt;EMAIL@ADDRESS&gt; Language: en Language-Team: en &lt;L@li.org&gt; Plural-Forms: nplurals&#x3D;2; plural&#x3D;(n !&#x3D;1) MIME-Version: 1.0 Content-Type: text/plain; charset&#x3D;utf-8 Content-Transfer-Encoding: 8bit Generated-By: Babel 2.8.0  |  -  |

