package com.cursor.planeShapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

import java.lang.Math;

public class Triangle extends PlaneShape {
    private Vertex b;
    private Vertex c;

    public Triangle(Vertex a, Vertex b, Vertex c) {
        super(a);
        this.b = b;
        this.c = c;
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
        double area = (getA().getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - getA().getY()) +
                c.getX() * (getA().getY() - b.getY())) / 2.0f;
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
