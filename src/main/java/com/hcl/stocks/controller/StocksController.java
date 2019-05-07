package com.hcl.stocks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.stocks.service.OrdersService;

@RestController
public class StocksController {
	
	@Autowired
	OrdersService ordersService;
	
	@PostMapping("/orderstock")
	public String orderingStock(@RequestParam("stockid") Integer stockid, @RequestParam("userid")Integer userid,@RequestParam("quantity")Integer quantity) {
		String msg = ordersService.orderingStock(stockid,userid,quantity);
	  return msg;		
	}

}