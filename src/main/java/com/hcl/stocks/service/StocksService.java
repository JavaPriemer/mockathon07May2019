package com.hcl.stocks.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StocksService {

	List<String> getRecommendedList();
	
}