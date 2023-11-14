package net.patterns.creational.factorymethod;

class ConcreteCreatorA extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}
