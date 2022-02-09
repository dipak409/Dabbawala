package com.dipak.service;

import com.dipak.exception.ItemNotFoundException;
import com.dipak.model.FoodCart;
import com.dipak.model.Item;

public interface CartService {
	
	public FoodCart addItemToCart(int cartId,Item item)throws ItemNotFoundException;
	public FoodCart increseQuantity(FoodCart cart,Item item,int quantity);
	public FoodCart reduceQuantity(FoodCart cart,Item item, int quantity);
	public FoodCart removeItem(FoodCart cart,Item item);
	public FoodCart clearCart(Item item);
	
}
