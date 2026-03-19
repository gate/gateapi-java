
# FixedTermBonusInfo

Bonus reward campaign information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Activity ID |  [optional]
**productId** | **Integer** | Associated product ID |  [optional]
**asset** | **String** | Product currency |  [optional]
**bonusAsset** | **String** | Reward currency |  [optional]
**kycLimit** | **String** | KYC level restrictions, comma-separated |  [optional]
**ladderApr** | [**List&lt;LadderApr&gt;**](LadderApr.md) | Tiered annual interest rate |  [optional]
**totalBonusAmount** | **String** | Total reward amount |  [optional]
**userTotalBonusAmount** | **String** | Maximum reward per user |  [optional]
**status** | **Integer** | Activity status: 1 for unlisted, 2 for listed, 3 for delisted |  [optional]
**startTime** | **String** | Activity start time |  [optional]
**endTime** | **String** | Activity end time |  [optional]
**createTime** | **String** | Created time |  [optional]
**startAt** | **Integer** | Activity start timestamp (in seconds) |  [optional]
**endAt** | **Integer** | Activity end timestamp (in seconds) |  [optional]
**totalIssuedAmount** | **String** | Total rewards distributed |  [optional]
**userTotalIssuedAmount** | **String** | Total rewards distributed to the user |  [optional]
**bonusAssetPrice** | **String** | Reward currency price (denominated in USDT) |  [optional]
**productAssetPrice** | **String** | Product currency price (denominated in USDT) |  [optional]
**productYearRate** | **String** | Product base annual interest rate |  [optional]

