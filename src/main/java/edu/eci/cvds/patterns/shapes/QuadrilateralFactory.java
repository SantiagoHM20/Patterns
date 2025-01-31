package edu.eci.cvds.patterns.shapes;

public class QuadrilateralFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Quadrilateral();
    }
}