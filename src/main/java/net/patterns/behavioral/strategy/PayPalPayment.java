package net.patterns.behavioral.strategy;

class PayPalPayment implements PaymentStrategy {
    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal using email " + email);
    }
}
