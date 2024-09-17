package com.kumar.template.example;

/**
 * Abstract class defining a template method for preparing caffeinated beverages.
 * The template method `prepareRecipe` defines the steps for making a beverage.
 * Subclasses are required to implement the `brew` and `addCondiments` methods.
 */
public abstract class CaffeineBeverage {

    /**
     * Template method defining the steps to prepare the recipe.
     * This method is final to prevent subclass from altering the algorithm.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * Boils water.
     * This method is common for all caffeinated beverages.
     */
    void boilWater() {
        System.out.println("Boiling Water");
    }

    /**
     * Abstract method for brewing.
     * This method must be implemented by subclasses.
     */
    abstract void brew();

    /**
     * Pours the brewed beverage into a cup.
     * This method is common for all caffeinated beverages.
     */
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Abstract method for adding condiments.
     * This method must be implemented by subclasses.
     */
    abstract void addCondiments();
}