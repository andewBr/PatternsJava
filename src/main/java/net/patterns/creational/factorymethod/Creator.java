package net.patterns.creational.factorymethod;

abstract class Creator {
    abstract Product factoryMethod();

    void someOperation() {
        Product product = factoryMethod();
        product.make();
    }
}
