package com.kumar.interpreter;

/**
 * The MultiplyNonTerminalExpression class represents the multiplication operation.
 * It combines two expressions to evaluate their product.
 */
public class MultiplyNonTerminalExpression implements AbstractExpression {
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    /**
     * Constructor for MultiplyNonTerminalExpression.
     *
     * @param leftExpression the left operand
     * @param rightExpression the right operand
     */
    public MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * Interprets the multiplication expression in the given context.
     *
     * @param context the context containing variable values
     * @return the result of the multiplication
     */
    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}