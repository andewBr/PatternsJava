package net.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();
    }
}
