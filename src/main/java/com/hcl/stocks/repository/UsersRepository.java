package com.hcl.stocks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.stocks.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

}