package net.patterns.creational.prototype;

public class Main {

    public static void main(String[] args) {
        CloneableInterface prototype = new ConcretePrototype1(42);
        CloneableInterface clone1 = prototype.clone();
        CloneableInterface clone2 = prototype.clone();

        System.out.println(clone1);
        System.out.println(clone2);
    }
}

