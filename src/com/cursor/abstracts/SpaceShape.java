package com.cursor.abstracts;

import com.cursor.interfaces.AreaMeasurable;
import com.cursor.Vertex;
import com.cursor.interfaces.Multiplier;
import com.cursor.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable, Multiplier {

    public SpaceShape(Vertex vertex) {
        super(vertex);
    }

    public Vertex getVertexA() {
        return super.getVertexA();
    }

    public void setVertexA(Vertex vertexA) {
        super.setVertexA(vertexA);
    }
}
