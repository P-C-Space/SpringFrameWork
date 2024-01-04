package com.nhnacademy.edu.springframework.greeting.service;

import com.nhnacademy.edu.springframework.greeting.greeter.Greeter;

public class GreetingService {
    private Greeter greeter;

    public GreetingService() {
    }

    public GreetingService(Greeter greeter) {
        this.greeter = greeter;
    }

    public void setGreeter(Greeter greeter) {
        System.out.println("setGreeter invoked!");
        this.greeter = greeter;
    }

    public boolean greet() {
        return greeter.sayHello();
    }
}
