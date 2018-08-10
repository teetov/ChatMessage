package com.teetov.chat.message;

import java.io.Serializable;
import java.util.Calendar;

public class Message implements Serializable{
    private static final long serialVersionUID = 2l;
    
    private String body;
    private String name;
    private Calendar departureTime;
    private String senderAddress;
    private int destination;
        
    public Message(String message, String name, String senderAddress, int destination) {
        this.body = message;
        this.name = name;
        this.senderAddress = senderAddress;
        departureTime = Calendar.getInstance();
        this.destination = destination;
    }

    public Message(String message, String name, String senderAddress) {
        this(message, name, senderAddress, MessageProtocol.TEXT);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBody() {
        return body;
    }
    
    public void setBody(String newBody) {
        body = newBody;
    }
    
    public Calendar getDepartureTime() {
        return departureTime;
    }
    
    public String getSenderAdress() {
        return senderAddress;
    }
    
    public int getDestination() {
        return destination;
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(" [");
        result.append(name);
        result.append("] ");
        result.append(body);
        return result.toString();
    }
}
