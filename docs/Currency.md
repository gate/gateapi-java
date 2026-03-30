
# Currency

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | Currency symbol |  [optional]
**name** | **String** | Currency name |  [optional]
**delisted** | **Boolean** | Whether currency is de-listed |  [optional]
**withdrawDisabled** | **Boolean** | Whether currency&#39;s withdrawal is disabled (deprecated) |  [optional]
**withdrawDelayed** | **Boolean** | Whether currency&#39;s withdrawal is delayed (deprecated) |  [optional]
**depositDisabled** | **Boolean** | Whether currency&#39;s deposit is disabled (deprecated) |  [optional]
**tradeDisabled** | **Boolean** | Whether currency&#39;s trading is disabled |  [optional]
**fixedRate** | **String** | Fixed fee rate. Only for fixed rate currencies, not valid for normal currencies |  [optional]
**chain** | **String** | The main chain corresponding to the coin |  [optional]
**chains** | [**List&lt;SpotCurrencyChain&gt;**](SpotCurrencyChain.md) | All links corresponding to coins |  [optional]
**totalSupply** | **String** | Total supply |  [optional]
**marketCap** | **String** | Market cap |  [optional]
**category** | **List&lt;String&gt;** | 币种分类  - stocks: 股票 - metals: 金属 - indices: 指数 - forex: 外汇 - commodities: 大宗商品 |  [optional]

