package com.test.kafka_demo.producer;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // create constructor of final var or element
@Slf4j
public class KafkaProducer {
    // here producer key and volume are string type, in case of json format will change
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
//        log.info(String.format("➡️Sending message to topic(name: demo-topic-1, msg: %s)", msg));
        kafkaTemplate.send("wikimedia-stream", msg);
    }

}
