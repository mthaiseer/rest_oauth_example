package com.oauth.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "Home page";
	}

}
