package com.cursor;

import com.cursor.abstracts.Shape;
import com.cursor.planeShapes.Circle;
import com.cursor.planeShapes.Rectangle;
import com.cursor.planeShapes.Triangle;
import com.cursor.spaceShapes.Cuboid;
import com.cursor.spaceShapes.Sphere;
import com.cursor.spaceShapes.SquarePyramid;

public class TestShapes {
    public static void start() {
        Vertex vertexSphere = new Vertex(1.0, 4.0);
        Sphere sphere = new Sphere(vertexSphere, 4);

        Vertex vertexCircle = new Vertex(1.0, 4.0);
        Circle circle = new Circle(vertexCircle, 5.0);

        Vertex vertexRectangle = new Vertex(7.0, 8.0);
        Rectangle rectangle = new Rectangle(vertexRectangle, 7.0, 8.0);

        Vertex vertexCuboid = new Vertex(11.0, 12.0);
        Cuboid cuboid = new Cuboid(vertexCuboid, 11.0, 12.0, 13.0);

        Vertex vertexTriangle1 = new Vertex(1.0, 2.0);
        Vertex vertexTriangle2 = new Vertex(5.0, 7.0);
        Vertex vertexTriangle3 = new Vertex(11.0, 3.0);
        Triangle triangle = new Triangle(vertexTriangle1, vertexTriangle2, vertexTriangle3);

        Vertex vertexSquarePyramid = new Vertex(33.0, 33.0);
        SquarePyramid squarePyramid = new SquarePyramid(vertexSquarePyramid, 4.0, 7.0);


        Shape[] array = {sphere, circle, rectangle, cuboid, triangle, squarePyramid};
        for (Shape value : array) {
            System.out.println(value.toString());
        }
    }
}
