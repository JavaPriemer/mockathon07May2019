package com.hcl.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.stocks.entities.Order;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {

}