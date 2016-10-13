package com.musicrecords.service;

import java.util.List;


import com.musicrecords.model.Category;

public interface CategoryService {
	   public List<Category> list();
	    
	    public Category get( String catId);
	     
	    public void saveOrUpdate(Category category);
	     
	    public void delete( String catId);

}
