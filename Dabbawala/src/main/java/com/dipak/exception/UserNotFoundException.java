package com.dipak.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = " Create New Account ")
public class UserNotFoundException extends Exception{

}
