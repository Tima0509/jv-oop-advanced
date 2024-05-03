package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Area: " + getArea() + ", Side: " + side + ", Color: " + getColor());
    }

    @Override
    public Color getColor() {
        return null;
    }
}
