package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id @GeneratedValue
	private int id;
	private String usrId;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private long Pin;
	private String addType;
	private String addStatus;
	

	public Address() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsrId() {
		return usrId;
	}


	public void setUsrId(String usrId) {
		this.usrId = usrId;
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


	public String getAddType() {
		return addType;
	}


	public void setAddType(String addType) {
		this.addType = addType;
	}


	public String getAddStatus() {
		return addStatus;
	}


	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}

}
