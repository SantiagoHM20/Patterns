package edu.eci.cvds.patterns.shapes;

public class PentagonFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Pentagon();
    }
}