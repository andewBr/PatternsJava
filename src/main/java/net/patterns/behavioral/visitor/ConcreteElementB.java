package net.patterns.behavioral.visitor;

class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationB() {
        System.out.println("Operation B for ConcreteElementB");
    }
}
