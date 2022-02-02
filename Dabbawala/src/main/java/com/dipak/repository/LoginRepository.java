package com.dipak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipak.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String>{
	 Login findByEmailAndPassword(String email,String password);
}
