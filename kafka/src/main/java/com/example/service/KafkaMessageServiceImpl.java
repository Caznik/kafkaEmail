package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.model.EmailEntity;
import com.example.model.KafkaMessageEmail;

@Service
public class KafkaMessageServiceImpl implements KafkaMessageService{

	@Autowired
	private KafkaTemplate<String, EmailEntity> emailKafkaTemplate;
	
	@Override
	public void createMessage(KafkaMessageEmail kafkaEmailMessage) {
		emailKafkaTemplate.send(kafkaEmailMessage.getTopic(), kafkaEmailMessage.getEmailEntity());
	}
}
