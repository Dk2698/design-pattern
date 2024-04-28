package com.kumar.structural.composite.sol;

public class Expression implements ArithmeticExpression {

    private final ArithmeticExpression leftExpression;
    private final ArithmeticExpression rightExpression;

    private final Operation operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = switch (operation) {
            case add -> leftExpression.evaluate() + rightExpression.evaluate();
            case sub -> leftExpression.evaluate() - rightExpression.evaluate();
            case multiply -> leftExpression.evaluate() * rightExpression.evaluate();
            case divide -> leftExpression.evaluate() / rightExpression.evaluate();
        };
        System.out.println("Express value is : "+ value);
        return value;
    }
}
