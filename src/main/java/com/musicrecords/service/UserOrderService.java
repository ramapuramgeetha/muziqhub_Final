package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.UserOrder;;

public interface UserOrderService {
	   public List<UserOrder> list();
	    
	    public UserOrder get(String orderId);
	     
	    public void saveOrUpdate(UserOrder order);
	     
	    public void delete(String orderId);
}
