
# PositionHistoryListDataList

Position close history

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**positionId** | **Long** | Position ID | 
**symbol** | **String** | Market / Trading symbol | 
**realizedPnl** | **String** | Realized PnL | 
**realizedPnlRate** | **String** | Realized return rate |  [optional]
**volume** | **String** | Position size / Maximum position size | 
**volumeClosed** | **String** | Close volume | 
**priceOpen** | **String** | Average Opening Price | 
**positionDir** | [**PositionDirEnum**](#PositionDirEnum) | Position Direction - Long: Long Position - Short: Short Position | 
**priceTp** | **String** | Take profit price |  [optional]
**priceSl** | **String** | Stop loss price |  [optional]
**counterpartyPrice** | **String** | Counterparty price |  [optional]
**closePrice** | **String** | Close price | 
**timeCreate** | **String** | Open time (timestamp in seconds) | 
**timeClose** | **String** | Close time (timestamp in seconds) | 
**positionStatus** | **String** | Position Status - 1: Fully Closed - 2: Forced Liquidation | 
**closeDetail** | [**PositionHistoryListDataCloseDetail**](PositionHistoryListDataCloseDetail.md) |  |  [optional]
**realizedPnlDetail** | [**PositionHistoryListDataRealizedPnlDetail**](PositionHistoryListDataRealizedPnlDetail.md) |  | 

## Enum: PositionDirEnum

Name | Value
---- | -----
LONG | &quot;Long&quot;
SHORT | &quot;Short&quot;

