package com.test.kafka_demo.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}
