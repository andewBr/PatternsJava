package net.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
