package com.kumar.strategy.shop.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;          // Name of the cardholder
    private String cardNumber;    // Credit card number
    private String cvv;           // Card security code
    private String dateOfExpiry;  // Expiry date of the card

    /**
     * Constructor for CreditCardStrategy.
     *
     * @param name         Name of the cardholder
     * @param cardNumber   Credit card number
     * @param cvv          Card security code
     * @param dateOfExpiry Expiry date of the card
     */
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card.");
    }
}