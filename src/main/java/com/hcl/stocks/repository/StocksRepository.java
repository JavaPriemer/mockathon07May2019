package com.hcl.stocks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.stocks.entities.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Integer> {

	@Query("select s from Stocks s where s.stockName = ?1")
	List<Stocks> findByStockName(String stockName);

}