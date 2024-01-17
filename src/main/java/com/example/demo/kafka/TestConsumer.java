package com.example.demo.kafka;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class TestConsumer {
    @KafkaListener(topics = "first")
    public void FirstTopicListener(String msg){
        System.out.println("收到的消息   "+msg);
    }
}
