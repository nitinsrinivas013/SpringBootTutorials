package com.redspade.ExceptionHandling.rest;

public class CustomErrorResponse {


    private int status;
    private long timestamp;
    private String errorMessage;

    public CustomErrorResponse(){

    }
    public CustomErrorResponse(int status, long timestamp, String errorMessage){
        this.status = status;
        this.timestamp = timestamp;
        this.errorMessage = errorMessage;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public int getStatus() {
        return status;
    }

    public void setTimeStamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long getTimeStamp() {
        return timestamp;
    }

    public void setMessage(String message) {
        this.errorMessage = message;
    }

    public String getMessage() {
        return errorMessage;
    }
}
