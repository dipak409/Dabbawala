package com.dipak.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderDetails {
	@Id
	private int orderId;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;	
	private String orderStatus;
	private FoodCart cart;
	
	
	
	public OrderDetails() {
		super();
	}


	public OrderDetails(int orderId, LocalDateTime startDateTime, LocalDateTime endDateTime, String orderStatus,
			FoodCart cart) {
		super();
		this.orderId = orderId;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.orderStatus = orderStatus;
		this.cart = cart;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public FoodCart getCart() {
		return cart;
	}
	public void setCart(FoodCart cart) {
		this.cart = cart;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", startDateTime=" + startDateTime + ", endDateTime=" + endDateTime
				+ ", orderStatus=" + orderStatus + ", cart=" + cart + "]";
	}
	
	
	
}
