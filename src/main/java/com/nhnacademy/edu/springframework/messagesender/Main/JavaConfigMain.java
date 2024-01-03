package com.nhnacademy.edu.springframework.messagesender.Main;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework");) {
            User user = new User("nhn@gmail.com", "010-1234-5678");

            MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
            messageSendService.doSendMessage(user, "service test");
        }
    }
}
