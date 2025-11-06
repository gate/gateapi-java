
# DepositRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Record ID |  [optional] [readonly]
**txid** | **String** | Hash record of the withdrawal |  [optional] [readonly]
**timestamp** | **String** | Operation time |  [optional] [readonly]
**amount** | **String** | Token amount | 
**currency** | **String** | Currency name | 
**address** | **String** | Withdrawal address. Required for withdrawals |  [optional]
**memo** | **String** | Additional remarks with regards to the withdrawal |  [optional]
**status** | **String** | Transaction Status  - BLOCKED: Deposit Blocked - DEP_CREDITED: Deposit Credited, Withdrawal Pending Unlock - DONE: Funds Credited to Spot Account - INVALID: Invalid Transaction - MANUAL: Manual Review Required - PEND: Processing - REVIEW: Under Compliance Review - TRACK: Tracking Block Confirmations, Pending Spot Account Credit |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

