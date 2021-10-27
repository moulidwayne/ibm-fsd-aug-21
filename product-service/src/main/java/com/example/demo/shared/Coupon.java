package com.example.demo.shared;

import java.math.BigDecimal;

public class Coupon {
	private int couponId;
	private String couponCode;
	private String expireDate;
	private BigDecimal discount;
	public Coupon() {
		super();
	}
	public Coupon(int couponId, String couponCode, String expireDate, BigDecimal discount) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.expireDate = expireDate;
		this.discount = discount;
	}
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	
}
