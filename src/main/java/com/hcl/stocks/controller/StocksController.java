package com.hcl.stocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.service.StocksService;

@RestController
@RequestMapping("/stocks")
public class StocksController {
	
	@Autowired
	private StocksService stocksService;

	@GetMapping("/getStock/{stockName}")
	public List<Stocks> getStock(@PathVariable String stockName) {
		 return stocksService.viewStockDetails(stockName);

	}

}