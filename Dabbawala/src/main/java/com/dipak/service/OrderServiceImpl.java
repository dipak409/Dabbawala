package com.dipak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.OrderNotFoundException;
import com.dipak.model.Customer;
import com.dipak.model.OrderDetails;
import com.dipak.model.Resturant;
import com.dipak.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	private OrderRepository orderRepository;
	
	@Autowired
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		
		return orderRepository.save(order);
	}





	@Override
	public OrderDetails updateOrder(OrderDetails order) throws OrderNotFoundException{
		if(orderRepository.findById(order.getOrderId()).isEmpty())
		{
			throw new OrderNotFoundException();
		}
		return orderRepository.save(order);
	}

	@Override
	public OrderDetails removeOrder(OrderDetails order) throws OrderNotFoundException{
		if(orderRepository.findById(order.getOrderId()).isEmpty())
		{
			throw new OrderNotFoundException();
		}
		else
		{
			OrderDetails deleteOrderDetails=orderRepository.findById(order.getOrderId()).get();
			orderRepository.deleteById(order.getOrderId());
			return deleteOrderDetails;
		}
		
	}

	@Override
	public OrderDetails viewOrder(OrderDetails order) throws OrderNotFoundException {
		if(orderRepository.findById(order.getOrderId()).isEmpty())
		{
			throw new OrderNotFoundException();
		}
		return orderRepository.findById(order.getOrderId()).get();
	}

	@Override
	public List<OrderDetails> viewAllOders(Resturant resturant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOders(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
