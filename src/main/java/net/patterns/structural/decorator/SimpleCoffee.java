package net.patterns.structural.decorator;

class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}

