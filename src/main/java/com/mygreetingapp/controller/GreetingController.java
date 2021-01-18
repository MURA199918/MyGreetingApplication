package com.mygreetingapp.controller;

import com.mygreetingapp.model.Greeting;
import com.mygreetingapp.model.User;
import com.mygreetingapp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    public static final String template = "Hello, %s!";
    public final AtomicLong counter = new AtomicLong();

    @Autowired
    private IGreetingService greetingService;

    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello World!!!";
    }

    @GetMapping({"", "/", "/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @RequestMapping("/id")
    public Greeting getId(@RequestParam(value = "id") long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/list")
    public List<Greeting> getListData() {
        return greetingService.getGreetingByList();
    }
}
