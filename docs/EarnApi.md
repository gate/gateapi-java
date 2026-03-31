# EarnApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDualInvestmentPlans**](EarnApi.md#listDualInvestmentPlans) | **GET** /earn/dual/investment_plan | Dual Investment product list
[**listDualOrders**](EarnApi.md#listDualOrders) | **GET** /earn/dual/orders | Dual Investment order list
[**placeDualOrder**](EarnApi.md#placeDualOrder) | **POST** /earn/dual/orders | Place Dual Investment order
[**listDualBalance**](EarnApi.md#listDualBalance) | **GET** /earn/dual/balance | Dual-Currency Earning Assets
[**findCoin**](EarnApi.md#findCoin) | **GET** /earn/staking/coins | Staking coins
[**swapStakingCoin**](EarnApi.md#swapStakingCoin) | **POST** /earn/staking/swap | On-chain token swap for earned coins
[**orderList**](EarnApi.md#orderList) | **GET** /earn/staking/order_list | List of on-chain coin-earning orders
[**awardList**](EarnApi.md#awardList) | **GET** /earn/staking/award_list | On-chain coin-earning dividend records
[**assetList**](EarnApi.md#assetList) | **GET** /earn/staking/assets | On-chain coin-earning assets
[**createAutoInvestPlan**](EarnApi.md#createAutoInvestPlan) | **POST** /earn/autoinvest/plans/create | Create auto invest plan
[**updateAutoInvestPlan**](EarnApi.md#updateAutoInvestPlan) | **POST** /earn/autoinvest/plans/update | UpdateAuto invest plan
[**stopAutoInvestPlan**](EarnApi.md#stopAutoInvestPlan) | **POST** /earn/autoinvest/plans/stop | StopAuto invest plan
[**addPositionAutoInvestPlan**](EarnApi.md#addPositionAutoInvestPlan) | **POST** /earn/autoinvest/plans/add_position | Add position immediately
[**listAutoInvestCoins**](EarnApi.md#listAutoInvestCoins) | **GET** /earn/autoinvest/coins | QueryCurrencies supporting auto invest
[**getAutoInvestMinAmount**](EarnApi.md#getAutoInvestMinAmount) | **POST** /earn/autoinvest/min_invest_amount | Get minimum investment amount
[**listAutoInvestPlanRecords**](EarnApi.md#listAutoInvestPlanRecords) | **GET** /earn/autoinvest/plans/records | List plan execution records
[**listAutoInvestOrders**](EarnApi.md#listAutoInvestOrders) | **GET** /earn/autoinvest/orders | List plan execution recordsDetails（OrderDetails）
[**listAutoInvestConfig**](EarnApi.md#listAutoInvestConfig) | **GET** /earn/autoinvest/config | List investment currency configuration
[**getAutoInvestPlanDetail**](EarnApi.md#getAutoInvestPlanDetail) | **GET** /earn/autoinvest/plans/detail | QueryAuto invest planDetails
[**listAutoInvestPlans**](EarnApi.md#listAutoInvestPlans) | **GET** /earn/autoinvest/plans/list_info | QueryAuto invest planList
[**listEarnFixedTermProducts**](EarnApi.md#listEarnFixedTermProducts) | **GET** /earn/fixed-term/product | Get product list
[**listEarnFixedTermProductsByAsset**](EarnApi.md#listEarnFixedTermProductsByAsset) | **GET** /earn/fixed-term/product/{asset}/list | Get product list by single currency
[**listEarnFixedTermLends**](EarnApi.md#listEarnFixedTermLends) | **GET** /earn/fixed-term/user/lend | Subscription list
[**createEarnFixedTermLend**](EarnApi.md#createEarnFixedTermLend) | **POST** /earn/fixed-term/user/lend | Subscription
[**createEarnFixedTermPreRedeem**](EarnApi.md#createEarnFixedTermPreRedeem) | **POST** /earn/fixed-term/user/pre-redeem | Redeem
[**listEarnFixedTermHistory**](EarnApi.md#listEarnFixedTermHistory) | **GET** /earn/fixed-term/user/history | Subscription history


<a name="listDualInvestmentPlans"></a>
# **listDualInvestmentPlans**
> List&lt;DualGetPlans&gt; listDualInvestmentPlans().planId(planId).execute();

Dual Investment product list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Long planId = 1L; // Long | Financial project ID
        try {
            List<DualGetPlans> result = apiInstance.listDualInvestmentPlans()
                        .planId(planId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listDualInvestmentPlans");
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
 **planId** | **Long**| Financial project ID | [optional]

### Return type

[**List&lt;DualGetPlans&gt;**](DualGetPlans.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listDualOrders"></a>
# **listDualOrders**
> List&lt;DualGetOrders&gt; listDualOrders().from(from).to(to).page(page).limit(limit).execute();

Dual Investment order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Long from = 1740727000L; // Long | Start settlement time
        Long to = 1740729000L; // Long | End settlement time
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        try {
            List<DualGetOrders> result = apiInstance.listDualOrders()
                        .from(from)
                        .to(to)
                        .page(page)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listDualOrders");
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
 **from** | **Long**| Start settlement time | [optional]
 **to** | **Long**| End settlement time | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;DualGetOrders&gt;**](DualGetOrders.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="placeDualOrder"></a>
# **placeDualOrder**
> PlaceDualInvestmentOrder placeDualOrder(placeDualInvestmentOrderParams)

Place Dual Investment order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        PlaceDualInvestmentOrderParams placeDualInvestmentOrderParams = new PlaceDualInvestmentOrderParams(); // PlaceDualInvestmentOrderParams | 
        try {
            PlaceDualInvestmentOrder result = apiInstance.placeDualOrder(placeDualInvestmentOrderParams);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#placeDualOrder");
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
 **placeDualInvestmentOrderParams** | [**PlaceDualInvestmentOrderParams**](PlaceDualInvestmentOrderParams.md)|  |

### Return type

[**PlaceDualInvestmentOrder**](PlaceDualInvestmentOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order placed successfully |  -  |

<a name="listDualBalance"></a>
# **listDualBalance**
> DualGetBalance listDualBalance()

Dual-Currency Earning Assets

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        try {
            DualGetBalance result = apiInstance.listDualBalance();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listDualBalance");
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

[**DualGetBalance**](DualGetBalance.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="findCoin"></a>
# **findCoin**
> List&lt;Object&gt; findCoin().cointype(cointype).execute();

Staking coins

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String cointype = "cointype_example"; // String | Currency type: swap - voucher; lock - locked position; debt - US Treasury bond.
        try {
            List<Object> result = apiInstance.findCoin()
                        .cointype(cointype)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#findCoin");
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
 **cointype** | **String**| Currency type: swap - voucher; lock - locked position; debt - US Treasury bond. | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="swapStakingCoin"></a>
# **swapStakingCoin**
> SwapCoinStruct swapStakingCoin(swapCoin)

On-chain token swap for earned coins

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        SwapCoin swapCoin = new SwapCoin(); // SwapCoin | 
        try {
            SwapCoinStruct result = apiInstance.swapStakingCoin(swapCoin);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#swapStakingCoin");
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
 **swapCoin** | [**SwapCoin**](SwapCoin.md)|  |

### Return type

[**SwapCoinStruct**](SwapCoinStruct.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Swap successful |  -  |

<a name="orderList"></a>
# **orderList**
> OrderListStruct orderList().pid(pid).coin(coin).type(type).page(page).execute();

List of on-chain coin-earning orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Integer pid = 7; // Integer | Product ID
        String coin = "ETH"; // String | Currency name
        Integer type = 0; // Integer | Type 0-staking 1-redemption
        Integer page = 1; // Integer | Page number
        try {
            OrderListStruct result = apiInstance.orderList()
                        .pid(pid)
                        .coin(coin)
                        .type(type)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#orderList");
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
 **pid** | **Integer**| Product ID | [optional]
 **coin** | **String**| Currency name | [optional]
 **type** | **Integer**| Type 0-staking 1-redemption | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**OrderListStruct**](OrderListStruct.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="awardList"></a>
# **awardList**
> AwardListStruct awardList().pid(pid).coin(coin).page(page).execute();

On-chain coin-earning dividend records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Integer pid = 7; // Integer | Product ID
        String coin = "ETH"; // String | Currency name
        Integer page = 1; // Integer | Page number
        try {
            AwardListStruct result = apiInstance.awardList()
                        .pid(pid)
                        .coin(coin)
                        .page(page)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#awardList");
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
 **pid** | **Integer**| Product ID | [optional]
 **coin** | **String**| Currency name | [optional]
 **page** | **Integer**| Page number | [optional] [default to 1]

### Return type

[**AwardListStruct**](AwardListStruct.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="assetList"></a>
# **assetList**
> List&lt;Object&gt; assetList().coin(coin).execute();

On-chain coin-earning assets

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String coin = "ETH"; // String | Currency name
        try {
            List<Object> result = apiInstance.assetList()
                        .coin(coin)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#assetList");
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
 **coin** | **String**| Currency name | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="createAutoInvestPlan"></a>
# **createAutoInvestPlan**
> AutoInvestPlanCreateResp createAutoInvestPlan(autoInvestPlanCreate)

Create auto invest plan

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        AutoInvestPlanCreate autoInvestPlanCreate = new AutoInvestPlanCreate(); // AutoInvestPlanCreate | 
        try {
            AutoInvestPlanCreateResp result = apiInstance.createAutoInvestPlan(autoInvestPlanCreate);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#createAutoInvestPlan");
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
 **autoInvestPlanCreate** | [**AutoInvestPlanCreate**](AutoInvestPlanCreate.md)|  |

### Return type

[**AutoInvestPlanCreateResp**](AutoInvestPlanCreateResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Created successfully |  -  |

<a name="updateAutoInvestPlan"></a>
# **updateAutoInvestPlan**
> updateAutoInvestPlan(autoInvestPlanUpdate)

UpdateAuto invest plan

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        AutoInvestPlanUpdate autoInvestPlanUpdate = new AutoInvestPlanUpdate(); // AutoInvestPlanUpdate | 
        try {
            apiInstance.updateAutoInvestPlan(autoInvestPlanUpdate);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#updateAutoInvestPlan");
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
 **autoInvestPlanUpdate** | [**AutoInvestPlanUpdate**](AutoInvestPlanUpdate.md)|  |

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
**200** | Updated successfully |  -  |

<a name="stopAutoInvestPlan"></a>
# **stopAutoInvestPlan**
> stopAutoInvestPlan(autoInvestPlanStop)

StopAuto invest plan

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        AutoInvestPlanStop autoInvestPlanStop = new AutoInvestPlanStop(); // AutoInvestPlanStop | 
        try {
            apiInstance.stopAutoInvestPlan(autoInvestPlanStop);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#stopAutoInvestPlan");
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
 **autoInvestPlanStop** | [**AutoInvestPlanStop**](AutoInvestPlanStop.md)|  |

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
**200** | Stopped successfully |  -  |

<a name="addPositionAutoInvestPlan"></a>
# **addPositionAutoInvestPlan**
> addPositionAutoInvestPlan(autoInvestPlanAddPosition)

Add position immediately

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        AutoInvestPlanAddPosition autoInvestPlanAddPosition = new AutoInvestPlanAddPosition(); // AutoInvestPlanAddPosition | 
        try {
            apiInstance.addPositionAutoInvestPlan(autoInvestPlanAddPosition);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#addPositionAutoInvestPlan");
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
 **autoInvestPlanAddPosition** | [**AutoInvestPlanAddPosition**](AutoInvestPlanAddPosition.md)|  |

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
**200** | Add PositionSuccess |  -  |

<a name="listAutoInvestCoins"></a>
# **listAutoInvestCoins**
> List&lt;AutoInvestCoinsItem&gt; listAutoInvestCoins().planMoney(planMoney).execute();

QueryCurrencies supporting auto invest

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String planMoney = "USDT"; // String | Pricing currency，Optional: USDT or BTC，Default: USDT
        try {
            List<AutoInvestCoinsItem> result = apiInstance.listAutoInvestCoins()
                        .planMoney(planMoney)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listAutoInvestCoins");
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
 **planMoney** | **String**| Pricing currency，Optional: USDT or BTC，Default: USDT | [optional]

### Return type

[**List&lt;AutoInvestCoinsItem&gt;**](AutoInvestCoinsItem.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getAutoInvestMinAmount"></a>
# **getAutoInvestMinAmount**
> AutoInvestMinInvestAmountResp getAutoInvestMinAmount(autoInvestMinInvestAmount)

Get minimum investment amount

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        AutoInvestMinInvestAmount autoInvestMinInvestAmount = new AutoInvestMinInvestAmount(); // AutoInvestMinInvestAmount | 
        try {
            AutoInvestMinInvestAmountResp result = apiInstance.getAutoInvestMinAmount(autoInvestMinInvestAmount);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#getAutoInvestMinAmount");
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
 **autoInvestMinInvestAmount** | [**AutoInvestMinInvestAmount**](AutoInvestMinInvestAmount.md)|  |

### Return type

[**AutoInvestMinInvestAmountResp**](AutoInvestMinInvestAmountResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listAutoInvestPlanRecords"></a>
# **listAutoInvestPlanRecords**
> AutoInvestPlanRecordsResp listAutoInvestPlanRecords(planId).page(page).pageSize(pageSize).execute();

List plan execution records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Long planId = 141378L; // Long | Plan ID
        Long page = 1L; // Long | page number
        Long pageSize = 10L; // Long | Items per page，Maximum 100
        try {
            AutoInvestPlanRecordsResp result = apiInstance.listAutoInvestPlanRecords(planId)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listAutoInvestPlanRecords");
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
 **planId** | **Long**| Plan ID |
 **page** | **Long**| page number | [optional]
 **pageSize** | **Long**| Items per page，Maximum 100 | [optional]

### Return type

[**AutoInvestPlanRecordsResp**](AutoInvestPlanRecordsResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listAutoInvestOrders"></a>
# **listAutoInvestOrders**
> List&lt;AutoInvestOrderItem&gt; listAutoInvestOrders(planId, recordId)

List plan execution recordsDetails（OrderDetails）

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Long planId = 142583L; // Long | Plan ID
        Long recordId = 1770805384904919L; // Long | Record ID
        try {
            List<AutoInvestOrderItem> result = apiInstance.listAutoInvestOrders(planId, recordId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listAutoInvestOrders");
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
 **planId** | **Long**| Plan ID |
 **recordId** | **Long**| Record ID |

### Return type

[**List&lt;AutoInvestOrderItem&gt;**](AutoInvestOrderItem.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listAutoInvestConfig"></a>
# **listAutoInvestConfig**
> List&lt;AutoInvestConfigItem&gt; listAutoInvestConfig()

List investment currency configuration

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        try {
            List<AutoInvestConfigItem> result = apiInstance.listAutoInvestConfig();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listAutoInvestConfig");
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

[**List&lt;AutoInvestConfigItem&gt;**](AutoInvestConfigItem.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="getAutoInvestPlanDetail"></a>
# **getAutoInvestPlanDetail**
> AutoInvestPlanDetail getAutoInvestPlanDetail(planId)

QueryAuto invest planDetails

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Long planId = 142609L; // Long | Plan ID
        try {
            AutoInvestPlanDetail result = apiInstance.getAutoInvestPlanDetail(planId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#getAutoInvestPlanDetail");
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
 **planId** | **Long**| Plan ID |

### Return type

[**AutoInvestPlanDetail**](AutoInvestPlanDetail.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listAutoInvestPlans"></a>
# **listAutoInvestPlans**
> AutoInvestPlanListInfoResp listAutoInvestPlans(status).page(page).pageSize(pageSize).execute();

QueryAuto invest planList

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String status = "active"; // String | Plan status，History history，Active active
        Long page = 56L; // Long | page number
        Long pageSize = 56L; // Long | Items per page，Maximum 100
        try {
            AutoInvestPlanListInfoResp result = apiInstance.listAutoInvestPlans(status)
                        .page(page)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listAutoInvestPlans");
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
 **status** | **String**| Plan status，History history，Active active |
 **page** | **Long**| page number | [optional]
 **pageSize** | **Long**| Items per page，Maximum 100 | [optional]

### Return type

[**AutoInvestPlanListInfoResp**](AutoInvestPlanListInfoResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully retrieved |  -  |

<a name="listEarnFixedTermProducts"></a>
# **listEarnFixedTermProducts**
> ListEarnFixedTermProductsResponse listEarnFixedTermProducts(page, limit).asset(asset).type(type).execute();

Get product list

Query fixed-term earn product list. Supports filtering by currency, product type, status, etc. Returns product interest rate, lock-up period, quota, and reward campaign information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        EarnApi apiInstance = new EarnApi(defaultClient);
        Integer page = 1; // Integer | Page number
        Integer limit = 100; // Integer | Page size
        String asset = "USDT"; // String | Currency
        Integer type = 1; // Integer | Product type: 1 for regular, 2 for VIP
        try {
            ListEarnFixedTermProductsResponse result = apiInstance.listEarnFixedTermProducts(page, limit)
                        .asset(asset)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listEarnFixedTermProducts");
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
 **page** | **Integer**| Page number |
 **limit** | **Integer**| Page size |
 **asset** | **String**| Currency | [optional]
 **type** | **Integer**| Product type: 1 for regular, 2 for VIP | [optional]

### Return type

[**ListEarnFixedTermProductsResponse**](ListEarnFixedTermProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Product list retrieved successfully |  -  |

<a name="listEarnFixedTermProductsByAsset"></a>
# **listEarnFixedTermProductsByAsset**
> ListEarnFixedTermProductsByAssetResponse listEarnFixedTermProductsByAsset(asset).type(type).execute();

Get product list by single currency

Sort by product term in ascending order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String asset = "USDT"; // String | Currency name, e.g., USDT, BTC
        String type = "1"; // String | Product type: \"\" or 1 for regular product list, 2 for VIP product list, 0 for all products
        try {
            ListEarnFixedTermProductsByAssetResponse result = apiInstance.listEarnFixedTermProductsByAsset(asset)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listEarnFixedTermProductsByAsset");
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
 **asset** | **String**| Currency name, e.g., USDT, BTC |
 **type** | **String**| Product type: \&quot;\&quot; or 1 for regular product list, 2 for VIP product list, 0 for all products | [optional]

### Return type

[**ListEarnFixedTermProductsByAssetResponse**](ListEarnFixedTermProductsByAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Single currency product list retrieved successfully |  -  |

<a name="listEarnFixedTermLends"></a>
# **listEarnFixedTermLends**
> ListEarnFixedTermLendsResponse listEarnFixedTermLends(orderType, page, limit).productId(productId).orderId(orderId).asset(asset).subBusiness(subBusiness).businessFilter(businessFilter).execute();

Subscription list

Query the user&#39;s fixed-term earn subscription order list. Supports filtering by product, currency, order type, etc. Returns order details, earnings, rewards, and interest rate boost coupon information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String orderType = "1"; // String | Order type: 1 for current orders, 2 for historical orders
        Integer page = 1; // Integer | Page number
        Integer limit = 10; // Integer | Page size
        Integer productId = 56; // Integer | Product ID
        Long orderId = 56L; // Long | Order ID
        String asset = "asset_example"; // String | Currency
        Integer subBusiness = 56; // Integer | Sub-business
        String businessFilter = "[{\"business\":1, \"sub_business\": 0},{\"business\":2, \"sub_business\": 0}]"; // String | Business filter conditions, JSON array format, e.g., [{\"business\":1, \"sub_business\": 0}]. business: 1 for regular, 2 for VIP
        try {
            ListEarnFixedTermLendsResponse result = apiInstance.listEarnFixedTermLends(orderType, page, limit)
                        .productId(productId)
                        .orderId(orderId)
                        .asset(asset)
                        .subBusiness(subBusiness)
                        .businessFilter(businessFilter)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listEarnFixedTermLends");
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
 **orderType** | **String**| Order type: 1 for current orders, 2 for historical orders |
 **page** | **Integer**| Page number |
 **limit** | **Integer**| Page size |
 **productId** | **Integer**| Product ID | [optional]
 **orderId** | **Long**| Order ID | [optional]
 **asset** | **String**| Currency | [optional]
 **subBusiness** | **Integer**| Sub-business | [optional]
 **businessFilter** | **String**| Business filter conditions, JSON array format, e.g., [{\&quot;business\&quot;:1, \&quot;sub_business\&quot;: 0}]. business: 1 for regular, 2 for VIP | [optional]

### Return type

[**ListEarnFixedTermLendsResponse**](ListEarnFixedTermLendsResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Subscription order list retrieved successfully |  -  |

<a name="createEarnFixedTermLend"></a>
# **createEarnFixedTermLend**
> CreateEarnFixedTermLendResponse createEarnFixedTermLend(fixedTermLendRequest)

Subscription

Subscribe to a fixed-term earn product by specifying the product ID and subscription amount. Optionally enable auto-renewal and apply an interest rate boost coupon

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        FixedTermLendRequest fixedTermLendRequest = new FixedTermLendRequest(); // FixedTermLendRequest | 
        try {
            CreateEarnFixedTermLendResponse result = apiInstance.createEarnFixedTermLend(fixedTermLendRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#createEarnFixedTermLend");
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
 **fixedTermLendRequest** | [**FixedTermLendRequest**](FixedTermLendRequest.md)|  | [optional]

### Return type

[**CreateEarnFixedTermLendResponse**](CreateEarnFixedTermLendResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Subscription successful |  -  |

<a name="createEarnFixedTermPreRedeem"></a>
# **createEarnFixedTermPreRedeem**
> CreateEarnFixedTermPreRedeemResponse createEarnFixedTermPreRedeem(earnFixedTermPreRedeemRequest)

Redeem

Early redemption of a fixed-term earn order, order ID is required

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        EarnFixedTermPreRedeemRequest earnFixedTermPreRedeemRequest = new EarnFixedTermPreRedeemRequest(); // EarnFixedTermPreRedeemRequest | 
        try {
            CreateEarnFixedTermPreRedeemResponse result = apiInstance.createEarnFixedTermPreRedeem(earnFixedTermPreRedeemRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#createEarnFixedTermPreRedeem");
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
 **earnFixedTermPreRedeemRequest** | [**EarnFixedTermPreRedeemRequest**](EarnFixedTermPreRedeemRequest.md)|  | [optional]

### Return type

[**CreateEarnFixedTermPreRedeemResponse**](CreateEarnFixedTermPreRedeemResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Redemption successful |  -  |

<a name="listEarnFixedTermHistory"></a>
# **listEarnFixedTermHistory**
> ListEarnFixedTermHistoryResponse listEarnFixedTermHistory(type, page, limit).productId(productId).orderId(orderId).asset(asset).startAt(startAt).endAt(endAt).subBusiness(subBusiness).businessFilter(businessFilter).execute();

Subscription history

Query the user&#39;s fixed-term earn history records. Supports filtering by type (subscription, redemption, interest, bonus rewards) and time range

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.EarnApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        EarnApi apiInstance = new EarnApi(defaultClient);
        String type = "1"; // String | 1 for subscription, 2 for redemption, 3 for interest, 4 for bonus reward
        Integer page = 1; // Integer | Page number
        Integer limit = 10; // Integer | Page size
        Integer productId = 56; // Integer | Product ID
        String orderId = "orderId_example"; // String | Order ID
        String asset = "asset_example"; // String | Currency
        Integer startAt = 56; // Integer | Start timestamp
        Integer endAt = 56; // Integer | End Timestamp
        Integer subBusiness = 56; // Integer | Sub-business
        String businessFilter = "[{\"business\":1, \"sub_business\": 0},{\"business\":2, \"sub_business\": 0}]"; // String | Business filter conditions, JSON array format, e.g., [{\"business\":1, \"sub_business\": 0}]. business: 1 for regular, 2 for VIP
        try {
            ListEarnFixedTermHistoryResponse result = apiInstance.listEarnFixedTermHistory(type, page, limit)
                        .productId(productId)
                        .orderId(orderId)
                        .asset(asset)
                        .startAt(startAt)
                        .endAt(endAt)
                        .subBusiness(subBusiness)
                        .businessFilter(businessFilter)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling EarnApi#listEarnFixedTermHistory");
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
 **type** | **String**| 1 for subscription, 2 for redemption, 3 for interest, 4 for bonus reward |
 **page** | **Integer**| Page number |
 **limit** | **Integer**| Page size |
 **productId** | **Integer**| Product ID | [optional]
 **orderId** | **String**| Order ID | [optional]
 **asset** | **String**| Currency | [optional]
 **startAt** | **Integer**| Start timestamp | [optional]
 **endAt** | **Integer**| End Timestamp | [optional]
 **subBusiness** | **Integer**| Sub-business | [optional]
 **businessFilter** | **String**| Business filter conditions, JSON array format, e.g., [{\&quot;business\&quot;:1, \&quot;sub_business\&quot;: 0}]. business: 1 for regular, 2 for VIP | [optional]

### Return type

[**ListEarnFixedTermHistoryResponse**](ListEarnFixedTermHistoryResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | History records retrieved successfully |  -  |

