package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.Role;;

public interface RoleDAO {
	   public List<Role> list();
	    
	    public Role get(String userName);
	     
	    public void saveOrUpdate(Role role);
	     
	    public void delete(String userName);
}
