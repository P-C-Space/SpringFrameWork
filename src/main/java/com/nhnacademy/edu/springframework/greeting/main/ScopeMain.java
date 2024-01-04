package com.nhnacademy.edu.springframework.greeting.main;

import com.nhnacademy.edu.springframework.greeting.greeter.Greeter;
import com.nhnacademy.edu.springframework.greeting.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("greetBeans.xml")) {
            new GreetingService(context.getBean("koreanGreeter", Greeter.class)).greet();
            new GreetingService(context.getBean("koreanGreeter", Greeter.class)).greet();

            new GreetingService(context.getBean("englishGreeter", Greeter.class)).greet();
            new GreetingService(context.getBean("englishGreeter", Greeter.class)).greet();
        }
    }
}
