package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddCircleGetField() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle(3.0);
        //When
        sc.addFigure(circle);
        //Then
        Assert.assertEquals(3.1415 * 9.0, sc.getFigure(0).getField(), 0.001);
    }

    @Test
    public void testAddSquareGetField() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape square = new Square(5);
        //When
        sc.addFigure(square);
        //Then
        Assert.assertEquals(25, sc.getFigure(0).getField(), 0.001);
    }

    @Test
    public void testAddTriangleGetField() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape triangle = new Triangle(3, 3, 3);
        //When
        sc.addFigure(triangle);
        //Then
        Assert.assertEquals(3.897, sc.getFigure(0).getField(), 0.001);
    }

    @Test
    public void testRemoveCircle() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle(3.0);
        //When
        sc.addFigure(circle);
        sc.removeFigure(circle);
        //Then
        Assert.assertTrue( sc.getListOfShapes().isEmpty());
    }

    @Test
    public void testSizeOfArray() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(3, 3, 3);
        Shape square = new Square(5);
        //When
        sc.addFigure(circle);
        sc.addFigure(triangle);
        sc.addFigure(square);
        //Then
        Assert.assertEquals(3, sc.getListOfShapes().size());
    }

    @Test
    public void testGetThirdShape() {
        //Given
        ShapeCollector sc = new ShapeCollector();
        Shape circle = new Circle(3.0);
        Shape triangle = new Triangle(3, 3, 3);
        Shape square = new Square(5);
        //When
        sc.addFigure(circle);
        sc.addFigure(triangle);
        sc.addFigure(square);
        //Then
        Assert.assertEquals(square, sc.getFigure(2));
    }
}