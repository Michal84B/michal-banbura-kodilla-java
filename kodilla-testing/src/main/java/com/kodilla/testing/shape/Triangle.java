package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "triangle";
    private double field;

    public Triangle(Double field){
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return field;
    }
}
