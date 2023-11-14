package net.patterns.behavioral.mediator;

interface ChatMediator {
    void sendMessage(String message, Colleague colleague);
}
