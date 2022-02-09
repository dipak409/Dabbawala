package com.dipak.service;

import java.util.List;

import com.dipak.model.Customer;
import com.dipak.model.OrderDetails;
import com.dipak.model.Resturant;

public interface OrderService {
	
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
	public List<OrderDetails> viewAllOders(Resturant resturant);
	public List<OrderDetails> viewAllOders(Customer customer);
}
