package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {

    @Test
    public void testSingleton() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        assertSame(logger1, logger2, "Logger instances should be the same");
    }

    @Test
    public void testLogging() {
        Logger logger = Logger.getInstance();
        logger.log("Тестове повідомлення");

        assertEquals(1, logger.getLogs().size(), "Log size should be 1");
        assertEquals("Тестове повідомлення", logger.getLogs().get(0), "Log message should match");
    }
}
