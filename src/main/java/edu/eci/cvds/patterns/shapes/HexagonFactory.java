package edu.eci.cvds.patterns.shapes;

public class HexagonFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Hexagon();
    }
}