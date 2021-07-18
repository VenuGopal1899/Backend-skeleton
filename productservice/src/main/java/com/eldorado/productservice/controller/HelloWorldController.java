package com.eldorado.productservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloWorldController {
	@GetMapping("/helloworld")
    String helloWorld() {
		return "Hello World -> Product Microservice";
	}
}
