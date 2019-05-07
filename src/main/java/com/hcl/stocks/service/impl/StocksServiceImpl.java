package com.hcl.stocks.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.repository.StocksRepository;
import com.hcl.stocks.service.StocksService;

@Service
public class StocksServiceImpl implements StocksService {
	@Autowired
	private StocksRepository stocksRepository;

	@Override
	public List<Stocks> viewStockDetails(String stockName) {
		return stocksRepository.findByStockName(stockName);
	}

}