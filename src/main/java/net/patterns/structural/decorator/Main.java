package net.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());


        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + milkCoffee.getCost() + ", Description: " + milkCoffee.getDescription());
    }
}

