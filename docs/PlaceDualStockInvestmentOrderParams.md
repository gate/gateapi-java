
# PlaceDualStockInvestmentOrderParams

Stock dual investment order request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**planId** | **String** | Product ID | 
**amount** | **String** | Subscription amount | 
**text** | **String** | Order custom information. Users can set custom ID with this field. Custom fields must meet the following conditions:  1. Must start with &#x60;t-&#x60; 2. Excluding &#x60;t-&#x60;, length cannot exceed 28 bytes 3. Can only contain numbers, letters, underscore(_), hyphen(-) or dot(.)  |  [optional]
**hitSpot** | [**HitSpotEnum**](#HitSpotEnum) | Whether to use the spot account to fund a buy-low (put) subscription. &#x60;1&#x60; selects the account; omitted or other values leave it unselected. |  [optional]
**hitStock** | [**HitStockEnum**](#HitStockEnum) | Whether to use the stock account to fund a buy-low (put) subscription. &#x60;1&#x60; selects the account; omitted or other values leave it unselected. |  [optional]
**hitSimple** | [**HitSimpleEnum**](#HitSimpleEnum) | Whether to use the Simple Earn account to fund a buy-low (put) subscription. &#x60;1&#x60; selects the account; omitted or other values leave it unselected. |  [optional]

## Enum: HitSpotEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

## Enum: HitStockEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

## Enum: HitSimpleEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1

