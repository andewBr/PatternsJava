package net.patterns.behavioral.strategy;

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;

    CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with credit card " + cardNumber);
    }
}
