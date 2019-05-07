package com.hcl.stocks.service.impl;

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
	OrdersRepository orderRepository;

	@Autowired
	StocksRepository stocksRepository;

	@Override
	public String confirmOrder(Order pOrder, Integer stockId, Double price) {
		String status = "Order Status In progress";
		Optional<Stocks> stockOptional = stocksRepository.findById(stockId);
		Stocks stock = stockOptional.get();
		if (price != null && stock != null && stock.getStockPrice().equals(price)) {
			pOrder.setAmount(StockUtils.calculateComission(pOrder.getQuantity(), pOrder.getAmount()));
			orderRepository.save(pOrder);
			status = "Order Placed Successfully";
		}
		else
		{
			status = "Either stock  not available or change in Stock price";
		}

		return status;
	}

}