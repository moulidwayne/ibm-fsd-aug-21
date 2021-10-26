package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	private Environment environment;
	
	@Autowired
	public ProductController(Environment environment) {
		this.environment = environment;
	}

	@GetMapping("/")
	public ResponseEntity<String> productHome()
	{
		return ResponseEntity.ok("product service is up and running on port: "+environment.getProperty("local.server.port"));
	}

}
