package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String figureProperty, String color, double radius) {
        super(figureProperty, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getArea() + " square units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

}