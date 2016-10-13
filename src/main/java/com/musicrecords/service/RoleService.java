package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Role;;

public interface RoleService {
	   public List<Role> list();
	    
	    public Role get(String userName);
	     
	    public void saveOrUpdate(Role role);
	     
	    public void delete(String userName);
}
