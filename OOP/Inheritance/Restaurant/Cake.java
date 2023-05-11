package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {

    private double CAKE_GRAMS = 250;
    private double CAKE_CALORIES = 1000;
    private BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake(String name) {
        super(name);
        setCalories(CAKE_CALORIES);
        setPrice(CAKE_PRICE);
        setGrams(CAKE_GRAMS);
    }
}
