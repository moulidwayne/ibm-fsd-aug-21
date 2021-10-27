package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coupon;
import com.example.demo.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponController {

	private Environment environment;
	private CouponService couponService;

	@Autowired
	public CouponController(Environment environment, CouponService couponService) {
		super();
		this.environment = environment;
		this.couponService = couponService;
	}

	@GetMapping("/")
	public ResponseEntity<String> couponHome() {
		return ResponseEntity
				.ok("coupon service is up and running on port: " + environment.getProperty("local.server.port"));
	}

	@PostMapping("/")
	public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon) {
		return ResponseEntity.status(HttpStatus.CREATED).body(couponService.createCoupon(coupon));
	}

	@GetMapping("/{couponCode}")
	public Coupon fetchCouponByCouponCode(@PathVariable("couponCode") String couponCode) {
		return couponService.getCouponByCode(couponCode);
	}

}
