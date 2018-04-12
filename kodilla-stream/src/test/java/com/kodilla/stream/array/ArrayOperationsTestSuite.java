package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int [] numbersList = {10, 20, 30, 40};

        //Then
        Assert.assertEquals(ArrayOperations.getAverage(numbersList), 25.0, 0.1);
    }
}
