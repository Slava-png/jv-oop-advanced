package core.basesyntax.service;

import core.basesyntax.model.Figure;

public interface FigureSupplier {
    Figure getRandomFigure();

    Figure getDefaultFigure();
}