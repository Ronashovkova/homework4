package com.cursor.planeShapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

import java.lang.Math;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(Vertex a, double radius) {
        super(a);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(getRadius(), 2) * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * getRadius() * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Circle: " + "vertex " + getA().toString() + ", radius = " + getRadius() +
                ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
