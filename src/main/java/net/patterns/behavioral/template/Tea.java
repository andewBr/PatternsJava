package net.patterns.behavioral.template;

class Tea extends BeverageTemplate {
    void brew() {
        System.out.println("Steeping the tea");
    }

    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
