package com.kumar.behavioral.strategy.shop.strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId;  // PayPal account email
    private String password;  // PayPal account password

    /**
     * Constructor for PaypalStrategy.
     *
     * @param emailId PayPal account email
     * @param password PayPal account password
     */
    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}