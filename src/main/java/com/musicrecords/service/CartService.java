package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Cart;;

public interface CartService {
    public List<Cart> list();
    
    public Cart get( int cartId);
     
    public void saveOrUpdate(Cart cart);
     
    public void delete( int cartId);

}
