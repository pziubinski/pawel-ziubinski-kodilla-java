package com.kodilla.testing.shape;

public class Circle implements Shape {
    private static String shapeName = "circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return Math.PI * radius * radius;
    }

}