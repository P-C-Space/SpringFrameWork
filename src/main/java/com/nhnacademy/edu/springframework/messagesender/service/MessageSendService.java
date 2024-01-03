package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.message.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("messageSendService")
public class MessageSendService {
    MessageSender messageSender;

    public MessageSendService() {
    }

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }

    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("setMessageSender invoked!");
        this.messageSender = messageSender;
    }
}
