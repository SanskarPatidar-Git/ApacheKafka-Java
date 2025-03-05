package com.kafka.consumer.kafka;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/*
 * @KafkaListener -> Subscribe to the topic and listen when data arrives to topic.
 * Serialization is used to convert Objects in Byte array so that kafka can process that array.
 * Similarly Deserialization for byte array to objects.
 * 
 */

@Service
@EnableKafka
public class KafkaService {

	@KafkaListener(topics = "topic-1", groupId = "g1")
	public void consumeMessage(String msg) {
		System.out.println("Message : "+msg);
	}
}
