package com.hcl.stocks.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stock.utils.StockUtils;
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
			Stocks stock = stocksRepository.findById(stockid).get();
			Order order = new Order();
			order.setQuantity(quantity);
			order.setAmount(StockUtils.calculateComission(quantity, stock.getStockPrice()));
			order.setOrderStatus("ordered");
			order.setStockId(stock.getStockId());
			order.setUserId(userid);
			ordersRepository.save(order);
			return "Order with following details " + order.toString() + " has been saved successfully";
		} catch (Exception e) {
			return "Something went wrong";
		}
	}

	public String confirmOrder(Order pOrder, Integer stockId, Double price) {
		String status = "Order Status In progress";
		Optional<Stocks> stockOptional = stocksRepository.findById(stockId);
		Stocks stock = stockOptional.get();
		if (price != null && stock != null && stock.getStockPrice().equals(price)) {
			pOrder.setAmount(StockUtils.calculateComission(pOrder.getQuantity(), pOrder.getAmount()));
			pOrder.setOrderStatus("Confirmed");
			ordersRepository.save(pOrder);
			status = "Order Placed Successfully";
		}
		else
		{
			status = "Either stock  not available or change in Stock price";
		}

		return status;
	}

}