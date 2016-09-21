package com.musicrecords.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class LoginPK implements Serializable {
	
	private String usrName;
	private  String usrRole;

	public LoginPK() {
		// TODO Auto-generated constructor stub
	}

	public String getUsrName() {
		return usrName;
	}

	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}

	public String getUsrRole() {
		return usrRole;
	}

	public void setUsrRole(String usrRole) {
		this.usrRole = usrRole;
	}

}
