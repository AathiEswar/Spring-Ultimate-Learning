package com.rest.webservices.rest_web_services.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NegativeIdException extends Exception{
    public NegativeIdException(String message) {
        super(message);
    }
}
