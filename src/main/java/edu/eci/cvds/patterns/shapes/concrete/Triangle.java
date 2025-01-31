package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape {
    @override
    public int getNumberOfEdges() {
        return 3;
    }
}
Cree el archivo Shape