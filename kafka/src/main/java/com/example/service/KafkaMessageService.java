package com.example.service;

import com.example.model.KafkaMessage;

public interface KafkaMessageService {
	
	public void createMessage(KafkaMessage kafkaMessage);
	
	public KafkaMessage readMessage(String topic);

}
