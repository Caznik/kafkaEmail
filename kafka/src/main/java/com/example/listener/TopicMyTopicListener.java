package com.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TopicMyTopicListener {

	@KafkaListener(topics = "mytopic", groupId = "test", containerFactory = "kafkaListenerContainerFactory")
	public void listenGroupTest(String message) {
	    System.out.println("Received Message in topic \"mytopic\": " + message);
	}
	
	/*
	@KafkaListener(topics = "mytopic", groupId = "test", containerFactory = "filterPruebaKafkaListenerContainerFactory")
	public void listenWithFilterPrueba(String message) {
		System.out.println("1- Received Message in filtered listener: " + message);
	}
	*/
	
	/*
	@KafkaListener(topics = "mytopic", groupId = "test", containerFactory = "filterTestKafkaListenerContainerFactory")
	public void listenWithFilterTest(String message) {
		System.out.println("2- Received Message in filtered listener: " + message);
	}
	*/
}
