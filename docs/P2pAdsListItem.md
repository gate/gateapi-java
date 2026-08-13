
# P2pAdsListItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | Serial number |  [optional]
**asset** | **String** | Cryptocurrency |  [optional]
**fiatUnit** | **String** | Fiat currency |  [optional]
**advNo** | **Integer** | Ad ID |  [optional]
**price** | **String** | Price |  [optional]
**surplusAmount** | **String** | Remaining tradable crypto quantity |  [optional]
**maxSingleTransAmount** | **String** | Maximum crypto size per trade. |  [optional]
**minSingleTransAmount** | **String** | Minimum crypto size per trade. |  [optional]
**fiatMinAmount** | **String** | Minimum fiat amount per order |  [optional]
**fiatMaxAmount** | **String** | Maximum fiat amount per order |  [optional]
**limitBasis** | [**LimitBasisEnum**](#LimitBasisEnum) | Trading limit unit. 0: crypto quantity, 1: fiat amount |  [optional]
**limitBasisText** | [**LimitBasisTextEnum**](#LimitBasisTextEnum) | Trading limit unit label. crypto: crypto quantity, fiat: fiat amount |  [optional]
**tradeMethods** | [**List&lt;P2pAdsListTradeMethod&gt;**](P2pAdsListTradeMethod.md) | Supported payment methods list |  [optional]
**nickName** | **String** | Advertiser Nickname |  [optional]

## Enum: LimitBasisEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

## Enum: LimitBasisTextEnum

Name | Value
---- | -----
CRYPTO | &quot;crypto&quot;
FIAT | &quot;fiat&quot;

