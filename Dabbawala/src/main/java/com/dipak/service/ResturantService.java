package com.dipak.service;

import java.util.List;

import com.dipak.exception.ResturantNotFoundException;
import com.dipak.model.Resturant;

public interface ResturantService {
	
	public Resturant addRestaurant(Resturant resturant) ;
	public Resturant updateRestaurant(Resturant resturant)throws ResturantNotFoundException;
	public Resturant removeRestaurant(Resturant resturant) throws ResturantNotFoundException;
	public Resturant viewRestaurant(Resturant resturant) throws ResturantNotFoundException;
	public List<Resturant> viewNearByRestaurant(String location);
	public List<Resturant> viewRestaurantByItemName(String name);
	
}
