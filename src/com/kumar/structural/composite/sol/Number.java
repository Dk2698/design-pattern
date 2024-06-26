package com.kumar.structural.composite.sol;

public class Number implements ArithmeticExpression {
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is :" + value);
        return value;
    }
}
