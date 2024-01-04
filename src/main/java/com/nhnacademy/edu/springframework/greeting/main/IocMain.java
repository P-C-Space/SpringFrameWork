package com.nhnacademy.edu.springframework.greeting.main;

import com.nhnacademy.edu.springframework.greeting.greeter.KoreanGreeter;
import com.nhnacademy.edu.springframework.greeting.service.GreetingService;

public class IocMain {
    public static void main(String[] args) {
        new GreetingService(new KoreanGreeter()).greet();
    }
}
