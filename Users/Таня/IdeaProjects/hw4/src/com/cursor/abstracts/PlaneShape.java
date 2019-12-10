package com.cursor.abstracts;

import com.cursor.interfaces.AreaMeasurable;
import com.cursor.interfaces.PerimeterMeasurable;
import com.cursor.Vertex;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Vertex a) {
        super(a);
    }

    public Vertex getA() {
        return super.getA();
    }

    public void setA(Vertex a) {
        super.setA(a);
    }
}
