package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer>{

}
