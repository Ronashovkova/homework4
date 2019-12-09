package com.cursor;

import java.lang.Math;

public class Circle extends PlaneShape {
    private Vertex a;
    private double radius;

    public Circle(Vertex a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
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
        return "Circle: " + "vertex " + a.toString() + ", radius = " + getRadius() +
                ", perimeter = " + getPerimeter() + ", area = " + getArea();
    }
}
