package com.example;

public class Location {
	
	private int locationId;
	private String cityName;
	private Country country;
	public Location() {
		super();
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", cityName=" + cityName + ", country=" + country + "]";
	}

}
