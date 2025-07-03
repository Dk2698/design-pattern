package com.kumar.behavioral.template.example;

/**
 * Concrete class representing the preparation of tea.
 * Implements the `brew` and `addCondiments` methods specific to tea.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
