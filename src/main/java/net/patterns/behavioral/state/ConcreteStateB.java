package net.patterns.behavioral.state;

class ConcreteStateB implements State {
    public void doAction(Context context) {
        System.out.println("State B is set.");
        context.setState(new ConcreteStateA());
    }
}