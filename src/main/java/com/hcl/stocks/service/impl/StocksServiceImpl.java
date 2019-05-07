package com.hcl.stocks.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.repository.StocksRepository;
import com.hcl.stocks.service.StocksService;

@Service
public class StocksServiceImpl implements StocksService {

	@Autowired
	StocksRepository stocksRepository;

	@Override
	public List<Stocks> getRecommendedList() {
		List<Stocks> listOfStocks = stocksRepository.findAll();
		List<Stocks> firstNElementsList = new ArrayList<>();

		if (listOfStocks != null && listOfStocks.size() > 5) {
			for (int i = 0; i < 5; i++) {
				firstNElementsList.add(listOfStocks.get(i));
			}
		} else
			firstNElementsList = listOfStocks;
		return firstNElementsList;
	}

}