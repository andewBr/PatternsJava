package net.patterns.behavioral.chain;

public class ErrorLogger extends Logger {
    protected void writeMessage(String message) {
        System.out.println("Error Logger: " + message);
    }

    protected LogLevel getLogLevel() {
        return LogLevel.ERROR;
    }
}