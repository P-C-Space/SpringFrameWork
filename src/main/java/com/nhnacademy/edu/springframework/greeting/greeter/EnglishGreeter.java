package com.nhnacademy.edu.springframework.greeting.greeter;

public class EnglishGreeter implements Greeter{

    public EnglishGreeter() {
        System.out.println("EnglishGreeter initiated!!");
    }

    @Override
    public boolean sayHello() {
        System.out.println("English Hello!");
        return true;
    }
}
