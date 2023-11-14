package net.patterns.behavioral.memento;

class Originator {
    private String state;

    void setState(String state) {
        this.state = state;
    }

    Memento saveToMemento() {
        return new Memento(state);
    }

    void restoreFromMemento(Memento memento) {
        state = memento.getState();
    }

    void printState() {
        System.out.println("Current State: " + state);
    }
}