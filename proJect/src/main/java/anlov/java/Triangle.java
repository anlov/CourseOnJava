package anlov.java;

public class Triangle extends FigureParams {
    private final double SIDELENGTH;

    public Triangle(Colors colorOfBoard, Colors colorOfFill, double sidelength) {
        super(colorOfBoard, colorOfFill);
        SIDELENGTH = sidelength;
    }

    @Override
    public String getName() {
        return "Треугольника";
    }

    @Override
    public double perimeter() {
        return Math.PI * SIDELENGTH * 2;
    }

    @Override
    public double area() {
        return Math.PI * SIDELENGTH * SIDELENGTH;
    }
}
