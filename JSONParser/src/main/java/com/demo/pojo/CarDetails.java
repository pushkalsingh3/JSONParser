package com.demo.pojo;

public class CarDetails {
	private String carID;
	private String carName;
	private PersonalDetails personalDetails;
	
	public CarDetails(String carID, String carName, PersonalDetails personalDetails) {
		this.carID=carID;
		this.carName=carName;
		this.personalDetails=personalDetails;
	}
	
	public String getCarID() {
		return carID;
	}
	public void setCarID(String carID) {
		this.carID = carID;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
	
}
