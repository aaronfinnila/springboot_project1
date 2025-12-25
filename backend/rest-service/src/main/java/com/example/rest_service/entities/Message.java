package com.example.rest_service.entities;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String text) {
        this.text = text;
    }
}
