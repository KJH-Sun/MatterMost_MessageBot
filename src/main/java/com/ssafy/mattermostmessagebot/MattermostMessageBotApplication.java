package com.ssafy.mattermostmessagebot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MattermostMessageBotApplication {

    @Autowired
    private MessageScheduler scheduler;

    public static void main(String[] args) {
        SpringApplication.run(MattermostMessageBotApplication.class, args);
    }

}
