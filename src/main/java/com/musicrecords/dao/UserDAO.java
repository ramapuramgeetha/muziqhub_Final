package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.User;;

public interface UserDAO {
	   public List<User> list();
	    
	    public User get(String usrId);
	     
	    public void saveOrUpdate(User user);
	     
	    public void delete(String usrId);
}
