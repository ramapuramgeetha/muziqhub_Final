package com.musicrecords.model;

import javax.persistence.Entity;

@Entity
public class Login {
	
	private LoginPK logId;
	private String usrPasswod;
	private String usrStatus;
	

	public Login() {
		// TODO Auto-generated constructor stub
	}




	public String getUsrPasswod() {
		return usrPasswod;
	}


	public void setUsrPasswod(String usrPasswod) {
		this.usrPasswod = usrPasswod;
	}


	public String getUsrStatus() {
		return usrStatus;
	}


	public void setUsrStatus(String usrStatus) {
		this.usrStatus = usrStatus;
	}




	public LoginPK getLogId() {
		return logId;
	}




	public void setLogId(LoginPK logId) {
		this.logId = logId;
	}

}
