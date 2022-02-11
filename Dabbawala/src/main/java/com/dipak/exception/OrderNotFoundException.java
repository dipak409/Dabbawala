package com.dipak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = " Order Id is not availiable")
public class OrderNotFoundException extends Exception{

}
