package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

	private Environment environment;

	@Autowired
	public CouponController(Environment environment) {
		this.environment = environment;
	}

	@GetMapping
	public ResponseEntity<String> couponHome() {
		return ResponseEntity
				.ok("coupon service is up and running on port: " + environment.getProperty("local.server.port"));
	}

}
