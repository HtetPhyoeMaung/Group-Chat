package com.venzee.group_chat_impl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

@Configuration
public class AppConfig {

    @Bean
    public SimpMessageSendingOperations messagingTemplate(MessageChannel messageChannel) {
        return new SimpMessagingTemplate(messageChannel);
    }
}
