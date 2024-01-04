package com.nhnacademy.edu.springframework.greeting.main;

import com.nhnacademy.edu.springframework.greeting.greeter.EnglishGreeter;
import com.nhnacademy.edu.springframework.greeting.greeter.KoreanGreeter;
import com.nhnacademy.edu.springframework.greeting.service.GreetingService;

public class Main {
    public static void main(String[] args) {
        new GreetingService(new EnglishGreeter()).greet();
        new GreetingService(new KoreanGreeter()).greet();
    }
}
