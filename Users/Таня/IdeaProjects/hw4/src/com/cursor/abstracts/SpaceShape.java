package com.cursor.abstracts;

import com.cursor.interfaces.AreaMeasurable;
import com.cursor.Vertex;
import com.cursor.interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex vertex) {
        super(vertex);
    }

    public Vertex getA() {
        return super.getA();
    }

    public void setA(Vertex a) {
        super.setA(a);
    }
}
