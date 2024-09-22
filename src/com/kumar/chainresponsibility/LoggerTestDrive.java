package com.kumar.chainresponsibility;

/**
 * Main class to demonstrate the chain of responsibility pattern.
 */
public class LoggerTestDrive {
    public static void main(String[] args) {
        // Create the chain of log processors
        LogProcessor logChain = new InfoLogProcessor(
                new DebugLogProcessor(
                        new ErrorLogProcessor(null)
                )
        );

        // Logging messages of different severities
        logChain.log(LogProcessor.ERROR, "An exception occurred."); // Will be handled by ErrorLogProcessor
        logChain.log(LogProcessor.DEBUG, "Debugging information."); // Will be handled by DebugLogProcessor
        logChain.log(LogProcessor.INFO, "Informational message."); // Will be handled by InfoLogProcessor
        logChain.log(LogProcessor.DEBUG, "Another debug message."); // Will be handled by DebugLogProcessor
    }
}
