package com.dipak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Customer;
import com.dipak.model.Resturant;
import com.dipak.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
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
	public Customer viewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> viewAllCustomers(Resturant resturant) {
		// TODO Auto-generated method stub
		return null;
	}

}
