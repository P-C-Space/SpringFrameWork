package com.nhnacademy.edu.springframework.greeting.main;

import com.nhnacademy.edu.springframework.greeting.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("greetBeans.xml")){
            GreetingService service = context.getBean("greetingService", GreetingService.class);
            service.greet();
        }
    }
}
