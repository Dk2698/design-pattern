package com.kumar.template.hook;

/**
 * Test class to drive the application.
 * Demonstrates the usage of `CoffeeWithHook` class and its template method.
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        // Create an instance of CoffeeWithHook
        final CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        // Make coffee using the template method
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}