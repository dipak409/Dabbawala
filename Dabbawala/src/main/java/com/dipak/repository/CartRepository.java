package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.FoodCart;

@Repository
public interface CartRepository extends JpaRepository<FoodCart,Integer> {

}
