package com.musicrecords.dao;

import java.util.List;


import com.musicrecords.model.Category;

public interface CategoryDAO {
	   public List<Category> list();
	    
	    public Category get( String catId);
	     
	    public void saveOrUpdate(Category category);
	     
	    public void delete( String catId);

}
