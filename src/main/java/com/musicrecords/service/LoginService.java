package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Login;
import com.musicrecords.model.LoginPK;

public interface LoginService {
	   public List<Login> list();
	    
	    public Login get( LoginPK logId);
	     
	    public void saveOrUpdate(Login login);
	     
	    public void delete( LoginPK logId);
}
