package com.example;

public enum Country {
	USA("Country Is USA"),
	INDIA("Country Is India"),
	PAKISTAN("Country Is Pakistan");

	private String countryName;
	Country(String countryName) {
		this.countryName=countryName;
	}
	public String getCountryName() {
		return countryName;
	}
	
	

}
