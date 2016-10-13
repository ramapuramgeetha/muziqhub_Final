package com.musicrecords.model;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;


@Entity
public class User {


@Id
private String usrId;
private String usrName;
private String usrBillAdd;
private String usrShipAdd;
private String usrPhone;
private String usrEmail;

public String getUsrEmail() {
	return usrEmail;
}

public void setUsrEmail(String usrEmail) {
	this.usrEmail = usrEmail;
}

@OneToMany (cascade=CascadeType.ALL)
@JoinColumn (name="crCdNo")
private Set<CreditCard> usrCreditCard ;

private String usrStatus;


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



public String getUsrBillAdd() {
	return usrBillAdd;
}

public void setUsrBillAdd(String usrBillAdd) {
	this.usrBillAdd = usrBillAdd;
}

public String getUsrShipAdd() {
	return usrShipAdd;
}

public void setUsrShipAdd(String usrShipAdd) {
	this.usrShipAdd = usrShipAdd;
}

public String getUsrPhone() {
	return usrPhone;
}

public void setUsrPhone(String usrPhone) {
	this.usrPhone = usrPhone;
}

public String getUsremail() {
	return usrEmail;
}

public void setUsremail(String usremail) {
	this.usrEmail = usremail;
}



public Set<CreditCard> getUsrCreditCard() {
	return usrCreditCard;
}

public void setUsrCreditCard(Set<CreditCard> usrCreditCard) {
	this.usrCreditCard = usrCreditCard;
}

public String getUsrStatus() {
	return usrStatus;
}

public void setUsrStatus(String usrStatus) {
	this.usrStatus = usrStatus;
}



}

