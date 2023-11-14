package net.patterns.behavioral.chain;

public abstract class Logger {
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(LogLevel level, String message) {
        if (this.getLogLevel().compareTo(level) <= 0) {
            writeMessage(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void writeMessage(String message);
    protected abstract LogLevel getLogLevel();
}
