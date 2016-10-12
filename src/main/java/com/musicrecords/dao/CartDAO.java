package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.Cart;;

public interface CartDAO {
    public List<Cart> list();
    
    public Cart get( int cartId);
     
    public void saveOrUpdate(Cart cart);
     
    public void delete( int cartId);

}
