package com.cursor;

public class Sphere extends SpaceShape {

    private Vertex a;
    private double radius;

    public Sphere(Vertex a, double radius) {
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
