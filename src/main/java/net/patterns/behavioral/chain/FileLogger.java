package net.patterns.behavioral.chain;

public class FileLogger extends Logger {
    protected void writeMessage(String message) {
        System.out.println("File Logger: " + message);
    }

    protected LogLevel getLogLevel() {
        return LogLevel.DEBUG;
    }
}
