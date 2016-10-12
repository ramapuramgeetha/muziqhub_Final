package com.musicrecords.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Category implements Serializable {

	@Id
	private String catId;
	private String catName;
	private String catDesc;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Product> product;
	
	private String catStatus;
	

	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
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

	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public String getCatStatus() {
		return catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	

	



}
