package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
