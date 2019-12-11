package com.cursor.plane.shapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;

    public Rectangle(Vertex vertexA, double width, double height) {
        super(vertexA);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return Math.round(getHeight() * getWidth() * hundred) / hundred;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (getHeight() + getWidth()) * hundred) / hundred;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "vertex " + this.getVertexA() + ", width = " + getWidth() + ", height = " + getHeight() +
                ", perimeter=" + getPerimeter() + ", area = " + getArea();
    }
}

