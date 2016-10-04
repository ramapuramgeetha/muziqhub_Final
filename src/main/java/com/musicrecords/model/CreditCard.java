package com.musicrecords.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {

@Id
private long crCdNo;

@ManyToOne (cascade=CascadeType.ALL)
private User  user;

private String  crCdType;
private int  crCdExpMonth;
private int  crCdExpYear;
private String  crCdUserName;
private String Status;

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public long getCrCdNo() {
		return crCdNo;
	}

	public void setCrCdNo(long crCdNo) {
		this.crCdNo = crCdNo;
	}

	

	public String getCrCdType() {
		return crCdType;
	}

	public void setCrCdType(String crCdType) {
		this.crCdType = crCdType;
	}

	public int getCrCdExpMonth() {
		return crCdExpMonth;
	}

	public void setCrCdExpMonth(int crCdExpMonth) {
		this.crCdExpMonth = crCdExpMonth;
	}

	public int getCrCdExpYear() {
		return crCdExpYear;
	}

	public void setCrCdExpYear(int crCdExpYear) {
		this.crCdExpYear = crCdExpYear;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCrCdUserName() {
		return crCdUserName;
	}

	public void setCrCdUserName(String crCdUserName) {
		this.crCdUserName = crCdUserName;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	

}
