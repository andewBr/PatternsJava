package net.patterns.structural.bridge;

class RefinedAbstraction2 extends Abstraction {
    public RefinedAbstraction2(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.print("RefinedAbstraction2 operation -> ");
        implementor.operationImpl();
    }
}
