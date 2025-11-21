
# SpotPriceTrigger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | **String** | Trigger price | 
**rule** | [**RuleEnum**](#RuleEnum) | 价格条件类型 - 大于等于: 表示市场价格大于等于 price 时触发 - 小于等于: 表示市场价格小于等于 price 时触发 | 
**expiration** | **Integer** | Maximum wait time for trigger condition (in seconds). Order will be cancelled if timeout | 

## Enum: RuleEnum

Name | Value
---- | -----
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;

