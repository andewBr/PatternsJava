package net.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Implementor impl1 = new Implementor1();
        Implementor impl2 = new Implementor2();

        Abstraction abstraction1 = new RefinedAbstraction1(impl1);
        Abstraction abstraction2 = new RefinedAbstraction2(impl2);

        abstraction1.operation();
        abstraction2.operation();
    }
}
