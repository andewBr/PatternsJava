package net.patterns.behavioral.chain;

public class ConsoleLogger extends Logger {
    protected void writeMessage(String message) {
        System.out.println("Console Logger: " + message);
    }

    protected LogLevel getLogLevel() {
        return LogLevel.INFO;
    }
}
