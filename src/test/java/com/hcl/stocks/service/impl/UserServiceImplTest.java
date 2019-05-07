package com.hcl.stocks.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.stocks.repository.UsersRepository;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@Mock
	UsersRepository usersRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	@Test
	public void getUserTest() {
		Mockito.when(usersRepository.existsById(1)).thenReturn(Boolean.TRUE);
		Assert.assertEquals("User is successfully logged in!", userServiceImpl.getUser(1));
	}
	
}