package com.musicrecords.model;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Address {
	@Id 
	private String Addid;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private long Pin;
	private String addStatus;
	

    private String user;

	public Address() {
		// TODO Auto-generated constructor stub
	}



	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}

	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getPin() {
		return Pin;
	}

	public void setPin(long pin) {
		Pin = pin;
	}


	public String getAddid() {
		return Addid;
	}



	public void setAddid(String addid) {
		Addid = addid;
	}



	public String getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	

}
