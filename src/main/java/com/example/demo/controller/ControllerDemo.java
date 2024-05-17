package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to Spring Security";
	}

}
