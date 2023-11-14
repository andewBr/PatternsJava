package net.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State1");
        Memento memento1 = originator.saveToMemento();
        caretaker.saveMemento(memento1);

        originator.setState("State2");
        originator.printState();

        Memento savedMemento = caretaker.retrieveMemento();
        originator.restoreFromMemento(savedMemento);
        originator.printState();
    }
}
