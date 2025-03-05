package com.kafka.producer.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String,String> template;
	
	public String sendMessage(String msg) {
		template.send(KafkaConfig.topicName,msg);
		return "SUCCESS";
	}
}
