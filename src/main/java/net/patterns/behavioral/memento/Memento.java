package net.patterns.behavioral.memento;

class Memento {
    private String state;
    private String timestamp;

    Memento(String state) {
        this.state = state;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    String getState() {
        return state;
    }

    String getTimestamp() {
        return timestamp;
    }
}
