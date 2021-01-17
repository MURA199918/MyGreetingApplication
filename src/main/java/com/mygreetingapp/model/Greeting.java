package com.mygreetingapp.model;

public class Greeting {
    private  long greetingId;
    private String message;

    public Greeting(long greetingId, String message) {
        this.greetingId = greetingId;
        this.message = message;
    }

    public long getGreetingId() {
        return greetingId;
    }

    public void setGreetingId(long greetingId) {
        this.greetingId = greetingId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
