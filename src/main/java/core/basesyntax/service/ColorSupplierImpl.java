package core.basesyntax.service;

import core.basesyntax.model.Colors;

import java.util.Random;

public class ColorSupplierImpl implements ColorSupplier {
    private Random random;

    public ColorSupplierImpl(Random random) {
        this.random = random;
    }

    @Override
    public String getRandomColor() {
        int randNumber = random.nextInt(Colors.values().length);

        return Colors.values()[randNumber].toString();
    }
}