package com.hcl.stocks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.stocks.repository.UsersRepository;
import com.hcl.stocks.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UsersRepository userRepository;

	@Override
	public String getUser(Integer userid) {
		if (userRepository.existsById(userid)) {
			return "User is successfully logged in!";
		}
		return "User does not exist";
	}

}