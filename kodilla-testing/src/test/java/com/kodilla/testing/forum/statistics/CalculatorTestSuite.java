package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTestSuite {
    Statistics statisticMock;
    Calculator calculator;
    List<String> users100;
    List<String> users0;
    @Before
    public void before() {
        statisticMock = mock(Statistics.class);
        calculator = new Calculator();
        users100 = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users100.add("User Name" + i);
        }
        users0 = new ArrayList<String>();
    }
    @Test
    public void testAvgPostsPerUserWhenPostsIs1000AndUsersIs100(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users100);
        when(statisticMock.postsCount()).thenReturn(1000);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(10.0, avgPostsPerUser, 0.1);
    }
    @Test
    public void testAvgPostsPerUserWhenPostsIs1000AndUsersIs0(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users0);
        when(statisticMock.postsCount()).thenReturn(1000);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        System.out.println(avgPostsPerUser);
        Assert.assertEquals(Double.POSITIVE_INFINITY, avgPostsPerUser, 0.1);
    }
    @Test
    public void testAvgPostsPerUserWhenPostsIs0AndUsersIs100(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users100);
        when(statisticMock.postsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        Assert.assertEquals(0, avgPostsPerUser, 0.1);
    }
    @Test
    public void testAvgPostsPerUserWhenUsersIs0AndPostsIs0(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users0);
        when(statisticMock.postsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgPostsPerUser = calculator.getAvgPostsPerUser();
        //Then
        System.out.println(avgPostsPerUser);
        Assert.assertEquals(Double.NaN, avgPostsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerUserWhenCommentsIs500AndUsersIs100(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users100);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerUser = calculator.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(5.0, avgCommentsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerUserWhenCommentsIs0AndUsersIs100(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users100);
        when(statisticMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerUser = calculator.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(0.0, avgCommentsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerUserWhenCommentsIs500AndUsersIs0(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users0);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerUser = calculator.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(Double.POSITIVE_INFINITY, avgCommentsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerUserCommentsIs0AndUsersIs0(){
        //Given
        when(statisticMock.usersNames()).thenReturn(users0);
        when(statisticMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerUser = calculator.getAvgCommentsPerUser();
        //Then
        Assert.assertEquals(Double.NaN, avgCommentsPerUser, 0.1);
    }
    @Test
    public void testAvgCommentsPerPostWhenPostsIs1000AndCommentsIs500AndPostsMoreThanComments(){
        //Given
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0.5, avgCommentsPerPost, 0.1);
    }
    @Test
    public void testAvgCommentsPerPostWhenPostsIs0AndCommentsIs500(){
        //Given
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(500);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(Double.POSITIVE_INFINITY, avgCommentsPerPost, 0.1);
    }
    @Test
    public void testAvgCommentsPerPostWhenPostsIs1000AndCommentsIs0(){
        //Given
        when(statisticMock.postsCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0.0, avgCommentsPerPost, 0.1);
    }
    @Test
    public void testAvgCommentsPerPostWhenPostsIs0AndCommentsIs0(){
        //Given
        when(statisticMock.postsCount()).thenReturn(0);
        when(statisticMock.commentsCount()).thenReturn(0);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(Double.NaN, avgCommentsPerPost, 0.1);
    }
    @Test
    public void testAvgCommentsPerPostWhenCommentsMoreThanPosts(){
        //Given
        when(statisticMock.postsCount()).thenReturn(500);
        when(statisticMock.commentsCount()).thenReturn(1000);
        //When
        calculator.calculateAdvStatistics(statisticMock);
        double avgCommentsPerPost = calculator.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(2.0, avgCommentsPerPost, 0.1);
    }
}
