package com.musicrecords.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class UserOrder {

	@Id
	private String orderId;
	
	@OneToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	
	@ManyToOne 
	private User usrId;
	
	private String billaddress;
	
	private String shipaddress;
	
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUsrId() {
		return usrId;
	}

	public void setUsrId(User usrId) {
		this.usrId = usrId;
	}


	public String getBilladdress() {
		return billaddress;
	}

	public void setBilladdress(String billaddress) {
		this.billaddress = billaddress;
	}

	public String getShipaddress() {
		return shipaddress;
	}

	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}

	public UserOrder() {
		// TODO Auto-generated constructor stub
	}

}
