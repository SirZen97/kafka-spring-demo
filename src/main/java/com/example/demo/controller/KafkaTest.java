package com.example.demo.controller;

import com.example.demo.validation.annotation.BytesSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Validated
@RestController
public class KafkaTest {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @GetMapping(path = "/send")
    public String sendData(@BytesSize(max = 15,min = 5)  String data){
//        kafkaTemplate.send("first",data);
        return data;
    }
}
