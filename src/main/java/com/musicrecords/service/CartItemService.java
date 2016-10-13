package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.CartItem;

public interface CartItemService {
	   public List<CartItem> list();
	    
	    public CartItem get( int carItemId);
	     
	    public void saveOrUpdate(CartItem cartItem);
	     
	    public void delete( int carItemId);
}
