package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coupon_table")
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "coupon_id")
	private int couponId;
	@Column(name = "coupon_code",unique = true)
	private String couponCode;
	@Column(name = "date_of_expiration")
	private String expireDate;
	@Column(name = "discount")
	private Double discount;
	public Coupon() {
		
	}
	public Coupon(int couponId, String couponCode, String expireDate, Double discount) {
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
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	

}
