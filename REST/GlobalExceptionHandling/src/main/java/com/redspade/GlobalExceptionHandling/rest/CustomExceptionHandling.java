package com.redspade.GlobalExceptionHandling.rest;

public class CustomExceptionHandling extends RuntimeException {

    public CustomExceptionHandling(String message){
        super(message);
    }
    public CustomExceptionHandling(String message, Throwable cause){
        super(message, cause);
    }
    public CustomExceptionHandling(Throwable cause){
        super(cause);
    }
}
