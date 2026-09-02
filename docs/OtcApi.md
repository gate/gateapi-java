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
[**createOtcUploadPreUpload**](OtcApi.md#createOtcUploadPreUpload) | **POST** /otc/upload/pre_upload | Pre-upload file (temporary bucket)
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
> OtcBankCreateResponse createOtcBank(bankAccountName, bankName, bankCountry, bankAddress, iban, swift, remittanceLineNumber, agentBankName, agentBankSwift, documentationFile, documentationFileKey, fileType)

Create bank card

Bind a bank card. Under the Global entity, non-same-name accounts may enter manual review (&#x60;status&#x60; pending) and require supplementary materials later. Corresponds to Inner: &#x60;POST /bank/create&#x60;. Fields and protocol follow the live form/gateway; &#x60;bank_account_name&#x60; may be Base64-encoded in some environments—see integration notes.  Account-opening proof supports two methods (choose one):  1. **Pre-upload (recommended)**: call &#x60;POST /otc/upload/pre_upload&#x60; (&#x60;scene&#x3D;bank&#x60;) to obtain a temporary-bucket Policy and upload directly to S3, then pass &#x60;documentation_file_key&#x60; + &#x60;file_type&#x60; in this endpoint; 2. **Multipart direct upload**: pass the &#x60;documentation_file&#x60; file field; the server writes directly to the production bucket.  When using pre-upload, the server validates object existence and that the uid in the &#x60;file_key&#x60; path matches the caller; after validation, the object is moved to the production bucket and persisted. Cross-user references return &#x60;Invalid parameters file_key&#x60;; incomplete direct upload returns &#x60;Invalid parameters file not uploaded&#x60;.

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
        String remittanceLineNumber = "remittanceLineNumber_example"; // String | 
        String agentBankName = "agentBankName_example"; // String | 
        String agentBankSwift = "agentBankSwift_example"; // String | 
        String documentationFile = "documentationFile_example"; // String | Multipart direct upload; mutually exclusive with documentation_file_key
        String documentationFileKey = "documentationFileKey_example"; // String | Pre-upload mode; file_key returned by pre_upload (plaintext or base64 accepted)
        String fileType = "fileType_example"; // String | Required when using documentation_file_key; plaintext MIME or its base64
        try {
            OtcBankCreateResponse result = apiInstance.createOtcBank(bankAccountName, bankName, bankCountry, bankAddress, iban, swift, remittanceLineNumber, agentBankName, agentBankSwift, documentationFile, documentationFileKey, fileType);
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
 **remittanceLineNumber** | **String**|  | [optional]
 **agentBankName** | **String**|  | [optional]
 **agentBankSwift** | **String**|  | [optional]
 **documentationFile** | **String**| Multipart direct upload; mutually exclusive with documentation_file_key | [optional]
 **documentationFileKey** | **String**| Pre-upload mode; file_key returned by pre_upload (plaintext or base64 accepted) | [optional]
 **fileType** | **String**| Required when using documentation_file_key; plaintext MIME or its base64 | [optional]

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
> OtcActionResponse submitOtcBankPersonalSupplement(bankId, idDocumentFront, idDocumentBack, addressProof, relationshipProof)

Submit Bank Card Supplement Materials (Personal)

**Personal professional verification (type&#x3D;1)** users submit non-same-person/supplementary materials. Must match &#x60;user_type&#x3D;personal&#x60; from &#x60;GET /otc/bank/bank_supplement_checklist?bank_id&#x3D;&#x60;; otherwise rejected.  Two submission methods (can be mixed):  1. **Pre-upload (recommended)**: call &#x60;POST /otc/upload/pre_upload&#x60; (&#x60;scene&#x3D;bank&#x60;) to upload to the temporary bucket, then fill file items by category in the &#x60;relationship_proof&#x60; JSON; pass **&#x60;key&#x60; as plaintext** object path (&#x60;base64_decode(pre_upload.file_key)&#x60;, e.g. &#x60;otc_temp/{uid}/bank/xxx.png&#x60;), and &#x60;file_type&#x60; as plaintext MIME; the server base64-encodes before persistence—do not pass base64 &#x60;file_key&#x60; directly; 2. **Multipart direct upload**: one file field per material item; field names match checklist &#x60;code&#x60; (&#x60;id_document_front&#x60;, &#x60;id_document_back&#x60;, &#x60;address_proof&#x60;).

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
        String relationshipProof = "relationshipProof_example"; // String | Optional. JSON string of relationship_proof.
        try {
            OtcActionResponse result = apiInstance.submitOtcBankPersonalSupplement(bankId, idDocumentFront, idDocumentBack, addressProof, relationshipProof);
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
 **idDocumentFront** | **String**| ID document front-side file content (multipart file field, binary/Base64) | [optional]
 **idDocumentBack** | **String**| ID document back-side file content (multipart file field, binary/Base64) | [optional]
 **addressProof** | **String**| Proof-of-address file content (multipart file field, binary/Base64) | [optional]
 **relationshipProof** | **String**| Optional. JSON string of relationship_proof. | [optional]

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
> OtcActionResponse submitOtcBankEnterpriseSupplement(bankId, uid, certificate, shareHolders, passport, shareHoldingStructure, fundsStatement, additional, relationshipProof)

Submit Bank Card Supplement Materials (Enterprise)

**Enterprise professional verification (type&#x3D;2)** users submit supplementary materials. Must match &#x60;user_type&#x3D;enterprise&#x60; from the checklist.  Two submission methods (can be mixed):  1. **Pre-upload (recommended)**: call &#x60;POST /otc/upload/pre_upload&#x60; (&#x60;scene&#x3D;bank&#x60;), fill file items by category in &#x60;relationship_proof&#x60;; pass **&#x60;key&#x60; as plaintext** object path (&#x60;base64_decode(pre_upload.file_key)&#x60;), and &#x60;file_type&#x60; as plaintext MIME; 2. **Multipart direct upload**: file field names &#x60;certificate&#x60;, &#x60;share_holders&#x60;, &#x60;passport&#x60;, &#x60;share_holding_structure&#x60;; optional &#x60;funds_statement&#x60;, &#x60;additional&#x60;.

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
        String uid = "uid_example"; // String | 
        String certificate = "certificate_example"; // String | Business license / registration certificate file content (multipart file field, binary/Base64)
        String shareHolders = "shareHolders_example"; // String | Register of shareholders file content (multipart file field, binary/Base64)
        String passport = "passport_example"; // String | Legal representative / shareholder passport file content (multipart file field, binary/Base64)
        String shareHoldingStructure = "shareHoldingStructure_example"; // String | Ownership structure chart file content (multipart file field, binary/Base64)
        String fundsStatement = "fundsStatement_example"; // String | Proof-of-funds file content (multipart file field, binary/Base64, optional)
        String additional = "additional_example"; // String | Other supplementary material file content (multipart file field, binary/Base64, optional)
        String relationshipProof = "relationshipProof_example"; // String | Optional. JSON string of relationship_proof.
        try {
            OtcActionResponse result = apiInstance.submitOtcBankEnterpriseSupplement(bankId, uid, certificate, shareHolders, passport, shareHoldingStructure, fundsStatement, additional, relationshipProof);
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
 **uid** | **String**|  | [optional]
 **certificate** | **String**| Business license / registration certificate file content (multipart file field, binary/Base64) | [optional]
 **shareHolders** | **String**| Register of shareholders file content (multipart file field, binary/Base64) | [optional]
 **passport** | **String**| Legal representative / shareholder passport file content (multipart file field, binary/Base64) | [optional]
 **shareHoldingStructure** | **String**| Ownership structure chart file content (multipart file field, binary/Base64) | [optional]
 **fundsStatement** | **String**| Proof-of-funds file content (multipart file field, binary/Base64, optional) | [optional]
 **additional** | **String**| Other supplementary material file content (multipart file field, binary/Base64, optional) | [optional]
 **relationshipProof** | **String**| Optional. JSON string of relationship_proof. | [optional]

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

<a name="createOtcUploadPreUpload"></a>
# **createOtcUploadPreUpload**
> OtcUploadPreUploadResponse createOtcUploadPreUpload(otcUploadPreUploadRequest)

Pre-upload file (temporary bucket)

After selecting a file, the client calls this endpoint first to obtain a temporary-bucket POST Policy and &#x60;file_key&#x60;; then upload directly to S3 using the returned &#x60;url&#x60; and &#x60;fields&#x60; (success HTTP 204); finally, in business submit endpoints (e.g. &#x60;POST /otc/order/paid&#x60;, &#x60;POST /otc/bank/create&#x60;), pass the **same base64 &#x60;file_key&#x60; unchanged** (do not decode). The server validates ownership and object existence, then moves to the production bucket and persists. Unsubmitted files remain in the temporary bucket and are reclaimed by lifecycle rules.  Corresponds to Inner: &#x60;POST /upload/pre_upload&#x60;.  **&#x60;content_type&#x60; must be sent as base64** (plaintext containing &#x60;/&#x60; may be blocked by the gateway). Only the following MIME types are supported:  | MIME | base64 | Extension | | --- | --- | --- | | image/png | aW1hZ2UvcG5n | .png | | image/jpeg | aW1hZ2UvanBlZw&#x3D;&#x3D; | .jpeg | | image/jpg | aW1hZ2UvanBn | .jpg | | application/pdf | YXBwbGljYXRpb24vcGRm | .pdf |  **&#x60;scene&#x60; mapping to downstream endpoints**:  | scene | Typical use | | --- | --- | | general | Fiat buy payment receipt (&#x60;payment_receipt_file_key&#x60; in &#x60;POST /otc/order/paid&#x60;) | | bank | Add card, bank card supplementary materials | | assessment | Professional verification materials | | credit | Credit limit increase materials |  **Credential validity**: response &#x60;expires_in&#x60; is **5400 seconds (90 minutes)**; &#x60;fields.Policy&#x60; &#x60;expiration&#x60; matches it. Complete the S3 direct upload within this window; after expiry, call this endpoint again for a new credential.  **File size**: the S3 POST Policy enforces &#x60;content-length-range&#x60; **1 byte ~ 10MB** (10485760 bytes). Uploads exceeding the limit are rejected by S3; all &#x60;scene&#x60; values share this limit.  **Direct S3 upload**: &#x60;url&#x60; is the upload address; send each key-value pair in &#x60;fields&#x60; unchanged as form-data; the &#x60;file&#x60; field must be last. Object path is generated as &#x60;otc_temp/{uid}/{scene}/{unique filename}&#x60;; uid is taken from the login session.  This endpoint returns &#x60;content type is required.&#x60; when &#x60;content_type&#x60; is missing. Ownership and object-existence checks for &#x60;file_key&#x60; are performed by the subsequent business submission endpoint.

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
        OtcUploadPreUploadRequest otcUploadPreUploadRequest = new OtcUploadPreUploadRequest(); // OtcUploadPreUploadRequest | 
        try {
            OtcUploadPreUploadResponse result = apiInstance.createOtcUploadPreUpload(otcUploadPreUploadRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling OtcApi#createOtcUploadPreUpload");
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
 **otcUploadPreUploadRequest** | [**OtcUploadPreUploadRequest**](OtcUploadPreUploadRequest.md)|  |

### Return type

[**OtcUploadPreUploadResponse**](OtcUploadPreUploadResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pre-upload credentials issued successfully |  -  |

<a name="markOtcOrderPaid"></a>
# **markOtcOrderPaid**
> OtcActionResponse markOtcOrderPaid(otcMarkOrderPaidRequest)

Mark fiat order as paid (deposit confirmation)

Mark a fiat buy order as paid (deposit confirmation). **A user payment receipt must be uploaded**: &#x60;payment_receipt_file_key&#x60; is required; supported formats are jpg / jpeg / png / pdf, with a maximum size of 10 MB per file (validated jointly by the service and gateway). The compatible field name &#x60;payment_receipt&#x60; depends on the gateway and production contract. The persisted field is &#x60;otc_trade_record.payment_receipt_file_key&#x60;. The Pay Inner path is &#x60;POST .../pay/order_set_paid&#x60; (which commonly identifies orders by &#x60;client_order_id&#x60;); the Inner path corresponding to this OpenAPI operation, &#x60;POST /order/paid&#x60;, still primarily uses &#x60;order_id&#x60;. If the gateway standardizes on the merchant order ID, follow the gateway documentation.  **Recommended pre-upload flow**: first call &#x60;POST /otc/upload/pre_upload&#x60; (&#x60;scene&#x3D;general&#x60;) and upload directly to the temporary bucket, then pass the returned **base64 &#x60;file_key&#x60; unchanged** (do not decode) to this endpoint. The service validates the uid and object existence before moving the object to the production bucket. A cross-user key returns &#x60;Invalid parameters file_key&#x60;; an object that has not been uploaded returns &#x60;Invalid parameters file not uploaded&#x60;. The legacy flow using a base64 key for an object uploaded directly to the production bucket remains supported.

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

