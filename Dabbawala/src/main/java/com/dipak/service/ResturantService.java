package com.dipak.service;

import java.util.List;

import com.dipak.model.Resturant;

public interface ResturantService {
	
	public Resturant addRestaurant(Resturant resturant);
	public Resturant updateRestaurant(Resturant resturant);
	public Resturant removeRestaurant(Resturant resturant);
	public Resturant viewRestaurant(Resturant resturant);
	public List<Resturant> viewNearByRestaurant(String location);
	public List<Resturant> viewRestaurantByItemName(String name);
	
}
