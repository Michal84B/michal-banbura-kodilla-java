package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + listNumbers);
        //Then
        //Assert.assertEquals(emptyList, listNumbers);
        Assert.assertTrue(listNumbers.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 10, 1, 15, 6, 8, 2, 3));
        ArrayList<Integer> evenList = new ArrayList<Integer>(Arrays.asList(4, 10, 6, 8, 2));
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing " + listNumbers);
        //Then
        Assert.assertEquals(evenList, listNumbers);
    }
}