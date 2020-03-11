package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testOneMessage() {
        //Given
        Logger.getInstance().log("New text in log.");

        //When

        //Then
        Assert.assertEquals("New text in log.", Logger.getInstance().getLastLog());
    }

    @Test
    public void testOverwritedMessage() {
        //Given
        Logger.getInstance().log("New text in log.");

        //When
        Logger.getInstance().log("Second text in log.");

        //Then
        Assert.assertEquals("Second text in log.", Logger.getInstance().getLastLog());
    }

}
