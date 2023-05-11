package Inheritance.Restaurant;

import java.math.BigDecimal;

public class Dessert extends Food {

    private double calories;

    public Dessert(String name) {
        super(name);
        setCalories(calories);
    }

    public Dessert(String name, BigDecimal price, double grams) {
        super(name, price, grams);
        setCalories(calories);
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
