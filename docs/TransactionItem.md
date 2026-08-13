
# TransactionItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset** | **String** | Asset |  [optional]
**symbol** | **String** | Symbol |  [optional]
**symbolDisplay** | **String** | Symbol display name |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Transaction type. - deposit: Funds transfer in. - withdraw: Funds transfer out. - fee: Trading fee. - dividend: Dividend payout. - sell: Stock sale credit. - buy: Stock purchase debit. - award: Airdrop reward. - stock_transfer_in: Stock transfer in. - stock_transfer_out: Stock transfer out. |  [optional]
**typeDesc** | **String** | Transaction type description |  [optional]
**change** | **String** | Change amount |  [optional]
**balance** | **String** | Balance after change |  [optional]
**refId** | **String** | Business idempotent ID |  [optional]
**time** | **Long** | Unix timestamp (seconds) |  [optional]
**unitText** | **String** | Unit display text |  [optional]
**detail** | **Map&lt;String, Object&gt;** | Business details |  [optional]

## Enum: TypeEnum

Name | Value
---- | -----
DEPOSIT | &quot;deposit&quot;
WITHDRAW | &quot;withdraw&quot;
FEE | &quot;fee&quot;
DIVIDEND | &quot;dividend&quot;
SELL | &quot;sell&quot;
BUY | &quot;buy&quot;
AWARD | &quot;award&quot;
STOCK_TRANSFER_IN | &quot;stock_transfer_in&quot;
STOCK_TRANSFER_OUT | &quot;stock_transfer_out&quot;

