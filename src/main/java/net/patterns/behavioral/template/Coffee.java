package net.patterns.behavioral.template;

class Coffee extends BeverageTemplate {
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}