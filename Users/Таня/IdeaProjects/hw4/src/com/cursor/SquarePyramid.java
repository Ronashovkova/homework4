package com.cursor;

public class SquarePyramid extends SpaceShape {

    private Vertex a;
    private double baseWidth;
    private double baseHeight;

    public SquarePyramid(Vertex a, double baseWidth, double baseHeight) {
        this.a = a;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getBaseHeight() {
        return baseHeight;
    }

    public void setBaseHeight(double baseHeight) {
        this.baseHeight = baseHeight;
    }


    @Override
    public double getArea() {
        return Math.round(2 * getBaseWidth() * (getBaseWidth() / (2 + Math.sqrt(Math.pow(getBaseHeight(), 2)
                + Math.pow(getBaseWidth() / 2, 2)))) * 100.0) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round((Math.pow(getBaseWidth(), 2) * getBaseHeight()) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "SquarePyramid: " + "vertex " + getA() + ", base width = " + getBaseWidth() +
                ", height = " + getBaseHeight() + ", volume = " + getVolume() + ", area = " + getArea();
    }
}
