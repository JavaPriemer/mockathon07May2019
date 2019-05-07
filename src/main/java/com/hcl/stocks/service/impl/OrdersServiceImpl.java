package com.hcl.stocks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.entities.Order;
import com.hcl.stocks.entities.Stocks;
import com.hcl.stocks.repository.OrdersRepository;
import com.hcl.stocks.repository.StocksRepository;
import com.hcl.stocks.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	OrdersRepository ordersRepository;

	@Autowired
	StocksRepository stocksRepository;

	@Override
	public String orderingStock(Integer stockid, Integer userid, Integer quantity) {
            
		try {
             Stocks stock =  stocksRepository.findById(stockid).get();
             Order order = new Order();
             order.setQuantity(quantity);
             order.setAmount(stock.getStockPrice());
             order.setOrderStatus("ordered");
             order.setStockId(stock.getStockId());
             order.setUserId(userid);
             ordersRepository.save(order);
		    return "Order with following details "+order.toString()+ " has been saved successfully";
	}
		catch(Exception e){
			return "Something went wrong";
		}
	}	

}