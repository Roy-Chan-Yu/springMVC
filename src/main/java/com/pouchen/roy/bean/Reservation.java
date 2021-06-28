package com.pouchen.roy.bean;

public class Reservation {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String[] checkItems;
	private String cityTo;
	
	public String getCityTo() {
		return cityTo;
	}
	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}
	public String[] getCheckItems() {
		return checkItems;
	}
	public void setCheckItems(String[] checkItems) {
		this.checkItems = checkItems;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
