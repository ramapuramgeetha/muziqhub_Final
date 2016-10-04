package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	private String userName;
	private String userPassword;
	private String userRole;
	private String userStatus;
	
	

	public String getUserStatus() {
		return userStatus;
	}



	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getUserRole() {
		return userRole;
	}



	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}



	public Role() {
		// TODO Auto-generated constructor stub
	}

}
