package com.example.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.EmailEntity;
import com.example.service.EmailService;

@Service
public class EmailTopicKafkaListener {

	@Autowired
	private EmailService emailService;
	
	@KafkaListener(topics = "email", groupId = "email-group-1", containerFactory = "emailKafkaListenerContainerFactory")
	public void listenGroupEmailGroup1(EmailEntity emailEntity) {
		emailService.sendEmail(emailEntity.getTo(), emailEntity.getSubject(), emailEntity.getBody());
	}
}
