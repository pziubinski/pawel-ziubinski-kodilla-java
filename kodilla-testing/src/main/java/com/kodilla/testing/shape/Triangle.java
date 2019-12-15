package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private static String shapeName = "triangle";
    private double sideA;
    private double sideB;
    private double sideC;
    private double circumferenceDividedByTwo;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.circumferenceDividedByTwo = (sideA + sideB + sideC) / 2;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return Math.sqrt(circumferenceDividedByTwo * (circumferenceDividedByTwo - sideA) * (circumferenceDividedByTwo - sideB) * (circumferenceDividedByTwo - sideC));
    }
}