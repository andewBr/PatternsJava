package net.patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        Visitor visitor = new ConcreteVisitor();

        elementA.accept(visitor);
        elementB.accept(visitor);

        ObjectStructure objectStructure = new ObjectStructure(elementA, elementB);
        objectStructure.accept(visitor);
    }
}
