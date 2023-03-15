package core.basesyntax;

import java.util.Random;

public class FigureSupplierImpl implements FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier;

    public FigureSupplierImpl(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    @Override
    public Figure getRandomFigure() {
        FigureNames figure = FigureNames.values()[random.nextInt(FigureNames.values().length)];

        switch (figure) {
            case CIRCLE:
                return getCircle();
            case RECTANGLE:
                return getRectangle();
            case SQUARE:
                return getSquare();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    @Override
    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM),
                random.nextInt(MAX_RANDOM));
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM));
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM));

    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM), random.nextInt(MAX_RANDOM));
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM));
    }
}
