package com.cursor.spaceShapes;

import com.cursor.Vertex;
import com.cursor.abstracts.SpaceShape;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex vertex, double width, double height, double depth) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
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
        return "Cuboid: " + "vertex " + getVertexA() + ", width = " + getWidth() + ", height = " + getHeight() +
                ", depth = " + getDepth() + ", volume = " + getVolume() + ", area = " + getArea();
    }
}
