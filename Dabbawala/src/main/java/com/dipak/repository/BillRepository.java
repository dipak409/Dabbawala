package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer>{

}
