
# AccountTransferDetail

Trading account transfer details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txId** | **String** | Transfer transaction ID |  [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Transfer status:  - &#x60;pending&#x60;: Processing - &#x60;success&#x60;: Successful - &#x60;fail&#x60;: Failed |  [readonly]
**currency** | **String** | Transfer currency |  [readonly]
**amount** | **String** | Transfer amount |  [readonly]
**fromAccount** | [**FromAccountEnum**](#FromAccountEnum) | Source account type:  - &#x60;spot&#x60;: Spot account - &#x60;margin&#x60;: Margin account - &#x60;futures&#x60;: Perpetual futures account - &#x60;delivery&#x60;: Delivery futures account - &#x60;options&#x60;: Options account - &#x60;unknown&#x60;: Unrecognized account type |  [readonly]
**toAccount** | [**ToAccountEnum**](#ToAccountEnum) | Destination account type:  - &#x60;spot&#x60;: Spot account - &#x60;margin&#x60;: Margin account - &#x60;futures&#x60;: Perpetual futures account - &#x60;delivery&#x60;: Delivery futures account - &#x60;options&#x60;: Options account - &#x60;unknown&#x60;: Unrecognized account type |  [readonly]
**settle** | **String** | Settlement currency for futures, delivery, and options transfers; otherwise, null |  [readonly]
**currencyPair** | **String** | Currency pair for margin transfers; otherwise, null |  [readonly]

## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;pending&quot;
SUCCESS | &quot;success&quot;
FAIL | &quot;fail&quot;

## Enum: FromAccountEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
OPTIONS | &quot;options&quot;
UNKNOWN | &quot;unknown&quot;

## Enum: ToAccountEnum

Name | Value
---- | -----
SPOT | &quot;spot&quot;
MARGIN | &quot;margin&quot;
FUTURES | &quot;futures&quot;
DELIVERY | &quot;delivery&quot;
OPTIONS | &quot;options&quot;
UNKNOWN | &quot;unknown&quot;

