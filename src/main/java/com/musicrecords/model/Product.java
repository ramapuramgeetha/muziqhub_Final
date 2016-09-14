package com.musicrecords.model;

import javax.persistence.*;

	@Entity
	public class Product {
	
	@GeneratedValue
	int prodNo;
	@Id
	private String prodID;
	private String prodCategory;
	private String prodName;
	private Double prodPrice;
	
	public String getImageMap() {
		return imageMap;
	}

	public void setImageMap(String imageMap) {
		this.imageMap = imageMap;
	}

	public String getProdStatus() {
		return prodStatus;
	}

	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}

	private String imageMap;
	private String prodStatus;
	   
public String getProdID() {
		return prodID;
	}

	public void setProdID(String prodNo) {
		this.prodID = "PR"+prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public Double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}

		public Product(String id, String category, String name, Double price) {
			this.setProdID(id);
			this.setProdCategory(category);
			this.setProdName(name);
			this.setProdPrice(price);
		}

	}


