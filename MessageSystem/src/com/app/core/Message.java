package com.app.core;

import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Message implements Serializable {

	private String messageId;
	private String sender;
	private String recipient;
	private Instant timestamp;
	private String content;

	public Message(String messageId, String sender, String recipient, String content) {
		this.messageId = messageId;
		this.sender = sender;
		this.recipient = recipient;
		this.timestamp = Instant.now(); 
		this.content = content;
	}



	public String getFormattedTimestamp() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mm:ss a")
				.withZone(ZoneId.systemDefault());
		return formatter.format(timestamp);
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", sender=" + sender + ", recipient=" + recipient + ", timestamp="
				+ getFormattedTimestamp() + ", content=" + content + "]";
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMessageId() {
		return messageId;
	}

}