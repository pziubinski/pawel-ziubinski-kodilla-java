package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] array = new int[]{1,2,5,8,9};

        //When
        double calculatedAverage = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(5.0, calculatedAverage, 0.1);
    }
}
