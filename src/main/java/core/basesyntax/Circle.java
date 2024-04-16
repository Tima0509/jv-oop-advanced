package core.basesyntax;

public class Circle extends AbstractFigure {
    private final Color color;
    private final double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " +
                radius + " units, color: " + color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
