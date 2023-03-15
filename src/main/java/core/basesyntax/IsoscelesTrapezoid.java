package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    public IsoscelesTrapezoid(String color, int bottomBase, int topBase, int height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, bottom base: " + bottomBase
                + ", top base: " + topBase + ", height: " + height
                + ", color: " + getColor() + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) / 2 * height;
    }
}
