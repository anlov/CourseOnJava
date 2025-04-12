package anlov.java;

public abstract class FigureParams implements Figure {
    private Colors colorOfBoard;
    private Colors colorOfFill;

    public FigureParams(Colors colorOfBoard, Colors colorOfFill) {
        this.colorOfBoard = colorOfBoard;
        this.colorOfFill = colorOfFill;
    }

    public String getName() {
        return "Фигуры";
    }

    @Override
    public String toString() {
        return "Параметры " + getName() + "{\n" +
                "цвет границы = " + colorOfBoard +
                ", цвет заливки = " + colorOfFill +
                " периметр = " + this.perimeter() + " площадь = " + this.area() + '\n' + '}';
    }
}
