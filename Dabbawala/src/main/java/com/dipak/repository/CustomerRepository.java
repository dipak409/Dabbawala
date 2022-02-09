package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
