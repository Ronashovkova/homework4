package com.cursor.planeShapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;

    public Rectangle(Vertex a, double width, double height) {
        super(a);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(getHeight() * getWidth() * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (getHeight() + getWidth()) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "vertex " + getA() + ", width = " + getWidth() + ", height = " + getHeight() +
                ", perimeter=" + getPerimeter() + ", area = " + getArea();
    }
}

