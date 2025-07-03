package com.kumar.behavioral.chainresponsibility;

/**
 * Abstract class representing a log processor in the chain of responsibility.
 */
public abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

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
     * Method to log messages.
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
