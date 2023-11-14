package net.patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        String singleton1 = SingletonRealization.getInstance().toString();
        String singleton2 = SingletonRealization.getInstance().toString();
        String singleton3 = SingletonRealization.getInstance().toString();
        String singleton4 = SingletonRealization.getInstance().toString();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
    }
}
