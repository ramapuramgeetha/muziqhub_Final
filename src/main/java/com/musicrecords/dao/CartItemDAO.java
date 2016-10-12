package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.CartItem;

public interface CartItemDAO {
	   public List<CartItem> list();
	    
	    public CartItem get( int carItemId);
	     
	    public void saveOrUpdate(CartItem cartItem);
	     
	    public void delete( int carItemId);
}
