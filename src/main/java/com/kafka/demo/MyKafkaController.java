package com.kafka.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.kafka.core.KafkaTemplate;

@RestController
@RequestMapping("/admin/kafka")
public class MyKafkaController {
    private final static String TOPIC_NAME = "my-replicated-topic";

//    @Autowired
//    private KafkaTemplate kafkaTemplate;
//
//    @RequestMapping("/send")
//    public String sendMsg(){
//        kafkaTemplate.send(TOPIC_NAME, 0,"key","this is zabbix message");
//        return "send success";
//    }


}
