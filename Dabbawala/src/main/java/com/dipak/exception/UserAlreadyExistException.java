package com.dipak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT,reason = " User Already Exist ... Try to login ")
public class UserAlreadyExistException extends Exception {

}
