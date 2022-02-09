package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Resturant;

@Repository
public interface ResturantRepository extends JpaRepository<Resturant, Integer>{

}
