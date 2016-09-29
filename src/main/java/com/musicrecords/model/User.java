package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
@GeneratedValue
private int id;

@Id
private String usrId;
private String usrName;

@OneToMany (mappedBy ="id") 
private Address usrBillAdd;

@OneToMany (mappedBy ="id") 
private Address usrShipAdd;

private String usrPhone;
private String usremail;

@OneToMany (mappedBy ="crCdNo") 
private String usrCreditCard;

private String usrStatus;

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

public String getUsrName() {
	return usrName;
}

public void setUsrName(String usrName) {
	this.usrName = usrName;
}

public Address getUsrBillAdd() {
	return usrBillAdd;
}

public void setUsrBillAdd(Address usrBillAdd) {
	this.usrBillAdd = usrBillAdd;
}

public Address getUsrShipAdd() {
	return usrShipAdd;
}

public void setUsrShipAdd(Address usrShipAdd) {
	this.usrShipAdd = usrShipAdd;
}

public String getUsrPhone() {
	return usrPhone;
}

public void setUsrPhone(String usrPhone) {
	this.usrPhone = usrPhone;
}

public String getUsremail() {
	return usremail;
}

public void setUsremail(String usremail) {
	this.usremail = usremail;
}

public String getUsrCreditCard() {
	return usrCreditCard;
}

public void setUsrCreditCard(String usrCreditCard) {
	this.usrCreditCard = usrCreditCard;
}

public String getUsrStatus() {
	return usrStatus;
}

public void setUsrStatus(String usrStatus) {
	this.usrStatus = usrStatus;
}



}
