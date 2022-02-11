package com.dipak.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.ResturantNotFoundException;
import com.dipak.model.Resturant;
import com.dipak.repository.ResturantRepository;

@Service
public class ResturantServiceImpl implements ResturantService{

	private ResturantRepository resturantRepository;
	
	@Autowired
	public ResturantServiceImpl(ResturantRepository resturantRepository) {
		this.resturantRepository = resturantRepository;
	}

	@Override
	public Resturant addRestaurant(Resturant resturant){
	
		return resturantRepository.save(resturant);
		
		
	}

	@Override
	public Resturant updateRestaurant(Resturant resturant) throws ResturantNotFoundException  {
		if(resturantRepository.findById(resturant.getRestaurantId()).isEmpty())
		{
			throw new ResturantNotFoundException();
		}
		return resturantRepository.save(resturant);
		
	}

	@Override
	public Resturant removeRestaurant(Resturant resturant) throws ResturantNotFoundException {
		if(resturantRepository.findById(resturant.getRestaurantId()).isEmpty())
		{
			throw new ResturantNotFoundException();
		}
		else
		{
			Resturant deleteResturant=resturantRepository.findById(resturant.getRestaurantId()).get();
			resturantRepository.deleteById(resturant.getRestaurantId());
			return deleteResturant;
		}
		
	}

	@Override
	public Resturant viewRestaurant(Resturant resturant) throws ResturantNotFoundException{
		if(resturantRepository.findById(resturant.getRestaurantId()).isEmpty())
		{
			throw new ResturantNotFoundException();
		}
		else
		{
			Resturant findResturant=resturantRepository.findById(resturant.getRestaurantId()).get();
			return findResturant;
		}
		
	}

	@Override
	public List<Resturant> viewNearByRestaurant(String location) {
		List<Resturant> viewResturant=resturantRepository.findAll();
		return viewResturant.stream().filter(r->r.getAddress().getArea().toString().equalsIgnoreCase((location.toString())))
				.collect(Collectors.toList());
	}

	@Override
	public List<Resturant> viewRestaurantByItemName(String name) {
		List<Resturant> viewItemResturant=resturantRepository.findAll();
		return viewItemResturant.stream().filter(r->r.getItemList().toString().equalsIgnoreCase(name))
				.collect(Collectors.toList());
//		/filter(item->item.getItemName().toString().equalsIgnoreCase(name.toString())));
	}

}
