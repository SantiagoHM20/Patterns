package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape {
    @override
    public int getNumberOfEdges() {
        return 4;
    }
}
Cree el archivo Shape