package anlov.java;

public class Square extends FigureParams {

    private final double SIDELENGTH;

    public Square(Colors fillColor, Colors boardColor, double SIDELENGTH) {
        super(fillColor, boardColor);
        this.SIDELENGTH = SIDELENGTH;
    }

    @Override
    public String getName() {
        return "Квадрата";
    }

    @Override
    public double perimeter() {
        return SIDELENGTH * 4;
    }

    @Override
    public double area() {
        return SIDELENGTH * SIDELENGTH;
    }
}
