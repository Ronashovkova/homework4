package com.cursor.spaceShapes;
import com.cursor.Vertex;
import com.cursor.abstracts.SpaceShape;

public class SquarePyramid extends SpaceShape {

    private double baseWidth;
    private double baseHeight;

    public SquarePyramid(Vertex vertex, double baseWidth, double baseHeight) {
        super(vertex);
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public double getBaseHeight() {
        return baseHeight;
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
        return "SquarePyramid: " + "vertex " + getVertexA() + ", base width = " + getBaseWidth() +
                ", height = " + getBaseHeight() + ", volume = " + getVolume() + ", area = " + getArea();
    }
}
