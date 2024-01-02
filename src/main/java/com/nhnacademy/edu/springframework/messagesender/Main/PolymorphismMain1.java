package com.nhnacademy.edu.springframework.messagesender.Main;

import com.nhnacademy.edu.springframework.messagesender.User;

public class PolymorphismMain1 {
    public static void main(String[] args) {
        User user = new User("user@naver.com","010-1234-5678");

        sendSmsMessage(user, "메세지");
    }

    private static void sendSmsMessage(User user, String message){
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private static void sendEmailMessage(User user, String message){
        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
    }
}
