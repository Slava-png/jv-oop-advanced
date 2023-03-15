package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.service.ColorSupplierImpl;
import core.basesyntax.service.FigureSupplier;
import core.basesyntax.service.FigureSupplierImpl;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        FigureSupplier figureSupplier = new FigureSupplierImpl(new Random(),
                new ColorSupplierImpl(new Random()));

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
