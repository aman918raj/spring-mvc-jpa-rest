package com.example.springmvcjparest.exception;

import org.springframework.http.HttpStatus;

public class UserException extends RuntimeException{

    HttpStatus code;

    public UserException(String errorMessage, HttpStatus code){
        super(errorMessage);
        this.code = code;
    }

    public HttpStatus getCode() {
        return code;
    }
}
