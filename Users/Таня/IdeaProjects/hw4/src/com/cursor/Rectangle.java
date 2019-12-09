package com.cursor;

public class Rectangle extends PlaneShape {

    private Vertex a;
    private double width;
    private double height;

    public Rectangle(Vertex a, double width, double height) {
        this.a = a;
        this.height = height;
        this.width = width;
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
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

