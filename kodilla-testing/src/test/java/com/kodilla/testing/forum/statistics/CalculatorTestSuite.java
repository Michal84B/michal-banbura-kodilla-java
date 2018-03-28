package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTestSuite {
    Statistics statisticMock;
    Calculator calculator;
    List<String> users;
    @Before
    public void before() {
        statisticMock = mock(Statistics.class);
        calculator = new Calculator();
        users = new ArrayList<String>();
        for(int i=0; i<200; i++){
            users.add("User Name" +i);
        }
    }
    @Test
    public void testAvgPostsPerUser(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(1000);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(5.0, avgPostsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerUser(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerUser = calculator.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(2.5, avgCommentsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerPost(){
        //Given
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0.5, avgCommentsPerPost, 0.1);
    }
}
