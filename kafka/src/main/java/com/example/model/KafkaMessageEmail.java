package com.example.model;

public class KafkaMessageEmail {
	
	private String topic;
	private EmailEntity emailEntity;
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public EmailEntity getEmailEntity() {
		return emailEntity;
	}
	public void setEmailEntity(EmailEntity emailEntity) {
		this.emailEntity = emailEntity;
	}
	
}
