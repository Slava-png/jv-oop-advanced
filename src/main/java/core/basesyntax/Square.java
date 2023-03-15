package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, side: " + side
                + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
