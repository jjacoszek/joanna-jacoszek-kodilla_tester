package com.kodilla.spring.basic.dependency_injection;

public class MessageService {

    public void send(String message, String receiver) {
        MessageService messageService = new MessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
    }

