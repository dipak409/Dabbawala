package com.dipak.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue
	private int orderId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime startDateTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime endDateTime;	
	private String orderStatus;
	@OneToOne
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
