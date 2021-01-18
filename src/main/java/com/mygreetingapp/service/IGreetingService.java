package com.mygreetingapp.service;

import com.mygreetingapp.model.Greeting;
import com.mygreetingapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);

}
