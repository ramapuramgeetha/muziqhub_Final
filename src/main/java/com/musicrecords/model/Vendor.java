package com.musicrecords.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendor {

@Id
private String vendorId;
private String vendName;
private String vendAdd;
private String vendPh;
private String vendEmail;
private String vendStatus;

@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private Set<Product> product;



public String getVendorId() {
	return vendorId;
}

public void setVendorId(String vendorId) {
	this.vendorId = vendorId;
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

public String getVendStatus() {
	return vendStatus;
}

public void setVendStatus(String vendStatus) {
	this.vendStatus = vendStatus;
}

public Set<Product> getProduct() {
	return product;
}

public void setProduct(Set<Product> product) {
	this.product = product;
}



	

}
