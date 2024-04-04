package com.example.model;

import java.io.Serializable;

public class EmailEntity implements Serializable{
	
	private static final long serialVersionUID = -1440385977076532533L;
	
	private String from;
	private String to;
	private String subject;
	private String body;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "EmailEntity [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
}
