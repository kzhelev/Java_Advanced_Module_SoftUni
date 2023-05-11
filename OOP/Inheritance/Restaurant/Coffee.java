package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    private final double COFFEE_MILLILITERS = 50;
    private final double COFFEE_PRICE = 3.50;
    private double caffeine;

    public Coffee(String name, double caffeine) {
        super(name);
        setMilliliters(COFFEE_MILLILITERS);
        setPrice(BigDecimal.valueOf(COFFEE_PRICE));
        setCaffeine(caffeine);

    }

    public double getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }
}
