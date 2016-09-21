package com.musicrecords.model;

import javax.persistence.*;

	@Entity
	public class Product {
	
	@GeneratedValue
	int prodNo;
	@Id
	private String prodID;
	private String prodName;
	private String prodCategory;
	private String prodDesc;
	private String prodColor;
	private String prodSize;
	private String prUOM;
	private long prodStock;
	private int prodReorder;
	private String vendorID;
	private Double prodPrice;
	private String imageMap;
	private String prodStatus;
	
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
	   
public String getProdID() {
		return prodID;
	}

	public void setProdID(int prodNo) {
		this.prodID = "PR"+Integer.toString(prodNo);
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

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getProdColor() {
		return prodColor;
	}

	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}

	public String getProdSize() {
		return prodSize;
	}

	public void setProdSize(String prodSize) {
		this.prodSize = prodSize;
	}

	public String getPrUOM() {
		return prUOM;
	}

	public void setPrUOM(String prUOM) {
		this.prUOM = prUOM;
	}

	public long getProdStock() {
		return prodStock;
	}

	public void setProdStock(long prodStock) {
		this.prodStock = prodStock;
	}

	public int getProdReorder() {
		return prodReorder;
	}

	public void setProdReorder(int prodReorder) {
		this.prodReorder = prodReorder;
	}

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
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
	}


