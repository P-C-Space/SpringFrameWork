package com.nhnacademy.edu.springframework.greeting.greeter;

public class EnglishGreeter implements Greeter {

    public EnglishGreeter() {
        System.out.println("EnglishGreeter initiated!!");
    }

    public void init() {
        System.out.println("EnglishGreeter init called!!");
    }

    public void cleanup() {
        System.out.println("EnglishGreeter cleanup called!!");
    }

    @Override
    public boolean sayHello() {
        System.out.println("English Hello!");
        return true;
    }
}
