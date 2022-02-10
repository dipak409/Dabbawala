package com.dipak.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Resturant {
	
	@Id
	@GeneratedValue
	private int restaurantId;
	private String restaurantName;
	@OneToOne
	private Address address;
	@OneToOne
	private List<Item> itemList;
	private String managerName;
	private String contactNumber;
	
	
	
	public Resturant() {
		super();
	}
	
	public Resturant(int restaurantId, String restaurantName, Address address, List<Item> itemList, String managerName,
			String contactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.itemList = itemList;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
	}
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Resturant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address=" + address
				+ ", itemList=" + itemList + ", managerName=" + managerName + ", contactNumber=" + contactNumber + "]";
	}
	
	
	
}
