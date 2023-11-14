package net.patterns.behavioral.state;

class Context {
    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.doAction(this);
    }
}
