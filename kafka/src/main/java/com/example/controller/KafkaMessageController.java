package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.KafkaMessageEmail;
import com.example.service.KafkaMessageService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class KafkaMessageController {

	@Autowired
	private KafkaMessageService kafkaService;
	
	@RequestMapping(value = "/createMessage", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
	public void createMessage(@RequestBody(required=true) KafkaMessageEmail kafkaMessage, HttpServletRequest request, HttpServletResponse response) {
		kafkaService.createMessage(kafkaMessage);
	}
	
	/*
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, World!";
    }
    */
}
