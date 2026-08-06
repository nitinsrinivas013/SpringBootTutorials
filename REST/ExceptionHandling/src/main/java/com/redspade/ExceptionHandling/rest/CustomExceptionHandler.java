package com.redspade.ExceptionHandling.rest;

public class CustomExceptionHandler extends RuntimeException{

    public CustomExceptionHandler(String message){
        super(message);
    }
    public CustomExceptionHandler(String message, Throwable cause){
        super(message, cause);
    }
    public CustomExceptionHandler(Throwable cause){
        super(cause);
    }

}
