package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void log() {
        logger = new Logger();
        logger.log("New Log 1.");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String logEntry = logger.getLastLog();
        System.out.println("Last log -> " + logEntry);

        //Then
        Assert.assertEquals("New Log 1.", logEntry);

    }
}
