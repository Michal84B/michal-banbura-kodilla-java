package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTestSuite {
    @Before
    public void before() {
        Statistics statisticMock = mock(Statistics.class);
        Calculator calculator = new Calculator();
        calculator.calculateAdvStatistics(statisticMock);
        List<String> users = new ArrayList<String>();
        for(int i=0; i<100; i++){
            users.add("User Name" +i);
        }
    }
    @Test
    public void testAvgPostsPerUser(){
        //Given
        when(statisticsMock.username()).thenReturn(users);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(10, avgPostsPerUser);
    }
}
