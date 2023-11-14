package net.patterns.behavioral.memento;

class Caretaker {
    private Memento memento;

    void saveMemento(Memento memento) {
        this.memento = memento;
    }

    Memento retrieveMemento() {
        return memento;
    }
}
