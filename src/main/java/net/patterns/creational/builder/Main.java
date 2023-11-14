package net.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Horse horse1 = new Director().getHorse1();
        Horse horse2 = new Director().getHorse2();

        System.out.println(horse1);
        System.out.println(horse2);

    }
}
