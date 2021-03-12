package com.spydrone.springrestclientexample.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest {

	@Autowired
	ApplicationContext applicationContext;
	WebTestClient webTestClient;

	@BeforeEach
	void setUp() {
		webTestClient = WebTestClient.bindToApplicationContext(applicationContext).build();
	}

	@Test
	void index() {
		webTestClient.get().uri("/")
				.exchange()
				.expectStatus().isOk();
	}

	@Test
	void users() {
		webTestClient.get().uri("/users")
				.exchange()
				.expectStatus().isOk();
	}
}