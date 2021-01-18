package com.mygreetingapp.service;

import com.mygreetingapp.model.Greeting;
import com.mygreetingapp.model.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getGreetingByList();
}
