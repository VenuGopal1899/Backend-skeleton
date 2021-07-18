package com.eldorado.searchservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloWorldController {
	@GetMapping("/helloworld")
    String helloWorld() {
		return "Hello World -> Search Microservice";
	}
}
