package com.example.demokafkalistner.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaListner {

    @KafkaListener(topics = "demo_topic", groupId = "group_id")
    public void logMessage(@Payload String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){
        log.info("----------Topic: {}, message: {}",topic,message);
    }
}
