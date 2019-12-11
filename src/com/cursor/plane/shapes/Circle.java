package com.cursor.plane.shapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

import java.lang.Math;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(Vertex vertexA, double radius) {
        super(vertexA);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(getRadius(), 2) * hundred) / hundred;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * getRadius() * hundred) / hundred;
    }

    @Override
    public String toString() {
        return "Circle: " + "vertex " + this.getVertexA().toString() + ", radius = " + getRadius() +
                ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
