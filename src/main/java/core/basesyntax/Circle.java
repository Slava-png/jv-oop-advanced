package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, radius: " + radius
                + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
