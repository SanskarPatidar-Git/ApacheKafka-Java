package com.kafka.producer.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

	public static final String topicName = "topic-1"; 
	
	//Create a topic
	@Bean
	public NewTopic createTopic() {
		return TopicBuilder.name(topicName)
				//.replicas(0)
				.build();
	}
}
