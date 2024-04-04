package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.model.KafkaMessage;

@Service
public class KafkaMessageServiceImpl implements KafkaMessageService{

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Override
	public void createMessage(KafkaMessage kafkaMessage) {
		kafkaTemplate.send(kafkaMessage.getTopic(), kafkaMessage.getMessage());
	}

	@Override
	public KafkaMessage readMessage(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

}
