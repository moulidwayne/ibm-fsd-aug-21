package com.model;

public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String country;
	private String city;
	private String mobileNumber;
	public Address() {
		super();
	}
	public Address(String addressLine1, String addressLine2, String country, String city) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.city = city;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", country=" + country
				+ ", city=" + city;
	}
	
	

}
