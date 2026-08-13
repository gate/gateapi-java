# UnifiedApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listUnifiedAccounts**](UnifiedApi.md#listUnifiedAccounts) | **GET** /unified/accounts | Get unified account information
[**getUnifiedBorrowable**](UnifiedApi.md#getUnifiedBorrowable) | **GET** /unified/borrowable | Query maximum borrowable amount for unified account
[**getUnifiedTransferable**](UnifiedApi.md#getUnifiedTransferable) | **GET** /unified/transferable | Query maximum transferable amount for unified account
[**getUnifiedTransferables**](UnifiedApi.md#getUnifiedTransferables) | **GET** /unified/transferables | Batch query maximum transferable amount for unified accounts. Each currency shows the maximum value. After user withdrawal, the transferable amount for all currencies will change
[**getUnifiedBorrowableList**](UnifiedApi.md#getUnifiedBorrowableList) | **GET** /unified/batch_borrowable | Batch query unified account maximum borrowable amount
[**listUnifiedLoans**](UnifiedApi.md#listUnifiedLoans) | **GET** /unified/loans | Query loans
[**createUnifiedLoan**](UnifiedApi.md#createUnifiedLoan) | **POST** /unified/loans | Borrow or repay
[**listUnifiedLoanRecords**](UnifiedApi.md#listUnifiedLoanRecords) | **GET** /unified/loan_records | Query loan records
[**listUnifiedLoanInterestRecords**](UnifiedApi.md#listUnifiedLoanInterestRecords) | **GET** /unified/interest_records | Query interest deduction records
[**getUnifiedRiskUnits**](UnifiedApi.md#getUnifiedRiskUnits) | **GET** /unified/risk_units | Get user risk unit details
[**getUnifiedMode**](UnifiedApi.md#getUnifiedMode) | **GET** /unified/unified_mode | Query mode of the unified account
[**setUnifiedMode**](UnifiedApi.md#setUnifiedMode) | **PUT** /unified/unified_mode | Set unified account mode
[**getUnifiedEstimateRate**](UnifiedApi.md#getUnifiedEstimateRate) | **GET** /unified/estimate_rate | Query unified account estimated interest rate
[**listCurrencyDiscountTiers**](UnifiedApi.md#listCurrencyDiscountTiers) | **GET** /unified/currency_discount_tiers | Query unified account tiered
[**listLoanMarginTiers**](UnifiedApi.md#listLoanMarginTiers) | **GET** /unified/loan_margin_tiers | Query unified account tiered loan margin
[**calculatePortfolioMargin**](UnifiedApi.md#calculatePortfolioMargin) | **POST** /unified/portfolio_calculator | Portfolio margin calculator
[**setUserLeverage**](UnifiedApi.md#setUserLeverage) | **POST** /unified/leverage/user_setting | Set leverage for all of the user&#39;s borrowed currencies
[**getUserLeverageCurrencyConfig**](UnifiedApi.md#getUserLeverageCurrencyConfig) | **GET** /unified/leverage/user_currency_config | Maximum and minimum currency leverage that can be set
[**getUserLeverageCurrencySetting**](UnifiedApi.md#getUserLeverageCurrencySetting) | **GET** /unified/leverage/user_currency_setting | Get user currency leverage
[**setUserLeverageCurrencySetting**](UnifiedApi.md#setUserLeverageCurrencySetting) | **POST** /unified/leverage/user_currency_setting | Set loan currency leverage
[**listUnifiedCurrencies**](UnifiedApi.md#listUnifiedCurrencies) | **GET** /unified/currencies | List of loan currencies supported by unified account
[**getHistoryLoanRate**](UnifiedApi.md#getHistoryLoanRate) | **GET** /unified/history_loan_rate | Get historical lending rates
[**setUnifiedCollateral**](UnifiedApi.md#setUnifiedCollateral) | **POST** /unified/collateral_currencies | Set collateral currency
[**getEstimatedQuickRepayment**](UnifiedApi.md#getEstimatedQuickRepayment) | **GET** /unified/estimated_quick_repayment | Estimated quick repayment details
[**createQuickRepayment**](UnifiedApi.md#createQuickRepayment) | **POST** /unified/quick_repayment | Quick repayment
[**getUnifiedDeltaNeutral**](UnifiedApi.md#getUnifiedDeltaNeutral) | **GET** /unified/delta_neutral | Query the account Delta-neutral strategy mode setting
[**setUnifiedDeltaNeutral**](UnifiedApi.md#setUnifiedDeltaNeutral) | **POST** /unified/delta_neutral | Set the account Delta-neutral strategy mode


<a name="listUnifiedAccounts"></a>
# **listUnifiedAccounts**
> UnifiedAccount listUnifiedAccounts().currency(currency).subUid(subUid).execute();

Get unified account information

The assets of each currency in the account will be adjusted according to their liquidity, defined by corresponding adjustment coefficients, and then uniformly converted to USD to calculate the total asset value and position value of the account.  For specific formulas, please refer to [Margin Formula](#margin-formula)

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        String subUid = "10001"; // String | Sub account user ID
        try {
            UnifiedAccount result = apiInstance.listUnifiedAccounts()
                        .currency(currency)
                        .subUid(subUid)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedAccounts");
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
 **subUid** | **String**| Sub account user ID | [optional]

### Return type

[**UnifiedAccount**](UnifiedAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getUnifiedBorrowable"></a>
# **getUnifiedBorrowable**
> UnifiedBorrowable getUnifiedBorrowable(currency)

Query maximum borrowable amount for unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        try {
            UnifiedBorrowable result = apiInstance.getUnifiedBorrowable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedBorrowable");
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
 **currency** | **String**| Query by specified currency name |

### Return type

[**UnifiedBorrowable**](UnifiedBorrowable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUnifiedTransferable"></a>
# **getUnifiedTransferable**
> UnifiedTransferable getUnifiedTransferable(currency)

Query maximum transferable amount for unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        try {
            UnifiedTransferable result = apiInstance.getUnifiedTransferable(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedTransferable");
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
 **currency** | **String**| Query by specified currency name |

### Return type

[**UnifiedTransferable**](UnifiedTransferable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUnifiedTransferables"></a>
# **getUnifiedTransferables**
> List&lt;TransferablesResult&gt; getUnifiedTransferables(currencies)

Batch query maximum transferable amount for unified accounts. Each currency shows the maximum value. After user withdrawal, the transferable amount for all currencies will change

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currencies = "BTC,ETH"; // String | Specify the currency name to query in batches, and support up to 100 pass parameters at a time
        try {
            List<TransferablesResult> result = apiInstance.getUnifiedTransferables(currencies);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedTransferables");
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
 **currencies** | **String**| Specify the currency name to query in batches, and support up to 100 pass parameters at a time |

### Return type

[**List&lt;TransferablesResult&gt;**](TransferablesResult.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUnifiedBorrowableList"></a>
# **getUnifiedBorrowableList**
> List&lt;UnifiedBorrowable&gt; getUnifiedBorrowableList(currencies)

Batch query unified account maximum borrowable amount

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        List<String> currencies = Arrays.asList(); // List<String> | Specify currency names for querying in an array, separated by commas, maximum 10 currencies
        try {
            List<UnifiedBorrowable> result = apiInstance.getUnifiedBorrowableList(currencies);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedBorrowableList");
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
 **currencies** | [**List&lt;String&gt;**](String.md)| Specify currency names for querying in an array, separated by commas, maximum 10 currencies |

### Return type

[**List&lt;UnifiedBorrowable&gt;**](UnifiedBorrowable.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listUnifiedLoans"></a>
# **listUnifiedLoans**
> List&lt;UniLoan&gt; listUnifiedLoans().currency(currency).page(page).limit(limit).type(type).execute();

Query loans

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of items returned. Default: 100, minimum: 1, maximum: 100
        String type = "platform"; // String | Loan type: platform borrowing - platform, margin borrowing - margin
        try {
            List<UniLoan> result = apiInstance.listUnifiedLoans()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoans");
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
 **limit** | **Integer**| Maximum number of items returned. Default: 100, minimum: 1, maximum: 100 | [optional] [default to 100]
 **type** | **String**| Loan type: platform borrowing - platform, margin borrowing - margin | [optional]

### Return type

[**List&lt;UniLoan&gt;**](UniLoan.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="createUnifiedLoan"></a>
# **createUnifiedLoan**
> UnifiedLoanResult createUnifiedLoan(unifiedLoan)

Borrow or repay

When borrowing, ensure the borrowed amount is not below the minimum borrowing threshold for the specific cryptocurrency and does not exceed the maximum borrowing limit set by the platform and user.  Loan interest will be automatically deducted from the account at regular intervals. Users are responsible for managing repayment of borrowed amounts.  For repayment, use &#x60;repaid_all&#x3D;true&#x60; to repay all available amounts

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedLoan unifiedLoan = new UnifiedLoan(); // UnifiedLoan | 
        try {
            UnifiedLoanResult result = apiInstance.createUnifiedLoan(unifiedLoan);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#createUnifiedLoan");
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
 **unifiedLoan** | [**UnifiedLoan**](UnifiedLoan.md)|  |

### Return type

[**UnifiedLoanResult**](UnifiedLoanResult.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Operation successful |  -  |

<a name="listUnifiedLoanRecords"></a>
# **listUnifiedLoanRecords**
> List&lt;UnifiedLoanRecord&gt; listUnifiedLoanRecords().type(type).currency(currency).page(page).limit(limit).execute();

Query loan records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String type = "type_example"; // String | Loan record type: borrow - borrowing, repay - repayment
        String currency = "BTC"; // String | Query by specified currency name
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of items returned. Default: 100, minimum: 1, maximum: 100
        try {
            List<UnifiedLoanRecord> result = apiInstance.listUnifiedLoanRecords()
                        .type(type)
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoanRecords");
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
 **type** | **String**| Loan record type: borrow - borrowing, repay - repayment | [optional]
 **currency** | **String**| Query by specified currency name | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of items returned. Default: 100, minimum: 1, maximum: 100 | [optional] [default to 100]

### Return type

[**List&lt;UnifiedLoanRecord&gt;**](UnifiedLoanRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listUnifiedLoanInterestRecords"></a>
# **listUnifiedLoanInterestRecords**
> List&lt;UniLoanInterestRecord&gt; listUnifiedLoanInterestRecords().currency(currency).page(page).limit(limit).from(from).to(to).type(type).execute();

Query interest deduction records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Query by specified currency name
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of items returned. Default: 100, minimum: 1, maximum: 100
        Long from = 1627706330L; // Long | Start timestamp for the query
        Long to = 1635329650L; // Long | End timestamp for the query, defaults to current time if not specified
        String type = "platform"; // String | Loan type: platform borrowing - platform, margin borrowing - margin. Defaults to margin if not specified
        try {
            List<UniLoanInterestRecord> result = apiInstance.listUnifiedLoanInterestRecords()
                        .currency(currency)
                        .page(page)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedLoanInterestRecords");
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
 **limit** | **Integer**| Maximum number of items returned. Default: 100, minimum: 1, maximum: 100 | [optional] [default to 100]
 **from** | **Long**| Start timestamp for the query | [optional]
 **to** | **Long**| End timestamp for the query, defaults to current time if not specified | [optional]
 **type** | **String**| Loan type: platform borrowing - platform, margin borrowing - margin. Defaults to margin if not specified | [optional]

### Return type

[**List&lt;UniLoanInterestRecord&gt;**](UniLoanInterestRecord.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUnifiedRiskUnits"></a>
# **getUnifiedRiskUnits**
> UnifiedRiskUnits getUnifiedRiskUnits()

Get user risk unit details

Get user risk unit details, only valid in portfolio margin mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            UnifiedRiskUnits result = apiInstance.getUnifiedRiskUnits();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedRiskUnits");
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

[**UnifiedRiskUnits**](UnifiedRiskUnits.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUnifiedMode"></a>
# **getUnifiedMode**
> UnifiedModeSet getUnifiedMode()

Query mode of the unified account

Unified account mode: - &#x60;classic&#x60;: Classic account mode - &#x60;multi_currency&#x60;: Cross-currency margin mode - &#x60;portfolio&#x60;: Portfolio margin mode - &#x60;single_currency&#x60;: Single-currency margin mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            UnifiedModeSet result = apiInstance.getUnifiedMode();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedMode");
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

[**UnifiedModeSet**](UnifiedModeSet.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="setUnifiedMode"></a>
# **setUnifiedMode**
> setUnifiedMode(unifiedModeSet)

Set unified account mode

Each account mode switch only requires passing the corresponding account mode parameter, and also supports turning on or off the configuration switches under the corresponding account mode during the switch. - When enabling the classic account mode, mode&#x3D;classic &#x60;&#x60;&#x60;  PUT /unified/unified_mode  {  \&quot;mode\&quot;: \&quot;classic\&quot;  } &#x60;&#x60;&#x60; - When enabling the cross-currency margin \&quot;multi_currency\&quot;,  \&quot;settings\&quot;: {  \&quot;usdt_futures\&quot;: true  }  } &#x60;&#x60;&#x60; - When enabling the portfolio margin mode, mode&#x3D;portfolio &#x60;&#x60;&#x60;  PUT /unified/unified_mode  {  \&quot;mode\&quot;: \&quot;portfolio\&quot;,  \&quot;settings\&quot;: {  \&quot;spot_hedge\&quot;: true  }  } &#x60;&#x60;&#x60; - When enabling the single-currency margin mode, mode&#x3D;single_currency &#x60;&#x60;&#x60;  PUT /unified/unified_mode  {  \&quot;mode\&quot;: \&quot;single_currency\&quot;  } &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedModeSet unifiedModeSet = new UnifiedModeSet(); // UnifiedModeSet | 
        try {
            apiInstance.setUnifiedMode(unifiedModeSet);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUnifiedMode");
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
 **unifiedModeSet** | [**UnifiedModeSet**](UnifiedModeSet.md)|  |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Set successfully |  -  |

<a name="getUnifiedEstimateRate"></a>
# **getUnifiedEstimateRate**
> Map&lt;String, String&gt; getUnifiedEstimateRate(currencies)

Query unified account estimated interest rate

Interest rates fluctuate hourly based on lending depth, so exact rates cannot be provided. When a currency is not supported, the interest rate returned will be an empty string

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        List<String> currencies = Arrays.asList(); // List<String> | Specify currency names for querying in an array, separated by commas, maximum 10 currencies
        try {
            Map<String, String> result = apiInstance.getUnifiedEstimateRate(currencies);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedEstimateRate");
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
 **currencies** | [**List&lt;String&gt;**](String.md)| Specify currency names for querying in an array, separated by commas, maximum 10 currencies |

### Return type

**Map&lt;String, String&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listCurrencyDiscountTiers"></a>
# **listCurrencyDiscountTiers**
> List&lt;UnifiedDiscount&gt; listCurrencyDiscountTiers()

Query unified account tiered

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            List<UnifiedDiscount> result = apiInstance.listCurrencyDiscountTiers();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listCurrencyDiscountTiers");
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

[**List&lt;UnifiedDiscount&gt;**](UnifiedDiscount.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listLoanMarginTiers"></a>
# **listLoanMarginTiers**
> List&lt;UnifiedMarginTiers&gt; listLoanMarginTiers()

Query unified account tiered loan margin

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            List<UnifiedMarginTiers> result = apiInstance.listLoanMarginTiers();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listLoanMarginTiers");
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

[**List&lt;UnifiedMarginTiers&gt;**](UnifiedMarginTiers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="calculatePortfolioMargin"></a>
# **calculatePortfolioMargin**
> UnifiedPortfolioOutput calculatePortfolioMargin(unifiedPortfolioInput)

Portfolio margin calculator

Portfolio Margin Calculator  This interface calculates maintenance and initial margin requirements under the portfolio margin model for custom simulated position and order portfolios. It currently supports all underlying currencies with active options trading. Each simulated position requires a name and holding quantity; each simulated pending order requires a market identifier, price, and quantity. Market orders are not supported.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedPortfolioInput unifiedPortfolioInput = new UnifiedPortfolioInput(); // UnifiedPortfolioInput | 
        try {
            UnifiedPortfolioOutput result = apiInstance.calculatePortfolioMargin(unifiedPortfolioInput);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#calculatePortfolioMargin");
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
 **unifiedPortfolioInput** | [**UnifiedPortfolioInput**](UnifiedPortfolioInput.md)|  |

### Return type

[**UnifiedPortfolioOutput**](UnifiedPortfolioOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="setUserLeverage"></a>
# **setUserLeverage**
> List&lt;LeverageFailedCurrencies&gt; setUserLeverage(userLeverageSetting)

Set leverage for all of the user&#39;s borrowed currencies

Note the following: - Leverage cannot be changed for currencies with outstanding loans. - A leverage value above a currency&#39;s limit is capped at that limit. - Failures are not rolled back and affect only the currencies that failed. For example, if USDT has an outstanding loan, only the USDT leverage remains unchanged.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UserLeverageSetting userLeverageSetting = new UserLeverageSetting(); // UserLeverageSetting | 
        try {
            List<LeverageFailedCurrencies> result = apiInstance.setUserLeverage(userLeverageSetting);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUserLeverage");
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
 **userLeverageSetting** | [**UserLeverageSetting**](UserLeverageSetting.md)|  |

### Return type

[**List&lt;LeverageFailedCurrencies&gt;**](LeverageFailedCurrencies.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Set successfully |  -  |

<a name="getUserLeverageCurrencyConfig"></a>
# **getUserLeverageCurrencyConfig**
> UnifiedLeverageConfig getUserLeverageCurrencyConfig(currency)

Maximum and minimum currency leverage that can be set

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Currency
        try {
            UnifiedLeverageConfig result = apiInstance.getUserLeverageCurrencyConfig(currency);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUserLeverageCurrencyConfig");
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
 **currency** | **String**| Currency |

### Return type

[**UnifiedLeverageConfig**](UnifiedLeverageConfig.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getUserLeverageCurrencySetting"></a>
# **getUserLeverageCurrencySetting**
> List&lt;UnifiedLeverageSetting&gt; getUserLeverageCurrencySetting().currency(currency).execute();

Get user currency leverage

Get user currency leverage. If currency is not specified, query all currencies

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Currency
        try {
            List<UnifiedLeverageSetting> result = apiInstance.getUserLeverageCurrencySetting()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUserLeverageCurrencySetting");
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
 **currency** | **String**| Currency | [optional]

### Return type

[**List&lt;UnifiedLeverageSetting&gt;**](UnifiedLeverageSetting.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="setUserLeverageCurrencySetting"></a>
# **setUserLeverageCurrencySetting**
> setUserLeverageCurrencySetting(unifiedLeverageSetting)

Set loan currency leverage

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedLeverageSetting unifiedLeverageSetting = new UnifiedLeverageSetting(); // UnifiedLeverageSetting | 
        try {
            apiInstance.setUserLeverageCurrencySetting(unifiedLeverageSetting);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUserLeverageCurrencySetting");
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
 **unifiedLeverageSetting** | [**UnifiedLeverageSetting**](UnifiedLeverageSetting.md)|  |

### Return type

null (empty response body)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Set successfully |  -  |

<a name="listUnifiedCurrencies"></a>
# **listUnifiedCurrencies**
> List&lt;UnifiedCurrency&gt; listUnifiedCurrencies().currency(currency).execute();

List of loan currencies supported by unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "BTC"; // String | Currency
        try {
            List<UnifiedCurrency> result = apiInstance.listUnifiedCurrencies()
                        .currency(currency)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#listUnifiedCurrencies");
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
 **currency** | **String**| Currency | [optional]

### Return type

[**List&lt;UnifiedCurrency&gt;**](UnifiedCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getHistoryLoanRate"></a>
# **getHistoryLoanRate**
> UnifiedHistoryLoanRate getHistoryLoanRate(currency).tier(tier).page(page).limit(limit).execute();

Get historical lending rates

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        String currency = "USDT"; // String | Currency
        String tier = "1"; // String | VIP level for the floating rate to be queried
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of items returned. Default: 100, minimum: 1, maximum: 100
        try {
            UnifiedHistoryLoanRate result = apiInstance.getHistoryLoanRate(currency)
                        .tier(tier)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getHistoryLoanRate");
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
 **currency** | **String**| Currency |
 **tier** | **String**| VIP level for the floating rate to be queried | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of items returned. Default: 100, minimum: 1, maximum: 100 | [optional] [default to 100]

### Return type

[**UnifiedHistoryLoanRate**](UnifiedHistoryLoanRate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="setUnifiedCollateral"></a>
# **setUnifiedCollateral**
> UnifiedCollateralRes setUnifiedCollateral(unifiedCollateralReq)

Set collateral currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        UnifiedCollateralReq unifiedCollateralReq = new UnifiedCollateralReq(); // UnifiedCollateralReq | 
        try {
            UnifiedCollateralRes result = apiInstance.setUnifiedCollateral(unifiedCollateralReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUnifiedCollateral");
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
 **unifiedCollateralReq** | [**UnifiedCollateralReq**](UnifiedCollateralReq.md)|  |

### Return type

[**UnifiedCollateralRes**](UnifiedCollateralRes.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated successfully |  -  |

<a name="getEstimatedQuickRepayment"></a>
# **getEstimatedQuickRepayment**
> QuickEstimatedRepayment getEstimatedQuickRepayment()

Estimated quick repayment details

Available for unified account cross-currency margin mode and portfolio margin mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            QuickEstimatedRepayment result = apiInstance.getEstimatedQuickRepayment();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getEstimatedQuickRepayment");
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

[**QuickEstimatedRepayment**](QuickEstimatedRepayment.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |
**400** | Invalid request parameters |  -  |
**401** | Authentication failed |  -  |
**403** | Access denied (e.g. account mode does not support quick repayment) |  -  |

<a name="createQuickRepayment"></a>
# **createQuickRepayment**
> QuickRepaymentResponse createQuickRepayment(quickRepaymentRequest)

Quick repayment

Available for unified account cross-currency margin mode and portfolio margin mode. Use &#x60;GET /unified/estimated_quick_repayment&#x60; to query liabilities and pending repayment information.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        QuickRepaymentRequest quickRepaymentRequest = new QuickRepaymentRequest(); // QuickRepaymentRequest | 
        try {
            QuickRepaymentResponse result = apiInstance.createQuickRepayment(quickRepaymentRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#createQuickRepayment");
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
 **quickRepaymentRequest** | [**QuickRepaymentRequest**](QuickRepaymentRequest.md)|  |

### Return type

[**QuickRepaymentResponse**](QuickRepaymentResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Repayment successful |  -  |
**400** | Invalid request parameters |  -  |
**401** | Authentication failed |  -  |
**403** | Access denied (e.g. account mode does not support quick repayment) |  -  |

<a name="getUnifiedDeltaNeutral"></a>
# **getUnifiedDeltaNeutral**
> DeltaNeutralEnabled getUnifiedDeltaNeutral()

Query the account Delta-neutral strategy mode setting

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        try {
            DeltaNeutralEnabled result = apiInstance.getUnifiedDeltaNeutral();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#getUnifiedDeltaNeutral");
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

[**DeltaNeutralEnabled**](DeltaNeutralEnabled.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |
**401** | Authentication failed |  -  |
**403** | Access denied (e.g. insufficient VIP level or the account is not in cross-currency margin mode) |  -  |

<a name="setUnifiedDeltaNeutral"></a>
# **setUnifiedDeltaNeutral**
> DeltaNeutralEnabled setUnifiedDeltaNeutral(deltaNeutralEnabled)

Set the account Delta-neutral strategy mode

Enable or disable the account Delta-neutral strategy mode.  Requirements for enabling: VIP level &gt;&#x3D; 4 and the account is in cross-currency margin mode; otherwise 403 is returned. Returns the enabled status after the setting takes effect.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.UnifiedApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        UnifiedApi apiInstance = new UnifiedApi(defaultClient);
        DeltaNeutralEnabled deltaNeutralEnabled = new DeltaNeutralEnabled(); // DeltaNeutralEnabled | 
        try {
            DeltaNeutralEnabled result = apiInstance.setUnifiedDeltaNeutral(deltaNeutralEnabled);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling UnifiedApi#setUnifiedDeltaNeutral");
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
 **deltaNeutralEnabled** | [**DeltaNeutralEnabled**](DeltaNeutralEnabled.md)|  |

### Return type

[**DeltaNeutralEnabled**](DeltaNeutralEnabled.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Set successfully |  -  |
**400** | Invalid request parameters |  -  |
**401** | Authentication failed |  -  |
**403** | Access denied (e.g. insufficient VIP level or the account is not in cross-currency margin mode) |  -  |

