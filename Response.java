package com.example.demo;

public class Response{
    private String message;
    private int status;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Response(String message, int status){
        this.message = message;
        this.status = status;
    }


}
