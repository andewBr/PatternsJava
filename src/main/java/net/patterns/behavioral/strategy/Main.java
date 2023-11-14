package net.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("123456789", "Andrew Andrew");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        PaymentStrategy payPalPayment = new PayPalPayment("Andrew.Andrew@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(50);
    }
}