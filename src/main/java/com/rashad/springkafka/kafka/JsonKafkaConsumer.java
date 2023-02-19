package com.rashad.springkafka.kafka;

import com.rashad.springkafka.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "${kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user){
        log.info(String.format("Json message received -> %s", user.toString()));
    }
}
