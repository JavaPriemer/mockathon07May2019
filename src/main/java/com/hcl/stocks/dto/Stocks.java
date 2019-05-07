package com.hcl.stocks.dto;

public class Stocks {

    private Integer stockId;
	private Integer stockName;
	private Double stockPrice;
	private Double stockCurrentPrice;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public Integer getStockName() {
		return stockName;
	}
	public void setStockName(Integer stockName) {
		this.stockName = stockName;
	}
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Double getStockCurrentPrice() {
		return stockCurrentPrice;
	}
	public void setStockCurrentPrice(Double stockCurrentPrice) {
		this.stockCurrentPrice = stockCurrentPrice;
	}
	
	
}