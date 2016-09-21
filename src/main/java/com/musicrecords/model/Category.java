package com.musicrecords.model;

import javax.persistence.*;

@Entity
public class Category {
	@GeneratedValue
	private int id;
	@Id
	private String catId;
	private String catName;
	private String catDesc;
	private String catStatus;

	

	public String getCatId() {
		return catId;
	}

	public void setCatId(int id) {
		this.catId = "CAT"+Integer.toString(id);
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}


	public Category() {
		// TODO Auto-generated constructor stub
	}

	public String getCatStatus() {
		return catStatus;
	}

	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}



}
