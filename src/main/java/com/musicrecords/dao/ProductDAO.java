package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.Product;;

public interface ProductDAO {
	   public List<Product> list();
	    
	    public Product get( String prodIDd);
	     
	    public void saveOrUpdate(Product product);
	     
	    public void delete( String prodID);
}
