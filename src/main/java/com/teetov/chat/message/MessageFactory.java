package com.teetov.chat.message;

public class MessageFactory {
    
    String name;
    String senderAddress;
    
    public MessageFactory(String name, String senderAddress) {
        this.name = name;
        this.senderAddress = senderAddress;
    }
    
    public Message getMesage(String text) {
        return new Message(text, name, senderAddress);
    }
    
    public Message getMesage(String text, int destination) {
        return new Message(text, name, senderAddress, destination);
    }
}
