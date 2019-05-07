package com.hcl.stocks.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stocks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stock_id")
	private Integer stockId;

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "stock_price")
	private Double stockPrice;

	@Column(name = "stock_current_price")
	private Double stockCurrentPrice;

	@Column(name = "available_quantity")
	private Integer availableQuantity;

	public Stocks() {
		super();
	}

	public Stocks(Integer stockId, String stockName, Double stockPrice, Double stockCurrentPrice,
			Integer availableQuantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.stockCurrentPrice = stockCurrentPrice;
		this.availableQuantity = availableQuantity;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
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

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		return "Stocks [stockId=" + stockId + ", stockName=" + stockName + ", stockPrice=" + stockPrice
				+ ", stockCurrentPrice=" + stockCurrentPrice + ", availableQuantity=" + availableQuantity + "]";
	}

}