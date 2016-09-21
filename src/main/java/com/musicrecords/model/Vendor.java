package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vendor {

@GeneratedValue	
private int id; 
@Id
private String vendorId;
private String vendName;
private String vendAdd;
private String vendPh;
private String vendEmail;
private String vendStatus;

	public String getVendStatus() {
	return vendStatus;
}

public void setVendStatus(String vendStatus) {
	this.vendStatus = vendStatus;
}

	public String getVendorId() {
	return vendorId;
}

public void setVendorId(int id) {
	this.vendorId = "VEN"+Integer.toString(id);
}

public String getVendName() {
	return vendName;
}

public void setVendName(String vendName) {
	this.vendName = vendName;
}

public String getVendAdd() {
	return vendAdd;
}

public void setVendAdd(String vendAdd) {
	this.vendAdd = vendAdd;
}

public String getVendPh() {
	return vendPh;
}

public void setVendPh(String vendPh) {
	this.vendPh = vendPh;
}

public String getVendEmail() {
	return vendEmail;
}

public void setVendEmail(String vendEmail) {
	this.vendEmail = vendEmail;
}

	public Vendor() {
		// TODO Auto-generated constructor stub
	}

}
