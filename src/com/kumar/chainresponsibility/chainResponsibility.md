# Chain of Responsibility Design Pattern in Java

## Overview

The Chain of Responsibility pattern allows you to pass requests along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain. This pattern is particularly useful for logging, where different log levels can be handled by different loggers.

## Implementation

### LogProcessor Class

The abstract class `LogProcessor` serves as the base for different types of log processors. It contains a reference to the next logger in the chain.

**`LogProcessor.java`**
```java
package com.kumar.chainresponsibility;

/**
 * Abstract class representing a log processor in the chain of responsibility.
 */
public abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    // Reference to the next log processor in the chain
    protected LogProcessor nextLoggerProcessor;

    /**
     * Constructor to set the next logger in the chain.
     *
     * @param loggerProcessor the next log processor in the chain
     */
    LogProcessor(LogProcessor loggerProcessor) {
        this.nextLoggerProcessor = loggerProcessor;
    }

    /**
     * Method to log messages. If the current processor cannot handle
     * the message, it passes it to the next processor in the chain.
     *
     * @param logLevel the severity level of the log
     * @param message the message to log
     */
    public void log(int logLevel, String message) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
```
**`InfoLogProcessor.java`**
```java
package com.kumar.chainresponsibility;

/**
 * Log processor for handling INFO level logs.
 */
public class InfoLogProcessor extends LogProcessor {
    /**
     * Constructor to set the next logger in the chain.
     *
     * @param loggerProcessor the next log processor in the chain
     */
    InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message); // Pass to the next processor
        }
    }
}
```
**`DebugLogProcessor.java`**
```java
package com.kumar.chainresponsibility;

/**
 * Log processor for handling DEBUG level logs.
 */
public class DebugLogProcessor extends LogProcessor {
    /**
     * Constructor to set the next logger in the chain.
     *
     * @param loggerProcessor the next log processor in the chain
     */
    DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logLevel, message); // Pass to the next processor
        }
    }
}

```
**`ErrorLogProcessor.java`**

```java
package com.kumar.chainresponsibility;

/**
 * Log processor for handling ERROR level logs.
 */
public class ErrorLogProcessor extends LogProcessor {
    /**
     * Constructor to set the next logger in the chain.
     *
     * @param loggerProcessor the next log processor in the chain
     */
    ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(logLevel, message); // Pass to the next processor
        }
    }
}
```
**`LoggerTestDrive.java`**

```java
package com.kumar.chainresponsibility;

/**
 * Main class to demonstrate the chain of responsibility pattern.
 */
public class LoggerTestDrive {
    public static void main(String[] args) {
        // Creating the chain of log processors
        LogProcessor logObject = new InfoLogProcessor(
                new DebugLogProcessor(
                        new ErrorLogProcessor(null)
                )
        );

        // Logging messages of different severities
        logObject.log(LogProcessor.ERROR, "An exception occurred."); // Passing ERROR level
        logObject.log(LogProcessor.DEBUG, "Debugging information."); // Passing DEBUG level
        logObject.log(LogProcessor.INFO, "Informational message."); // Passing INFO level
    }
}
```