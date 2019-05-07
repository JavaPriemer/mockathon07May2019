package com.hcl.stocks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.stocks.entities.Order;
import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.service.OrdersService;
import com.hcl.stocks.service.StocksService;
import com.hcl.stocks.service.UserService;

@RestController
@RequestMapping("/stocks")
public class StocksController {
	@Autowired
	OrdersService orderService;
	@Autowired
	OrdersService ordersService;
	@Autowired
	StocksService stocksService;
	
	@PostMapping("/orderstock")
	public String orderingStock(@RequestParam("stockid") Integer stockid, @RequestParam("userid") Integer userid,
			@RequestParam("quantity") Integer quantity) {
		String msg = ordersService.orderingStock(stockid, userid, quantity);
		return msg;
	}
	
	@GetMapping("/getStock/{stockName}")
	public List<Stocks> getStock(@PathVariable String stockName) {
	return stocksService.viewStockDetails(stockName);
	}
	
	@Autowired
	UserService userService;

	@PostMapping("/confirmOrder")
	public ResponseEntity<String> confirmOrder(@RequestBody Order pOrder, @RequestParam("orderId") Integer orderId,
			@RequestParam("price") Double price) {
		String msg = orderService.confirmOrder(pOrder, orderId, price);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/userLogin")
	public ResponseEntity<String> getUser(@RequestParam("userId") Integer userId) {
		String userLoggedIn = userService.getUser(userId);
		return new ResponseEntity<String>(userLoggedIn, HttpStatus.OK);
	}

	@GetMapping("/listRecommendedStocks")
	public ResponseEntity<List<Stocks>> getRecommendedStocks(@RequestParam("userId") Integer userId) {
		List<Stocks> recommendedList = stocksService.getRecommendedList();
		return new ResponseEntity<List<Stocks>>(recommendedList, HttpStatus.OK);
	}
	
	@GetMapping("/stockdetails")
	public com.hcl.stocks.entities.Stocks stockdetails(@RequestParam("stockId") Integer stockId ) {
	  return stocksService.getQuote(stockId);
	}

}