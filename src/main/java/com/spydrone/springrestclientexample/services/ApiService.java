package com.spydrone.springrestclientexample.services;

import com.spydrone.springrestclientexample.api.domain.User;

import java.util.List;

public interface ApiService {
	List<User> getUsers();
}
