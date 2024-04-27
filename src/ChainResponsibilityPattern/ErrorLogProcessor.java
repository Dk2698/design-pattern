package ChainResponsibilityPattern;

public class ErrorLogProcessor extends  LogProcessor{
    ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("ERROR "+ message);
        } else {
            super.log(logLevel, message); // call super method
        }
    }
}
