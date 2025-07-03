# Interpreter Design Pattern in Java

The Interpreter Design Pattern is a behavioral design pattern that defines a representation for a language's grammar and provides an interpreter to evaluate sentences in that language. This pattern is particularly useful for designing domain-specific languages.

## Key Concepts

1. **Context**: This class holds the state of the variables used during interpretation.
2. **AbstractExpression**: This interface declares the method for interpreting expressions.
3. **TerminalExpression**: This class implements the expression interface for terminal symbols (e.g., numbers).
4. **NonTerminalExpression**: This class implements the expression interface for non-terminal symbols (e.g., operations like multiplication).
5. **Client**: This class creates the expression tree and uses it to evaluate expressions.

## Code Implementation

**`Context.java`**

```java
package com.kumar.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * The Context class holds the state of the variables that can be used
 * during the interpretation of expressions.
 */
public class Context {
    private Map<String, Integer> contextMap = new HashMap<>();

    /**
     * Puts a variable and its value in the context.
     *
     * @param strVariable the name of the variable
     * @param intValue the value of the variable
     */
    public void put(String strVariable, int intValue) {
        contextMap.put(strVariable, intValue);
    }

    /**
     * Gets the value of a variable from the context.
     *
     * @param strVariable the name of the variable
     * @return the value of the variable
     */
    public int get(String strVariable) {
        return contextMap.get(strVariable);
    }
}
```
**`AbstractExpression.java`**

```java
package com.kumar.behavioral.interpreter;

/**
 * The AbstractExpression interface defines the method for interpreting expressions.
 */
public interface AbstractExpression {
    int interpret(Context context);
}
```
**`MultiplyNonTerminalExpression.java`**

```java
package com.kumar.behavioral.interpreter;

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
```
**`NumberTerminalExpression.java`**

```java
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
```
**`Client.java`**

```java
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
```