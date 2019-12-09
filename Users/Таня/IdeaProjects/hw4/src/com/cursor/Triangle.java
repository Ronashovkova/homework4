package com.cursor;

import java.lang.Math;

public class Triangle extends PlaneShape {
    private Vertex a;
    private Vertex b;
    private Vertex c;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
    }

    public Vertex getB() {
        return b;
    }

    public void setB(Vertex b) {
        this.b = b;
    }

    public Vertex getC() {
        return c;
    }

    public void setC(Vertex c) {
        this.c = c;
    }


    @Override
    public double getArea() {
        double area = (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY())) / 2.0f;
        return Math.abs(area);
    }

    private double findSide(Vertex a, Vertex b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    @Override
    public double getPerimeter() {
        double sideA = findSide(getA(), getB());
        double sideB = findSide(getB(), getC());
        double sideC = findSide(getC(), getA());
        return Math.round((sideA + sideB + sideC) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Triangle: " + "vertex A " + getA() + ", vertex B " + getB() +
                ", vertex C " + getC() + ", perimeter = " + getPerimeter() +
                ", area = " + getArea();
    }
}
