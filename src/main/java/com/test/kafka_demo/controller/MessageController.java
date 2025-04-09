package com.test.kafka_demo.controller;

import com.test.kafka_demo.payload.Student;
import com.test.kafka_demo.producer.KafkaJsonProducer;
import com.test.kafka_demo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class MessageController {
    // Text
    private final KafkaProducer kafkaProducer;

    // JSON (student obj)
    private final KafkaJsonProducer kafkaJsonProducer;

    // Text
    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message queued successfully");
    }

    // JSON (student obj)
    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(@RequestBody Student message) {
        kafkaJsonProducer.sendMessage(message);
        return ResponseEntity.ok("message queued successfully");
    }

}
