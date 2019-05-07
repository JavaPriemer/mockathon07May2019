package com.hcl.stocks.service;

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
import com.hcl.stocks.service.impl.StocksServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class StocksServiceTest {

	@InjectMocks
	private StocksServiceImpl stocksServiceImpl;

	@Mock
	private StocksRepository stocksRepository;

	@Test
	public void viewStockDetails() {
		List<Stocks> listStock = new ArrayList<>();
		Stocks stockOne = new Stocks(1, "HINDUNILVR", 3000.00, 29000.00);
		Stocks stockTwo = new Stocks(1, "HINDALCO", 34550.00, 29050.00);
		listStock.add(stockOne);
		listStock.add(stockTwo);
		Mockito.when(stocksRepository.findByStockName("HINDUNILVR")).thenReturn(listStock);
		Assert.assertEquals(listStock, stocksServiceImpl.viewStockDetails("HINDUNILVR"));
	}
	@Test
	public void viewStockDetailSWrongName() {
		List<Stocks> listStock = new ArrayList<>();
		Stocks stockOne = new Stocks(1, "HINDUNILVR", 3000.00, 29000.00);
		Stocks stockTwo = new Stocks(1, "HINDALCO", 34550.00, 29050.00);
		listStock.add(stockOne);
		listStock.add(stockTwo);
		Mockito.when(stocksRepository.findByStockName("WIPRO")).thenReturn(listStock);
		Assert.assertEquals(listStock, stocksServiceImpl.viewStockDetails("WIPRO"));
	}

}
