package com.spydrone.springrestclientexample.services;

import com.spydrone.springrestclientexample.api.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceImplTest {

	@Autowired
	private ApiServiceImpl sut;

	@Test
	void getUsers() {
		List<User> users = sut.getUsers();
		System.out.println(users);
		Assertions.assertNotNull(users);
		Assertions.assertEquals(4, users.size());
	}
}