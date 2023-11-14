package net.patterns.behavioral.mediator;

interface Colleague {
    void sendMessage(String message);
    void receiveMessage(String message);
}
