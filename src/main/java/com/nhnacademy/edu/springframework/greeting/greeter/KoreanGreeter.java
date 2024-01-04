package com.nhnacademy.edu.springframework.greeting.greeter;

public class KoreanGreeter implements Greeter{
    @Override
    public boolean sayHello() {
        System.out.println("한국말 안녕하세요!");
        return true;
    }
}
