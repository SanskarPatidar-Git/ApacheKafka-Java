package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.kafka.KafkaService;

@RestController
@RequestMapping("send")
public class ProducerController {

	@Autowired
	KafkaService kafkaService;
	
	@PostMapping("{message}")
	public String send(@PathVariable("message") String msg) {
		return kafkaService.sendMessage(msg);
	}
}
