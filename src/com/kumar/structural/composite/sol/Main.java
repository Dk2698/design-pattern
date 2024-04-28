package com.kumar.structural.composite.sol;

public class Main {
    public static void main(String[] args) {
        final ArithmeticExpression two = new Number(2);

        final ArithmeticExpression one = new Number(1);
        final ArithmeticExpression seven = new Number(7);
        final Expression addExpression = new Expression(one, seven, Operation.add);

        final Expression parentExpression = new Expression(two,addExpression , Operation.multiply);

        System.out.println(parentExpression.evaluate());
    }
}
