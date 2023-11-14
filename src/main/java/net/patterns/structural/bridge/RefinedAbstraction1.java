package net.patterns.structural.bridge;

class RefinedAbstraction1 extends Abstraction {
    public RefinedAbstraction1(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.print("RefinedAbstraction1 operation -> ");
        implementor.operationImpl();
    }
}
