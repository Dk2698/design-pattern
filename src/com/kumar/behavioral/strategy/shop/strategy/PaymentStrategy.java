package com.kumar.behavioral.strategy.shop.strategy;

// Strategy design pattern is one of the behavioral design patterns.
// It is used when we have multiple algorithms for a specific task,
// and the client decides which implementation to use at runtime.
// A common example is the Collections.sort() method that takes a Comparator parameter,
// allowing different sorting strategies.
// In this example, we implement a simple Shopping Cart with two payment strategies:
// using Credit Card or using PayPal.

public interface PaymentStrategy {
    /**
     * Method to process payment.
     *
     * @param amount the amount to be paid
     */
    void pay(int amount);
}