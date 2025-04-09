package com.test.kafka_demo.consumer;

import com.test.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    // Text
//    @KafkaListener(topics = "demo-topic-1", groupId = "myGroup")
//    public void consumeMsg(String msg) {
//        log.info(String.format("➡️Consuming the msg from 'demo-topic-1', msg: %s",msg));
//    }

    // JSON (Student obj
    @KafkaListener(topics = "demo-topic-1", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("➡️Consuming the msg from 'demo-topic-1', msg: %s",student.toString()));
    }
}
