package com.redspade.GlobalExceptionHandling.rest;

public class CustomErrorResponse {

    private int status;
    private long timestamp;
    private String message;

    public CustomErrorResponse(){

    }
    public CustomErrorResponse(int status, long timestamp, String message){
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return status;
    }
    public void setTimestamp(long timestamp){
        this.timestamp = timestamp;
    }
    public long getTimestamp(){
        return timestamp;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
