package com.nhnacademy.edu.springframework.greeting.greeter;

public class EnglishGreeter implements Greeter{
    @Override
    public boolean sayHello() {
        System.out.println("English Hello!");
        return true;
    }
}
