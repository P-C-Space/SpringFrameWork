package com.nhnacademy.edu.springframework.messagesender.Main;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
            User user = new User("nhn@gmail.com","010-1234-5678");
            MessageSender SmsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
            MessageSender EmailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

            SmsMessageSender.sendMessage(user,"sms test");
            EmailMessageSender.sendMessage(user,"email test");
        }
    }
}
