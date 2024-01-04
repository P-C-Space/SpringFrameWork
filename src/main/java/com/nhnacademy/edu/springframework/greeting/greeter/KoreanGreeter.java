package com.nhnacademy.edu.springframework.greeting.greeter;

public class KoreanGreeter implements Greeter {
    public KoreanGreeter() {
        System.out.println("KoreanGreeter initiated!!");
    }

    public void init() {
        System.out.println("KoreanGreeter init called!!");
    }

    public void cleanup() {
        System.out.println("KoreanGreeter cleanup called!!");
    }

    @Override
    public boolean sayHello() {
        System.out.println("한국말 안녕하세요!");
        return true;
    }
}
