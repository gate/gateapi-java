
# Key

Main Account API Key Information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | **Integer** | API Key Status: 1 - Normal, 2 - Locked, 3 - Frozen (can only be modified; default is 1 upon creation) |  [optional]
**mode** | **Integer** | User Mode: 1 - Classic, 2 - Legacy Unified (can only be specified during creation, non-modifiable afterwards) |  [optional]
**name** | **List&lt;String&gt;** | API Key Remark |  [optional]
**currencyPairs** | **List&lt;String&gt;** | Trading Pair Whitelist, Maximum 30 Pairs |  [optional]
**userId** | **Long** | User ID |  [optional]
**ipWhitelist** | **List&lt;String&gt;** | IP Whitelist |  [optional]
**perms** | [**List&lt;KeyPerms&gt;**](KeyPerms.md) |  |  [optional]
**key** | [**AccountDetailKey**](AccountDetailKey.md) |  |  [optional]
**createdAt** | **String** | Created time |  [optional] [readonly]
**updatedAt** | **String** | Last Update Time |  [optional] [readonly]
**lastAccess** | **String** | Last Access Time |  [optional] [readonly]

