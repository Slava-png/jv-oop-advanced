package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, base: "
                + base + ", height: " + height + ", color: " + getColor()
                + ", area: " + getArea());

    }

    @Override
    public double getArea() {
        return base * height * 0.5;
    }
}