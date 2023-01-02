package com.devops.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to rest api...it's working";
	}
}
