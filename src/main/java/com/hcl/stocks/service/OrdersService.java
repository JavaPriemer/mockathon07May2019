package com.hcl.stocks.service;

import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Order;

@Service
public interface OrdersService {
	public String confirmOrder(Order pOrder, Integer orderId, Double price);

}