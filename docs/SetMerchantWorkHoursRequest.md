
# SetMerchantWorkHoursRequest

Request to set merchant working status or custom working hours

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**workStatus** | [**WorkStatusEnum**](#WorkStatusEnum) | Working status. 0: resting, 1: working, 2: using custom working hours | 
**cycleType** | [**CycleTypeEnum**](#CycleTypeEnum) | Custom working cycle; required when work_status is 2 |  [optional]
**dayOfWeek** | **String** | Weekly working days, comma-separated values 1-7 for Monday to Sunday; required when work_status is 2 and cycle_type is Weekly |  [optional]
**timeZone** | **String** | UTC timezone offset, ranging from -12 to +14; required when work_status is 2 |  [optional]
**startTime** | **String** | Custom working start time in HH:mm format; required when work_status is 2 and must not be later than end_time |  [optional]
**endTime** | **String** | Custom working end time in HH:mm format; required when work_status is 2 and must not be earlier than start_time |  [optional]

## Enum: WorkStatusEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2

## Enum: CycleTypeEnum

Name | Value
---- | -----
WEEKLY | &quot;Weekly&quot;
DAILY | &quot;Daily&quot;

