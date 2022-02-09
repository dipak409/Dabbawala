package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}
