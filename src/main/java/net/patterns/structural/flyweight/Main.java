package net.patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("shared");
        Flyweight flyweight2 = factory.getFlyweight("shared");

        flyweight1.operation("extrinsic1");
        flyweight2.operation("extrinsic2");
    }
}
