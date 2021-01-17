package com.mygreetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyGreetingApplication {

    public static void main(String[] args) {
        System.out.println("Hello from Murali!!!");
        SpringApplication.run(MyGreetingApplication.class, args);
    }

}
