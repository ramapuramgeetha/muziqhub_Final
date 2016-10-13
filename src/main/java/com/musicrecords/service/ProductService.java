package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Product;;

public interface ProductService {
	   public List<Product> list();
	    
	    public Product get( String prodIDd);
	     
	    public void saveOrUpdate(Product product);
	     
	    public void delete( String prodID);
}
