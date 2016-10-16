package com.musicrecords.model;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class UserData {
private String UId;
private String password;
private String cfrmPass;
private String name;
private String email;
private String Baddress1;
private String Baddress2;
private String Saddress1;
private String Saddress2;
private String city;
private String state;
private int pin;
private String country;
private long phone;
/*
private long CrCardNo;
private int  crCdExpMonth;
private int  crCdExpYear;
private String  crCdUserName;
*/
private boolean BillandShip;
private boolean TandC;
public String getUId() {
	return UId;
}
public void setUId(String uId) {
	UId = uId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCfrmPass() {
	return cfrmPass;
}
public void setCfrmPass(String cfrmPass) {
	this.cfrmPass = cfrmPass;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getBaddress1() {
	return Baddress1;
}
public void setBaddress1(String baddress1) {
	Baddress1 = baddress1;
}
public String getBaddress2() {
	return Baddress2;
}
public void setBaddress2(String baddress2) {
	Baddress2 = baddress2;
}
public String getSaddress1() {
	return Saddress1;
}
public void setSaddress1(String saddress1) {
	Saddress1 = saddress1;
}
public String getSaddress2() {
	return Saddress2;
}
public void setSaddress2(String saddress2) {
	Saddress2 = saddress2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public boolean isBillandShip() {
	return BillandShip;
}
public void setBillandShip(boolean billandShip) {
	BillandShip = billandShip;
}
public boolean isTandC() {
	return TandC;
}
public void setTandC(boolean tandC) {
	TandC = tandC;
}




}
