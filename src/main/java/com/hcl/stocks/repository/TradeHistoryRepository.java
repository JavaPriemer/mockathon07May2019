package com.hcl.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.stocks.entities.TradeHistory;

@Repository
public interface TradeHistoryRepository extends JpaRepository<TradeHistory, Integer> {

}