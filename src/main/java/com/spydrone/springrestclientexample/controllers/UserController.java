package com.spydrone.springrestclientexample.controllers;

import com.spydrone.springrestclientexample.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	private final ApiService apiService;

	public UserController(ApiService apiService) {
		this.apiService = apiService;
	}

	@GetMapping({"", "/", "/index"})
	public String index() {
		return "index";
	}

	@GetMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", apiService.getUsers());
		return "userlist";
	}
}
