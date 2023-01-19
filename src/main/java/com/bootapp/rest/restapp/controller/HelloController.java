package com.bootapp.rest.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/helloapi")
	public String HelloApi() {
		return "Hello World";
	}
	
	@GetMapping("/api/helloapi2")
	public String HelloApi2() {
		return "Hello World2";
	}
}
