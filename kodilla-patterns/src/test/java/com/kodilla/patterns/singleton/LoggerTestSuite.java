package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getInstance().log("New singleton log");
    }

    @Test
    public void getLastLog() {
        //Given
        //When
        String logEntry = Logger.getInstance().getLastLog();
        System.out.println("Last log -> " + logEntry);

        //Then
        Assert.assertEquals("New singleton log", logEntry);

    }
}
