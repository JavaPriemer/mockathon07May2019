package com.hcl.stocks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Order;
import com.hcl.stocks.entities.TradeHistory;
import com.hcl.stocks.repository.TradeHistoryRepository;
import com.hcl.stocks.service.TradeHistoryService;

@Service
public class TradeHistoryServiceImpl implements TradeHistoryService {

	@Autowired
	TradeHistoryRepository tradeRepository; 
	@Override
	public TradeHistory confirmOrder(TradeHistory tradeHistory) {
		TradeHistory history = tradeRepository.save(tradeHistory);
		return history;
	}

}