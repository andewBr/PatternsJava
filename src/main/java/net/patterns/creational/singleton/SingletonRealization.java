package net.patterns.creational.singleton;

public class SingletonRealization {
    private static SingletonRealization instance;

    public static SingletonRealization getInstance() {
        if (instance == null) {
            instance = new SingletonRealization();
        }
        return instance;
    }

}
