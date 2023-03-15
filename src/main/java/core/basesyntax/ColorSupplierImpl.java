package core.basesyntax;

import java.util.Random;

public class ColorSupplierImpl implements ColorSupplier {
    private Random random = new Random();

    @Override
    public String getRandomColor() {
        int randNumber = random.nextInt(Colors.values().length);

        return Colors.values()[randNumber].toString();
    }
}
