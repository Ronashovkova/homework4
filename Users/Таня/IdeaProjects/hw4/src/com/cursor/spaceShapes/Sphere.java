package com.cursor.spaceShapes;

import com.cursor.Vertex;
import com.cursor.abstracts.SpaceShape;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex vertex, double radius) {
        super(vertex);
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
        return Math.round(4 * Math.PI * Math.pow(getRadius(), 2) * 100.0) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round((4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Sphere: " + "vertex " + getA() + ", radius = " + getRadius() +
                ", volume = " + getVolume() + ", area = " + getArea();
    }
}
