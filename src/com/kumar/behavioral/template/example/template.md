# Template Method Pattern in Java

## Overview
The template method defines the step of an algorithm and allows subclass to provide the implementation for one or more step.

The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class but lets subclasses override specific steps of the algorithm without changing its structure. This pattern is useful for implementing an algorithm with variable steps, where some steps are fixed and others are customizable.

## Key Concepts

- **Template Method:** Defines the steps of an algorithm. It is a final method to prevent alteration.
- **Abstract Class:** Contains the template method and common steps. Abstract methods are placeholders for steps that subclasses must implement.
- **Concrete Class:** Implements the abstract methods to provide specific behavior for certain steps of the algorithm.

## Example

Consider a scenario where we need to prepare caffeinated beverages like tea and coffee. The preparation steps are mostly similar but differ in how the beverage is brewed and what condiments are added. The Template Method Pattern allows us to define the common steps and let subclasses specify the details.

### Java Code

**`CaffeineBeverage.java`**

```java
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
```

**`Tea.java`**

```java
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
```

**`Coffee.java`**

```java
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
```

**`TemplateTestDrive.java`**

```java
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
```