package com.hcl.stocks.service;

import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.TradeHistory;

@Service
public interface TradeHistoryService {
	public TradeHistory confirmOrder(TradeHistory trade);
}