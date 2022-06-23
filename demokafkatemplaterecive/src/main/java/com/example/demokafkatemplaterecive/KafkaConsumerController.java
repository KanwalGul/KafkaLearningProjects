package com.example.demokafkatemplaterecive;

import com.example.demokafkatemplaterecive.kafka.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaConsumerController {

    private KafkaConsumer kafkaConsumer;

    @Autowired
    public KafkaConsumerController(KafkaConsumer kafkaConsumer){
        this.kafkaConsumer = kafkaConsumer;
    }

    @GetMapping(value = "receive")
    public void KafkaReceiveMessage(){
        kafkaConsumer.receiveMessage();
    }

}
