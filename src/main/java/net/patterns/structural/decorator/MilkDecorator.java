package net.patterns.structural.decorator;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}
