package com.hcl.stocks.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "stock_id")
	private Integer stockId;

	@Column(name = "order_status")
	private String orderStatus;

	private Integer quantity;
	private Double amount;
	
	public Order() {
	}

	public Order(Integer orderId, Integer userId, Integer stockId, String orderStatus, Integer quantity,
			Double amount) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.stockId = stockId;
		this.orderStatus = orderStatus;
		this.quantity = quantity;
		this.amount = amount;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", stockId=" + stockId + ", orderStatus="
				+ orderStatus + ", quantity=" + quantity + ", amount=" + amount + "]";
	}

}