package com.nhnacademy.edu.springframework.greeting.service;

import com.nhnacademy.edu.springframework.greeting.greeter.Greeter;

public class GreetingService {
    private final Greeter greeter;

    public GreetingService(Greeter greeter) {
        this.greeter = greeter;
    }

    public boolean greet() {
        return greeter.sayHello();
    }
}
