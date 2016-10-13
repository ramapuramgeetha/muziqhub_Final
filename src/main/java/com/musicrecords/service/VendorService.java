package com.musicrecords.service;

import java.util.List;

import com.musicrecords.model.Vendor;;

public interface VendorService {
	   public List<Vendor> list();
	    
	    public Vendor get(String vendorId);
	     
	    public void saveOrUpdate(Vendor vendor);
	     
	    public void delete(String vendorId);
}
