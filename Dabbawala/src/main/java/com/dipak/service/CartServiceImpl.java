package com.dipak.service;

import org.springframework.stereotype.Service;

import com.dipak.exception.ItemNotFoundException;
import com.dipak.model.FoodCart;
import com.dipak.model.Item;

@Service
public class CartServiceImpl implements CartService{

	@Override
	public FoodCart addItemToCart(int cartId, Item item) throws ItemNotFoundException {
	
		return null;
	}

	@Override
	public FoodCart increseQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart removeItem(FoodCart cart, Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodCart clearCart(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

}
