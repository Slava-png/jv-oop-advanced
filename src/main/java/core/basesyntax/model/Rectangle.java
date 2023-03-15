package core.basesyntax.model;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, height: " + height
                + ", width: " + width + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}