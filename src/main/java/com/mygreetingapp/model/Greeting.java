package com.mygreetingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GREETINGS")
public class Greeting {

    @Id
    private long greetingId;
    private String message;

    public Greeting() {
        greetingId = 0;
        message = "";
    }

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
