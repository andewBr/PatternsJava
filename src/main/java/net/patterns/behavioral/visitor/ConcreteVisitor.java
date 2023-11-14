package net.patterns.behavioral.visitor;

class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visited ConcreteElementA");
    }

    public void visit(ConcreteElementB elementB) {
        System.out.println("Visited ConcreteElementB");
    }
}