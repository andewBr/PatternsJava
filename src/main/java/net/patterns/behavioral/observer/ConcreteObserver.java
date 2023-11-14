package net.patterns.behavioral.observer;

class ConcreteObserver implements Observer {
    private String name;

    ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}