package net.patterns.behavioral.mediator;

class ConcreteColleague implements Colleague {
    private ChatMediator mediator;
    private String name;

    ConcreteColleague(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " sending message: " + message);
        mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}