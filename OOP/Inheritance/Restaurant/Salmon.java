package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {

    private double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, grams);
        setGrams(SALMON_GRAMS);
    }
}
