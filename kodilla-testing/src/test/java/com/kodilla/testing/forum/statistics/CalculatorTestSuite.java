package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTestSuite {
    @Before
    public void before() {
        Statistics statisticMock = mock(Statistics.class);
        Calculator calculator = new Calculator(statisticMock);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++){
            users.add("User Name" +i);
        }
    }
    @Test
    public void testAvgPostsPerUser(){
        //Given
        //When
        //Then
    }
}
