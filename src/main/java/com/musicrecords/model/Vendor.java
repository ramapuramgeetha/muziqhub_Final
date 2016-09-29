package com.musicrecords.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

@OneToMany(mappedBy = "vendorID", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
private List<Product> product;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

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

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

	

}
