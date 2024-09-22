package com.kumar.chainResponsibility;

public  abstract class LogProcessor {
    public  static  int INFO = 1;
    public  static  int DEBUG = 2;
    public  static  int ERROR = 3;

    LogProcessor nextLoggerProcessor;

    // take next responsibility
    LogProcessor(LogProcessor loggerProcessor){
        this.nextLoggerProcessor = loggerProcessor;
    }

    public  void  log(int logLevel, String message){

        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
