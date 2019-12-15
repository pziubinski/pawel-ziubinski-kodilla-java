package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> listOfShapes = new ArrayList<>();

    public ArrayList<Shape> getListOfShapes() {
        return listOfShapes;
    }

    public void addFigure(Shape shape){
        listOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public void showFigures() {
        for(Shape s : listOfShapes)
            System.out.println("Figure: " + s.getShapeName() + " , field of figure: " + s.getField());
    }
}