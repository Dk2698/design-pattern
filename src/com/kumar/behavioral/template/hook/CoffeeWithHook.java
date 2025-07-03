package com.kumar.behavioral.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Concrete class representing the preparation of coffee with hooks.
 * Implements the `brew` and `addCondiments` methods specific to coffee.
 * Overrides the `customerWantsCondiments` hook method to ask the user whether to add condiments.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    /**
     * Gets user input to determine if condiments should be added.
     *
     * @return the user's answer as a string.
     */
    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}