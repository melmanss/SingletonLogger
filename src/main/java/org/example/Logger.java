package org.example;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logMessages;

    private Logger() {
        logMessages = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.add(message);
        System.out.println("Log: " + message);
    }

    public List<String> getLogs() {
        return logMessages;
    }
}
