package com.musicrecords.dao;

import java.util.List;

import com.musicrecords.model.CreditCard;;

public interface CreditCardDAO {
	   public List<CreditCard> list();
	    
	    public CreditCard get(long crCdNo);
	     
	    public void saveOrUpdate(CreditCard CrCard);
	     
	    public void delete(long crCdNo);

}
