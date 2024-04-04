package com.example.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.example.model.KafkaMessage;

@Service
public class KafkaMessageServiceImpl implements KafkaMessageService{

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Override
	public void createMessage(KafkaMessage kafkaMessage) {
		//kafkaTemplate.send(kafkaMessage.getTopic(), kafkaMessage.getMessage());
		
		CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(kafkaMessage.getTopic(), kafkaMessage.getMessage());
	    future.whenComplete((result, ex) -> {
	        if (ex == null) {
	            System.out.println("Sent message=[" + kafkaMessage.getMessage() + "] with offset=[" + result.getRecordMetadata().offset() + "]");
	        } else {
	            System.out.println("Unable to send message=[" + kafkaMessage.getMessage() + "] due to : " + ex.getMessage());
	        }
	    });
	}

	@Override
	public KafkaMessage readMessage(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

}
