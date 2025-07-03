package com.kumar.behavioral.interpreter;

/**
 * The Client class demonstrates the use of the Interpreter Design Pattern
 * by creating an expression tree and evaluating it.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // Setting up variables in the context
        context.put("a", 2);
        context.put("b", 4);

        // Creating the expression a * b
        final MultiplyNonTerminalExpression expression = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));

        // Evaluating and printing the result of the expression
        System.out.println("Result of a * b: " + expression.interpret(context));
    }
}