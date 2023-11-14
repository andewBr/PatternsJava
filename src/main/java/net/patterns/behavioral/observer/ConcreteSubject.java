package net.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers("State has been updated: " + state);
    }
}
