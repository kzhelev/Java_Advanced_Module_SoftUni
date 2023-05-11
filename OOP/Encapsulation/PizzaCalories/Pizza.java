package Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;


    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setToppings(int number) {
        if (number < 0 || number > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        numberOfToppings = number;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void addTopping(Topping topping) {
        if (toppings.size() < numberOfToppings) {
            toppings.add(topping);
        }
    }

    public double getOverallCalories() {

        double toppingsCalories = toppings.stream().mapToDouble(Topping::calculateCalories).sum();

        return dough.calculateCalories() + toppingsCalories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f",getName(),getOverallCalories());
    }

}
