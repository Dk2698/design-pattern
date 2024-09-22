package com.kumar.chainresponsibility;

/**
 * Log processor for handling ERROR level logs.
 */
public class ErrorLogProcessor extends LogProcessor {
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