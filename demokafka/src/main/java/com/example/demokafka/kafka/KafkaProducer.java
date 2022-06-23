package com.example.demokafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message,String topic) {
        log.info("Sending message to Kafka topic:{} , message:{}", topic,message);
        this.kafkaTemplate.send(topic, message);
        log.info("Message successfully sent to Kafka topic:{} , message:{}", topic, message);
    }

}
