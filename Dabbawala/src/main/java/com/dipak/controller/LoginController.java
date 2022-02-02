package com.dipak.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.exception.UserAlreadyExistException;
import com.dipak.exception.UserNotFoundException;
import com.dipak.model.Login;
import com.dipak.security.TokenGenerator;
import com.dipak.service.LoginService;

@RestController
@RequestMapping("/api/v1/")
public class LoginController {
	
	
	 private ResponseEntity responseEntity;
	 private TokenGenerator tokenGenerator;
	 private LoginService loginService;
	 
	public LoginController(TokenGenerator tokenGenerator,LoginService loginService) {
		this.tokenGenerator = tokenGenerator;
		this.loginService = loginService;
	}
	 
	 
	 	@PostMapping("register")
	    public ResponseEntity<?> registerUser(@RequestBody Login login) throws UserAlreadyExistException {
	        try
	        {
	        	loginService.register(login);
	            responseEntity = new ResponseEntity(login, HttpStatus.CREATED);
	        }
	        catch(UserAlreadyExistException e)
	        {
	            throw new UserAlreadyExistException();
	        }
	        catch (Exception e)
	        {
	            responseEntity = new ResponseEntity("Error in register ",HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	        return responseEntity;
	    }

	 	
	 	@PostMapping("login")
	    public ResponseEntity loginUser(@RequestBody Login login) throws UserNotFoundException {

	        Map<String, String> map = null;

	        try
	        {
	        	
	            Login loginObj = loginService.signIn(login.getEmail(), login.getPassword());


	            if((loginObj.getEmail().equalsIgnoreCase(login.getEmail())) && (loginObj.getPassword().equalsIgnoreCase(login.getPassword())))
	            {
	                map = tokenGenerator.generateToken(login);
	            }

	            responseEntity = new ResponseEntity(map, HttpStatus.OK);
	        }
	        catch(UserNotFoundException e){
	            throw new UserNotFoundException();
	        }
	        catch (Exception e){
	            responseEntity = new ResponseEntity("Login Failed", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	        return responseEntity;
	    }
}
