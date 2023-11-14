package net.patterns.structural.facade;

class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade() {
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
    }

    public void operation() {
        System.out.println("Facade operation:");
        subsystemA.operationA();
        subsystemB.operationB();
    }
}
