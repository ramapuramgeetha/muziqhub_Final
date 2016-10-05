package com.musicrecords.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

	@Entity
	public class Product  {

	@Id
	private String prodID;
	private String prodName;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "catId")
	private Category  prodCategory;
	
	private String prodDesc;
	private String prodColor;
	private String prodSize;
	private String prUOM;
	private long prodStock;
	private int prodReorder;
	
	/*
	@ManyToOne
    @JoinColumn(name = "vendorId")
	private Vendor  vendorID;
	*/
	
	private Double prodPrice;
	private String prodStatus;
	
@Transient
private MultipartFile prodimage;


public String getProdID() {
	return prodID;
}

public void setProdID(String prodID) {
	this.prodID = prodID;
}

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public Category getProdCategory() {
	return prodCategory;
}

public void setProdCategory(Category prodCategory) {
	this.prodCategory = prodCategory;
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

/*
public Vendor getVendorID() {
	return vendorID;
}

public void setVendorID(Vendor vendorID) {
	this.vendorID = vendorID;
}
*/
public Double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(Double prodPrice) {
	this.prodPrice = prodPrice;
}

public String getProdStatus() {
	return prodStatus;
}

public void setProdStatus(String prodStatus) {
	this.prodStatus = prodStatus;
}

public MultipartFile getProdimage() {
	return prodimage;
}

public void setProdimage(MultipartFile prodimage) {
	this.prodimage = prodimage;
}

	
	}


