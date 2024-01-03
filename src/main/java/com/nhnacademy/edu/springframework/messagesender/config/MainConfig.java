package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.message.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.message.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework"})
public class MainConfig {

//    @Bean(value = "smsMessageSender")
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }
//
//    @Bean(value = "emailMessageSender")
//    public MessageSender emailMessageSender(){
//        return new EmailMessageSender();
//    }
}
