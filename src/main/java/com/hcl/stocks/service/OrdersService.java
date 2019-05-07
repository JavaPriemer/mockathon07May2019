package com.hcl.stocks.service;

import org.springframework.stereotype.Service;

import com.hcl.stocks.dto.Stocks;

@Service
public interface OrdersService {

	String orderingStock(Integer stockid, Integer userid, Integer quantity);

}