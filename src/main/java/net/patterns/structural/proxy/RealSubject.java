package net.patterns.structural.proxy;

class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject handles request");
    }
}