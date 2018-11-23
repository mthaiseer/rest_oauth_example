package com.oauth.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/user/{name}")
	public String hello(@PathVariable("name")String name) {
		return "Regular user "+ name;
	}

}
