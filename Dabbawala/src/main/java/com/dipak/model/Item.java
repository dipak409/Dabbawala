package com.dipak.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	@OneToOne
	private Category category;
	private int quantity;
	private double cost;
	@OneToOne
	private List<Resturant> listOfRestaurants;
	
	
	public Item() {
		super();
	}


	public Item(int itemId, String itemName, Category category, int quantity, double cost,
			List<Resturant> listOfRestaurants) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.listOfRestaurants = listOfRestaurants;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public List<Resturant> getListOfRestaurants() {
		return listOfRestaurants;
	}


	public void setListOfRestaurants(List<Resturant> listOfRestaurants) {
		this.listOfRestaurants = listOfRestaurants;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", quantity=" + quantity
				+ ", cost=" + cost + ", listOfRestaurants=" + listOfRestaurants + "]";
	}
	
	
	
}
