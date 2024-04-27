package com.kumar.ChainResponsibilityPattern;

public class InfoLogProcessor extends  LogProcessor {
    InfoLogProcessor(LogProcessor loggerProcessor) {
        // which is next processor
        super(loggerProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO "+ message);
        } else {
            super.log(logLevel, message); // call super method
        }
    }
}
