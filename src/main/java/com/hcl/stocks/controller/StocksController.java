package com.hcl.stocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.stocks.entities.Order;
import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.service.StocksService;
import com.hcl.stocks.service.UserService;

@RestController
@RequestMapping("/stocks")
public class StocksController {

	@Autowired
	UserService userService;
	@Autowired
	StocksService stocksService;
	
	@PostMapping("/confirmOrder")
	public ResponseEntity<String> confirmOrder(Order pOrder, @RequestParam("stockId") Integer stockId,
			@RequestParam("price") Double price) {
		return null;
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<String> getUser(@RequestParam("userId") Integer userId) {
		String userLoggedIn = userService.getUser(userId);
		return new ResponseEntity<String>(userLoggedIn, HttpStatus.OK);
	}
	
	@GetMapping("/getRecommendedStocks")
	public ResponseEntity<List<Stocks>> getRecommendedStocks(@RequestParam("userId") Integer userId) {
		List<Stocks> recommendedList = stocksService.getRecommendedList();
		return new ResponseEntity<List<Stocks>>(recommendedList, HttpStatus.OK);
	}

}