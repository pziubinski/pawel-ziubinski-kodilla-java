package com.kodilla.testing.shape;

public class Square implements Shape {
    private static String shapeName = "square";
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return sideLength * sideLength;
    }

}