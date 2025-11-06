
# WithdrawalsDel

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
**status** | **String** | 交易状态  - BCODE: 充值码操作 - CANCEL: 已取消 - CANCELPEND: 取消提现中 - DMOVE: 待人工审核 - DONE: 完成 (block_number &gt; 0 时表示已完成上链) - EXTPEND: 已经发送等待确认 - FAIL: 链上失败等待确认 - FVERIFY: 人脸审核处理中 - LOCKED: 钱包侧锁单 - MANUAL: 待人工审核 - REJECT: 拒绝 - REQUEST: 请求中 - REVIEW: 审核中 |  [optional] [readonly]
**chain** | **String** | Name of the chain used in withdrawals | 

