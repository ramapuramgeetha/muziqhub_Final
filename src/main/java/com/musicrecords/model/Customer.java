package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
@GeneratedValue
private int id;

@Id
private String usrId;
private String usrName;
private String usrAddressId;
private String usrPhone;
private String usremail;
private String usrCreditCard;
private String usrStatus;

public String getUsrStatus() {
	return usrStatus;
}
public void setUsrStatus(String usrStatus) {
	this.usrStatus = usrStatus;
}
public Customer() {
		// TODO Auto-generated constructor stub
	}
public String getUsrId() {
	return usrId;
}
public void setUsrId(int id) {
	this.usrId = "USR" +Integer.toString(id);
}
public String getUsrName() {
	return usrName;
}
public void setUsrName(String usrName) {
	this.usrName = usrName;
}
public String getUsrAddressId() {
	return usrAddressId;
}
public void setUsrAddressId(String usrAddressId) {
	this.usrAddressId = usrAddressId;
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

}
