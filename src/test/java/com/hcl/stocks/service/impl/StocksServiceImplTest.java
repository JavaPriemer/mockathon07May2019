package com.hcl.stocks.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.repository.StocksRepository;

@RunWith(MockitoJUnitRunner.class)
public class StocksServiceImplTest {

	@InjectMocks
	private StocksServiceImpl stocksServiceImpl;

	@Mock
	private StocksRepository stocksRepository;

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

	@Test
	public void getRecommendedStockListTest() {
		List<Stocks> listOfStocks = new ArrayList<>();
		Stocks stock1 = new Stocks(1, "HINDUNILVR", 1702.2, 1706.2, 500);
		Stocks stock2 = new Stocks(2, "HINDALCO", 203.8, 202.2, 200);
		Stocks stock3 = new Stocks(3, "TITAN", 1100.43, 1099.1, 350);
		Stocks stock4 = new Stocks(4, "LT", 1350.67, 1371.5, 100);
		Stocks stock5 = new Stocks(5, "TATAMOTORS", 196.34, 194.1, 550);
		
		listOfStocks.add(stock1);
		listOfStocks.add(stock2);
		listOfStocks.add(stock3);
		listOfStocks.add(stock4);
		listOfStocks.add(stock5);
		
		Mockito.when(stocksRepository.findAll()).thenReturn(listOfStocks);
		Mockito.when(stocksRepository.findAll().size()).thenReturn(5);
		Assert.assertEquals(listOfStocks, stocksRepository.findAll());
	}

}