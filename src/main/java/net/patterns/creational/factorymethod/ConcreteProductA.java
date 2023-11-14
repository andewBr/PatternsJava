package net.patterns.creational.factorymethod;

class ConcreteProductA extends Product {
    @Override
    void make() {
        System.out.println("Product A is created");
    }
}