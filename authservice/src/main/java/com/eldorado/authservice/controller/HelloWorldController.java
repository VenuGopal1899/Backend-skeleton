package com.eldorado.authservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloWorldController {
	@GetMapping("/helloworld")
    String helloWorld() {
		return "Hello World -> Auth Microservice";
	}
}
