package com.cursor.abstracts;

import com.cursor.Vertex;

public abstract class Shape {
    private Vertex vertexA;

    public Shape(Vertex vertex) {
        this.vertexA = vertex;
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }
}
