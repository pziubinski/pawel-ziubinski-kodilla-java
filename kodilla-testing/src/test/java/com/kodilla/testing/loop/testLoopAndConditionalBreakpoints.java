package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //GIVEN
        long sum = 0;

        //WHEN
        for(int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("[" + n + "] Sum equals: " +sum);
        }

        //THEN
        Assert.assertEquals(499500, sum);

    }
}
