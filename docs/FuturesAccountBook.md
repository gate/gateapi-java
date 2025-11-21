
# FuturesAccountBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **Double** | Change time |  [optional]
**change** | **String** | Change amount |  [optional]
**balance** | **String** | Balance after change |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Change types:  - dnw: Deposit and withdrawal - pnl: Profit and loss from position reduction - fee: Trading fees - refr: Referrer rebates - fund: Funding fees - point_dnw: Point card deposit and withdrawal - point_fee: Point card trading fees - point_refr: Point card referrer rebates - bonus_offset: Trial fund deduction |  [optional]
**text** | **String** | Comment |  [optional]
**contract** | **String** | Futures contract, the field is only available for data after 2023-10-30 |  [optional]
**tradeId** | **String** | trade id |  [optional]
**id** | **String** | Account change record ID |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
DNW | &quot;dnw&quot;
PNL | &quot;pnl&quot;
FEE | &quot;fee&quot;
REFR | &quot;refr&quot;
FUND | &quot;fund&quot;
POINT_DNW | &quot;point_dnw&quot;
POINT_FEE | &quot;point_fee&quot;
POINT_REFR | &quot;point_refr&quot;
BONUS_OFFSET | &quot;bonus_offset&quot;

