package com.cursor.abstracts;

import com.cursor.Vertex;

public abstract class Shape {
    private Vertex a;

    public Shape(Vertex vertex) {
        this.a = vertex;
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
    }
}
