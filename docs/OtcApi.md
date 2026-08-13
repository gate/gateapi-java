# OtcApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOtcQuote**](OtcApi.md#createOtcQuote) | **POST** /otc/quote | Fiat and stablecoin quote
[**createOtcOrder**](OtcApi.md#createOtcOrder) | **POST** /otc/order/create | Create fiat order
[**createStableCoinOrder**](OtcApi.md#createStableCoinOrder) | **POST** /otc/stable_coin/order/create | Create stablecoin order
[**getBankListInnerPath**](OtcApi.md#getBankListInnerPath) | **GET** /otc/bank/list | Get user bank card list
[**createOtcBank**](OtcApi.md#createOtcBank) | **POST** /otc/bank/create | Create bank card
[**deleteOtcBank**](OtcApi.md#deleteOtcBank) | **POST** /otc/bank/delete | Delete bank card
[**setDefaultOtcBank**](OtcApi.md#setDefaultOtcBank) | **POST** /otc/bank/set_default | Set default bank card
[**getOtcBankSupplementChecklist**](OtcApi.md#getOtcBankSupplementChecklist) | **GET** /otc/bank/bank_supplement_checklist | Query the checklist of materials to supplement for a bank card
[**submitOtcBankPersonalSupplement**](OtcApi.md#submitOtcBankPersonalSupplement) | **POST** /otc/bank/personal/bank_supplement | Submit Bank Card Supplement Materials (Personal)
[**submitOtcBankEnterpriseSupplement**](OtcApi.md#submitOtcBankEnterpriseSupplement) | **POST** /otc/bank/enterprise/bank_supplement | Submit Bank Card Supplement Materials (Enterprise)
[**markOtcOrderPaid**](OtcApi.md#markOtcOrderPaid) | **POST** /otc/order/paid | Mark fiat order as paid (deposit confirmation)
[**cancelOtcOrder**](OtcApi.md#cancelOtcOrder) | **POST** /otc/order/cancel | Fiat order cancellation
[**listOtcOrders**](OtcApi.md#listOtcOrders) | **GET** /otc/order/list | Fiat order list
[**listStableCoinOrders**](OtcApi.md#listStableCoinOrders) | **GET** /otc/stable_coin/order/list | Stablecoin order list
[**getOtcOrderDetail**](OtcApi.md#getOtcOrderDetail) | **GET** /otc/order/detail | Fiat order details


<a name="createOtcQuote"></a>
# **createOtcQuote**
> OtcQuoteResponse createOtcQuote(otcQuoteRequest)

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
        OtcQuoteRequest otcQuoteRequest = new OtcQuoteRequest(); // OtcQuoteRequest | 
        try {
            OtcQuoteResponse result = apiInstance.createOtcQuote(otcQuoteRequest);
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
 **otcQuoteRequest** | [**OtcQuoteRequest**](OtcQuoteRequest.md)|  |

### Return type

[**OtcQuoteResponse**](OtcQuoteResponse.md)

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
> OtcActionResponse createOtcOrder(otcOrderRequest)

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
        OtcOrderRequest otcOrderRequest = new OtcOrderRequest(); // OtcOrderRequest | 
        try {
            OtcActionResponse result = apiInstance.createOtcOrder(otcOrderRequest);
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
 **otcOrderRequest** | [**OtcOrderRequest**](OtcOrderRequest.md)|  |

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

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
> OtcStableCoinOrderCreateResponse createStableCoinOrder(otcStableCoinOrderRequest)

Create stablecoin order

Create a stablecoin order. All request body fields except &#x60;promotion_code&#x60; are required.

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
        OtcStableCoinOrderRequest otcStableCoinOrderRequest = new OtcStableCoinOrderRequest(); // OtcStableCoinOrderRequest | 
        try {
            OtcStableCoinOrderCreateResponse result = apiInstance.createStableCoinOrder(otcStableCoinOrderRequest);
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
 **otcStableCoinOrderRequest** | [**OtcStableCoinOrderRequest**](OtcStableCoinOrderRequest.md)|  |

### Return type

[**OtcStableCoinOrderCreateResponse**](OtcStableCoinOrderCreateResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Stablecoin order created successfully |  -  |

<a name="getBankListInnerPath"></a>
# **getBankListInnerPath**
> OtcBankListResponse getBankListInnerPath()

Get user bank card list

List the user&#39;s bank cards for selecting a card when placing an order. **Default card**: use the &#x60;is_default&#x60; field in each list item (&#x60;1&#x60; indicates the default). The deprecated standalone default-bank-card endpoint is no longer required.

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
            OtcBankListResponse result = apiInstance.getBankListInnerPath();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#getBankListInnerPath");
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

[**OtcBankListResponse**](OtcBankListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="createOtcBank"></a>
# **createOtcBank**
> OtcBankCreateResponse createOtcBank(bankAccountName, bankName, bankCountry, bankAddress, iban, swift, documentationFile, remittanceLineNumber, agentBankName, agentBankSwift)

Create bank card

Bind a bank card. Under the Global entity, an account with a non-matching name may enter manual review (&#x60;status&#x60; pending) and require subsequent supplementary materials. Corresponding Inner: &#x60;POST /bank/create&#x60;. Fields and protocol are subject to the production form/gateway; in some environments &#x60;bank_account_name&#x60; is passed Base64-encoded, see the integration notes for details.

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
        String bankAccountName = "bankAccountName_example"; // String | 
        String bankName = "bankName_example"; // String | 
        String bankCountry = "bankCountry_example"; // String | 
        String bankAddress = "bankAddress_example"; // String | 
        String iban = "iban_example"; // String | 
        String swift = "swift_example"; // String | 
        String documentationFile = "documentationFile_example"; // String | Account opening proof file content (multipart file field, binary/Base64; jpg/jpeg/png/pdf, etc.; maximum 10 MB per file, subject to the live environment)
        String remittanceLineNumber = "remittanceLineNumber_example"; // String | 
        String agentBankName = "agentBankName_example"; // String | 
        String agentBankSwift = "agentBankSwift_example"; // String | 
        try {
            OtcBankCreateResponse result = apiInstance.createOtcBank(bankAccountName, bankName, bankCountry, bankAddress, iban, swift, documentationFile, remittanceLineNumber, agentBankName, agentBankSwift);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#createOtcBank");
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
 **bankAccountName** | **String**|  |
 **bankName** | **String**|  |
 **bankCountry** | **String**|  |
 **bankAddress** | **String**|  |
 **iban** | **String**|  |
 **swift** | **String**|  |
 **documentationFile** | **String**| Account opening proof file content (multipart file field, binary/Base64; jpg/jpeg/png/pdf, etc.; maximum 10 MB per file, subject to the live environment) |
 **remittanceLineNumber** | **String**|  | [optional]
 **agentBankName** | **String**|  | [optional]
 **agentBankSwift** | **String**|  | [optional]

### Return type

[**OtcBankCreateResponse**](OtcBankCreateResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accepted successfully |  -  |

<a name="deleteOtcBank"></a>
# **deleteOtcBank**
> OtcActionResponse deleteOtcBank(otcBankIdRequest)

Delete bank card

Delete the specified bank card. Corresponds to Inner: &#x60;POST /bank/delete&#x60;.

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
        OtcBankIdRequest otcBankIdRequest = new OtcBankIdRequest(); // OtcBankIdRequest | 
        try {
            OtcActionResponse result = apiInstance.deleteOtcBank(otcBankIdRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#deleteOtcBank");
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
 **otcBankIdRequest** | [**OtcBankIdRequest**](OtcBankIdRequest.md)|  |

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Deleted successfully |  -  |

<a name="setDefaultOtcBank"></a>
# **setDefaultOtcBank**
> OtcActionResponse setDefaultOtcBank(otcBankIdRequest)

Set default bank card

Set the specified bank card as default. Corresponds to Inner: &#x60;POST /bank/set_default&#x60;.

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
        OtcBankIdRequest otcBankIdRequest = new OtcBankIdRequest(); // OtcBankIdRequest | 
        try {
            OtcActionResponse result = apiInstance.setDefaultOtcBank(otcBankIdRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#setDefaultOtcBank");
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
 **otcBankIdRequest** | [**OtcBankIdRequest**](OtcBankIdRequest.md)|  |

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Set successfully |  -  |

<a name="getOtcBankSupplementChecklist"></a>
# **getOtcBankSupplementChecklist**
> OtcBankSupplementChecklistResponse getOtcBankSupplementChecklist(bankId)

Query the checklist of materials to supplement for a bank card

**①** &#x60;bank_id&#x60; must be specified. After verifying that the card belongs to the current user and its status allows supplementary documents, the endpoint returns the required items based on the user&#39;s **approved advanced verification type** (personal/enterprise); each item&#39;s &#x60;description&#x60; states the submission requirements. Corresponding Inner endpoint: &#x60;GET /bank/bank_supplement_checklist&#x60;.

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
        String bankId = "bankId_example"; // String | Bank card ID (otc_rds / the id returned by the list endpoint).
        try {
            OtcBankSupplementChecklistResponse result = apiInstance.getOtcBankSupplementChecklist(bankId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#getOtcBankSupplementChecklist");
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
 **bankId** | **String**| Bank card ID (otc_rds / the id returned by the list endpoint). |

### Return type

[**OtcBankSupplementChecklistResponse**](OtcBankSupplementChecklistResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="submitOtcBankPersonalSupplement"></a>
# **submitOtcBankPersonalSupplement**
> OtcActionResponse submitOtcBankPersonalSupplement(bankId, idDocumentFront, idDocumentBack, addressProof)

Submit Bank Card Supplement Materials (Personal)

**Personal professional verification (type&#x3D;1)** users submit non-same-person/supplementary materials. Must match &#x60;user_type&#x3D;personal&#x60; returned by &#x60;GET /otc/bank/bank_supplement_checklist?bank_id&#x3D;&#x60;, otherwise the request is rejected. **multipart/form-data** is recommended: each material item is a separate file field, with field names matching the checklist &#x60;code&#x60; (&#x60;id_document_front&#x60;, &#x60;id_document_back&#x60;, &#x60;address_proof&#x60;).

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
        String bankId = "bankId_example"; // String | 
        String idDocumentFront = "idDocumentFront_example"; // String | ID document front-side file content (multipart file field, binary/Base64)
        String idDocumentBack = "idDocumentBack_example"; // String | ID document back-side file content (multipart file field, binary/Base64)
        String addressProof = "addressProof_example"; // String | Proof-of-address file content (multipart file field, binary/Base64)
        try {
            OtcActionResponse result = apiInstance.submitOtcBankPersonalSupplement(bankId, idDocumentFront, idDocumentBack, addressProof);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#submitOtcBankPersonalSupplement");
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
 **bankId** | **String**|  |
 **idDocumentFront** | **String**| ID document front-side file content (multipart file field, binary/Base64) |
 **idDocumentBack** | **String**| ID document back-side file content (multipart file field, binary/Base64) |
 **addressProof** | **String**| Proof-of-address file content (multipart file field, binary/Base64) |

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accepted successfully |  -  |

<a name="submitOtcBankEnterpriseSupplement"></a>
# **submitOtcBankEnterpriseSupplement**
> OtcActionResponse submitOtcBankEnterpriseSupplement(bankId, certificate, shareHolders, passport, shareHoldingStructure, uid, fundsStatement, additional)

Submit Bank Card Supplement Materials (Enterprise)

**Enterprise professional verification (type&#x3D;2)** users submit supplementary materials. Must match &#x60;user_type&#x3D;enterprise&#x60; returned by the checklist. **multipart** file field names: &#x60;certificate&#x60;, &#x60;share_holders&#x60;, &#x60;passport&#x60;, &#x60;share_holding_structure&#x60;.

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
        String bankId = "bankId_example"; // String | 
        String certificate = "certificate_example"; // String | Business license / registration certificate file content (multipart file field, binary/Base64)
        String shareHolders = "shareHolders_example"; // String | Register of shareholders file content (multipart file field, binary/Base64)
        String passport = "passport_example"; // String | Legal representative / shareholder passport file content (multipart file field, binary/Base64)
        String shareHoldingStructure = "shareHoldingStructure_example"; // String | Ownership structure chart file content (multipart file field, binary/Base64)
        String uid = "uid_example"; // String | 
        String fundsStatement = "fundsStatement_example"; // String | Proof-of-funds file content (multipart file field, binary/Base64, optional)
        String additional = "additional_example"; // String | Other supplementary material file content (multipart file field, binary/Base64, optional)
        try {
            OtcActionResponse result = apiInstance.submitOtcBankEnterpriseSupplement(bankId, certificate, shareHolders, passport, shareHoldingStructure, uid, fundsStatement, additional);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#submitOtcBankEnterpriseSupplement");
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
 **bankId** | **String**|  |
 **certificate** | **String**| Business license / registration certificate file content (multipart file field, binary/Base64) |
 **shareHolders** | **String**| Register of shareholders file content (multipart file field, binary/Base64) |
 **passport** | **String**| Legal representative / shareholder passport file content (multipart file field, binary/Base64) |
 **shareHoldingStructure** | **String**| Ownership structure chart file content (multipart file field, binary/Base64) |
 **uid** | **String**|  | [optional]
 **fundsStatement** | **String**| Proof-of-funds file content (multipart file field, binary/Base64, optional) | [optional]
 **additional** | **String**| Other supplementary material file content (multipart file field, binary/Base64, optional) | [optional]

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Accepted successfully |  -  |

<a name="markOtcOrderPaid"></a>
# **markOtcOrderPaid**
> OtcActionResponse markOtcOrderPaid(otcMarkOrderPaidRequest)

Mark fiat order as paid (deposit confirmation)

Mark a fiat BUY order as paid (deposit confirmation). **A user payment receipt must be uploaded**: &#x60;payment_receipt_file_key&#x60; is required; supported formats are jpg/jpeg/png/pdf, with a maximum size of 10 MB per file (validated jointly by the service and gateway). The compatibility field name &#x60;payment_receipt&#x60; is subject to the gateway/live environment. The persisted field is &#x60;otc_trade_record.payment_receipt_file_key&#x60;. The Pay Inner path is &#x60;POST .../pay/order_set_paid&#x60; (commonly associated by &#x60;client_order_id&#x60;); the Inner path corresponding to this OpenAPI endpoint, &#x60;POST /order/paid&#x60;, still primarily uses &#x60;order_id&#x60;. If the gateway standardizes on the merchant order ID, follow the gateway documentation.

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
        OtcMarkOrderPaidRequest otcMarkOrderPaidRequest = new OtcMarkOrderPaidRequest(); // OtcMarkOrderPaidRequest | 
        try {
            OtcActionResponse result = apiInstance.markOtcOrderPaid(otcMarkOrderPaidRequest);
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
 **otcMarkOrderPaidRequest** | [**OtcMarkOrderPaidRequest**](OtcMarkOrderPaidRequest.md)|  |

### Return type

[**OtcActionResponse**](OtcActionResponse.md)

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
> OtcActionResponse cancelOtcOrder(orderId)

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
            OtcActionResponse result = apiInstance.cancelOtcOrder(orderId);
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

[**OtcActionResponse**](OtcActionResponse.md)

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
> OtcOrderListResponse listOtcOrders().type(type).fiatCurrency(fiatCurrency).cryptoCurrency(cryptoCurrency).startTime(startTime).endTime(endTime).status(status).pn(pn).ps(ps).execute();

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
        String status = "status_example"; // String | DONE: completed CANCEL: canceled PROCESSING: in progress DISBURSED: disbursed
        String pn = "pn_example"; // String | Page number
        String ps = "ps_example"; // String | Number of items per page
        try {
            OtcOrderListResponse result = apiInstance.listOtcOrders()
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
 **status** | **String**| DONE: completed CANCEL: canceled PROCESSING: in progress DISBURSED: disbursed | [optional]
 **pn** | **String**| Page number | [optional]
 **ps** | **String**| Number of items per page | [optional]

### Return type

[**OtcOrderListResponse**](OtcOrderListResponse.md)

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
> OtcStableCoinOrderListResponse listStableCoinOrders().pageSize(pageSize).pageNumber(pageNumber).coinName(coinName).startTime(startTime).endTime(endTime).status(status).execute();

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
            OtcStableCoinOrderListResponse result = apiInstance.listStableCoinOrders()
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

[**OtcStableCoinOrderListResponse**](OtcStableCoinOrderListResponse.md)

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
> OtcOrderDetailResponse getOtcOrderDetail(orderId)

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
            OtcOrderDetailResponse result = apiInstance.getOtcOrderDetail(orderId);
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

[**OtcOrderDetailResponse**](OtcOrderDetailResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

