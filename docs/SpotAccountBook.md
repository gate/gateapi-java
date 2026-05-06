
# SpotAccountBook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Balance change record ID |  [optional]
**time** | **Long** | The timestamp of the change (in milliseconds) |  [optional]
**currency** | **String** | Currency changed |  [optional]
**change** | **String** | Amount changed. Positive value means transferring in, while negative out |  [optional]
**balance** | **String** | Balance after change |  [optional]
**type** | **String** | Account change type; deprecated (see &#x60;code&#x60; for account change type encoding) |  [optional]
**code** | **String** | Account change code, see [Asset Record Code] (Asset Record Code) |  [optional]
**text** | **String** | Additional information |  [optional]

