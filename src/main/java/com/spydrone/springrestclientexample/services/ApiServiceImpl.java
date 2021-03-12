package com.spydrone.springrestclientexample.services;

import com.spydrone.springrestclientexample.api.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

	private final RestTemplate restTemplate;
	private final String apiUri;

	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.uri}") String apiUri) {
		this.restTemplate = restTemplate;
		this.apiUri = apiUri;
	}

	@Override
	public List<User> getUsers() {
		ResponseEntity<User[]> response = restTemplate.getForEntity(apiUri, User[].class);
		return Arrays.asList(response.getBody());
	}
}
