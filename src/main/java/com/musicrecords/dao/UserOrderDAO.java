package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.UserOrder;;

public interface UserOrderDAO {
	   public List<UserOrder> list();
	    
	    public UserOrder get(String orderId);
	     
	    public void saveOrUpdate(UserOrder order);
	     
	    public void delete(String orderId);
}
