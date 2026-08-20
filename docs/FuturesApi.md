# FuturesApi

All URIs are relative to *https://api.gateio.ws/api/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFuturesContracts**](FuturesApi.md#listFuturesContracts) | **GET** /futures/{settle}/contracts | Query all futures contracts
[**listFuturesContractsAll**](FuturesApi.md#listFuturesContractsAll) | **GET** /futures/{settle}/contracts_all | Query all contract information (including delisted)
[**getFuturesContract**](FuturesApi.md#getFuturesContract) | **GET** /futures/{settle}/contracts/{contract} | Query single contract information
[**listFuturesADLRiskStates**](FuturesApi.md#listFuturesADLRiskStates) | **GET** /futures/{settle}/adl_risk_states | List market-level ADL risk states
[**listFuturesOrderBook**](FuturesApi.md#listFuturesOrderBook) | **GET** /futures/{settle}/order_book | Query futures market depth information
[**listFuturesTrades**](FuturesApi.md#listFuturesTrades) | **GET** /futures/{settle}/trades | Futures market transaction records
[**listFuturesCandlesticks**](FuturesApi.md#listFuturesCandlesticks) | **GET** /futures/{settle}/candlesticks | Futures market K-line chart
[**listFuturesPremiumIndex**](FuturesApi.md#listFuturesPremiumIndex) | **GET** /futures/{settle}/premium_index | Premium Index K-line chart
[**listFuturesTickers**](FuturesApi.md#listFuturesTickers) | **GET** /futures/{settle}/tickers | Get all futures trading statistics
[**listFuturesFundingRateHistory**](FuturesApi.md#listFuturesFundingRateHistory) | **GET** /futures/{settle}/funding_rate | Futures market historical funding rate
[**listBatchFuturesFundingRates**](FuturesApi.md#listBatchFuturesFundingRates) | **POST** /futures/{settle}/funding_rates | Batch Query Historical Funding Rate Data for Perpetual Contracts
[**listFuturesInsuranceLedger**](FuturesApi.md#listFuturesInsuranceLedger) | **GET** /futures/{settle}/insurance | Futures market insurance fund history
[**listContractStats**](FuturesApi.md#listContractStats) | **GET** /futures/{settle}/contract_stats | Futures statistics
[**getIndexConstituents**](FuturesApi.md#getIndexConstituents) | **GET** /futures/{settle}/index_constituents/{index} | Query index constituents
[**listLiquidatedOrders**](FuturesApi.md#listLiquidatedOrders) | **GET** /futures/{settle}/liq_orders | Query liquidation order history
[**listFuturesRiskLimitTiers**](FuturesApi.md#listFuturesRiskLimitTiers) | **GET** /futures/{settle}/risk_limit_tiers | Query risk limit tiers
[**listFuturesAccounts**](FuturesApi.md#listFuturesAccounts) | **GET** /futures/{settle}/accounts | Get futures account
[**listFuturesAccountBook**](FuturesApi.md#listFuturesAccountBook) | **GET** /futures/{settle}/account_book | Query futures account change history
[**listPositions**](FuturesApi.md#listPositions) | **GET** /futures/{settle}/positions | Get user position list
[**listPositionsTimerange**](FuturesApi.md#listPositionsTimerange) | **GET** /futures/{settle}/positions_timerange | Get user&#39;s historical position information list by time
[**getPosition**](FuturesApi.md#getPosition) | **GET** /futures/{settle}/positions/{contract} | Get single position information
[**getLeverage**](FuturesApi.md#getLeverage) | **GET** /futures/{settle}/get_leverage/{contract} | Get Leverage Information for Specified Mode
[**updatePositionMargin**](FuturesApi.md#updatePositionMargin) | **POST** /futures/{settle}/positions/{contract}/margin | Update position margin
[**updatePositionLeverage**](FuturesApi.md#updatePositionLeverage) | **POST** /futures/{settle}/positions/{contract}/leverage | Update position leverage
[**updateContractPositionLeverage**](FuturesApi.md#updateContractPositionLeverage) | **POST** /futures/{settle}/positions/{contract}/set_leverage | Update Leverage for Specified Mode
[**updatePositionCrossMode**](FuturesApi.md#updatePositionCrossMode) | **POST** /futures/{settle}/positions/cross_mode | Switch Position Margin Mode
[**updateDualCompPositionCrossMode**](FuturesApi.md#updateDualCompPositionCrossMode) | **POST** /futures/{settle}/dual_comp/positions/cross_mode | Switch Between Cross and Isolated Margin Modes Under Hedge Mode
[**updatePositionRiskLimit**](FuturesApi.md#updatePositionRiskLimit) | **POST** /futures/{settle}/positions/{contract}/risk_limit | Update position risk limit
[**setDualMode**](FuturesApi.md#setDualMode) | **POST** /futures/{settle}/dual_mode | Set position mode
[**setPositionMode**](FuturesApi.md#setPositionMode) | **POST** /futures/{settle}/set_position_mode | Set Position Holding Mode, replacing the dual_mode interface
[**getDualModePosition**](FuturesApi.md#getDualModePosition) | **GET** /futures/{settle}/dual_comp/positions/{contract} | Get position information in Hedge Mode
[**updateDualModePositionMargin**](FuturesApi.md#updateDualModePositionMargin) | **POST** /futures/{settle}/dual_comp/positions/{contract}/margin | Update position margin in Hedge Mode
[**updateDualModePositionLeverage**](FuturesApi.md#updateDualModePositionLeverage) | **POST** /futures/{settle}/dual_comp/positions/{contract}/leverage | Update position leverage in Hedge Mode
[**updateDualModePositionRiskLimit**](FuturesApi.md#updateDualModePositionRiskLimit) | **POST** /futures/{settle}/dual_comp/positions/{contract}/risk_limit | Update position risk limit in Hedge Mode
[**listFuturesOrders**](FuturesApi.md#listFuturesOrders) | **GET** /futures/{settle}/orders | Query futures order list
[**createFuturesOrder**](FuturesApi.md#createFuturesOrder) | **POST** /futures/{settle}/orders | Place futures order
[**cancelFuturesOrders**](FuturesApi.md#cancelFuturesOrders) | **DELETE** /futures/{settle}/orders | Cancel all orders with &#39;open&#39; status
[**getOrdersWithTimeRange**](FuturesApi.md#getOrdersWithTimeRange) | **GET** /futures/{settle}/orders_timerange | Query futures order list by time range
[**createBatchFuturesOrder**](FuturesApi.md#createBatchFuturesOrder) | **POST** /futures/{settle}/batch_orders | Place batch futures orders
[**getFuturesOrder**](FuturesApi.md#getFuturesOrder) | **GET** /futures/{settle}/orders/{order_id} | Query single order details
[**amendFuturesOrder**](FuturesApi.md#amendFuturesOrder) | **PUT** /futures/{settle}/orders/{order_id} | Amend single order
[**cancelFuturesOrder**](FuturesApi.md#cancelFuturesOrder) | **DELETE** /futures/{settle}/orders/{order_id} | Cancel single order
[**getMyTrades**](FuturesApi.md#getMyTrades) | **GET** /futures/{settle}/my_trades | Query personal trading records
[**getMyTradesWithTimeRange**](FuturesApi.md#getMyTradesWithTimeRange) | **GET** /futures/{settle}/my_trades_timerange | Query personal trading records by time range
[**listPositionClose**](FuturesApi.md#listPositionClose) | **GET** /futures/{settle}/position_close | Query position close history
[**listLiquidates**](FuturesApi.md#listLiquidates) | **GET** /futures/{settle}/liquidates | Query liquidation history
[**listAutoDeleverages**](FuturesApi.md#listAutoDeleverages) | **GET** /futures/{settle}/auto_deleverages | Query ADL auto-deleveraging order information
[**countdownCancelAllFutures**](FuturesApi.md#countdownCancelAllFutures) | **POST** /futures/{settle}/countdown_cancel_all | Countdown cancel orders
[**getFuturesFee**](FuturesApi.md#getFuturesFee) | **GET** /futures/{settle}/fee | Query futures market trading fee rates
[**cancelBatchFutureOrders**](FuturesApi.md#cancelBatchFutureOrders) | **POST** /futures/{settle}/batch_cancel_orders | Cancel batch orders by specified ID list
[**amendBatchFutureOrders**](FuturesApi.md#amendBatchFutureOrders) | **POST** /futures/{settle}/batch_amend_orders | Batch modify orders by specified IDs
[**getFuturesRiskLimitTable**](FuturesApi.md#getFuturesRiskLimitTable) | **GET** /futures/{settle}/risk_limit_table | Query risk limit table by table_id
[**createFuturesBBOOrder**](FuturesApi.md#createFuturesBBOOrder) | **POST** /futures/{settle}/bbo_orders | Level-based BBO Contract Order Placement
[**createTrailOrder**](FuturesApi.md#createTrailOrder) | **POST** /futures/{settle}/autoorder/v1/trail/create | Create trail order
[**stopTrailOrder**](FuturesApi.md#stopTrailOrder) | **POST** /futures/{settle}/autoorder/v1/trail/stop | Terminate trail order
[**stopAllTrailOrders**](FuturesApi.md#stopAllTrailOrders) | **POST** /futures/{settle}/autoorder/v1/trail/stop_all | Batch terminate trail orders
[**getTrailOrders**](FuturesApi.md#getTrailOrders) | **GET** /futures/{settle}/autoorder/v1/trail/list | Get trail order list
[**getTrailOrderDetail**](FuturesApi.md#getTrailOrderDetail) | **GET** /futures/{settle}/autoorder/v1/trail/detail | Get trail order details
[**updateTrailOrder**](FuturesApi.md#updateTrailOrder) | **POST** /futures/{settle}/autoorder/v1/trail/update | Update trail order
[**getTrailOrderChangeLog**](FuturesApi.md#getTrailOrderChangeLog) | **GET** /futures/{settle}/autoorder/v1/trail/change_log | Get trail order user modification records
[**createChaseOrder**](FuturesApi.md#createChaseOrder) | **POST** /futures/{settle}/autoorder/v1/chase/create | Create a chase order
[**stopChaseOrder**](FuturesApi.md#stopChaseOrder) | **POST** /futures/{settle}/autoorder/v1/chase/stop | Stop a chase order
[**stopAllChaseOrders**](FuturesApi.md#stopAllChaseOrders) | **POST** /futures/{settle}/autoorder/v1/chase/stop_all | Stop chase orders in batch
[**getChaseOrders**](FuturesApi.md#getChaseOrders) | **GET** /futures/{settle}/autoorder/v1/chase/list | List chase orders
[**getChaseOrderDetail**](FuturesApi.md#getChaseOrderDetail) | **GET** /futures/{settle}/autoorder/v1/chase/detail | Get chase order detail
[**listPriceTriggeredOrders**](FuturesApi.md#listPriceTriggeredOrders) | **GET** /futures/{settle}/price_orders | Query auto order list
[**createPriceTriggeredOrder**](FuturesApi.md#createPriceTriggeredOrder) | **POST** /futures/{settle}/price_orders | Create price-triggered order
[**cancelPriceTriggeredOrderList**](FuturesApi.md#cancelPriceTriggeredOrderList) | **DELETE** /futures/{settle}/price_orders | Cancel all auto orders
[**getPriceTriggeredOrder**](FuturesApi.md#getPriceTriggeredOrder) | **GET** /futures/{settle}/price_orders/{order_id} | Query single auto order details
[**cancelPriceTriggeredOrder**](FuturesApi.md#cancelPriceTriggeredOrder) | **DELETE** /futures/{settle}/price_orders/{order_id} | Cancel single auto order
[**updatePriceTriggeredOrder**](FuturesApi.md#updatePriceTriggeredOrder) | **PUT** /futures/{settle}/price_orders/amend | Modify a Single Auto Order


<a name="listFuturesContracts"></a>
# **listFuturesContracts**
> List&lt;Contract&gt; listFuturesContracts(settle).limit(limit).offset(offset).execute();

Query all futures contracts

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<Contract> result = apiInstance.listFuturesContracts(settle)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesContracts");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listFuturesContractsAll"></a>
# **listFuturesContractsAll**
> List&lt;Contract&gt; listFuturesContractsAll(settle).limit(limit).offset(offset).execute();

Query all contract information (including delisted)

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<Contract> result = apiInstance.listFuturesContractsAll(settle)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesContractsAll");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getFuturesContract"></a>
# **getFuturesContract**
> Contract getFuturesContract(settle, contract)

Query single contract information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            Contract result = apiInstance.getFuturesContract(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesContract");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |

### Return type

[**Contract**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Contract information |  -  |

<a name="listFuturesADLRiskStates"></a>
# **listFuturesADLRiskStates**
> FuturesADLRiskStates listFuturesADLRiskStates(settle)

List market-level ADL risk states

List the current ADL risk states of all futures markets for the specified settlement currency

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        try {
            FuturesADLRiskStates result = apiInstance.listFuturesADLRiskStates(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesADLRiskStates");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]

### Return type

[**FuturesADLRiskStates**](FuturesADLRiskStates.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesOrderBook"></a>
# **listFuturesOrderBook**
> FuturesOrderBook listFuturesOrderBook(settle, contract).interval(interval).limit(limit).withId(withId).execute();

Query futures market depth information

Bids will be sorted by price from high to low, while asks sorted reversely

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String interval = "\"0\""; // String | Price precision for merged depth. 0 means no merging. If not specified, defaults to 0
        Integer limit = 10; // Integer | Number of depth levels
        Boolean withId = false; // Boolean | Whether to return depth update ID. This ID increments by 1 each time the depth changes
        try {
            FuturesOrderBook result = apiInstance.listFuturesOrderBook(settle, contract)
                        .interval(interval)
                        .limit(limit)
                        .withId(withId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesOrderBook");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **interval** | **String**| Price precision for merged depth. 0 means no merging. If not specified, defaults to 0 | [optional] [default to &quot;0&quot;]
 **limit** | **Integer**| Number of depth levels | [optional] [default to 10]
 **withId** | **Boolean**| Whether to return depth update ID. This ID increments by 1 each time the depth changes | [optional] [default to false]

### Return type

[**FuturesOrderBook**](FuturesOrderBook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Depth query successful |  -  |

<a name="listFuturesTrades"></a>
# **listFuturesTrades**
> List&lt;FuturesTrade&gt; listFuturesTrades(settle, contract).limit(limit).offset(offset).lastId(lastId).from(from).to(to).execute();

Futures market transaction records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. Use `from` and `to` instead to limit time range
        Long from = 1546905600L; // Long | Specify starting time in Unix seconds. If not specified, `to` and `limit` will be used to limit response items. If items between `from` and `to` are more than `limit`, only `limit` number will be returned. 
        Long to = 1546935600L; // Long | Specify end time in Unix seconds, default to current time.
        try {
            List<FuturesTrade> result = apiInstance.listFuturesTrades(settle, contract)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesTrades");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. Use &#x60;from&#x60; and &#x60;to&#x60; instead to limit time range | [optional]
 **from** | **Long**| Specify starting time in Unix seconds. If not specified, &#x60;to&#x60; and &#x60;limit&#x60; will be used to limit response items. If items between &#x60;from&#x60; and &#x60;to&#x60; are more than &#x60;limit&#x60;, only &#x60;limit&#x60; number will be returned.  | [optional]
 **to** | **Long**| Specify end time in Unix seconds, default to current time. | [optional]

### Return type

[**List&lt;FuturesTrade&gt;**](FuturesTrade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listFuturesCandlesticks"></a>
# **listFuturesCandlesticks**
> List&lt;FuturesCandlestick&gt; listFuturesCandlesticks(settle, contract).from(from).to(to).limit(limit).interval(interval).timezone(timezone).execute();

Futures market K-line chart

Return specified contract candlesticks. If prefix &#x60;contract&#x60; with &#x60;mark_&#x60;, the contract&#39;s mark price candlesticks are returned; if prefix with &#x60;index_&#x60;, index price candlesticks will be returned.  Maximum of 2000 points are returned in one query. Be sure not to exceed the limit when specifying &#x60;from&#x60;, &#x60;to&#x60; and &#x60;interval&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision
        Integer limit = 100; // Integer | Maximum number of recent data points to return. `limit` conflicts with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        String interval = "5m"; // String | Time interval for data points. Note: 1w represents a natural week, 7d is aligned with Unix epoch time, 30d represents a natural month
        String timezone = "\"utc0\""; // String | Time zone: all/utc0/utc8, default utc0
        try {
            List<FuturesCandlestick> result = apiInstance.listFuturesCandlesticks(settle, contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .interval(interval)
                        .timezone(timezone)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesCandlesticks");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision | [optional]
 **limit** | **Integer**| Maximum number of recent data points to return. &#x60;limit&#x60; conflicts with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Time interval for data points. Note: 1w represents a natural week, 7d is aligned with Unix epoch time, 30d represents a natural month | [optional] [default to 5m] [enum: 10s, 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]
 **timezone** | **String**| Time zone: all/utc0/utc8, default utc0 | [optional] [default to &quot;utc0&quot;]

### Return type

[**List&lt;FuturesCandlestick&gt;**](FuturesCandlestick.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesPremiumIndex"></a>
# **listFuturesPremiumIndex**
> List&lt;FuturesPremiumIndex&gt; listFuturesPremiumIndex(settle, contract).from(from).to(to).limit(limit).interval(interval).execute();

Premium Index K-line chart

K-line chart data returns a maximum of 1000 points per request. When specifying from, to, and interval, ensure the number of points is not excessive

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1546905600L; // Long | Start time of candlesticks, formatted in Unix timestamp in seconds. Default to`to - 100 * interval` if not specified
        Long to = 1546935600L; // Long | Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision
        Integer limit = 100; // Integer | Maximum number of recent data points to return. `limit` conflicts with `from` and `to`. If either `from` or `to` is specified, request will be rejected.
        String interval = "5m"; // String | Time interval between data points
        try {
            List<FuturesPremiumIndex> result = apiInstance.listFuturesPremiumIndex(settle, contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .interval(interval)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesPremiumIndex");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start time of candlesticks, formatted in Unix timestamp in seconds. Default to&#x60;to - 100 * interval&#x60; if not specified | [optional]
 **to** | **Long**| Specify the end time of the K-line chart, defaults to current time if not specified, note that the time format is Unix timestamp with second precision | [optional]
 **limit** | **Integer**| Maximum number of recent data points to return. &#x60;limit&#x60; conflicts with &#x60;from&#x60; and &#x60;to&#x60;. If either &#x60;from&#x60; or &#x60;to&#x60; is specified, request will be rejected. | [optional] [default to 100]
 **interval** | **String**| Time interval between data points | [optional] [default to 5m] [enum: 1m, 5m, 15m, 30m, 1h, 4h, 8h, 1d, 7d]

### Return type

[**List&lt;FuturesPremiumIndex&gt;**](FuturesPremiumIndex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesTickers"></a>
# **listFuturesTickers**
> List&lt;FuturesTicker&gt; listFuturesTickers(settle).contract(contract).execute();

Get all futures trading statistics

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        try {
            List<FuturesTicker> result = apiInstance.listFuturesTickers(settle)
                        .contract(contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesTickers");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**List&lt;FuturesTicker&gt;**](FuturesTicker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesFundingRateHistory"></a>
# **listFuturesFundingRateHistory**
> List&lt;FundingRateRecord&gt; listFuturesFundingRateHistory(settle, contract).limit(limit).from(from).to(to).execute();

Futures market historical funding rate

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        try {
            List<FundingRateRecord> result = apiInstance.listFuturesFundingRateHistory(settle, contract)
                        .limit(limit)
                        .from(from)
                        .to(to)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesFundingRateHistory");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]

### Return type

[**List&lt;FundingRateRecord&gt;**](FundingRateRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | History query successful |  -  |

<a name="listBatchFuturesFundingRates"></a>
# **listBatchFuturesFundingRates**
> List&lt;BatchFundingRatesResponse&gt; listBatchFuturesFundingRates(settle, batchFundingRatesRequest)

Batch Query Historical Funding Rate Data for Perpetual Contracts

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        BatchFundingRatesRequest batchFundingRatesRequest = new BatchFundingRatesRequest(); // BatchFundingRatesRequest | 
        try {
            List<BatchFundingRatesResponse> result = apiInstance.listBatchFuturesFundingRates(settle, batchFundingRatesRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listBatchFuturesFundingRates");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **batchFundingRatesRequest** | [**BatchFundingRatesRequest**](BatchFundingRatesRequest.md)|  |

### Return type

[**List&lt;BatchFundingRatesResponse&gt;**](BatchFundingRatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch Query Successful |  -  |

<a name="listFuturesInsuranceLedger"></a>
# **listFuturesInsuranceLedger**
> List&lt;InsuranceRecord&gt; listFuturesInsuranceLedger(settle).limit(limit).execute();

Futures market insurance fund history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        try {
            List<InsuranceRecord> result = apiInstance.listFuturesInsuranceLedger(settle)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesInsuranceLedger");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;InsuranceRecord&gt;**](InsuranceRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listContractStats"></a>
# **listContractStats**
> List&lt;ContractStat&gt; listContractStats(settle, contract).from(from).interval(interval).limit(limit).execute();

Futures statistics

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1604561000L; // Long | Start timestamp
        String interval = "\"5m\""; // String | 
        Integer limit = 30; // Integer | 
        try {
            List<ContractStat> result = apiInstance.listContractStats(settle, contract)
                        .from(from)
                        .interval(interval)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listContractStats");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start timestamp | [optional]
 **interval** | **String**|  | [optional] [default to &quot;5m&quot;]
 **limit** | **Integer**|  | [optional] [default to 30]

### Return type

[**List&lt;ContractStat&gt;**](ContractStat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getIndexConstituents"></a>
# **getIndexConstituents**
> FuturesIndexConstituents getIndexConstituents(settle, index)

Query index constituents

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String index = "BTC_USDT"; // String | Index name
        try {
            FuturesIndexConstituents result = apiInstance.getIndexConstituents(settle, index);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getIndexConstituents");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **index** | **String**| Index name |

### Return type

[**FuturesIndexConstituents**](FuturesIndexConstituents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listLiquidatedOrders"></a>
# **listLiquidatedOrders**
> List&lt;FuturesLiqOrder&gt; listLiquidatedOrders(settle).contract(contract).from(from).to(to).limit(limit).execute();

Query liquidation order history

The time interval between from and to is maximum 3600. Some private fields are not returned by public interfaces, refer to field descriptions for details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        try {
            List<FuturesLiqOrder> result = apiInstance.listLiquidatedOrders(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listLiquidatedOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]

### Return type

[**List&lt;FuturesLiqOrder&gt;**](FuturesLiqOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listFuturesRiskLimitTiers"></a>
# **listFuturesRiskLimitTiers**
> List&lt;FuturesLimitRiskTiers&gt; listFuturesRiskLimitTiers(settle).contract(contract).limit(limit).offset(offset).execute();

Query risk limit tiers

When the &#39;contract&#39; parameter is not passed, the default is to query the risk limits for the top 100 markets. &#39;Limit&#39; and &#39;offset&#39; correspond to pagination queries at the market level, not to the length of the returned array. This only takes effect when the contract parameter is empty.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesLimitRiskTiers> result = apiInstance.listFuturesRiskLimitTiers(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesRiskLimitTiers");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesLimitRiskTiers&gt;**](FuturesLimitRiskTiers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesAccounts"></a>
# **listFuturesAccounts**
> FuturesAccount listFuturesAccounts(settle)

Get futures account

Query account information for classic future account and unified account

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        try {
            FuturesAccount result = apiInstance.listFuturesAccounts(settle);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesAccounts");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesAccountBook"></a>
# **listFuturesAccountBook**
> List&lt;FuturesAccountBook&gt; listFuturesAccountBook(settle).contract(contract).limit(limit).offset(offset).from(from).to(to).type(type).execute();

Query futures account change history

If the contract field is passed, only records containing this field after 2023-10-30 can be filtered。

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        String type = "dnw"; // String | Change types:  - dnw: Deposit and withdrawal - pnl: Profit and loss from position reduction - fee: Trading fees - refr: Referrer rebates - fund: Funding fees - point_dnw: Point card deposit and withdrawal - point_fee: Point card trading fees - point_refr: Point card referrer rebates - bonus_offset: Trial fund deduction
        try {
            List<FuturesAccountBook> result = apiInstance.listFuturesAccountBook(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .from(from)
                        .to(to)
                        .type(type)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesAccountBook");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **type** | **String**| Change types:  - dnw: Deposit and withdrawal - pnl: Profit and loss from position reduction - fee: Trading fees - refr: Referrer rebates - fund: Funding fees - point_dnw: Point card deposit and withdrawal - point_fee: Point card trading fees - point_refr: Point card referrer rebates - bonus_offset: Trial fund deduction | [optional]

### Return type

[**List&lt;FuturesAccountBook&gt;**](FuturesAccountBook.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listPositions"></a>
# **listPositions**
> List&lt;Position&gt; listPositions(settle).holding(holding).limit(limit).offset(offset).execute();

Get user position list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Boolean holding = true; // Boolean | Return only real positions - true, return all - false
        Integer limit = 100; // Integer | Maximum number of positions returned. If omitted, all current positions are returned by default; if provided, the value must be within [1,100].
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<Position> result = apiInstance.listPositions(settle)
                        .holding(holding)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPositions");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **holding** | **Boolean**| Return only real positions - true, return all - false | [optional]
 **limit** | **Integer**| Maximum number of positions returned. If omitted, all current positions are returned by default; if provided, the value must be within [1,100]. | [optional]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listPositionsTimerange"></a>
# **listPositionsTimerange**
> List&lt;PositionTimerange&gt; listPositionsTimerange(settle, contract).from(from).to(to).limit(limit).offset(offset).execute();

Get user&#39;s historical position information list by time

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<PositionTimerange> result = apiInstance.listPositionsTimerange(settle, contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPositionsTimerange");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;PositionTimerange&gt;**](PositionTimerange.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="getPosition"></a>
# **getPosition**
> Position getPosition(settle, contract).execute();

Get single position information

Get single position information from a contract. If you hold two postions in one contract market, please use this API: /futures/{settle}/dual_comp/positions/{contract}

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            Position result = apiInstance.getPosition(settle, contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getPosition");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="getLeverage"></a>
# **getLeverage**
> FuturesLeverage getLeverage(settle, contract, posMarginMode, dualSide)

Get Leverage Information for Specified Mode

Get Leverage Information for Specified Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String posMarginMode = "isolated"; // String | Position Margin Mode, required for split position mode, values: isolated/cross.
        String dualSide = "dual_long"; // String | dual_long - Long, dual_short - Short
        try {
            FuturesLeverage result = apiInstance.getLeverage(settle, contract, posMarginMode, dualSide);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getLeverage");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **posMarginMode** | **String**| Position Margin Mode, required for split position mode, values: isolated/cross. |
 **dualSide** | **String**| dual_long - Long, dual_short - Short |

### Return type

[**FuturesLeverage**](FuturesLeverage.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | query leverage success |  -  |

<a name="updatePositionMargin"></a>
# **updatePositionMargin**
> Position updatePositionMargin(settle, contract, change)

Update position margin

Under the new risk limit rules(https://www.gate.com/en/help/futures/futures-logic/22162), the position limit is related to the leverage you set; a lower leverage will result in a higher position limit. Please use the leverage adjustment api to adjust the position limit.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String change = "0.01"; // String | Margin change amount, positive number increases, negative number decreases
        try {
            Position result = apiInstance.updatePositionMargin(settle, contract, change);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionMargin");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change amount, positive number increases, negative number decreases |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updatePositionLeverage"></a>
# **updatePositionLeverage**
> Position updatePositionLeverage(settle, contract, leverage, crossLeverageLimit, pid)

Update position leverage

⚠️ Position Mode Switching Rules:  - leverage ≠ 0: Isolated Margin Mode (Regardless of whether cross_leverage_limit is filled, this parameter will be ignored) - leverage &#x3D; 0: Cross Margin Mode (Use cross_leverage_limit to set the leverage multiple)  Examples: - Set isolated margin with 10x leverage: leverage&#x3D;10 - Set cross margin with 10x leverage: leverage&#x3D;0&amp;cross_leverage_limit&#x3D;10 - leverage&#x3D;5&amp;cross_leverage_limit&#x3D;10 → Result: Isolated margin with 5x leverage (cross_leverage_limit is ignored)  ⚠️ Warning: Incorrect settings may cause unexpected position mode switching, affecting risk management.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String leverage = "10"; // String | Set the leverage for isolated margin. When setting isolated margin leverage, the `cross_leverage_limit`  must be empty.
        String crossLeverageLimit = "10"; // String | Set the leverage for cross margin. When setting cross margin leverage, the `leverage` must be set to 0.
        Integer pid = 1; // Integer | Product ID
        try {
            Position result = apiInstance.updatePositionLeverage(settle, contract, leverage, crossLeverageLimit, pid);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionLeverage");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| Set the leverage for isolated margin. When setting isolated margin leverage, the &#x60;cross_leverage_limit&#x60;  must be empty. |
 **crossLeverageLimit** | **String**| Set the leverage for cross margin. When setting cross margin leverage, the &#x60;leverage&#x60; must be set to 0. | [optional]
 **pid** | **Integer**| Product ID | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updateContractPositionLeverage"></a>
# **updateContractPositionLeverage**
> Position updateContractPositionLeverage(settle, contract, leverage, marginMode, dualSide)

Update Leverage for Specified Mode

To simplify the complex logic of the leverage interface, added a new interface for modifying leverage

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String leverage = "10"; // String | Position Leverage Multiple
        String marginMode = "cross"; // String | Margin Mode isolated/cross
        String dualSide = "dual_long"; // String | dual_long - Long, dual_short - Short
        try {
            Position result = apiInstance.updateContractPositionLeverage(settle, contract, leverage, marginMode, dualSide);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateContractPositionLeverage");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| Position Leverage Multiple |
 **marginMode** | **String**| Margin Mode isolated/cross |
 **dualSide** | **String**| dual_long - Long, dual_short - Short | [optional]

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updatePositionCrossMode"></a>
# **updatePositionCrossMode**
> Position updatePositionCrossMode(settle, futuresPositionCrossMode)

Switch Position Margin Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        FuturesPositionCrossMode futuresPositionCrossMode = new FuturesPositionCrossMode(); // FuturesPositionCrossMode | 
        try {
            Position result = apiInstance.updatePositionCrossMode(settle, futuresPositionCrossMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionCrossMode");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresPositionCrossMode** | [**FuturesPositionCrossMode**](FuturesPositionCrossMode.md)|  |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="updateDualCompPositionCrossMode"></a>
# **updateDualCompPositionCrossMode**
> List&lt;Position&gt; updateDualCompPositionCrossMode(settle, updateDualCompPositionCrossModeRequest)

Switch Between Cross and Isolated Margin Modes Under Hedge Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        UpdateDualCompPositionCrossModeRequest updateDualCompPositionCrossModeRequest = new UpdateDualCompPositionCrossModeRequest(); // UpdateDualCompPositionCrossModeRequest | 
        try {
            List<Position> result = apiInstance.updateDualCompPositionCrossMode(settle, updateDualCompPositionCrossModeRequest);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualCompPositionCrossMode");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **updateDualCompPositionCrossModeRequest** | [**UpdateDualCompPositionCrossModeRequest**](UpdateDualCompPositionCrossModeRequest.md)|  |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="updatePositionRiskLimit"></a>
# **updatePositionRiskLimit**
> Position updatePositionRiskLimit(settle, contract, riskLimit)

Update position risk limit

Under the new risk limit rules(https://www.gate.com/en/help/futures/futures-logic/22162), the position limit is related to the leverage you set; a lower leverage will result in a higher position limit. Please use the leverage adjustment api to adjust the position limit.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String riskLimit = "1000000"; // String | New risk limit value
        try {
            Position result = apiInstance.updatePositionRiskLimit(settle, contract, riskLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePositionRiskLimit");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New risk limit value |

### Return type

[**Position**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Position information |  -  |

<a name="setDualMode"></a>
# **setDualMode**
> FuturesAccount setDualMode(settle, dualMode)

Set position mode

The prerequisite for changing mode is that all positions have no holdings and no pending orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Boolean dualMode = true; // Boolean | Whether to enable Hedge Mode
        try {
            FuturesAccount result = apiInstance.setDualMode(settle, dualMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#setDualMode");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **dualMode** | **Boolean**| Whether to enable Hedge Mode |

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated successfully |  -  |

<a name="setPositionMode"></a>
# **setPositionMode**
> FuturesAccount setPositionMode(settle, positionMode)

Set Position Holding Mode, replacing the dual_mode interface

The prerequisite for changing mode is that all positions have no holdings and no pending orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String positionMode = "dual_plus"; // String | Optional Values: single, dual, dual_plus, representing Single Direction, Dual Direction, Split Position respectively
        try {
            FuturesAccount result = apiInstance.setPositionMode(settle, positionMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#setPositionMode");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **positionMode** | **String**| Optional Values: single, dual, dual_plus, representing Single Direction, Dual Direction, Split Position respectively |

### Return type

[**FuturesAccount**](FuturesAccount.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated successfully |  -  |

<a name="getDualModePosition"></a>
# **getDualModePosition**
> List&lt;Position&gt; getDualModePosition(settle, contract).execute();

Get position information in Hedge Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        try {
            List<Position> result = apiInstance.getDualModePosition(settle, contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getDualModePosition");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="updateDualModePositionMargin"></a>
# **updateDualModePositionMargin**
> List&lt;Position&gt; updateDualModePositionMargin(settle, contract, change, dualSide)

Update position margin in Hedge Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String change = "0.01"; // String | Margin change amount, positive number increases, negative number decreases
        String dualSide = "dual_long"; // String | Long or short position
        try {
            List<Position> result = apiInstance.updateDualModePositionMargin(settle, contract, change, dualSide);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionMargin");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **change** | **String**| Margin change amount, positive number increases, negative number decreases |
 **dualSide** | **String**| Long or short position |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="updateDualModePositionLeverage"></a>
# **updateDualModePositionLeverage**
> List&lt;Position&gt; updateDualModePositionLeverage(settle, contract, leverage, crossLeverageLimit)

Update position leverage in Hedge Mode

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String leverage = "10"; // String | New position leverage
        String crossLeverageLimit = "10"; // String | Cross margin leverage (valid only when `leverage` is 0)
        try {
            List<Position> result = apiInstance.updateDualModePositionLeverage(settle, contract, leverage, crossLeverageLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionLeverage");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **leverage** | **String**| New position leverage |
 **crossLeverageLimit** | **String**| Cross margin leverage (valid only when &#x60;leverage&#x60; is 0) | [optional]

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="updateDualModePositionRiskLimit"></a>
# **updateDualModePositionRiskLimit**
> List&lt;Position&gt; updateDualModePositionRiskLimit(settle, contract, riskLimit)

Update position risk limit in Hedge Mode

Under the new risk limit rules(https://www.gate.com/en/help/futures/futures-logic/22162), the position limit is related to the leverage you set; a lower leverage will result in a higher position limit. Please use the leverage adjustment api to adjust the position limit.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract
        String riskLimit = "1000000"; // String | New risk limit value
        try {
            List<Position> result = apiInstance.updateDualModePositionRiskLimit(settle, contract, riskLimit);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateDualModePositionRiskLimit");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract |
 **riskLimit** | **String**| New risk limit value |

### Return type

[**List&lt;Position&gt;**](Position.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="listFuturesOrders"></a>
# **listFuturesOrders**
> List&lt;FuturesOrder&gt; listFuturesOrders(settle, status).contract(contract).limit(limit).offset(offset).lastId(lastId).execute();

Query futures order list

- Zero-fill order cannot be retrieved for 10 minutes after cancellation - Historical orders, by default, only data within the past 6 months is supported.  If you need to query data for a longer period, please use &#x60;GET /futures/{settle}/orders_timerange&#x60;.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String status = "open"; // String | Query order list based on status
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Use the ID of the last record in the previous list as the starting point for the next list  Operations based on custom IDs can only be checked when orders are pending. After orders are completed (filled/cancelled), they can be checked within 1 hour after completion. After expiration, only order IDs can be used
        try {
            List<FuturesOrder> result = apiInstance.listFuturesOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listFuturesOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **status** | **String**| Query order list based on status |
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Use the ID of the last record in the previous list as the starting point for the next list  Operations based on custom IDs can only be checked when orders are pending. After orders are completed (filled/cancelled), they can be checked within 1 hour after completion. After expiration, only order IDs can be used | [optional]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  * X-Pagination-Limit - Limit specified for pagination <br>  * X-Pagination-Offset - Offset specified for pagination <br>  |

<a name="createFuturesOrder"></a>
# **createFuturesOrder**
> FuturesOrder createFuturesOrder(settle, futuresOrder, xGateExptime)

Place futures order

- When placing an order, the number of contracts is specified &#x60;size&#x60;, not the number of coins. The number of coins corresponding to each contract is returned in the contract details interface &#x60;quanto_multiplier&#x60; - 0 The order that was completed cannot be obtained after 10 minutes of withdrawal, and the order will be mentioned that the order does not exist - Setting &#x60;reduce_only&#x60; to &#x60;true&#x60; can prevent the position from being penetrated when reducing the position - In single-position mode, if you need to close the position, you need to set &#x60;size&#x60; to 0 and &#x60;close&#x60; to &#x60;true&#x60; - In dual warehouse mode,   - Reduce position: reduce_only&#x3D;true, size is a positive number that indicates short position, negative number that indicates long position  - Add number that indicates adding long positions, and negative numbers indicate adding short positions  - Close position: size&#x3D;0, set the direction of closing position according to auto_size, and set &#x60;reduce_only&#x60; to true  at the same time - reduce_only: Make sure to only perform position reduction operations to prevent increased positions - Set &#x60;stp_act&#x60; to determine the use of a strategy that restricts user transactions. For detailed usage, refer to the body parameter &#x60;stp_act&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        FuturesOrder futuresOrder = new FuturesOrder(); // FuturesOrder | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            FuturesOrder result = apiInstance.createFuturesOrder(settle, futuresOrder, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createFuturesOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresOrder** | [**FuturesOrder**](FuturesOrder.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order details |  -  |

<a name="cancelFuturesOrders"></a>
# **cancelFuturesOrders**
> List&lt;FuturesOrder&gt; cancelFuturesOrders(settle, xGateExptime, contract, actionMode, side, excludeReduceOnly, text)

Cancel all orders with &#39;open&#39; status

Zero-fill orders cannot be retrieved 10 minutes after order cancellation

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        String contract = "BTC_USDT"; // String | Contract Identifier; if specified, only cancel pending orders related to this contract
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - `ACK`: Asynchronous mode, returns only key order fields - `RESULT`: No clearing information - `FULL`: Full mode (default)
        String side = "ask"; // String | Specify all buy orders or all sell orders, both are included if not specified. Set to bid to cancel all buy orders, set to ask to cancel all sell orders
        Boolean excludeReduceOnly = false; // Boolean | Whether to exclude reduce-only orders
        String text = "cancel by user"; // String | Remark for order cancellation
        try {
            List<FuturesOrder> result = apiInstance.cancelFuturesOrders(settle, xGateExptime, contract, actionMode, side, excludeReduceOnly, text);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelFuturesOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]
 **contract** | **String**| Contract Identifier; if specified, only cancel pending orders related to this contract | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - &#x60;ACK&#x60;: Asynchronous mode, returns only key order fields - &#x60;RESULT&#x60;: No clearing information - &#x60;FULL&#x60;: Full mode (default) | [optional]
 **side** | **String**| Specify all buy orders or all sell orders, both are included if not specified. Set to bid to cancel all buy orders, set to ask to cancel all sell orders | [optional]
 **excludeReduceOnly** | **Boolean**| Whether to exclude reduce-only orders | [optional] [default to false]
 **text** | **String**| Remark for order cancellation | [optional]

### Return type

[**List&lt;FuturesOrder&gt;**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancellation successful |  -  |

<a name="getOrdersWithTimeRange"></a>
# **getOrdersWithTimeRange**
> List&lt;FuturesOrderTimerange&gt; getOrdersWithTimeRange(settle).contract(contract).from(from).to(to).limit(limit).offset(offset).execute();

Query futures order list by time range

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesOrderTimerange> result = apiInstance.getOrdersWithTimeRange(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getOrdersWithTimeRange");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesOrderTimerange&gt;**](FuturesOrderTimerange.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  * X-Pagination-Limit - Limit specified for pagination <br>  * X-Pagination-Offset - Offset specified for pagination <br>  |

<a name="createBatchFuturesOrder"></a>
# **createBatchFuturesOrder**
> List&lt;BatchFuturesOrder&gt; createBatchFuturesOrder(settle, futuresOrder, xGateExptime)

Place batch futures orders

- Up to 10 orders per request - If any of the order&#39;s parameters are missing or in the wrong format, all of them will not be executed, and a http status 400 error will be returned directly - If the parameters are checked and passed, all are executed. Even if there is a business logic error in the middle (such as insufficient funds), it will not affect other execution orders - The returned result is in array format, and the order corresponds to the orders in the request body - In the returned result, the &#x60;succeeded&#x60; field of type bool indicates whether the execution was successful or not - If the execution is successful, the normal order content is included; if the execution fails, the &#x60;label&#x60; field is included to indicate the cause of the error - In the rate limiting, each order is counted individually

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        List<FuturesOrder> futuresOrder = Arrays.asList(); // List<FuturesOrder> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<BatchFuturesOrder> result = apiInstance.createBatchFuturesOrder(settle, futuresOrder, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createBatchFuturesOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresOrder** | [**List&lt;FuturesOrder&gt;**](FuturesOrder.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;BatchFuturesOrder&gt;**](BatchFuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request execution completed |  -  |

<a name="getFuturesOrder"></a>
# **getFuturesOrder**
> FuturesOrder getFuturesOrder(settle, orderId)

Query single order details

- Zero-fill order cannot be retrieved for 10 minutes after cancellation - Historical orders, by default, only data within the past 6 months is supported.  

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String orderId = "12345"; // String | The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the `text` field). When using the custom `text` field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by `text`; continuing to use `text` returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by `text` indefinitely.
        try {
            FuturesOrder result = apiInstance.getFuturesOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **orderId** | **String**| The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the &#x60;text&#x60; field). When using the custom &#x60;text&#x60; field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by &#x60;text&#x60;; continuing to use &#x60;text&#x60; returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by &#x60;text&#x60; indefinitely. |

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="amendFuturesOrder"></a>
# **amendFuturesOrder**
> FuturesOrder amendFuturesOrder(settle, orderId, futuresOrderAmendment, xGateExptime)

Amend single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String orderId = "12345"; // String | The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the `text` field). When using the custom `text` field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by `text`; continuing to use `text` returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by `text` indefinitely.
        FuturesOrderAmendment futuresOrderAmendment = new FuturesOrderAmendment(); // FuturesOrderAmendment | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            FuturesOrder result = apiInstance.amendFuturesOrder(settle, orderId, futuresOrderAmendment, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#amendFuturesOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **orderId** | **String**| The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the &#x60;text&#x60; field). When using the custom &#x60;text&#x60; field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by &#x60;text&#x60;; continuing to use &#x60;text&#x60; returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by &#x60;text&#x60; indefinitely. |
 **futuresOrderAmendment** | [**FuturesOrderAmendment**](FuturesOrderAmendment.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="cancelFuturesOrder"></a>
# **cancelFuturesOrder**
> FuturesOrder cancelFuturesOrder(settle, orderId, xGateExptime, actionMode)

Cancel single order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String orderId = "12345"; // String | The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the `text` field). When using the custom `text` field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by `text`; continuing to use `text` returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by `text` indefinitely.
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        String actionMode = "ACK"; // String | Processing Mode  When placing an order, different fields are returned based on the action_mode  - `ACK`: Asynchronous mode, returns only key order fields - `RESULT`: No clearing information - `FULL`: Full mode (default)
        try {
            FuturesOrder result = apiInstance.cancelFuturesOrder(settle, orderId, xGateExptime, actionMode);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelFuturesOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **orderId** | **String**| The order ID returned when the order is created successfully, or the custom ID specified by the user when creating the order (i.e. the &#x60;text&#x60; field). When using the custom &#x60;text&#x60; field: 1. If the order was not filled and has been cancelled, after 60 seconds you cannot query the order by &#x60;text&#x60;; continuing to use &#x60;text&#x60; returns error ORDER_NOT_FOUND. 2. If the order was fully or partially filled, you can query the order by &#x60;text&#x60; indefinitely. |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]
 **actionMode** | **String**| Processing Mode  When placing an order, different fields are returned based on the action_mode  - &#x60;ACK&#x60;: Asynchronous mode, returns only key order fields - &#x60;RESULT&#x60;: No clearing information - &#x60;FULL&#x60;: Full mode (default) | [optional]

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order details |  -  |

<a name="getMyTrades"></a>
# **getMyTrades**
> List&lt;MyFuturesTrade&gt; getMyTrades(settle).contract(contract).order(order).limit(limit).offset(offset).lastId(lastId).execute();

Query personal trading records

By default, only supports querying data within 6 months. For older data, use &#x60;GET /futures/{settle}/my_trades_timerange&#x60;

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long order = 12345L; // Long | Futures order ID, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String lastId = "12345"; // String | Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. If you need to iterate through and retrieve more records, we recommend using 'GET /futures/{settle}/my_trades_timerange'.
        try {
            List<MyFuturesTrade> result = apiInstance.getMyTrades(settle)
                        .contract(contract)
                        .order(order)
                        .limit(limit)
                        .offset(offset)
                        .lastId(lastId)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getMyTrades");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **order** | **Long**| Futures order ID, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **lastId** | **String**| Specify the starting point for this list based on a previously retrieved id  This parameter is deprecated. If you need to iterate through and retrieve more records, we recommend using &#39;GET /futures/{settle}/my_trades_timerange&#39;. | [optional]

### Return type

[**List&lt;MyFuturesTrade&gt;**](MyFuturesTrade.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  * X-Pagination-Limit - Limit specified for pagination <br>  * X-Pagination-Offset - Offset specified for pagination <br>  |

<a name="getMyTradesWithTimeRange"></a>
# **getMyTradesWithTimeRange**
> List&lt;MyFuturesTradeTimeRange&gt; getMyTradesWithTimeRange(settle).contract(contract).from(from).to(to).limit(limit).offset(offset).role(role).execute();

Query personal trading records by time range

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        String role = "maker"; // String | Query role, maker or taker
        try {
            List<MyFuturesTradeTimeRange> result = apiInstance.getMyTradesWithTimeRange(settle)
                        .contract(contract)
                        .from(from)
                        .to(to)
                        .limit(limit)
                        .offset(offset)
                        .role(role)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getMyTradesWithTimeRange");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **role** | **String**| Query role, maker or taker | [optional]

### Return type

[**List&lt;MyFuturesTradeTimeRange&gt;**](MyFuturesTradeTimeRange.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  * X-Pagination-Limit - Limit specified for pagination <br>  * X-Pagination-Offset - Offset specified for pagination <br>  |

<a name="listPositionClose"></a>
# **listPositionClose**
> List&lt;PositionClose&gt; listPositionClose(settle).contract(contract).limit(limit).offset(offset).from(from).to(to).side(side).pnl(pnl).execute();

Query position close history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        String side = "short"; // String | Query side. long or shot
        String pnl = "profit"; // String | Query profit or loss
        try {
            List<PositionClose> result = apiInstance.listPositionClose(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .from(from)
                        .to(to)
                        .side(side)
                        .pnl(pnl)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPositionClose");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **side** | **String**| Query side. long or shot | [optional]
 **pnl** | **String**| Query profit or loss | [optional]

### Return type

[**List&lt;PositionClose&gt;**](PositionClose.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listLiquidates"></a>
# **listLiquidates**
> List&lt;FuturesLiquidate&gt; listLiquidates(settle).contract(contract).limit(limit).offset(offset).from(from).to(to).at(at).execute();

Query liquidation history

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer at = 0; // Integer | Specify liquidation timestamp
        try {
            List<FuturesLiquidate> result = apiInstance.listLiquidates(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .from(from)
                        .to(to)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listLiquidates");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **at** | **Integer**| Specify liquidation timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesLiquidate&gt;**](FuturesLiquidate.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="listAutoDeleverages"></a>
# **listAutoDeleverages**
> List&lt;FuturesAutoDeleverage&gt; listAutoDeleverages(settle).contract(contract).limit(limit).offset(offset).from(from).to(to).at(at).execute();

Query ADL auto-deleveraging order information

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        Long from = 1547706332L; // Long | Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit)
        Long to = 1547706332L; // Long | Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp
        Integer at = 0; // Integer | Specify auto-deleveraging timestamp
        try {
            List<FuturesAutoDeleverage> result = apiInstance.listAutoDeleverages(settle)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .from(from)
                        .to(to)
                        .at(at)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listAutoDeleverages");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]
 **from** | **Long**| Start timestamp  Specify start time, time format is Unix timestamp. If not specified, it defaults to (the data start time of the time range actually returned by to and limit) | [optional]
 **to** | **Long**| Termination Timestamp  Specify the end time. If not specified, it defaults to the current time, and the time format is a Unix timestamp | [optional]
 **at** | **Integer**| Specify auto-deleveraging timestamp | [optional] [default to 0]

### Return type

[**List&lt;FuturesAutoDeleverage&gt;**](FuturesAutoDeleverage.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="countdownCancelAllFutures"></a>
# **countdownCancelAllFutures**
> TriggerTime countdownCancelAllFutures(settle, countdownCancelAllFuturesTask)

Countdown cancel orders

Heartbeat detection for contract orders: When the user-set &#x60;timeout&#x60; time is reached, if neither the existing countdown is canceled nor a new countdown is set, the relevant contract orders will be automatically canceled. This API can be called repeatedly to or cancel the countdown. Usage example: Repeatedly call this API at 30-second intervals, setting the &#x60;timeout&#x60; to 30 (seconds) each time. If this API is not called again within 30 seconds, all open orders on your specified &#x60;market&#x60; will be automatically canceled. If the &#x60;timeout&#x60; is set to 0 within 30 seconds, the countdown timer will terminate, and the automatic order cancellation function will be disabled.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        CountdownCancelAllFuturesTask countdownCancelAllFuturesTask = new CountdownCancelAllFuturesTask(); // CountdownCancelAllFuturesTask | 
        try {
            TriggerTime result = apiInstance.countdownCancelAllFutures(settle, countdownCancelAllFuturesTask);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#countdownCancelAllFutures");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **countdownCancelAllFuturesTask** | [**CountdownCancelAllFuturesTask**](CountdownCancelAllFuturesTask.md)|  |

### Return type

[**TriggerTime**](TriggerTime.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Countdown set successfully |  -  |

<a name="getFuturesFee"></a>
# **getFuturesFee**
> Map&lt;String, FuturesFee&gt; getFuturesFee(settle).contract(contract).execute();

Query futures market trading fee rates

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        try {
            Map<String, FuturesFee> result = apiInstance.getFuturesFee(settle)
                        .contract(contract)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesFee");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**Map&lt;String, FuturesFee&gt;**](FuturesFee.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="cancelBatchFutureOrders"></a>
# **cancelBatchFutureOrders**
> List&lt;FutureCancelOrderResult&gt; cancelBatchFutureOrders(settle, requestBody, xGateExptime)

Cancel batch orders by specified ID list

Multiple different order IDs can be specified. A maximum of 20 records can be cancelled in one request

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        List<String> requestBody = Arrays.asList(); // List<String> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<FutureCancelOrderResult> result = apiInstance.cancelBatchFutureOrders(settle, requestBody, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelBatchFutureOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;FutureCancelOrderResult&gt;**](FutureCancelOrderResult.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order cancellation operation completed |  -  |

<a name="amendBatchFutureOrders"></a>
# **amendBatchFutureOrders**
> List&lt;BatchFuturesOrder&gt; amendBatchFutureOrders(settle, batchAmendOrderReq, xGateExptime)

Batch modify orders by specified IDs

Multiple different order IDs can be specified. A maximum of 10 orders can be modified in one request

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        List<BatchAmendOrderReq> batchAmendOrderReq = Arrays.asList(); // List<BatchAmendOrderReq> | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            List<BatchFuturesOrder> result = apiInstance.amendBatchFutureOrders(settle, batchAmendOrderReq, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#amendBatchFutureOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **batchAmendOrderReq** | [**List&lt;BatchAmendOrderReq&gt;**](BatchAmendOrderReq.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**List&lt;BatchFuturesOrder&gt;**](BatchFuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request execution completed |  -  |

<a name="getFuturesRiskLimitTable"></a>
# **getFuturesRiskLimitTable**
> List&lt;FuturesRiskLimitTier&gt; getFuturesRiskLimitTable(settle, tableId)

Query risk limit table by table_id

Just pass table_id

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String tableId = "CYBER_USDT_20241122"; // String | Risk limit table ID
        try {
            List<FuturesRiskLimitTier> result = apiInstance.getFuturesRiskLimitTable(settle, tableId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getFuturesRiskLimitTable");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **tableId** | **String**| Risk limit table ID |

### Return type

[**List&lt;FuturesRiskLimitTier&gt;**](FuturesRiskLimitTier.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="createFuturesBBOOrder"></a>
# **createFuturesBBOOrder**
> FuturesOrder createFuturesBBOOrder(settle, futuresBBOOrder, xGateExptime)

Level-based BBO Contract Order Placement

Compared to the futures trading order placement interface (futures/{settle}/orders), it adds the &#x60;level&#x60; and &#x60;direction&#x60; parameters.

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        FuturesBBOOrder futuresBBOOrder = new FuturesBBOOrder(); // FuturesBBOOrder | 
        String xGateExptime = "1689560679123"; // String | Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected
        try {
            FuturesOrder result = apiInstance.createFuturesBBOOrder(settle, futuresBBOOrder, xGateExptime);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createFuturesBBOOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresBBOOrder** | [**FuturesBBOOrder**](FuturesBBOOrder.md)|  |
 **xGateExptime** | **String**| Specify the expiration time (milliseconds); if the GATE receives the request time greater than the expiration time, the request will be rejected | [optional]

### Return type

[**FuturesOrder**](FuturesOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order details |  -  |

<a name="createTrailOrder"></a>
# **createTrailOrder**
> CreateTrailOrderResponse createTrailOrder(settle, createTrailOrder)

Create trail order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        CreateTrailOrder createTrailOrder = new CreateTrailOrder(); // CreateTrailOrder | 
        try {
            CreateTrailOrderResponse result = apiInstance.createTrailOrder(settle, createTrailOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createTrailOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **createTrailOrder** | [**CreateTrailOrder**](CreateTrailOrder.md)|  |

### Return type

[**CreateTrailOrderResponse**](CreateTrailOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created successfully |  -  |

<a name="stopTrailOrder"></a>
# **stopTrailOrder**
> TrailOrderResponse stopTrailOrder(settle, stopTrailOrder)

Terminate trail order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        StopTrailOrder stopTrailOrder = new StopTrailOrder(); // StopTrailOrder | 
        try {
            TrailOrderResponse result = apiInstance.stopTrailOrder(settle, stopTrailOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#stopTrailOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **stopTrailOrder** | [**StopTrailOrder**](StopTrailOrder.md)|  |

### Return type

[**TrailOrderResponse**](TrailOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Termination successful |  -  |

<a name="stopAllTrailOrders"></a>
# **stopAllTrailOrders**
> TrailOrderListResponse stopAllTrailOrders(settle, stopAllTrailOrders)

Batch terminate trail orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        StopAllTrailOrders stopAllTrailOrders = new StopAllTrailOrders(); // StopAllTrailOrders | 
        try {
            TrailOrderListResponse result = apiInstance.stopAllTrailOrders(settle, stopAllTrailOrders);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#stopAllTrailOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **stopAllTrailOrders** | [**StopAllTrailOrders**](StopAllTrailOrders.md)|  |

### Return type

[**TrailOrderListResponse**](TrailOrderListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Termination successful |  -  |

<a name="getTrailOrders"></a>
# **getTrailOrders**
> TrailOrderListResponse getTrailOrders(settle).contract(contract).isFinished(isFinished).startAt(startAt).endAt(endAt).pageNum(pageNum).pageSize(pageSize).sortBy(sortBy).hideCancel(hideCancel).relatedPosition(relatedPosition).sortByTrigger(sortByTrigger).reduceOnly(reduceOnly).side(side).execute();

Get trail order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "contract_example"; // String | Contract name
        Boolean isFinished = true; // Boolean | Whether historical order
        Long startAt = 56L; // Long | Start time of time range
        Long endAt = 56L; // Long | End time of time range
        Integer pageNum = 1; // Integer | Page number, starting from 1
        Integer pageSize = 20; // Integer | Number of items per page
        Integer sortBy = 1; // Integer | Common sort field, 1-creation time, 2-end time
        Boolean hideCancel = false; // Boolean | Hide cancelled orders
        Integer relatedPosition = 56; // Integer | Associated position, if provided, only return orders associated with this position, 1-long, 2-short
        Boolean sortByTrigger = false; // Boolean | Sort by trigger price and activation price, easy to trigger or activate first, only for current orders associated with positions
        Integer reduceOnly = 56; // Integer | Whether reduce only, 1-yes, 2-no
        Integer side = 56; // Integer | Direction, 1-long position, 2-short position
        try {
            TrailOrderListResponse result = apiInstance.getTrailOrders(settle)
                        .contract(contract)
                        .isFinished(isFinished)
                        .startAt(startAt)
                        .endAt(endAt)
                        .pageNum(pageNum)
                        .pageSize(pageSize)
                        .sortBy(sortBy)
                        .hideCancel(hideCancel)
                        .relatedPosition(relatedPosition)
                        .sortByTrigger(sortByTrigger)
                        .reduceOnly(reduceOnly)
                        .side(side)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getTrailOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Contract name | [optional]
 **isFinished** | **Boolean**| Whether historical order | [optional]
 **startAt** | **Long**| Start time of time range | [optional]
 **endAt** | **Long**| End time of time range | [optional]
 **pageNum** | **Integer**| Page number, starting from 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items per page | [optional] [default to 20]
 **sortBy** | **Integer**| Common sort field, 1-creation time, 2-end time | [optional] [default to 1] [enum: 1, 2]
 **hideCancel** | **Boolean**| Hide cancelled orders | [optional] [default to false]
 **relatedPosition** | **Integer**| Associated position, if provided, only return orders associated with this position, 1-long, 2-short | [optional] [enum: 1, 2]
 **sortByTrigger** | **Boolean**| Sort by trigger price and activation price, easy to trigger or activate first, only for current orders associated with positions | [optional] [default to false]
 **reduceOnly** | **Integer**| Whether reduce only, 1-yes, 2-no | [optional] [enum: 1, 2]
 **side** | **Integer**| Direction, 1-long position, 2-short position | [optional] [enum: 1, 2]

### Return type

[**TrailOrderListResponse**](TrailOrderListResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="getTrailOrderDetail"></a>
# **getTrailOrderDetail**
> TrailOrderDetailResponse getTrailOrderDetail(settle, id)

Get trail order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Long id = 56L; // Long | Order ID
        try {
            TrailOrderDetailResponse result = apiInstance.getTrailOrderDetail(settle, id);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getTrailOrderDetail");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **id** | **Long**| Order ID |

### Return type

[**TrailOrderDetailResponse**](TrailOrderDetailResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="updateTrailOrder"></a>
# **updateTrailOrder**
> TrailOrderResponse updateTrailOrder(settle, updateTrailOrder)

Update trail order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        UpdateTrailOrder updateTrailOrder = new UpdateTrailOrder(); // UpdateTrailOrder | 
        try {
            TrailOrderResponse result = apiInstance.updateTrailOrder(settle, updateTrailOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updateTrailOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **updateTrailOrder** | [**UpdateTrailOrder**](UpdateTrailOrder.md)|  |

### Return type

[**TrailOrderResponse**](TrailOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Updated successfully |  -  |

<a name="getTrailOrderChangeLog"></a>
# **getTrailOrderChangeLog**
> TrailOrderChangeLogResponse getTrailOrderChangeLog(settle, id).pageNum(pageNum).pageSize(pageSize).execute();

Get trail order user modification records

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Long id = 56L; // Long | Order ID
        Integer pageNum = 1; // Integer | Page number, starting from 1
        Integer pageSize = 20; // Integer | Number of items per page
        try {
            TrailOrderChangeLogResponse result = apiInstance.getTrailOrderChangeLog(settle, id)
                        .pageNum(pageNum)
                        .pageSize(pageSize)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getTrailOrderChangeLog");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **id** | **Long**| Order ID |
 **pageNum** | **Integer**| Page number, starting from 1 | [optional] [default to 1]
 **pageSize** | **Integer**| Number of items per page | [optional] [default to 20]

### Return type

[**TrailOrderChangeLogResponse**](TrailOrderChangeLogResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query successful |  -  |

<a name="createChaseOrder"></a>
# **createChaseOrder**
> CreateChaseOrderResp createChaseOrder(settle, createChaseOrderReq)

Create a chase order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        CreateChaseOrderReq createChaseOrderReq = new CreateChaseOrderReq(); // CreateChaseOrderReq | 
        try {
            CreateChaseOrderResp result = apiInstance.createChaseOrder(settle, createChaseOrderReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createChaseOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **createChaseOrderReq** | [**CreateChaseOrderReq**](CreateChaseOrderReq.md)|  |

### Return type

[**CreateChaseOrderResp**](CreateChaseOrderResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="stopChaseOrder"></a>
# **stopChaseOrder**
> StopChaseOrderResp stopChaseOrder(settle, stopChaseOrderReq)

Stop a chase order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        StopChaseOrderReq stopChaseOrderReq = new StopChaseOrderReq(); // StopChaseOrderReq | 
        try {
            StopChaseOrderResp result = apiInstance.stopChaseOrder(settle, stopChaseOrderReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#stopChaseOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **stopChaseOrderReq** | [**StopChaseOrderReq**](StopChaseOrderReq.md)|  |

### Return type

[**StopChaseOrderResp**](StopChaseOrderResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="stopAllChaseOrders"></a>
# **stopAllChaseOrders**
> StopAllChaseOrdersResp stopAllChaseOrders(settle, stopAllChaseOrdersReq)

Stop chase orders in batch

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        StopAllChaseOrdersReq stopAllChaseOrdersReq = new StopAllChaseOrdersReq(); // StopAllChaseOrdersReq | 
        try {
            StopAllChaseOrdersResp result = apiInstance.stopAllChaseOrders(settle, stopAllChaseOrdersReq);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#stopAllChaseOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **stopAllChaseOrdersReq** | [**StopAllChaseOrdersReq**](StopAllChaseOrdersReq.md)|  |

### Return type

[**StopAllChaseOrdersResp**](StopAllChaseOrdersResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getChaseOrders"></a>
# **getChaseOrders**
> GetChaseOrdersResp getChaseOrders(settle, sortBy).contract(contract).isFinished(isFinished).startAt(startAt).endAt(endAt).pageNum(pageNum).pageSize(pageSize).hideCancel(hideCancel).reduceOnly(reduceOnly).side(side).execute();

List chase orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Integer sortBy = 56; // Integer | Sort field: 1 ORDER_SORT_CREATED_AT, 2 ORDER_SORT_FINISHED_AT; cannot be 0
        String contract = "contract_example"; // String | Optional. When non-empty, must be a valid contract (validated against the market cache for the path settle); server-side converted to uppercase
        Boolean isFinished = true; // Boolean | true to query finished orders, false to query in-progress orders
        Long startAt = 56L; // Long | Lower time bound for the history list, paired with end_at. Required when is_finished is true
        Long endAt = 56L; // Long | Upper time bound for the history list, paired with start_at. Required when is_finished is true
        Integer pageNum = 56; // Integer | Page number, starting from 1
        Integer pageSize = 56; // Integer | Page size; must be between 1 and 100
        Boolean hideCancel = true; // Boolean | When true, cancelled orders are hidden in the list
        Integer reduceOnly = 56; // Integer | OptionalBool: 0 unknown, 1 true, 2 false; used to filter by reduce-only flag
        Integer side = 56; // Integer | Filter by long/short side: 1 long, 2 short
        try {
            GetChaseOrdersResp result = apiInstance.getChaseOrders(settle, sortBy)
                        .contract(contract)
                        .isFinished(isFinished)
                        .startAt(startAt)
                        .endAt(endAt)
                        .pageNum(pageNum)
                        .pageSize(pageSize)
                        .hideCancel(hideCancel)
                        .reduceOnly(reduceOnly)
                        .side(side)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getChaseOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **sortBy** | **Integer**| Sort field: 1 ORDER_SORT_CREATED_AT, 2 ORDER_SORT_FINISHED_AT; cannot be 0 | [enum: 1, 2]
 **contract** | **String**| Optional. When non-empty, must be a valid contract (validated against the market cache for the path settle); server-side converted to uppercase | [optional]
 **isFinished** | **Boolean**| true to query finished orders, false to query in-progress orders | [optional]
 **startAt** | **Long**| Lower time bound for the history list, paired with end_at. Required when is_finished is true | [optional]
 **endAt** | **Long**| Upper time bound for the history list, paired with start_at. Required when is_finished is true | [optional]
 **pageNum** | **Integer**| Page number, starting from 1 | [optional]
 **pageSize** | **Integer**| Page size; must be between 1 and 100 | [optional]
 **hideCancel** | **Boolean**| When true, cancelled orders are hidden in the list | [optional]
 **reduceOnly** | **Integer**| OptionalBool: 0 unknown, 1 true, 2 false; used to filter by reduce-only flag | [optional] [enum: 0, 1, 2]
 **side** | **Integer**| Filter by long/short side: 1 long, 2 short | [optional] [enum: 0, 1, 2]

### Return type

[**GetChaseOrdersResp**](GetChaseOrdersResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getChaseOrderDetail"></a>
# **getChaseOrderDetail**
> GetChaseOrderDetailResp getChaseOrderDetail(settle, id)

Get chase order detail

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String id = "id_example"; // String | Order ID, must be a non-zero positive integer
        try {
            GetChaseOrderDetailResp result = apiInstance.getChaseOrderDetail(settle, id);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getChaseOrderDetail");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **id** | **String**| Order ID, must be a non-zero positive integer |

### Return type

[**GetChaseOrderDetailResp**](GetChaseOrderDetailResp.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="listPriceTriggeredOrders"></a>
# **listPriceTriggeredOrders**
> List&lt;FuturesPriceTriggeredOrder&gt; listPriceTriggeredOrders(settle, status).contract(contract).limit(limit).offset(offset).execute();

Query auto order list

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String status = "status_example"; // String | Query order list based on status
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        Integer limit = 100; // Integer | Maximum number of records returned in a single list
        Integer offset = 0; // Integer | List offset, starting from 0
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.listPriceTriggeredOrders(settle, status)
                        .contract(contract)
                        .limit(limit)
                        .offset(offset)
                        .execute();
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#listPriceTriggeredOrders");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **status** | **String**| Query order list based on status | [enum: open, finished]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]
 **limit** | **Integer**| Maximum number of records returned in a single list | [optional] [default to 100]
 **offset** | **Integer**| List offset, starting from 0 | [optional] [default to 0]

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List retrieved successfully |  -  |

<a name="createPriceTriggeredOrder"></a>
# **createPriceTriggeredOrder**
> TriggerOrderResponse createPriceTriggeredOrder(settle, futuresPriceTriggeredOrder)

Create price-triggered order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = new FuturesPriceTriggeredOrder(); // FuturesPriceTriggeredOrder | 
        try {
            TriggerOrderResponse result = apiInstance.createPriceTriggeredOrder(settle, futuresPriceTriggeredOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#createPriceTriggeredOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresPriceTriggeredOrder** | [**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)|  |

### Return type

[**TriggerOrderResponse**](TriggerOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Order created successfully |  -  |

<a name="cancelPriceTriggeredOrderList"></a>
# **cancelPriceTriggeredOrderList**
> List&lt;FuturesPriceTriggeredOrder&gt; cancelPriceTriggeredOrderList(settle, contract)

Cancel all auto orders

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        String contract = "BTC_USDT"; // String | Futures contract, return related data only if specified
        try {
            List<FuturesPriceTriggeredOrder> result = apiInstance.cancelPriceTriggeredOrderList(settle, contract);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrderList");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **contract** | **String**| Futures contract, return related data only if specified | [optional]

### Return type

[**List&lt;FuturesPriceTriggeredOrder&gt;**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancel request is received and processed. Success is determined based on the order list |  -  |

<a name="getPriceTriggeredOrder"></a>
# **getPriceTriggeredOrder**
> FuturesPriceTriggeredOrder getPriceTriggeredOrder(settle, orderId)

Query single auto order details

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Long orderId = 56L; // Long | ID returned when order is successfully created
        try {
            FuturesPriceTriggeredOrder result = apiInstance.getPriceTriggeredOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#getPriceTriggeredOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **orderId** | **Long**| ID returned when order is successfully created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order details |  -  |

<a name="cancelPriceTriggeredOrder"></a>
# **cancelPriceTriggeredOrder**
> FuturesPriceTriggeredOrder cancelPriceTriggeredOrder(settle, orderId)

Cancel single auto order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        Long orderId = 56L; // Long | ID returned when order is successfully created
        try {
            FuturesPriceTriggeredOrder result = apiInstance.cancelPriceTriggeredOrder(settle, orderId);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#cancelPriceTriggeredOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **orderId** | **Long**| ID returned when order is successfully created |

### Return type

[**FuturesPriceTriggeredOrder**](FuturesPriceTriggeredOrder.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Auto order details |  -  |

<a name="updatePriceTriggeredOrder"></a>
# **updatePriceTriggeredOrder**
> TriggerOrderResponse updatePriceTriggeredOrder(settle, futuresUpdatePriceTriggeredOrder)

Modify a Single Auto Order

### Example

```java
// Import classes:
import io.gate.gateapi.ApiClient;
import io.gate.gateapi.ApiException;
import io.gate.gateapi.Configuration;
import io.gate.gateapi.GateApiException;
import io.gate.gateapi.auth.*;
import io.gate.gateapi.models.*;
import io.gate.gateapi.api.FuturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.gateio.ws/api/v4");
        
        // Configure APIv4 authorization: apiv4
        defaultClient.setApiKeySecret("YOUR_API_KEY", "YOUR_API_SECRET");

        FuturesApi apiInstance = new FuturesApi(defaultClient);
        String settle = "usdt"; // String | Perpetual futures settlement currency
        FuturesUpdatePriceTriggeredOrder futuresUpdatePriceTriggeredOrder = new FuturesUpdatePriceTriggeredOrder(); // FuturesUpdatePriceTriggeredOrder | 
        try {
            TriggerOrderResponse result = apiInstance.updatePriceTriggeredOrder(settle, futuresUpdatePriceTriggeredOrder);
            System.out.println(result);
        } catch (GateApiException e) {
            System.err.println(String.format("Gate api exception, label: %s, message: %s", e.getErrorLabel(), e.getMessage()));
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling FuturesApi#updatePriceTriggeredOrder");
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
 **settle** | **String**| Perpetual futures settlement currency | [enum: btc, usdt, usd1]
 **futuresUpdatePriceTriggeredOrder** | [**FuturesUpdatePriceTriggeredOrder**](FuturesUpdatePriceTriggeredOrder.md)|  |

### Return type

[**TriggerOrderResponse**](TriggerOrderResponse.md)

### Authorization

[apiv4](../README.md#apiv4)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Order created successfully |  -  |

