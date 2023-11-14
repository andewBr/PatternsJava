package net.patterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.operationA();
        productB1.operationB();
    }
}