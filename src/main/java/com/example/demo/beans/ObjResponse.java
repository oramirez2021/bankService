package com.example.demo.beans;

public class ObjResponse {
    private String message;
    public ObjResponse(String message){
        this.message =  message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
