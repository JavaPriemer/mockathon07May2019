package com.hcl.stocks.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TradeHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "stock_name")
	private String stockName;

	@Column(name = "stock_price")
	private Double stockPrice;

	private Integer quantity;

	@Column(name = "total_price")
	private Double totalPrice;

	private Double fees;

	@Column(name = "total_included_fees")
	private Double totalIncludedFees;

	@Column(name = "time_of_trade")
	private Date timeOfTrade;

	public TradeHistory() {
	}

	public TradeHistory(Integer id, Integer userId, String stockName, Double stockPrice, Integer quantity,
			Double totalPrice, Double fees, Double totalIncludedFees, Date timeOfTrade) {
		super();
		this.id = id;
		this.userId = userId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.fees = fees;
		this.totalIncludedFees = totalIncludedFees;
		this.timeOfTrade = timeOfTrade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Double getTotalIncludedFees() {
		return totalIncludedFees;
	}

	public void setTotalIncludedFees(Double totalIncludedFees) {
		this.totalIncludedFees = totalIncludedFees;
	}

	public Date getTimeOfTrade() {
		return timeOfTrade;
	}

	public void setTimeOfTrade(Date timeOfTrade) {
		this.timeOfTrade = timeOfTrade;
	}

	@Override
	public String toString() {
		return "TradeHistory [id=" + id + ", userId=" + userId + ", stockName=" + stockName + ", stockPrice="
				+ stockPrice + ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", fees=" + fees
				+ ", totalIncludedFees=" + totalIncludedFees + ", timeOfTrade=" + timeOfTrade + "]";
	}

}