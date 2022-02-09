package com.dipak.service;

import java.util.List;

import com.dipak.model.Category;
import com.dipak.model.Item;
import com.dipak.model.Resturant;

public interface ItemService {
	
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item viewItem(Item item);
	public Item removeItem(Item item);
	public List<Item> viewAllItems(Category category);
	public List<Item> viewAllItems(Resturant resturant);
	public List<Item> viewAllItemByName(String name);
	
}
