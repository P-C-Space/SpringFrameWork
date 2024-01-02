package com.nhnacademy.edu.springframework.messagesender.Main;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.message.SmsMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;

public class PolymorphismMain2 {
    public static void main(String[] args) {
        User user = new User("user@naver.com","010-1234-5678");

        new MessageSendService(new SmsMessageSender()).doSendMessage(user, "Hello");
    }
}
