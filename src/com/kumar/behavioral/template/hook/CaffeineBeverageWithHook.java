package com.kumar.behavioral.template.hook;

/**
 * Abstract class defining a template method for preparing caffeinated beverages with hooks.
 * The template method `prepareRecipe` defines the steps for making a beverage.
 * Subclasses are required to implement the `brew` and `addCondiments` methods.
 * The `customerWantsCondiments` hook allows subclasses to choose whether to add condiments.
 */
public abstract class CaffeineBeverageWithHook {

    /**
     * Template method defining the steps to prepare the recipe.
     * This method is final to prevent subclasses from altering the algorithm.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
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
     * This method must be implemented by subclasses to provide specific brewing logic.
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
     * This method must be implemented by subclasses to provide specific condiments.
     */
    abstract void addCondiments();

    /**
     * Hook method that allows subclasses to decide whether to add condiments.
     * Default implementation returns true, meaning condiments are added.
     * Subclasses can override this method to change the behavior.
     *
     * @return true if condiments should be added; false otherwise.
     */
    boolean customerWantsCondiments() {
        return true;
    }
}