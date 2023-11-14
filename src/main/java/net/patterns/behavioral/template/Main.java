package net.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        BeverageTemplate tea = new Tea();
        tea.prepareBeverage();

        System.out.println("\nMaking coffee:");
        BeverageTemplate coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
