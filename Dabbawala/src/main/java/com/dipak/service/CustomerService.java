package com.dipak.service;

import java.util.List;

import com.dipak.exception.ResturantNotFoundException;
import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Customer;
import com.dipak.model.Resturant;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws UserNotFoundException;
	public Customer removeCustomer(Customer customer) throws UserNotFoundException;
	public Customer viewCustomer(Customer customer)throws UserNotFoundException;
	public List<Customer> viewAllCustomers(Resturant resturant)throws ResturantNotFoundException;
	//public List<Customer> viewAllCustomer(Customer customer);
}
