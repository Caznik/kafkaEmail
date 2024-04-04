package com.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.EmailEntity;

@Service
public class EmailTopicKafkaListener {

	@KafkaListener(topics = "email", groupId = "email-group-1", containerFactory = "emailKafkaListenerContainerFactory")
	public void listenGroupEmailGroup1(EmailEntity emailEntity) {
	    System.out.println("Received Message in topic: \"email\", group: \"email-group-1\", message: \"" + emailEntity.toString() + "\"");
	}
}
