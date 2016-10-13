package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.User;;

public interface UserService {
	   public List<User> list();
	    
	    public User get(String usrId);
	     
	    public void saveOrUpdate(User user);
	     
	    public void delete(String usrId);
}
