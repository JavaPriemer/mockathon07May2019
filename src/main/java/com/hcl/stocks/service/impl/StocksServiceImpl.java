package com.hcl.stocks.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.repository.StocksRepository;
import com.hcl.stocks.service.StocksService;

@Service
public class StocksServiceImpl implements StocksService {

	@Autowired
	StocksRepository stocksRepository;
	
	@Override
	public List<String> getRecommendedList() {
		List<String> listOfStocks = stocksRepository.findAllStockName();
		List<String> firstNElementsList = null;
		if (listOfStocks.size() < 5) {
			firstNElementsList = listOfStocks;
		} else {
			firstNElementsList = listOfStocks.stream().limit(5).collect(Collectors.toList());
		}
		return firstNElementsList;
	}
	
}