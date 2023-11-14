package net.patterns.behavioral.visitor;

class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    void operationA() {
        System.out.println("Operation A for ConcreteElementA");
    }
}
