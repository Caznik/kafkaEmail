package com.example.service;

import com.example.model.KafkaMessageEmail;

public interface KafkaMessageService {
	
	public void createMessage(KafkaMessageEmail kafkaMessage);

}
