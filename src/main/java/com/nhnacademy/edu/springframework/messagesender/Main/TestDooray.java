package com.nhnacademy.edu.springframework.messagesender.Main;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import org.springframework.web.client.RestTemplate;

public class TestDooray {
    public static void main(String[] args) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3204376758577275363/3707922642738216364/WdJUIozGSgGdnxhQnS1lSA")
                .send(DoorayHook.builder()
                        .botName("이정우")
                        .text("안녕하세요")
                        .build()
                );
    }
}
