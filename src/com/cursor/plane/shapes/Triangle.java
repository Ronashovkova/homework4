package com.cursor.plane.shapes;

import com.cursor.Vertex;
import com.cursor.abstracts.PlaneShape;

import java.lang.Math;

public class Triangle extends PlaneShape {
    private Vertex vertexB;
    private Vertex vertexC;

    public Triangle(Vertex vertexA, Vertex vertexB, Vertex vertexC) {
        super(vertexA);
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    public Vertex getVertexB() {
        return vertexB;
    }

    public Vertex getVertexC() {
        return vertexC;
    }


    @Override
    public double getArea() {
        double area = (this.getVertexA().getX() * (getVertexB().getY() - getVertexC().getY()) +
                getVertexB().getX() * (getVertexC().getY() - this.getVertexA().getY()) +
                getVertexC().getX() * (this.getVertexA().getY() - getVertexB().getY())) / 2.0f;
        return Math.abs(area);
    }

    private double findSide(Vertex a, Vertex b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    @Override
    public double getPerimeter() {
        double sideA = findSide(this.getVertexA(), getVertexB());
        double sideB = findSide(getVertexB(), getVertexC());
        double sideC = findSide(getVertexC(), this.getVertexA());
        return Math.round((sideA + sideB + sideC) * hundred) / hundred;
    }

    @Override
    public String toString() {
        return "Triangle: " + "vertex A " + this.getVertexA() + ", vertex B " + getVertexB() +
                ", vertex C " + getVertexC() + ", perimeter = " + getPerimeter() +
                ", area = " + getArea();
    }
}
