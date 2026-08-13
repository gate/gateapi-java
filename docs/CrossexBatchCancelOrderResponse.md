
# CrossexBatchCancelOrderResponse

Batch order cancellation request results

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | Order ID | 
**text** | **String** | Custom ID specified by the user when creating the order | 
**accepted** | **String** | Whether the request was accepted, as the string true or false | 
**label** | **String** | Error label when the request is not accepted; empty on success | 
**message** | **String** | Error message when the request is not accepted; empty on success | 

