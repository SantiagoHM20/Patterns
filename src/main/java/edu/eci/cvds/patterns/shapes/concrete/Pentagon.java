package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Pentagon implements Shape {
    @override
    public int getNumberOfEdges() {
        return 5;
    }
}
Cree el archivo Shape