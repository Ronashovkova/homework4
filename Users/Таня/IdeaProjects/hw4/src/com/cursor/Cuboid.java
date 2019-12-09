package com.cursor;

public class Cuboid extends SpaceShape {
    private Vertex a;
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex a, double width, double height, double depth) {
        this.a = a;
        this.width = width;
        this.height = height;
        this.depth = depth;
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return Math.round(2.0 * ((getDepth() * getWidth()) + (getWidth() * getHeight()) +
                (getHeight() * getDepth())) * 100.0) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round(getWidth() * getDepth() * getHeight() * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Cuboid: " + "vertex " + getA() + ", width = " + getWidth() + ", height = " + getHeight() +
                ", depth = " + getDepth() + ", volume = " + getVolume() + ", area = " + getArea();
    }
}
