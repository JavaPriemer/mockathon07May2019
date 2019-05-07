package com.hcl.stocks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.stocks.entities.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Integer> {

	List<String> findAllStockName();
	
}