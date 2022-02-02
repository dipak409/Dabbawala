package com.dipak.service;

import com.dipak.exception.UserAlreadyExistException;
import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Login;

public interface LoginService {
	//Create a new account
	Login register(Login login) throws UserAlreadyExistException;
	//Login to your site
	Login signIn(String email, String password) throws UserNotFoundException;
	//Logout to your site
	//Login signOut(Login login) throws UserNotFoundException;
}
