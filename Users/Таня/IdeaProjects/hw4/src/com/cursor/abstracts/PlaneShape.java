package com.cursor.abstracts;

import com.cursor.interfaces.AreaMeasurable;
import com.cursor.interfaces.PerimeterMeasurable;
import com.cursor.Vertex;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex vertexA) {
        super(vertexA);
    }

    public Vertex getVertexA() {
        return super.getVertexA();
    }

    public void setVertexA(Vertex vertexA) {
        super.setVertexA(vertexA);
    }
}
