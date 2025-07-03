package com.kumar.behavioral.interpreter;

/**
 * The NumberTerminalExpression class represents a terminal expression
 * that holds a variable and retrieves its value from the context.
 */
public class NumberTerminalExpression implements AbstractExpression {
    private final String stringValue;

    /**
     * Constructor for NumberTerminalExpression.
     *
     * @param stringValue the name of the variable
     */
    public NumberTerminalExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * Interprets the terminal expression in the given context.
     *
     * @param context the context containing variable values
     * @return the value of the variable
     */
    @Override
    public int interpret(Context context) {
        return context.get(stringValue);
    }
}