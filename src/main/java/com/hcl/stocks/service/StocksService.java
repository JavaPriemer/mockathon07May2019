package com.hcl.stocks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Stocks;

@Service
public interface StocksService {

	List<Stocks> getRecommendedList();

	List<Stocks> viewStockDetails(String stockName);

	Stocks getQuote(Integer stockId);
}