package com.musicrecords.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Category implements Serializable {
	@GeneratedValue
	private int id;
	@Id
	private String catId;
	private String catName;
	private String catDesc;
	@OneToMany(mappedBy = "prodCategory", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> product;
	private String catStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public String getCatStatus() {
		return catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	

	



}
