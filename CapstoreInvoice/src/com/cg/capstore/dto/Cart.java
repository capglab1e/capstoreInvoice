package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="prod_id")
	private String prodId;
	@Column(name="quantity")
	private int quantity;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String userId, String prodId, int quantity) {
		super();
		this.userId = userId;
		this.prodId = prodId;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [userId=" + userId + ", prodId=" + prodId + ", quantity="
				+ quantity + "]";
	}
	
}
