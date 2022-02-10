package com.dipak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.ResturantNotFoundException;
import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Customer;
import com.dipak.model.Resturant;
import com.dipak.repository.CustomerRepository;
import com.dipak.repository.ResturantRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	private ResturantRepository resturantRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository,ResturantRepository resturantRepository) {
		this.customerRepository = customerRepository;
		this.resturantRepository=resturantRepository;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer); 
	}

	@Override
	public Customer updateCustomer(Customer customer) throws UserNotFoundException{
		if(customerRepository.findById(customer.getCustomerId()).isEmpty())
		{
			throw new UserNotFoundException();
		}
		return customerRepository.save(customer);
	}

	@Override
	public Customer removeCustomer(Customer customer) throws UserNotFoundException{
		if(customerRepository.findById(customer.getCustomerId()).isEmpty())
		{
			throw new UserNotFoundException();
		}
		else
		{
			Customer deleteCustomer=customerRepository.findById(customer.getCustomerId()).get();
			customerRepository.deleteById(customer.getCustomerId());
			return deleteCustomer;
		}
		
	}

	@Override
	public Customer viewCustomer(Customer customer) throws UserNotFoundException {
		if(customerRepository.findById(customer.getCustomerId()).isEmpty())
		{
			throw new UserNotFoundException();
		}
		else
		{
			Customer findCustomerById=customerRepository.findById(customer.getCustomerId()).get();
			return findCustomerById;
		}
	}

	@Override
	public List<Customer> viewAllCustomers(Resturant resturant) throws ResturantNotFoundException {
	
		if(resturantRepository.findById(resturant.getRestaurantId()).isEmpty())
		{
			throw new ResturantNotFoundException();
		}
		return customerRepository.findAll();
	}

}
