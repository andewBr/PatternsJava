package net.patterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger errorLogger = new ErrorLogger();

        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);

        consoleLogger.logMessage(LogLevel.INFO, "This is an information.");
        consoleLogger.logMessage(LogLevel.DEBUG, "This is a debug level information.");
        consoleLogger.logMessage(LogLevel.ERROR, "This is an error information.");
    }
}
