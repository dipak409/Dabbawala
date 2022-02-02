package com.dipak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.exception.UserAlreadyExistException;
import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Login;
import com.dipak.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	private LoginRepository loginRepository;
	
	@Autowired
	public LoginServiceImpl(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	@Override
	public Login register(Login login) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		if(loginRepository.findById(login.getEmail()).isPresent())
		{
			throw new UserAlreadyExistException();
		}
		return loginRepository.save(login);
	}

	@Override
	public Login signIn(String email, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		if(loginRepository.findByEmailAndPassword(email, password)==null)
		{
			throw new UserNotFoundException();
		}
		return loginRepository.findByEmailAndPassword(email, password);
	}



//	@Override
//	public Login signOut(Login login) throws UserNotFoundException {
//		// TODO Auto-generated method stub
//		
//		return null;
//	}

}
