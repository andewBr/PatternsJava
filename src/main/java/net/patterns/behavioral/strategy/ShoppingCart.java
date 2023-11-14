package net.patterns.behavioral.strategy;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
