package com.example.demokafkatemplaterecive.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaConsumer(KafkaTemplate<String, String> kafkaTemplate, ConsumerFactory<String, String> consumerFactory){
        this.kafkaTemplate = kafkaTemplate;
        this.kafkaTemplate.setConsumerFactory(consumerFactory);
    }

    public void receiveMessage() {
        ConsumerRecord<String, String> records =this.kafkaTemplate.receive("demo_topic",0, 1);
        System.out.printf("offset = %d, key = %s, value = %s%n", records.offset(), records.key(), records.value());


    }
}
