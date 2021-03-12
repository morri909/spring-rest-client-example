package com.spydrone.springrestclientexample.services;

import com.spydrone.springrestclientexample.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

	private final RestTemplate restTemplate;

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers() {
		ResponseEntity<User[]> response = restTemplate.getForEntity("https://api.mocki.io/v1/b043df5a", User[].class);
		return Arrays.asList(response.getBody());
	}
}
