
# FuturesOrderAmendment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**size** | **String** | New order size, including filled part.  - If new size is less than or equal to filled size, the order will be cancelled. - Order side must be identical to the original one. - Close order size cannot be changed. - For reduce only orders, increasing size may leads to other reduce only orders being cancelled. - If price is not changed, decreasing size will not change its precedence in order book, while increasing will move it to the last at current price. |  [optional]
**price** | **String** | New order price |  [optional]
**amendText** | **String** | Custom info during order amendment |  [optional]
**text** | **String** | Internal users can modify information in the text field. |  [optional]
**actionMode** | **String** | Processing Mode  When placing an order, different fields are returned based on the action_mode  - &#x60;ACK&#x60;: Asynchronous mode, returns only key order fields - &#x60;RESULT&#x60;: No clearing information - &#x60;FULL&#x60;: Full mode (default) |  [optional]

