package com.kumar.template.example;

/**
 * Concrete class representing the preparation of coffee.
 * Implements the `brew` and `addCondiments` methods specific to coffee.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}