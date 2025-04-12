package anlov.java;

public class Circle extends FigureParams {
    private final double RADIUS;

    public Circle(Colors colorOfBoard, Colors colorOfFill, double radius) {
        super(colorOfBoard, colorOfFill);
        RADIUS = radius;
    }

    @Override
    public String getName() {
        return "Круг";
    }

    @Override
    public double perimeter() {
        return Math.PI * RADIUS * 2;
    }

    @Override
    public double area() {
        return Math.PI * RADIUS * RADIUS;
    }


}
