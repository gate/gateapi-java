
# AnnouncementArticleListRequest

Announcement article list query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**titleQuery** | **String** | Article title to use when querying announcements. |  [optional]
**page** | **String** | Page number. Optional. Pass as a string, for example \&quot;1\&quot;. |  [optional]
**size** | **String** | Number of articles to return per page. Optional. Pass as a string, for example \&quot;5\&quot;. |  [optional]
**tags** | **String** | Article tags |  [optional]
**timer** | **String** | Query announcements from the last N days, with N passed as a string. For example, on the 10th, pass \&quot;10\&quot; to query announcements from the 1st through the 10th. |  [optional]
**cateName** | **String** | Announcement category name. |  [optional]
**cateLevel** | **String** | Category level, passed as a string: \&quot;1\&quot; or \&quot;2\&quot;. |  [optional]
**subWebsiteId** | **String** | Subsite ID, passed as a string: \&quot;0\&quot; for the main site or \&quot;177\&quot; for the Turkey site. Defaults to \&quot;0\&quot;. |  [optional]
**pinned** | **Integer** | Whether to include pinned articles: 1 to include them or 0 to exclude them. Defaults to 1. |  [optional]
**updateAfter** | **Integer** | Query announcement articles updated after this timestamp. |  [optional]
**lang** | **String** | Language code, for example \&quot;cn\&quot;. |  [optional]
**filterEmptyContent** | **Integer** | Whether to exclude articles with empty content in the current language: 0 to keep them or 1 to exclude them. Defaults to 1. |  [optional]

