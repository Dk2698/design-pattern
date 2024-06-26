package com.kumar.ChainResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        // create info object
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens"); //passing level error
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO,"just for info");
    }
}
