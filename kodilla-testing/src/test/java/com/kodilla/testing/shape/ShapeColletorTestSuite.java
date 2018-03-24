package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeColletorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is begining of all Tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(4.5);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(1, shapeCollector.getSize());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(12.5);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getSize());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(15.0);
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrivedFigure);
    }
}
